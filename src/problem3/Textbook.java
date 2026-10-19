package problem3;

public class Textbook extends Book{
    public String level;
    public Textbook(String title,String author,int nbrPages,String level){
        super(title,author,nbrPages);
        this.level=level;
    }
    public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append(super.toString()).append("\n").append("Level: ").append(level);
        return sb.toString();
    }
}
