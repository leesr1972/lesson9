package sky.pro.java.course1.hw9;

public class MainHW9 {

    public static void main(String[] args) {
        System.out.println("В нашей библиотеке можно взять следующие книги:");
        Author lTolstoy = new Author("Лев", "Толстой");
        Author aPushkin = new Author("Александр", "Пушкин");
        Author mLermontov = new Author("Михаил", "Лермонтов");
        Book book1 = new Book("Война и мир", lTolstoy, 1985);
        Book book2 = new Book("Золотая рыбка", aPushkin, 1992);
        Book book3 = new Book("Бородино", mLermontov, 2015);
        Book[] catalog = {book1, book2, book3};
        System.out.println("В нашей библиотеке можно взять следующие книги:");
        for (int i = 0; i < catalog.length; i++) {
            System.out.println((i+1) + ". " + catalog[i]);
        }
    }
}
