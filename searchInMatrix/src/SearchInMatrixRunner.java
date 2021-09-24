public class SearchInMatrixRunner {
    private static boolean searchInMatrix(int[][] matrix, int target) {
        int noOfRowsInMatrix = matrix.length;

        int rowToSearch = 0;

        if (noOfRowsInMatrix == 1) {
            rowToSearch = 0;
        } else {
            for (int i = 0; i < noOfRowsInMatrix; i++) {
                int[] rowElements = matrix[i];
                int firstElement = rowElements[0];
                if (target < firstElement) {
                    rowToSearch = i == 0 ? 0 : i - 1;
                    break;
                } else if (target == firstElement) {
                    rowToSearch = i;
                    break;
                } else if (target > firstElement && noOfRowsInMatrix - i == 1) {
                    rowToSearch = i;
                    break;
                }

            }
        }


        for (int i : matrix[rowToSearch]) {
            if (i == target) {
                return Boolean.TRUE;
            }
        }


        return Boolean.FALSE;
    }

    public static void main(String[] args) {

        int[][] mat = {{1}, {3}};//{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};////
        System.out.println(searchInMatrix(mat, 3));
    }
}
