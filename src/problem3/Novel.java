package problem3;

public class Novel extends Book{
    public double price;
    public Novel(String title,String author,int nbrPages,double price){
        super(title,author,nbrPages);
        this.price=price;
    }
    public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append(super.toString()).append("\n").append("Price: ").append(price);
        return sb.toString();
    }


}
