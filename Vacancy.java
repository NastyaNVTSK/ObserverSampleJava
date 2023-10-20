public class Vacancy {

    private String name;

    private VacancyType type;

    public Vacancy(String name, VacancyType type){
        this.name = name;
        this.type = type;
    }

    public String getNane(){
        return name;
    }

    public VacancyType getType(){
        return type;
    }

    public void setType(VacancyType type) {
        this.type = type;
    }
}

