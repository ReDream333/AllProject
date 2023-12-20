package MatrixAbstract;

public class Main {
    public static void main(String[] args) {
        double[][] arrayA = {{1, 2},{0, 1}};
        double[][] arrayB = {{1, 1},{3, 4}};
        double[][] arrayC = {{2, 5, -3},{1, 4, -2},{-7, 3, 0}};
        MatrixExt matrixA = new MatrixExt(arrayA);
        MatrixExt matrixB = new MatrixExt(arrayB);
        MatrixExt matrixC = new MatrixExt(arrayC);
        System.out.println("    Сложение матриц     ");
        ((MatrixExt)matrixA.summ(matrixA,matrixB)).printMatrix();

        System.out.println("    Умножение матриц     ");
        ((MatrixExt)matrixA.multiply(matrixA,matrixB)).printMatrix();

        System.out.println("    Умножение матрицы на число     ");
        matrixA.multiplyNum(6).printMatrix();

        System.out.println(     "Поиск определителя      ");
        System.out.println(matrixA.determinant());
        System.out.println(matrixC.determinant());



    }
}
