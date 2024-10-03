public class Main {
    public static void main (String[] args){
        Spider labalaba = new Spider();
        System.out.println("Spider name is : Andrew");
        labalaba.walk();
        labalaba.eat();
        
        Cat kucing = new Cat() ;
        kucing.setName("Garfil");
        kucing.play();
        kucing.eat();
        kucing.walk();

        Dog anjing = new Dog();
        anjing.setName("Scooby-Doo");
        anjing.play();
        anjing.eat();
        anjing.walk();
    }

}
