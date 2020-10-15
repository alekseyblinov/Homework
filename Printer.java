package Homework;

public class Printer {
    String documentType;
    String documentPaperSize;
    int paperCount;

    static int count = 0;
}
class Photo {
    String color;
    int size;
    String photoType;

    public Photo(String color, int size, String photoType) {
        this.color = color;
        this.size = size;
        this.photoType = photoType; // фотография на визу/обычное фото/фото на паспорт

        System.out.println("Вы печатаете фотографию");
        System.out.println("Фотография цветная/чёрно белая: " + color);
        System.out.println("Фотография на: " + photoType);
    }
}