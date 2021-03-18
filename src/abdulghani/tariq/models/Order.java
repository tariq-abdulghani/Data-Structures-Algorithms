package abdulghani.tariq.models;

public enum Order {
    ASC(0),
    DESC(1);

    private int value;
    Order(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
