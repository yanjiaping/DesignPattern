package factory;

/**
 * @author admin
 * @description
 * @date 2020-07-24 14:24:31
 */
public class ShapeFactory {

    /**
     * getShape 方法获取形状类型的对象
     */
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
