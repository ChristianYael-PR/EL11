interface Figure {
    String getColor();
    double perimetro();
    double area();
}

class Triangle implements Figure {
    private String color;
    private double base, altura, lado1, lado2, lado3;

    public Triangle(String color, double base, double altura, double lado1, double lado2, double lado3) {
        this.color = color;
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double perimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public double area() {
        return (base * altura) / 2;
    }
}

class Circle implements Figure {
    private String color;
    private double radio;

    public Circle(String color, double radio) {
        this.color = color;
        this.radio = radio;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }
}

class Rectangle implements Figure {
    private String color;
    private double largo, ancho;

    public Rectangle(String color, double largo, double ancho) {
        this.color = color;
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double perimetro() {
        return 2 * (largo + ancho);
    }

    @Override
    public double area() {
        return largo * ancho;
    }
}

class Hexagon implements Figure {
    private String color;
    private double lado;

    public Hexagon(String color, double lado) {
        this.color = color;
        this.lado = lado;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double perimetro() {
        return 6 * lado;
    }

    @Override
    public double area() {
        return (3 * Math.sqrt(3) * Math.pow(lado, 2)) / 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Figure[] shapes = {
            new Triangle("red", 3, 4, 3, 4, 5),
            new Circle("blue", 5),
            new Rectangle("green", 4, 6),
            new Hexagon("yellow", 2)
        };

        for (Figure shape : shapes) {
            System.out.println("Color: " + shape.getColor() + ", Perimeter: " + shape.perimetro() + ", Area: " + shape.area());
        }
    }
}
