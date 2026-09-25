public class Main {
    public static void main(String[] args) {
        Author authorIvan = new Author("Ivan", "Ivanov");
        Author authorPavel = new Author("Pavel", "Pavlov");

        Book bookAction = new Book("Action", authorIvan, 2020);
        Book bookHistorical = new Book("Historical", authorPavel, 1919);

        bookAction.setYear(2000);

        System.out.println(
                bookAction.getName() + " " + bookAction.getYear() + " "
                        + bookAction.getAuthor().getFirstName());
        System.out.println(
                bookHistorical.getName() + " " + bookHistorical.getYear() + " "
                        + bookHistorical.getAuthor().getFirstName());
    }
}