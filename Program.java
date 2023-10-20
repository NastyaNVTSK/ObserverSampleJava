public class Program {
    public static void main(String[] args) {

        Publisher jobAgancy = new JobAgency();

        Company google = new Company("Goole", 120000, jobAgancy);
        Company yandex = new Company("Yandex", 95000, jobAgancy);
        Company geekbrains = new Company("Geekbrains", 98000, jobAgancy);

        Student student1 = new Student("Студент №1");
        Master master1 = new Master("Мастер №1");
        Master master2 = new Master("Мастер №2");

        jobAgancy.registerObserver(student1);
        jobAgancy.registerObserver(master1);
        jobAgancy.registerObserver(master2);

        for(int i = 0; i<3; i++){
            
            google.needEmployee();
            yandex.needEmployee();
            geekbrains.needEmployee();

        }

        jobAgancy.sendVacancy("Вакансия 1", VacancyType.FullTime);
        jobAgancy.sendVacancy("Вакансия 2", VacancyType.PartTimeJob);
        jobAgancy.sendVacancy("Вакансия 3", VacancyType.Freelanc);
    }
}
