package strategy;

/**
 * @author admin
 * @description
 * @date 2020-07-24 15:25:45
 */
public class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
