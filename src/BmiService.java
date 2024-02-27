public class BmiService {

    public double calculate(int weightKg, double heightM) {

        double doubleHeight = heightM * heightM;
        double index = weightKg / doubleHeight;
        int bmi = (int) index;
        return bmi;
    }
}
