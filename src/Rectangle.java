public class Rectangle extends Figure implements Drawable{
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        setName("Pryamougolnic:");
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void calculetePerimetr() {
        System.out.println(getName()+(sideA + sideB)*2);
    }

    @Override
    public void Drawable() {
        System.out.println("\uD83D\uDD33");
    }
}
