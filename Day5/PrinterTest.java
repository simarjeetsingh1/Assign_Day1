class Document {
    String text;

    Document(String text) {
        this.text = text;
    }

    void sendToPrinter(Printer p) {
        p.printDocument(this);
    }
}

class Printer {
    void printDocument(Document doc) {
        System.out.println("Printing: " + doc.text);
    }
}

class PrinterTest {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Document doc = new Document("Hello OOP");

        doc.sendToPrinter(printer);
    }
}
