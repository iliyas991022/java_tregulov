package metanit;

public class Tiger extends Animal{
    private int tooth;
    public Tiger(int tooth,String name, int age, boolean isHishnik, double weight, String... names) {
        super(name, age, isHishnik, weight, names);
        this.tooth= tooth;
    }


    @Override
            public void sayAllNames(){
        for(String i:names) {
            System.out.printf(i);;
        }
    }
}
