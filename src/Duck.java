public class Duck implements SwimAble{
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void Swim() {
        System.out.println(name+" is Swim");
    }
}
