public class Bear {

    private String name;
    private int age;
    private double weight;

    //constructor
    public Bear(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //getter
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public double getWeight(){
        return this.weight;
    }

    public boolean readyToHibernate(){
        if (this.weight >= 80.00){
            return true;
        }
        return false;
    }
}
