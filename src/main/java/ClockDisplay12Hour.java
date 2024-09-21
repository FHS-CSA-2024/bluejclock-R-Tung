package src.main.java;


public class ClockDisplay12Hour
{
    //Extend ClockDisplay for a 12 hour clock. This means you need to track AM/PM
    //Update all methods and parameters to accomodate this change
    
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String display;
    private String period; //for am or pm
    
    public ClockDisplay12Hour()
    {
        hours = new NumberDisplay(12);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }
    
    
    public ClockDisplay12Hour(int hour, int minute, String period)
    {
        hours = new NumberDisplay(12);
        minutes = new NumberDisplay(60);
        setTime(hour, minute, period);
    }
    
    public void timeTick()
    {
        minutes.increment();
        
        if (minutes.getValue() == 0)
        {
            hours.increment();
        }
        if (hours.getValue() == 0)
        {
            if (period.equals("AM"))
            {
                period = "PM";
            }
            else
            {
               period = "AM"; 
            }
        }
        updateDisplay();
    }
    
    public void setTime(int hour, int minute, String period)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        this.period = period;
        updateDisplay();
    }
    
    public String getTime(){
        return display + " " + period; 
    }
    
    public void updateDisplay(){
        String output = "";
        if (hours.getValue() == 0)
        {
            output = "12" + ":" + minutes.getDisplayValue();
        }
        else
        {
            output = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
        }
        display = output;
    }
}
