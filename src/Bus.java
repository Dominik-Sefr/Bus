public class Bus {
    private int seats;
    private int line;
    private String name;
    private int passengers;

    public int getPassengers() {
        return passengers;
    }

    public int getSeats() {
        return seats;
    }
    public Bus(int _seats, int _line, String _name){
        seats = _seats;
        line = _line;
        name = _name;
        passengers = 0;
    }
    public Bus(){
        seats = 40;
        passengers = 0;
    }
    public String getBus(){
        String result = ("Autobus číslo " + line + " společnosti " + name + " s počtem sedadel " + seats + " veze " + passengers + " cestujících.");
        return result;
    }
    public void changeName(int _line, String _name){
        line = _line;
        name = _name;
    }
    public String getInfo(){
        String result = ("Linka: " + line + "\nSpolečnost: " + name + "\nPočet sedadel: " + seats + "\nCestujících: " + passengers);
        return result;
    }
    public void add(int _passengers){
        passengers += _passengers;
    }
    public void remove(int _passengers){
        passengers -= _passengers;
    }
    public void clear(){
        passengers = 0;
    }
}
