class Luar {
    private String outerVariable = "Variabel Luar";

    class Dalam {
        String InnerVariable = "Variabel dalam";

        public void bicara() {
            System.out.println(InnerVariable);
            System.out.println(outerVariable);
        }
    }
}

interface MassagePrinter {
    void printMassage();
}