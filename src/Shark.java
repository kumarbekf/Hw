public class Shark implements SwimAble{
    private String name;

    public Shark(String name) {
        this.name=name;
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
