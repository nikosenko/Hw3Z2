public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int index = service.calculate(55, 1.67);

        System.out.println(index);
    }
}