
interface landvehical{
    default void main (){
        System.out.print("land vehical");
    }
}

interface watervehical{
    default void main (){
        System.out.print("Water vehical");
    }
}

interface Myinterfavce{
    void changeCadence(int newValue);
    void speedup();
    void speedDown();
}
public void changeCadence(){
    cadence=a;
}
public void speedup(){
    speed++;
}
public void speedDown(){
    speed--;
}
AmphibiousVehical(){
    System.out.println("this is amphi");
}
void printstates(){
    System.out.println{
        cadence + cadence +
        speed + speed
    }
}

class Interface {

    public static void main(String[] args) {
        AmphibiousVehical veh = new AmphibiousVehical();
        veh.landInfo();
        veh.waterInfo();
        veh.changeCadence(20);
        veh.printStates();
        veh.speedUp();
        veh.printStates();
        veh.speedDown();
        veh.printStates();
    }
}
//