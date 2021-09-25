import java.util.ArrayList;
import java.util.List;

public class PascalTriangleRunner {
    private static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0) {
            return triangle;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);


        for (int i = 1; i < numRows; i++) {
            List<Integer> preVRows = triangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            for (int j = 1; j < i; j++) {
                currentRow.add(preVRows.get(j - 1) + preVRows.get(j));
            }

            currentRow.add(1);
            triangle.add(currentRow);
        }
        return triangle;
    }

    public static void main(String[] args) {
        generate(5);

    }
}
