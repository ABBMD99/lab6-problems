package problem3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.print("Give the capacity of your library: ");
        int n = scan.nextInt();

        Library lib=new Library(n);

        Document d1=new Book("Mouse","Cristoph",210);
        Document d2=new Dictionary("LaRousse","Francais");
        lib.add(d1);
        lib.add(d2);

        int choice;
        do {
            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1. Add a document");
            System.out.println("2. Display all documents");
            System.out.println("3. Delete a document");
            System.out.println("4. Display authors");
            System.out.println("0. Exit");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Title: ");
                    String title = scan.next();
                    System.out.print("Author: ");
                    String author = scan.next();
                    System.out.print("Number of pages: ");
                    int pages = scan.nextInt();
                    if (lib.add(new Book(title, author, pages))) {
                        System.out.println("Book added.");
                    } else {
                        System.out.println("Library is full.");
                    }
                    break;

                case 2:
                    lib.displayDocuments();
                    break;
                case 3:
                    System.out.print("Record number to delete: ");
                    int num = scan.nextInt();
                    Document d = lib.document(num);
                    if (d != null && lib.delete(d)) {
                        System.out.println("Document deleted.");
                    } else {
                        System.out.println("Document not found.");
                    }
                    break;
                case 4:
                    lib.displayAuthors();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }while (choice!=0);

    }
}
