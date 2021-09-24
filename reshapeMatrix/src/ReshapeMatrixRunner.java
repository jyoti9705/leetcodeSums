public class ReshapeMatrixRunner {
    private static int[][] reShapeMatrix(int[][] mat, int r, int c) {
        int[][] matrixToReturn = new int[r][c];
        int noOfElementsInMatrix = mat[0].length * mat.length;
        int matColumn = mat[0].length;
        int matRow = mat.length;
        int noOfElementsInReshapedMatrix = r * c;
        int toReturnColumn =0;
        int toReturnRow=0;
        if (noOfElementsInMatrix != noOfElementsInReshapedMatrix) {
            return mat;
        }
        for (int i = 0; i < matRow; i++) {
            for (int j = 0; j < matColumn; j++) {
                if(toReturnColumn==c){
                    toReturnColumn = 0;
                    toReturnRow++;
                }
                matrixToReturn[toReturnRow][toReturnColumn]= mat[i][j];
                toReturnColumn++;

            }
        }

        return matrixToReturn;
    }

    public static void main(String[] args) {

        int[][] mat = {{1, 2}, {3, 4}};
        reShapeMatrix(mat, 1, 4);

    }
}
