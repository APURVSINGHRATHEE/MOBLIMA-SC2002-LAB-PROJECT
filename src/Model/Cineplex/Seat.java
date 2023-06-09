package Model.Cineplex;

/**
 * Class that represents a seat in the seating format of a cinema
 */
public class Seat extends CinemaBlock{
    
    private static final long serialVersionUID = 12324134119L;
    
    /**
     * Row label of the seat
     */
    private String row;
    
    /**
     * Column label of the seat
     */
    private int col;
    
    /**
     * Type of seat
     */
    private SeatType seatType;
    
    /**
     * Seat that this seat is paired with (for double seats)
     */
    private Seat pairedSeat = null;
    
    /**
     * Create a seat at the given X and Y positions and labeled with the 
     * row and column labels.
     *
     * @param xPos     X position where seat is located
     * @param yPos     Y position where seat is located
     * @param row The row label of the seat
     * @param col The column label of the seat
     * @param seatType the enumeration seat type
     */
    public Seat(int xPos, int yPos, String row, 
            int col, SeatType seatType) {
        super(xPos,yPos);
        this.row = row;
        this.col=col;
        this.seatType = seatType;
    }
    
    /**
     * Returns the seat type enumeration of this cinema seat
     * @return Seat Type
     */
    public SeatType getSeatType() {
        return this.seatType;
    }
    
    /**
     * Returns the seat type name of the cinema seat
     * @return Seat Type string
     */
    public String getSeatTypeString() {
        return this.seatType.toString();
    }
    
    /**
     * Change seat type by specifying seat type object
     * @param seatType seat type object
     */
    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }
    
    /**
     * Pair two seats with another seat (for couple seats)
     * @param seat1 Seat to be paired with
     * @param seat2 Seat to pair
     */
    public static final void pairSeat(Seat seat1, Seat seat2) {
        if (!(seat1.equals(seat2))) {
            seat1.pairedSeat = seat2;
            seat2.pairedSeat = seat1;
        }
        
    }
    
    /**
     * Get paired seated
     * @return The seat that this seat is paired with
     */
    public Seat getPairedSeat() {
        return this.pairedSeat;
        
    }
    
    
}
