public class Lamp {
 private int  power;

 Lamp(int power){
     this.power=power;
 }

 public void switchLampOnOrOff(){

     if(power==0){
         System.out.println("Your lamp is turn off");
     }

     if(power>0){
         System.out.println("Your lamp lights with " + power + " wattage");
     }

        if(power<0){
            System.out.println("Your lamp is broken :(");
        }
    }
}
