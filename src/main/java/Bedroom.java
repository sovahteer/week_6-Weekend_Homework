public class Bedroom extends Room {

    private BedroomType type;


    public Bedroom( String roomNumber, BedroomType type ) {
        super(roomNumber, type.getSize());
        this.type = type;



    }

    public String getType(){
        return type.getType();
    }

    public double getRate(){
        return type.getRate(); }
}
