public interface Publisher {

    void sendOffer(String name, int salary);

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);
    
    void sendVacancy(String name, VacancyType type);
}
