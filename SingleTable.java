public class SingleTable {
    private int seats;
    private double viewQuality;
    private int height;
    public SingleTable(int s, double v, int h)
    {
        seats = s;
        viewQuality = v;
        height = h;
    }

    public int getNumSeats() {
        return seats;
    }


    /** Returns the height of this table in centimeters. */
    public int getHeight() {
        return height;
    }


    /** Returns the quality of the view from this table. */
    public double getViewQuality() {
        return viewQuality;
    }


    /** Sets the quality of the view from this table to value . */
    public void setViewQuality(double value) {
        viewQuality = value;
    }
}
