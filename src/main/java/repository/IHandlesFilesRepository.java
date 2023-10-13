package repository;

import java.util.ArrayList;
import model.Person;

public interface IHandlesFilesRepository {
    
    void findPersonInfo();
    
    void coppyNewFile();
    
    ArrayList<Person> getListPerson(String pathFile);
    
    double getSalary(String salary);
    
    void printListPerson(ArrayList<Person> lp, double money);
    
    String getNewContent(String pathFileInput);
    
    void writeNewContent(String pathFileOutput, String content);
    
    
}