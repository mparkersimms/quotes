package quotes;

public class Quote {
    String author;
    String text;

    public Quote(String text, String author) {
        this.author = author;
        this.text = text;

    }
    public String toString(){
        return String.format("This is the author: %s, this is the quote: %s", author, text);
    }
}
