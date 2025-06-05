enum DaysOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

//super class 
class DisplayWeek {
    private String name;

    public DisplayWeek(String name){
        this.name = name;
    }
    //method to display the days 
    public void displayDays(){
        System.out.print(name + ":");
        for (DaysOfWeek day: DaysOfWeek.values()){
            System.out.println("- " + day);
        }
    }
}

//subclass 
class DetailedDisplay extends DisplayWeek {
    public DetailedDisplay(String name){
        super(name); //uses inheritance to call on super class constructor 
    }

    //override the method from the super class 
    @Override
    public void displayDays(){
      super.displayDays();    
    }

    //add more methods like display weekend
    public void displayWeekend(){
     DaysOfWeek[] days = DaysOfWeek.values();
     System.out.println("Weekend: " + days[5] +  " and " + days[6]);   
    }

    public void displayWeekdays(){
        DaysOfWeek[] days = DaysOfWeek.values();
        System.out.println("Weekdays: ");
        for (int i = 0; i < 5; i++) { // MONDAY to FRIDAY
            System.out.println("- " + days[i]);
        }
    }
 
}

//main  
public class DaysOfTheWeek{
    public static void main(String[] args) {
        //using super 
        DisplayWeek Simple = new DisplayWeek("Simple week");
        Simple.displayDays();

        System.out.println();
        //using sub class 

        DetailedDisplay detailed = new DetailedDisplay("Detailed Week");
        detailed.displayDays();
        detailed.displayWeekend();
        detailed.displayWeekdays();

    }

}
