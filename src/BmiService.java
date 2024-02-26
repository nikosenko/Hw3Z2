public class BmiService {

    public double calculate(int weightKg, double heightM) {

        double doubleHeight = heightM * heightM;
        double index = weightKg / doubleHeight;

        return index;
    }
}
