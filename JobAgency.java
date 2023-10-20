import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher{

    private List<Observer> observers = new ArrayList<>();

    public void sendOffer(String nameCompany, int salary){

        for(Observer observer : observers){

            observer.reciveOffer(nameCompany, salary);
        }
    }

    public void sendVacancy(String name, VacancyType type) {

        for (Observer observer : observers) {

            observer.receiveVacancy(name, type);
        }
    }
    public void registerObserver(Observer observer){

        observers.add(observer);
    }
     public void removeObserver(Observer observer){
        
        observers.remove(observer);
    }
}