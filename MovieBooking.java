package Project;

class User {

    String username, address, password, phone_number;
    
    User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    void buyTicket() {

    }
    void showTicket() {

    }
    void cancelTicket() {

    }
    void logout() {

    }
}
class Schedule {
    String showtime;
    String movie;
    String cinema;
    Schedule(int movie, int showtime) {

    }
}

class ticket {
    String ticket;
    String user;
    String Schedule;
    String selected_seats;
    String paymentStatus;
}
public class MovieBooking {
    public static void main(String[] args) {
        
    }
}