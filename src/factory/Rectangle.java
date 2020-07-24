package factory;

/**
 * @author admin
 * @description
 * @date 2020-07-24 14:22:28
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
