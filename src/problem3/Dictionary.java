package problem3;

public class Dictionary extends Document{
    private String language;

    public Dictionary(String title,String language){
        super(title);
        this.language=language;
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Title :").append(title).append("\n")
                .append("A ").append(language).append(" dictionary.");
        return sb.toString();
    }
}
