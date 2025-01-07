package com.dci;

public enum Delimiter {
    COMMA(","), SEMICOLON(";"), PIPE("|");

    private final String symbol;

    Delimiter(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public static boolean isValidDelimiter(String delimiter) {
        for (Delimiter d : Delimiter.values()) {
            if (d.getSymbol().equals(delimiter)) {
                return true;
            }
        }
        return false;
    }
}