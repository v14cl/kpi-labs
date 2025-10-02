import java.time.LocalDate;

public class Checkout {
    private Integer checkoutId;
    private Client client;
    private Book book;
    private LocalDate dateTaken;
    private LocalDate deadline;
    private LocalDate dateReturned;

    public Checkout(Integer checkoutId, Client client, Book book, LocalDate dateTaken, LocalDate deadline) {
        this.checkoutId = checkoutId;
        this.client = client;
        this.book = book;
        this.dateTaken = dateTaken;
        this.deadline = deadline;
    }

    public Integer getCheckoutId() {
        return checkoutId;
    }

    public void setCheckoutId(Integer checkoutId) {
        this.checkoutId = checkoutId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getDateTaken() {
        return dateTaken;
    }

    public void setDateTaken(LocalDate dateTaken) {
        this.dateTaken = dateTaken;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public LocalDate getDateReturned() {
        return dateReturned;
    }

    public void setDateReturned(LocalDate dateReturned) {
        this.dateReturned = dateReturned;
    }
}
