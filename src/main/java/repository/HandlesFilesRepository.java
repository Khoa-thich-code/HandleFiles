package repository;

import data_access.HandlesFilesDao;
import java.util.ArrayList;
import model.Person;

public class HandlesFilesRepository implements IHandlesFilesRepository{       

    @Override
    public void findPersonInfo() {
        HandlesFilesDao.Instance().findPersonInfo();
    }

    @Override
    public void coppyNewFile() {
        HandlesFilesDao.Instance().coppyNewFile();
    }

    @Override
    public ArrayList<Person> getListPerson(String pathFile) {
        return HandlesFilesDao.Instance().getListPerson(pathFile);
    }

    @Override
    public double getSalary(String salary) {
        return HandlesFilesDao.Instance().getSalary(salary);
    }

    @Override
    public void printListPerson(ArrayList<Person> lp, double money) {
        HandlesFilesDao.Instance().printListPerson(lp, money);
    }

    @Override
    public String getNewContent(String pathFileInput) {
        return HandlesFilesDao.Instance().getNewContent(pathFileInput);
    }

    @Override
    public void writeNewContent(String pathFileOutput, String content) {
        HandlesFilesDao.Instance().writeNewContent(pathFileOutput, content);
    }

    
 
    
    
    
    
}