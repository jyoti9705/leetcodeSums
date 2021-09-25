import java.util.HashSet;

public class ValidSodukuRunner {
    private static boolean isValidSudoku(char[][] board) {
        HashSet<String> values = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char currentValue = board[i][j];
                if (currentValue != '.') {
                    if (!values.add(currentValue + " found in row " + i) || !values.add(currentValue + "found in column " + j) || !values.add(currentValue + " found in box " + i / 3 + "-" + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}

