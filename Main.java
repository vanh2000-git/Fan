public class Main {
    public static void main(String[] args) {
        Fan fanDefault = new Fan();
        Fan fan = new Fan(Fan.fast, true, 10, "yellow");
        Fan fan2 = new Fan(Fan.medium, false, 5, "Blue");
        System.out.println(fanDefault);
        System.out.println(fan2);
        System.out.println(fan);
    }
}
