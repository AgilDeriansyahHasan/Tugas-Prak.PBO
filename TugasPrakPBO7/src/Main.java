public class Main {
    public static void main(final String[] args) throws Exception {
        Luar l = new Luar();
        Luar.Dalam d = l.new Dalam();
        d.bicara();

        MOuter that = new MOuter();
        that.go((int)(Math.random() * 100), (int)(Math.random() * 100));

        MassagePrinter printer = new MassagePrinter() {
            public void printMassage() {
                System.out.println("Pesan from anonymous function");
            }
        };
        printer.printMassage();
    }
}