public interface Observer { 

    void reciveOffer(String nameCompany, int salary);
    
    void receiveVacancy(String name, VacancyType type);
}
