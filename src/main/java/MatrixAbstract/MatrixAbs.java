package MatrixAbstract;
/* В абстрактном классе также можно определить поля и методы,
но в то же время нельзя создать объект или экземпляр абстрактного класса.
Абстрактные классы призваны предоставлять базовый функционал для классов-наследников.
А производные классы уже реализуют этот функционал.

Кроме обычных методов абстрактный класс может содержать абстрактные методы.
 Такие методы определяются с помощью ключевого слова abstract и не имеют никакой реализации:
 */

public abstract class MatrixAbs {

    protected int colon;
    protected int row;
    protected double[][] array;

    public abstract MatrixAbs summ(MatrixAbs matrixA, MatrixAbs matrixB);

    public abstract MatrixAbs multiply(MatrixAbs matrixA, MatrixAbs matrixB);



    public abstract MatrixAbs multiplyNum(int k);

    public abstract double determinant();
}
