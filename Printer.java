package Homework;

public class Printer {
    String documentType;
    String documentPaperSize;
    int paperCount;

    Printer (String documentType, String documentPaperSize, int paperCount) {
        this.documentType = documentType;
        this.documentPaperSize = documentPaperSize;
        this.paperCount = paperCount;

        System.out.println("Тип документа: " + documentType);
        System.out.println("Размер бумаги для печати: " + documentPaperSize);
        System.out.println("Количество копий: " + paperCount);
    }
}

class PrinterTest {
    public static void main(String[] args) {
        Printer P1 = new Printer("Photo", "10x15", 4);
        System.out.println();
        Printer P2 = new Printer("Report", "A4", 20);
        System.out.println();
        Printer P3 = new Printer("Scheme", "A2",1);
    }
}