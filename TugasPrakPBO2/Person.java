//Class Person
public class Person {
    // Atribut private
    private String name;
    private int age;
    private String address;

    // Constructor public
    public Person(String name, int age,String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //Methon Menampilkan Informasi
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address:" + address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}