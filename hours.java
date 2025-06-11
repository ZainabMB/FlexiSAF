interface HoursInDay {
    int CountHours();
    void CalculateHours(int NoOfDays);
}
class Day implements HoursInDay{
    @Override
    public int CountHours(){
        return 24;
    }
    @Override
    public void CalculateHours(int NoOfDays){
        int ans= NoOfDays * CountHours();
        System.out.println("There are " + ans + " hours in this day/s");
    }
}
public class hours{
public static void main(String[] args){
    Day thursday = new Day();
    thursday.CountHours();
    thursday.CalculateHours(1);

    Day weekend = new Day();
    weekend.CountHours();
    weekend.CalculateHours(2);
}}