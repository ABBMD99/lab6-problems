package problem3;

import javax.print.Doc;
import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Document> docs;

    public Library(int capacity){
        this.capacity=capacity;
        docs=new ArrayList<>();
    }
    public void displayDocuments(){
        for(Document d:docs){
            System.out.println(d.toString());
        }
    }
    public boolean add(Document doc){
        if(doc==null ||docs.size()==capacity){
            return false;
        }
        docs.add(doc);
        doc.setLibrary(this);
        return true;
    }

    public boolean delete(Document doc){
        boolean res=docs.remove(doc);
        if(res) doc.setLibrary(null);
        return res;
    }

    public Document document(int numEnrg){

        for(Document d:docs){
            if(d.getNumRec()==numEnrg){
                return d;
            }
        }
        return null;
    }

    public void displayAuthors(){
        for(Document d:docs){
            if(d instanceof Book){
                System.out.println(((Book) d).getAuthor());
            }
        }
    }


}
