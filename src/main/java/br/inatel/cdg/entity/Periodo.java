package br.inatel.cdg.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Periodo {
    INTEGRAL("INTEGRAL"),
    NOTURNO("NOTURNO");

    private final String value;
}
