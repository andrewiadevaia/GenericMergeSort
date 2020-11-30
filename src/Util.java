import java.util.Comparator;

public class Util {
    public static Comparator<String> stringComparator() {
        return String::compareTo;
    }

    public static Comparator<Integer> integerComparator() {
        return Integer::compareTo;
    }

    public static Comparator<Double> doubleComparator() {
        return Double::compareTo;
    }

    public static Comparator<Car> carYearComparator() {
        return Car::compareByYear;
    }

    public static Comparator<Car> carTypeComparator() {
        return Car::compareByType;
    }
}
