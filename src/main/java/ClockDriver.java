package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        ClockDisplay test1 = new ClockDisplay();
        String test1Output = test1.getTime();
        System.out.println("Empty Con. Test - " + test1Output);
        
        ClockDisplay test2 = new ClockDisplay(3, 45);
        String test2Output = test2.getTime();
        System.out.println("2 Arg. Con. Test - " + test2Output);
        
        ClockDisplay tickTest1 = new ClockDisplay(3, 32);
        System.out.println("\tTick Test 1 PreTick - " + tickTest1.getTime());
        tickTest1.timeTick();
        System.out.println("\tTest Test 1 PostTick - " + tickTest1.getTime());
        
        ClockDisplay tickTest2 = new ClockDisplay(3, 9);
        System.out.println("\tTick Test 2 PreTick - " + tickTest2.getTime());
        tickTest2.timeTick();
        System.out.println("\tTick Test 2 PostTick - " + tickTest2.getTime());
        
        ClockDisplay tickTest3 = new ClockDisplay(1, 59);
        System.out.println("\tTick Test 3 PreTick - " + tickTest3.getTime());
        tickTest3.timeTick();
        System.out.println("\tTick Test 3 PostTick - " + tickTest3.getTime());
        
        ClockDisplay tickTest4 = new ClockDisplay(9, 59);
        System.out.println("\tTick Test 4 PreTick - " + tickTest4.getTime());
        tickTest4.timeTick();
        System.out.println("\tTick Test 4 PostTick - " + tickTest4.getTime());
        
        ClockDisplay tickTest5 = new ClockDisplay(23, 59);
        System.out.println("\tTick Test 5 PreTick - " + tickTest5.getTime());
        tickTest5.timeTick();
        System.out.println("\tTick Test 5 PostTick - " + tickTest5.getTime());
        
        
        
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        
        ClockDisplaySeconds tickTest6 = new ClockDisplaySeconds(3, 32, 59);
        System.out.println("\tTick Test 6 PreTick - " + tickTest6.getTime());
        tickTest6.timeTick();
        System.out.println("\tTick Test 6 PostTick - " + tickTest6.getTime()); 
        
        ClockDisplaySeconds tickTest7 = new ClockDisplaySeconds(1, 00, 59);
        System.out.println("\tTick Test 7 PreTick - " + tickTest7.getTime());
        tickTest7.timeTick();
        System.out.println("\tTick Test 7 PostTick - " + tickTest7.getTime()); 
        
        ClockDisplaySeconds tickTest8 = new ClockDisplaySeconds(1, 59, 59);
        System.out.println("\tTick Test 8 PreTick - " + tickTest8.getTime());
        tickTest8.timeTick();
        System.out.println("\tTick Test 8 PostTick - " + tickTest8.getTime()); 
        
        ClockDisplaySeconds tickTest9 = new ClockDisplaySeconds(23, 59, 59);
        System.out.println("\tTick Test 9 PreTick - " + tickTest9.getTime());
        tickTest9.timeTick();
        System.out.println("\tTick Test 9 PostTick - " + tickTest9.getTime()); 
        
        
        
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
        
        ClockDisplay12Hour tickTest10 = new ClockDisplay12Hour(3, 32, "PM");
        System.out.println("\tTick Test 10 PreTick - " + tickTest10.getTime());
        tickTest10.timeTick();
        System.out.println("\tTick Test 10 PostTick - " + tickTest10.getTime()); 
        
        ClockDisplay12Hour tickTest11 = new ClockDisplay12Hour(11, 59, "PM");
        System.out.println("\tTick Test 11 PreTick - " + tickTest11.getTime());
        tickTest11.timeTick();
        System.out.println("\tTick Test 11 PostTick - " + tickTest11.getTime()); 
        
        ClockDisplay12Hour tickTest12 = new ClockDisplay12Hour(11, 59, "AM");
        System.out.println("\tTick Test 12 PreTick - " + tickTest12.getTime());
        tickTest12.timeTick();
        System.out.println("\tTick Test 12 PostTick - " + tickTest12.getTime()); 
        
        ClockDisplay12Hour tickTest13 = new ClockDisplay12Hour(12, 59, "PM");
        System.out.println("\tTick Test 13 PreTick - " + tickTest13.getTime());
        tickTest13.timeTick();
        System.out.println("\tTick Test 13 PostTick - " + tickTest13.getTime()); 
    }
}
