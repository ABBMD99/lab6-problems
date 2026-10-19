package problem3;

public class Document {
    private static int count=0;
    protected int numRec;
    protected String title;
    private Library library;

    public Document(String title){
        this.numRec=++count;
        this.title=title;
    }

    public int getNumRec() {
        return numRec;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public String toString(){
        return "Title of document: "+this.title;
    }

}
