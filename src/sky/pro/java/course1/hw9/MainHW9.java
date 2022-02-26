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
        System.out.println("1. " + book1.getTitleBook() + ". " + lTolstoy.getAuthorName() + " " + lTolstoy.getAuthorSurname() + ". " + book1.getYearOfPublication() + " год.");
        System.out.println("2. " + book2.getTitleBook() + ". " + aPushkin.getAuthorName() + " " + aPushkin.getAuthorSurname() + ". " + book2.getYearOfPublication() + " год.");
        System.out.println("3. " + book3.getTitleBook() + ". " + mLermontov.getAuthorName() + " " + mLermontov.getAuthorSurname() + ". " + book3.getYearOfPublication() + " год.");
        System.out.println();
        book1.setYearOfPublication(2022);
        System.out.println("У нас появилось новое издание книги " + book1.getTitleBook());
        System.out.println(book1.getTitleBook() + ". " + lTolstoy.getAuthorName() + " " + lTolstoy.getAuthorSurname() + ". " + book1.getYearOfPublication() + " год.");
    }
}
