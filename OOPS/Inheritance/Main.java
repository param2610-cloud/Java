public class Main {
    public static void main(String[] args) {
        LibraryItem item = new LibraryItem("The journey to the center of the earth", "Jules Verne", 1864);
        System.out.println(item.getDetails());
        System.out.println(item.checkAvailbility());
        Book book = new Book("Sherlock Holmes - The Complete Collection","Sir Arthur Conan Doyal", 1892, "9780719503566", "Mystry");
        System.out.println(book.getBookInfo());
        Magazine magazine = new Magazine("The Magazine", "Aythor", 2020, 45, "Publiser Company");
        System.out.println(magazine.getMagazineInfo());
        DVD dvd = new DVD("Tom And Jerry", "Tom,Jerry", 1990, 200, "Tom Jerry");
        System.out.println(dvd.getDVDInfo());
    }
    
}
