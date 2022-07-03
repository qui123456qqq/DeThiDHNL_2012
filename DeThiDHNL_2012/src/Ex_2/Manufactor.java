package Ex_2;

public class Manufactor {
    private String nameCompany;
    private String country;

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Manufactor(String nameCompany, String country) {
        this.nameCompany = nameCompany;
        this.country = country;
    }

    public String toString() {
        return ", hãng " + nameCompany + ", " + country;
    }
}
