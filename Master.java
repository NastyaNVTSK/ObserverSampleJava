public class Master implements Observer {

    private String name;

    private int salary = 80000;

    public Master(String name){

        this.name = name;
        
    }

    public void reciveOffer(String nameCompany, int salary){ 

        if(this.salary <= salary){ 

            System.out.printf("Специалист %s: Мне нужн эта работа! (компания: %s; заработная плта: %d)\n", name, nameCompany, salary); 
        this.salary = salary; 
    } 
    else{ 
        System.out.printf("Специалист %s: Я найду работк получше! (компания: %s; заработная плта: %d)\n", name, nameCompany, salary); 
    } 
}

    public void receiveVacancy(String name, VacancyType type) {
        
        System.out.printf("Специалист %s: Получил предложение о вакансии \"%s\" типа %s",name, name, type);
    }
    }

