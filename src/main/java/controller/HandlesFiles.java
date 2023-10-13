package controller;

import model.Person;
import repository.HandlesFilesRepository;

import view.Menu;
import repository.IHandlesFilesRepository;

public class HandlesFiles extends Menu<String>{
    static String[] mc = {"Find person info", "Copy Text to new file", "Exit"};
    
    private IHandlesFilesRepository handlesFilesRepository;
    
    protected Person person;
    
    public HandlesFiles(Person person) {
        super("=====================  File Processing =====================", mc);
        handlesFilesRepository = new HandlesFilesRepository();
        person = new Person();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                handlesFilesRepository.findPersonInfo();
                break;
            case 2:
                handlesFilesRepository.coppyNewFile();
                break;
            case 3:
                System.out.println("Exit the program successfully!");
                System.exit(0);
                break;
        }
    }   
    
}