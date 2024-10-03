public class Dog extends Animal implements Pet {
    private String name;

    public Dog() {
        super(4);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        System.out.println("Dog name is :" + name);
    }

    @Override
    public void play() {
        System.out.println("Dog is Playing");
    }

    @Override
    public void eat() {
        System.out.println("Dog is Eating");
    }

    @Override
    public void walk() {
        System.out.println("Dog is Walking");
    }
}
