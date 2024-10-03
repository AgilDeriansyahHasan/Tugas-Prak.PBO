public class Cat extends Animal implements Pet {
    private String name;

    public Cat(){
        super(4);
        this.name=name;
    }

    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public void setName(String name){
        System.out.println("Cat's name is :" + name);
    }

    @Override
    public void play(){
        System.out.println("Cat is playing.");
    }

    @Override
    public void eat(){
        System.out.println("Cat is eating");
    }

    @Override
    public void walk(){
        System.out.println("Cat is Walking");
    }
}
