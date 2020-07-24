package factory;

/**
 * @author admin
 * @description
 * @date 2020-07-24 14:23:43
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
