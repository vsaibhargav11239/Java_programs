interface Printer {
    void print();
}

interface ScannerDevice {
    void scan();
}

class MultiFunctionPrinter implements Printer, ScannerDevice {
    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }

    public static void main(String[] args) {
        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.print();
        mfp.scan();
    }
}