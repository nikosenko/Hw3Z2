public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double index = service.calculate(98, 1.87);
        int bmi = (int) index;
        System.out.println(bmi);
    }
}