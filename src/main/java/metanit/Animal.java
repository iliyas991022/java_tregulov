package metanit;

public abstract class Animal {
    int id;
    String name;
     int age;
     boolean isHishnik;
     double weight;
    String[] names;
     public static int counter;

    static {
        counter = 1;
        System.out.printf("Static inizialized");
    }

    {
        name = "Undifined";
        age = 0;
        isHishnik = false;
        weight = 0;
        names = new String[0];
    } //инициализатор

    public Animal(String name, int age, boolean isHishnik, double weight, String ...names) {
        this.id = counter++;
        this.name = name;
        this.age = age;
        this.isHishnik = isHishnik;
        this.weight= weight;
        this.names = names;
    }
    public Animal(String name, int age) {
        this(name, age, true, 100, "animal");
    }


    public void sayAllNames() {
        for(String i:names) {
            System.out.printf(i);;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        switch (age){
            case 3:
                System.out.printf("three ");
                break;
            case 5:
                System.out.printf("four");
                break;
            default:
                System.out.printf("ooo shit");
        }
        if (age > 50) {
            this.age = 50;
        } else if(age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }

    }

    public boolean isHishnik() {
        return isHishnik;
    }
    public void setHishnik(boolean isHishnik) {

        this.isHishnik = isHishnik;
    }

    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        String z = (weight > 100) ? "its big" : "norm";
        System.out.printf(z);
        this.weight = weight;
    }

    public static void changeAnimalName(Animal p, String name1) {
        p.setName(name1);
    } //обьект в качестве параметра
}

