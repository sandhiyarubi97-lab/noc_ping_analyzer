public class Projec1Loops {
    public static void main(String[]args) {
        String[] devices = {"Router-CBE-01", "Switch-CBE-02", "Server-CHN-01", "Firewall-01", "DB-Server"};

        for (int i=0; i<devices.length; i++) {
            System.out.println("Checking " + devices[i] + "...");

            if (i % 2 == 0) {
                System.out.println(devices[i] + "-> UP");
            } else {
                System.out.println(devices[i] + "-> DOWN Ticket Created");
            }
        }
    }
}
