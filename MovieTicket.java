package MovieTicketBookingSystem;

class Admin{
    String userName;
    String password;

    Admin(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    void login(){

    }
    void addSchedule(){

    }
    void deleteSchedule(){

    }
    void viewSchedule(){

    }
    void editSchedule(){

    }
    
}

class Schedule{
    String movie;
    String showtime;
    String cinema;

    Schedule(String movie, String showtime, String cinema) {
        this.movie = movie;
        this.showtime = showtime;
        this.cinema = cinema;
    }

}
class ticket {
    String ticket;
    String user;
    String Schedule;
    String selected_seats;
    String paymentStatus;
}

public class MovieTicket {
    public static void main(String[] args) {
        
    }
    
}