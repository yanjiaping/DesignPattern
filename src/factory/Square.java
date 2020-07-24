package factory;

/**
 * @author admin
 * @description
 * @date 2020-07-24 14:23:14
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
