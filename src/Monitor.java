public class Monitor {

    private int width;
    private int height;

    public void setlowresolution(){
        width = 800;
        height = 600;
    }

    public void setheightresolution(){
        width = 3840;
        height = 1920;
    }

    public String getresolution(){
        return width + "x" + height;
    }
}
