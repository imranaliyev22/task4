public class Main {
    public static void main(String[] args) {
        Test<Integer> test = new Test<>();
        test.add(1);
        System.out.println(test.get());
    }
}