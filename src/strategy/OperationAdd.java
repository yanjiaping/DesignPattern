package strategy;

/**
 * @author admin
 * @description
 * @date 2020-07-24 15:24:24
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
