//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class matrixAddition {
    public static void main(String[] args) {
        int row =3,col=3;
        int[][] firstMatrix = {{1, 2, 3},
                {2, 3, 4},
                {5, 6, 7}
        };

        int[][] secondMatrix = {{1, 2, 3},
                {2, 3, 4},
                {5, 6, 7}
        };

        int[][] output = new int[row][col];

        for(int i=0; i< row; i++) {
            for(int j=0; j< col; j++) {
                output[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        for(int i=0; i< output.length; i++) {
            for(int j=0; j< output[i].length; j++) {
                System.out.print(output[i][j]+" ");
            }
            System.out.println();

        }
    }
}