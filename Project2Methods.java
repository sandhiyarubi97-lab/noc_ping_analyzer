public class Project2Methods {
    public static void checkAndTickets(String device, int ping) {
        if (ping < 100) {
            System.out.println(device + "UP Ping: " + ping + "ms");
        } else {
            System.out.println(device + "DOWN Ping: " + ping + "ms");
            System.out.println("-> Ticket Created for " + device);
        }
    }
    public static void main(String[] args) {
        checkAndTickets("Router-CBE-01", 45);
        checkAndTickets("Server-CBE-02", 250);
        checkAndTickets("Firewall-01", 80);
    }
}
