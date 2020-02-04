package zadanie;

public class TypZnakowyILogiczny {
    /*
    Strona z listą znaków Unicode:
    http://unicode-table.com/en/#control-character
     */

    char c1 = 0, c2 = 65535; // rozmiar 16-bit

    char c3 = 'A', c4 = 65, c5 = 0041, c6 = '\u0041', c7 = 64 + 1;

    String string = "\u0041BCD";

    boolean b1 = true, b2 = false; // 8-bit
}
