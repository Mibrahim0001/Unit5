package wp_7;

public class Pruebas {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "red", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(s1.getRadius()); // getRadius es un metodo de la subclase

        Circle c1 = (Circle) s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        Shape s2 = new Shape(); // No se puede crear una instancia de una clase abstracta
        Shape s3 = new Rectangle(1.0, 2.0, "red", false);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        System.out.println(s3.getLength());// getLength es un metodo de la subclase
    }
}
