# Define nossa imagem base
FROM jenkins/jenkins:lts-jdk11

# Define nosso usuario dentro do container
USER root

# Executa comandos para instalar o maven
RUN apt-get update

RUN apt-get install -y wget

RUN wget --no-verbose https://services.gradle.org/distributions/gradle-7.5.1-bin.zip
RUN mkdir /opt/gradle
RUN unzip -d /opt/gradle gradle-7.5.1-bin.zip
RUN ls /opt/gradle/gradle-7.5.1

# Define uma variavel de ambiente GRADLE_HOME que aponta para o local do maven
ENV GRADLE_HOME=/opt/gradle/gradle-7.5.1
ENV PATH=$PATH:$GRADLE_HOME/bin
RUN gradle -version

# chown: comando linux que muda o dono de uma pasta. Nesse caso estamos dando permissao para o usuario jenkins
RUN chown -R jenkins:jenkins /opt/gradle

# Instalando mailutils
RUN apt-get install -y mailutils

# Limpa arquivos baixados com apt-get
RUN apt-get clean

USER jenkins