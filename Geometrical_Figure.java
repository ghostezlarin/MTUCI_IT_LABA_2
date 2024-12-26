public abstract class Geometrical_Figure {
    private String name;
    private int perimetr;
    private int square;
    public static int counter = 0;

    public Geometrical_Figure (String name, int perimetr, int square){
        this.name = name;
        this.perimetr = perimetr;
        this.square = square;
        counter++;
    }

    public Geometrical_Figure (String name, int perimetr){
        this.name = name;
        this.perimetr = perimetr;
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPerimetr() {
        return perimetr;
    }

    public void setPerimetr(int perimetr) {
        this.perimetr = perimetr;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public String get_values(){
        return "Название фигуры: " + name + " " + "Периметр фигуры: " + perimetr + " " + "Площадь фигуры: " + square;
    }

    void color(){
        System.out.println("Цвет фигуры: ");
    }

    public static int get_Counter(){
        return counter;
    }
}
