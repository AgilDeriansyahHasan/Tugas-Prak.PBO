public class App {
    public static int angka = 10;

    static{
        System.out.println("ini block");
    }
    static class Inner{
        void sapa(){
            System.out.println("Hallo");
        }
    }
    public static void getAngka(){
        System.out.println(App.angka);
    }

    public static void main (String[] args){
        App.Inner inner = new App.Inner();
        inner.sapa();
        App.getAngka();
    }
}