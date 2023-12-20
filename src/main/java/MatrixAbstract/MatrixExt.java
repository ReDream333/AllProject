package MatrixAbstract;

public class MatrixExt extends MatrixAbs{

    public MatrixExt(double[][] array) {
        this.array = array;
        this.row = array.length;
        this.colon = array[0].length;
    }
    public void printMatrix() { //вывод матрицы
        System.out.println("    Вывод матрицы    ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colon; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
    @Override
    public MatrixAbs summ(MatrixAbs matrixA, MatrixAbs matrixB) {
        if (matrixB.colon == matrixA.colon && matrixB.colon == matrixA.row) {
            MatrixExt matrixResult = new MatrixExt(new double[matrixB.row][matrixB.colon]);
//            matrixResult.setMatrix(new double[rowsCount][colsCount]);
            for (int i = 0; i < matrixA.row; i++) {
                for (int j = 0; j < matrixA.colon; j++) {
                    matrixResult.array[i][j] = matrixA.array[i][j] + matrixB.array[i][j];
                }
            }
            return matrixResult;
        }
        else {
            System.out.println("Данные матрицы невозможно сложить. ");
            return null;
        }
    }

    @Override
    public MatrixAbs multiply(MatrixAbs matrixA, MatrixAbs matrixB) {
        MatrixExt matrixResult = new MatrixExt(new double[matrixA.row][matrixB.colon]);
        if (matrixA.colon == matrixB.row) {
            for (int i = 0; i < matrixA.row; i++) {
                for (int j = 0; j < matrixB.colon; j++) {
                    double sum = 0;
                    for (int e = 0; e < matrixA.colon; e++) {
                        sum += matrixA.array[i][e] * matrixB.array[e][j];
                    }
                    matrixResult.array[i][j] = sum;
                }
            }
            return matrixResult;
        }
        else {
            System.out.println("Умножение матриц невозможно");
        }

        return null;
    }

    @Override
    public MatrixExt multiplyNum(int k) {
        MatrixExt matrixResult = new MatrixExt(new double[row][colon]);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colon; j++) {
                matrixResult.array[i][j] = array[i][j]*k;
            }
        }
        return matrixResult;
    }

    @Override
    public double determinant() {
        double o = 0;
        if(row == 2 && colon == 2){
            o = array[0][0]* array[1][1] - array[0][1]* array[1][0];
            return o;
        } else if (row == 3 && colon == 3) {
            o  = array[0][0] * array[1][1] * array[2][2] +
                 array[0][1] * array[1][2] * array[2][0] +
                 array[0][2] * array[1][0] * array[2][1] -
                    array[0][2] * array[1][1] * array[2][0] -
                    array[0][0] * array[1][2] * array[2][1] -
                    array[0][1] * array[1][0] * array[2][2];
            return o;
        } else {
            System.out.println("Невозможно найти определитель");
        }
        return 0;
    }
}
