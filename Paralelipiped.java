public class Paralelipiped extends Geometrical_Figure {
    public Paralelipiped(String name, int perimetr, int square) {
        super(name, perimetr, square);
        System.out.println(get_values());
    }

    public Paralelipiped(String name, int perimetr){
        super(name,perimetr);
        System.out.println(get_values());
    }
}
