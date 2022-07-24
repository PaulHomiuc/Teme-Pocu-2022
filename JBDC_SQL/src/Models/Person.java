package Models;

public class Person {
    private  Integer id;
    private String name;
    private  String birthday;
    private  String birthplace;


    public  Person(Integer id, String name, String birthday, String birthplace
    ){
        this.id=id;
        this.name=name;
        this.birthday=birthday;
        this.birthplace=birthplace;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
