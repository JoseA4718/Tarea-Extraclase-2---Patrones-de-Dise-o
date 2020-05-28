package AbstractFactory;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        //Obtenemos la factory de Shape
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //Obtenemos el objeto circulo
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //Llamamos al metodo dibujar de la clase circulo.
        shape1.draw();

        //Obtenemos un objeto de tipo Shape y tipo Rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //Llamamos al metodo dibujar de la clase Rectangle desde el objeto de tipo Shape.
        shape2.draw();

        //Obtenemos un objeto de tipo Shape y tipo Square
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //Llamamos al metodo dibujar de la clase Square desde el objeto de tipo Shape.
        shape3.draw();

        //Obtenemos una factoria de tipo Color
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //Obtenemos un objeto de tipo Color y tipo Red
        Color color1 = colorFactory.getColor("RED");

        //Llamamos al metodo rellenar de la clase Red desde el objeto de tipo Color
        color1.fill();

        //Obtenemos un objeto de tipo Color y tipo Green
        Color color2 = colorFactory.getColor("Green");

        //Llamamos al metodo rellenar de la clase Green desde el objeto de tipo Color
        color2.fill();

        //Obtenemos un objeto de tipo Color y tipo Blue
        Color color3 = colorFactory.getColor("BLUE");

        //Llamamos al metodo rellenar de la clase Blue desde el objeto de tipo Color
        color3.fill();
    }
}
