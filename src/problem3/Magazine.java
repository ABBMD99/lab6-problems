package problem3;

public class Magazine extends Document {
    private String month;
    private int year;

    public Magazine(String title,String month, int year){
        super(title);
        this.month=month;
        this.year=year;
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Title: ").append(title).append("\n")
                .append("month: ").append(month).append("\n")
                .append("Year: ").append(year).append("\n");
        return sb.toString();

    }
}
