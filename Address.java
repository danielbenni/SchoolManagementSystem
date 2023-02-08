package ArockiaMatha;

public class Address {
    private String street;
    private String city;
    private String state;
    private int pinCode;

    public Address(String street, String city, String state, int pinCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int pinCode() {
        return pinCode;
    }
    public String toString(){
        return " Street :- "+getStreet()+" & City :- "+getCity()+" & State :-"+getState()+" & PinCode :- "+pinCode();
    }
}

