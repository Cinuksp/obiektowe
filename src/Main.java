public class Main {
    public static void main(String[] args) {

Monitor monitor = new Monitor();

        System.out.println(monitor.getresolution());
        monitor.setlowresolution();
        System.out.println(monitor.getresolution());

    }
}