public class Car {
    private String Type;
    private int Year;

    public Car(String s, int t) {
        Type = s;
        Year = t;
    }

    //compare based on year
    public int compareByYear(Car o) {
        //using integer compare method because year is int
        return this.Year - o.Year;
    }

    //compare based on car type
    public int compareByType(Car o) {
        //since car type is a String here you are using the string compareTo function
        return this.Type.compareTo(o.Type);
    }
    @Override
    public String toString() {
        return "Car{" + "Type='" + Type + '\'' + ", Year=" + Year + '}';
    }
}
