package Models;

public class Phone_Number {
    Integer id;
    Integer number;
    String service_provider;

    public Phone_Number(Integer id, Integer number, String service_provider)
    {
        this.id=id;
        this.number=number;
        this.service_provider=service_provider;
    }

    public Integer getId() {
        return id;
    }

    public Integer getNumber() {
        return number;
    }

    public String getService_provider() {
        return service_provider;
    }
}
