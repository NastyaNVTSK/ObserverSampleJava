import java.util.Random;

public class Company{

    private Random random = new Random();

    private String name;

    private int maxSalary;

    private Publisher jobAgency;

    public Company(String name, int maxSalary, Publisher jobAgency){
        this.name = name;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }
    public void needEmployee(){

        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, salary);
        publishVacancy(name, getRandomVacancyType());
    }

    private void publishVacancy(String name, VacancyType type) {
        
        jobAgency.sendVacancy(name, type);
    }

    private VacancyType getRandomVacancyType() {
        
        return VacancyType.values()[random.nextInt(VacancyType.values().length)];
    }
}