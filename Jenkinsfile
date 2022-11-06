pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'gradle --version'
                sh 'java --version'
                sh 'ls'
                sh 'pwd'
                sh 'gradle clean build -x test' // -x test para pular os tests
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh 'gradle clean test'
                sh 'ls'
                archiveArtifacts 'build/reports/tests/test/'
            }
        }
        stage('Notification') {
            steps {
                echo 'Sending email....'
                sh '''
                    cd scripts/
                    chmod 775 *
                    ./jenkins.sh
                   '''
            }
        }
    }
}