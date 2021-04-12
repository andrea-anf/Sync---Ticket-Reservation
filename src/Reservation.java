public class Reservation {
    private volatile Integer tickets;

    public Reservation(){
        tickets = 5;
    }

    //funziona??
    public synchronized Integer checkTickets(){
        if(tickets < 1){
            return -1;
        }
        tickets--;
        return tickets;
    }
}
