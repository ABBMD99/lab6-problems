package problem3;

public class Book extends Document{
    protected String author;
    protected int nbrPages;

    public Book(String title,String auth, int nbrPages){
        super(title);
        this.author=auth;
        this.nbrPages=nbrPages;
    }

    public String getAuthor() {
        return author;
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Title: ").append(title).append("\n")
                .append("Author: ").append(author).append("\n")
                .append("Number of Pages: ").append(nbrPages).append("\n");
        return sb.toString();

    }
}
