package problem3;

import org.w3c.dom.css.DocumentCSS;

import javax.print.Doc;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Give the capacity of your library: ");
        int n=scan.nextInt();

        Library lib=new Library(n);
        Document d1=new Book("Mouse","Cristoph",210);
        Document d2=new Dictionary("LaRousse","Francais");



        lib.add(d1);
        lib.add(d2);

        lib.displayDocuments();
        lib.displayAuthors();

    }
}
