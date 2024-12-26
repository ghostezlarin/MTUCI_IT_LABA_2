public class Ring extends Geometrical_Figure {
    public Ring(String name, int perimetr, int square){
        super(name, perimetr,square);
        System.out.println(get_values());
    }
    public Ring(String name, int perimetr){
        super(name,perimetr);
        System.out.println(get_values());
    }

    @Override
    void color(){
        System.out.println("Синий");
    }
}
