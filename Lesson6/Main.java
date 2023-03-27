package Lesson6;

import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Notebook Notebook1 = new Notebook("Notebook 1", 8, "Windows11", 80000, "HP",15.6);
        Notebook Notebook2 = new Notebook("Notebook 2", 16, "Windows11", 85000, "Asus",14.6);
        Notebook Notebook3 = new Notebook("Notebook 3", 32, "macOS", 85000, "Lenovo", 15.6);
        Notebook Notebook4 = new Notebook("Notebook 4", 64, "linux", 90000, "Lenovo", 15.6);
        Notebook Notebook5 = new Notebook("Notebook 5",16,"linux",236900,"Apple", 15.6);
        Notebook Notebook6 = new Notebook("Notebook 6", 8,"Windows10",65000,"Asus", 15.6);

        List<Notebook> notebookList = List.of(Notebook1,Notebook2,Notebook3,Notebook4,Notebook5,Notebook6);

        Operations operation;
        operation = new Operations(notebookList);
        operation.start();

    }
    
}
