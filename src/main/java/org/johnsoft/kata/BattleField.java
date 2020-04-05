package org.johnsoft.kata;
public class BattleField {

    public static boolean fieldValidator(int[][] field) {
        Integer[] fleet = new Integer[]{8, 3, 2, 1};
        if (validateRowFields(field, fleet)) return false;
        for(int i = 0; i < field.length; i++) {
            for(int j = i+1; j < field.length; j++) {
                int temp = field[i][j];
                field[i][j] = field[j][i];
                field[j][i] = temp;
            }
        }
        if (validateRowFields(field, fleet)) return false;
        for (int i = 0; i < fleet.length; i++) {
            if (fleet[i] != 0) return false;
        }
        return true;
    }

    private static boolean validateRowFields(int[][] field, Integer[] fleet) {
        final int m = field.length - 1;
        for (int c = 0; c <= m; c++) {
            int d = 0;
            for (int r = 0; r <= m; r++) {
                d += field[c][r];
                int diag = (c == m || r == m) ? 0 : field[c + 1][r + 1];
                if (field[c][r] > 0 && diag > 0) {
                    return true;
                }
                int under = c == m ? 0 : field[c + 1][r];
                int over = c > 0 ? field[c - 1][r] : 0;
                if (d == 1 && (under > 0 || over > 0) ) {
                    d = 0;
                }
                if (d == 0) continue;
                if (d > 4) return true;
                if (field[c][r] == 0 || r == m) {
                    fleet[d - 1]--;
                    d = 0;
                }
            }
        }
        return false;
    }
}