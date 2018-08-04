public enum BedroomType {
    SINGLE("Single", 1, 25.00),
    DOUBLE("Double", 2, 50.00);

    private final String type;
    private int size;
    private final double rate;

    BedroomType(String name, int size, double rate){
        this.type = name;
        this.rate = rate;
        this.size = size;
    }

    public String getType(){
        return this.type;
    }
    public int getSize() { return this.size; }
    public double getRate(){
        return this.rate;
    }
}
