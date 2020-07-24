package strategy;

/**
 * @author admin
 * @description
 * @date 2020-07-24 15:26:08
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
