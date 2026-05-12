package app;

public class Address{
    private String streetName;
    private String city;
    private String state;
    private String country;
    private String zipCode;
    private String number;
    private String complement;

    public Address(String streetName, String city, String state, String country, String zipCode, String number, String complement){
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
        this.number = number;
        this.complement = complement;
    }

    public String getStreetName(){
        return this.streetName;
    }

    public void setStreetName(String streetName){
        this.streetName = streetName;
    }

    public String getCity(){
        return this.city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getState(){
        return this.state;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getCountry(){
        return this.country;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public String getZipCode(){
        return this.zipCode;
    }

    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public String getComplement(){
        return this.complement;
    }

    public void setComplement(String complement){
        this.complement = complement;
    }

    public String toString(){
        return "Address: " + this.streetName
            + "\nNumber: " + this.number
            + "\nComplement: " + this.complement
            + "\nCity: " + this.city
            + "\nState: " + this.state
            + "\nCountry: " + this.country
            + "\nZIP code: " + this.zipCode;
    }
}
