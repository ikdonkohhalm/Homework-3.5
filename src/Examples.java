// ADD TO THE TREKSH FOLDER

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

/**
 * Auto Generated Java Class.
 */
public class Examples {
    @Test
    public void BMITest2(){
        LinkedList<Double> DSA1=new LinkedList<Double>();
        LinkedList<Double> DSA2=new LinkedList<Double>();
        LinkedList<Double> DSA3=new LinkedList<Double>();
        LinkedList<Double> DSA4=new LinkedList<Double>();
        LinkedList<Double> DSA5=new LinkedList<Double>();

        DSA1.add(25);
        DSA1.add(54);
        DSA1.add(38.33);
        DSA1.add(32);

        DSA2.add(45);
        DSA2.add(47.33);
        DSA2.add(43);
        DSA2.add(32);

        DSA3.add(55);
        DSA3.add(35);

        DSA4.add(49);

        DSA5.add(24);
        DSA5.add(37.33);
        DSA5.add(37.33);
        DSA5.add(55.66);
        DSA5.add(75);



        BMI1 B2 = new BMI1();
        LinkedList<PHR> PHR2 = new LinkedList<PHR>();
        PHR2.add(new PHR("Calvin", 5, 49, 45));
        PHR2.add(new PHR("Kyle", 6, 40.1, 45));
        PHR2.add(new PHR("Cassandra",2.0, 22, 52));
        PHR2.add(new PHR("Cain", 4.2, 90, 32));

        BMI1 B3 = new BMI1();
        LinkedList<PHR> PHR3 = new LinkedList<PHR>();
        PHR3.add(new PHR("Donald", 2, 29,55));
        PHR3.add(new PHR("Daffy", 2.5, 21, 35));

        BMI1 B4 = new BMI1();
        LinkedList<PHR> PHR4 = new LinkedList<PHR>();
        PHR4.add(new PHR("Earnest", 1, 49,49));

        BMI1 B5 = new BMI1();
        LinkedList<PHR> PHR5 = new LinkedList<PHR>();
        PHR5.add(new PHR("Foster", 1.2, 33, 24));
        PHR5.add(new PHR("Franco", 6, 39.7, 20));
        PHR5.add(new PHR("Fredward", 4.6, 25, 68));
        PHR5.add(new PHR("Filippe", 1.2, 42, 24));
        PHR5.add(new PHR("Fabayo", 3, 50, 75));


        Earthquake2 E2 = new Earthquake2();
        LinkedList<Double> noData = new LinkedList<Double>();
        LinkedList<Double> threeDates = new LinkedList<Double>();
        LinkedList<MaxHzReport> NovReports = new LinkedList<MaxHzReport>();
        LinkedList<MaxHzReport> DecReports = new LinkedList<MaxHzReport>();


        threeDates.add(20151013.0);
        threeDates.add(10.0);
        threeDates.add(5.0);
        threeDates.add(20151020.0);
        threeDates.add(40.0);
        threeDates.add(50.0);
        threeDates.add(45.0);
        threeDates.add(20151101.0);
        threeDates.add(6.0);
        NovReports.add(new MaxHzReport(20151101.0,6.0));
        threeDates.add(20161201.0);
        threeDates.add(0.01);
        threeDates.add(20161205.0);
        threeDates.add(2.09);
        threeDates.add(1.6);
        threeDates.add(20161210.0);
        threeDates.add(3.2);
        threeDates.add(3.3);
        threeDates.add(15.0);
        threeDates.add(20161215.0);
        threeDates.add(30.2);
        threeDates.add(33.4);
        threeDates.add(19.0);
        threeDates.add(20161221.0);
        threeDates.add(300.0);
        threeDates.add(450.1);
        threeDates.add(2.4);
        threeDates.add(20161225.0);
        threeDates.add(64.1);
        threeDates.add(340.5);
        threeDates.add(461.2);
        threeDates.add(80.4);
        threeDates.add(479.2);
        threeDates.add(461.9);
        threeDates.add(20161231.0);
        threeDates.add(499.9);
        DecReports.add(new MaxHzReport(20161201.0,0.01));
        DecReports.add(new MaxHzReport(20161205.0,2.09));
        DecReports.add(new MaxHzReport(20161210.0,15.0));
        DecReports.add(new MaxHzReport(20161215.0,33.4));
        DecReports.add(new MaxHzReport(20161221.0,450.1));
        DecReports.add(new MaxHzReport(20161225.0,461.9));
        DecReports.add(new MaxHzReport(20161231.0,499.9));

        assertEquals(new BMISummary(new LinkedList < String > (Arrays.asList("Calvin", "Kyle", "Cassandra", "Cain")),
                        new LinkedList < String > (),
                        new LinkedList < String > (),
                        new LinkedList < String > (),
                B1.bmiReport(PHR2)));
    }
    @Test
    public void BMITest3(){
        LinkedList<Double> DSA1=new LinkedList<Double>();
        LinkedList<Double> DSA2=new LinkedList<Double>();
        LinkedList<Double> DSA3=new LinkedList<Double>();
        LinkedList<Double> DSA4=new LinkedList<Double>();
        LinkedList<Double> DSA5=new LinkedList<Double>();

        DSA1.add(25);
        DSA1.add(54);
        DSA1.add(38.33);
        DSA1.add(32);

        DSA2.add(45);
        DSA2.add(47.33);
        DSA2.add(43);
        DSA2.add(32);

        DSA3.add(55);
        DSA3.add(35);

        DSA4.add(49);

        DSA5.add(24);
        DSA5.add(37.33);
        DSA5.add(37.33);
        DSA5.add(55.66);
        DSA5.add(75);



        BMI1 B2 = new BMI1();
        LinkedList<PHR> PHR2 = new LinkedList<PHR>();
        PHR2.add(new PHR("Calvin", 5, 49, 45));
        PHR2.add(new PHR("Kyle", 6, 40.1, 45));
        PHR2.add(new PHR("Cassandra",2.0, 22, 52));
        PHR2.add(new PHR("Cain", 4.2, 90, 32));

        BMI1 B3 = new BMI1();
        LinkedList<PHR> PHR3 = new LinkedList<PHR>();
        PHR3.add(new PHR("Donald", 2, 29,55));
        PHR3.add(new PHR("Daffy", 2.5, 21, 35));

        BMI1 B4 = new BMI1();
        LinkedList<PHR> PHR4 = new LinkedList<PHR>();
        PHR4.add(new PHR("Earnest", 1, 49,49));

        BMI1 B5 = new BMI1();
        LinkedList<PHR> PHR5 = new LinkedList<PHR>();
        PHR5.add(new PHR("Foster", 1.2, 33, 24));
        PHR5.add(new PHR("Franco", 6, 39.7, 20));
        PHR5.add(new PHR("Fredward", 4.6, 25, 68));
        PHR5.add(new PHR("Filippe", 1.2, 42, 24));
        PHR5.add(new PHR("Fabayo", 3, 50, 75));


        Earthquake2 E2 = new Earthquake2();
        LinkedList<Double> noData = new LinkedList<Double>();
        LinkedList<Double> threeDates = new LinkedList<Double>();
        LinkedList<MaxHzReport> NovReports = new LinkedList<MaxHzReport>();
        LinkedList<MaxHzReport> DecReports = new LinkedList<MaxHzReport>();


        threeDates.add(20151013.0);
        threeDates.add(10.0);
        threeDates.add(5.0);
        threeDates.add(20151020.0);
        threeDates.add(40.0);
        threeDates.add(50.0);
        threeDates.add(45.0);
        threeDates.add(20151101.0);
        threeDates.add(6.0);
        NovReports.add(new MaxHzReport(20151101.0,6.0));
        threeDates.add(20161201.0);
        threeDates.add(0.01);
        threeDates.add(20161205.0);
        threeDates.add(2.09);
        threeDates.add(1.6);
        threeDates.add(20161210.0);
        threeDates.add(3.2);
        threeDates.add(3.3);
        threeDates.add(15.0);
        threeDates.add(20161215.0);
        threeDates.add(30.2);
        threeDates.add(33.4);
        threeDates.add(19.0);
        threeDates.add(20161221.0);
        threeDates.add(300.0);
        threeDates.add(450.1);
        threeDates.add(2.4);
        threeDates.add(20161225.0);
        threeDates.add(64.1);
        threeDates.add(340.5);
        threeDates.add(461.2);
        threeDates.add(80.4);
        threeDates.add(479.2);
        threeDates.add(461.9);
        threeDates.add(20161231.0);
        threeDates.add(499.9);
        DecReports.add(new MaxHzReport(20161201.0,0.01));
        DecReports.add(new MaxHzReport(20161205.0,2.09));
        DecReports.add(new MaxHzReport(20161210.0,15.0));
        DecReports.add(new MaxHzReport(20161215.0,33.4));
        DecReports.add(new MaxHzReport(20161221.0,450.1));
        DecReports.add(new MaxHzReport(20161225.0,461.9));
        DecReports.add(new MaxHzReport(20161231.0,499.9));
        assertEquals(new BMISummary(new LinkedList < String > (Arrays.asList("Donald", "Daffy")),
                        new LinkedList < String > (),
                        new LinkedList < String > (),
                        new LinkedList < String > (),
                B1.bmiReport(PHR3)));
    }
    @Test
    public void BMITest4(){
        LinkedList<Double> DSA1=new LinkedList<Double>();
        LinkedList<Double> DSA2=new LinkedList<Double>();
        LinkedList<Double> DSA3=new LinkedList<Double>();
        LinkedList<Double> DSA4=new LinkedList<Double>();
        LinkedList<Double> DSA5=new LinkedList<Double>();

        DSA1.add(25);
        DSA1.add(54);
        DSA1.add(38.33);
        DSA1.add(32);

        DSA2.add(45);
        DSA2.add(47.33);
        DSA2.add(43);
        DSA2.add(32);

        DSA3.add(55);
        DSA3.add(35);

        DSA4.add(49);

        DSA5.add(24);
        DSA5.add(37.33);
        DSA5.add(37.33);
        DSA5.add(55.66);
        DSA5.add(75);



        BMI1 B2 = new BMI1();
        LinkedList<PHR> PHR2 = new LinkedList<PHR>();
        PHR2.add(new PHR("Calvin", 5, 49, 45));
        PHR2.add(new PHR("Kyle", 6, 40.1, 45));
        PHR2.add(new PHR("Cassandra",2.0, 22, 52));
        PHR2.add(new PHR("Cain", 4.2, 90, 32));

        BMI1 B3 = new BMI1();
        LinkedList<PHR> PHR3 = new LinkedList<PHR>();
        PHR3.add(new PHR("Donald", 2, 29,55));
        PHR3.add(new PHR("Daffy", 2.5, 21, 35));

        BMI1 B4 = new BMI1();
        LinkedList<PHR> PHR4 = new LinkedList<PHR>();
        PHR4.add(new PHR("Earnest", 1, 49,49));

        BMI1 B5 = new BMI1();
        LinkedList<PHR> PHR5 = new LinkedList<PHR>();
        PHR5.add(new PHR("Foster", 1.2, 33, 24));
        PHR5.add(new PHR("Franco", 6, 39.7, 20));
        PHR5.add(new PHR("Fredward", 4.6, 25, 68));
        PHR5.add(new PHR("Filippe", 1.2, 42, 24));
        PHR5.add(new PHR("Fabayo", 3, 50, 75));


        Earthquake2 E2 = new Earthquake2();
        LinkedList<Double> noData = new LinkedList<Double>();
        LinkedList<Double> threeDates = new LinkedList<Double>();
        LinkedList<MaxHzReport> NovReports = new LinkedList<MaxHzReport>();
        LinkedList<MaxHzReport> DecReports = new LinkedList<MaxHzReport>();


        threeDates.add(20151013.0);
        threeDates.add(10.0);
        threeDates.add(5.0);
        threeDates.add(20151020.0);
        threeDates.add(40.0);
        threeDates.add(50.0);
        threeDates.add(45.0);
        threeDates.add(20151101.0);
        threeDates.add(6.0);
        NovReports.add(new MaxHzReport(20151101.0,6.0));
        threeDates.add(20161201.0);
        threeDates.add(0.01);
        threeDates.add(20161205.0);
        threeDates.add(2.09);
        threeDates.add(1.6);
        threeDates.add(20161210.0);
        threeDates.add(3.2);
        threeDates.add(3.3);
        threeDates.add(15.0);
        threeDates.add(20161215.0);
        threeDates.add(30.2);
        threeDates.add(33.4);
        threeDates.add(19.0);
        threeDates.add(20161221.0);
        threeDates.add(300.0);
        threeDates.add(450.1);
        threeDates.add(2.4);
        threeDates.add(20161225.0);
        threeDates.add(64.1);
        threeDates.add(340.5);
        threeDates.add(461.2);
        threeDates.add(80.4);
        threeDates.add(479.2);
        threeDates.add(461.9);
        threeDates.add(20161231.0);
        threeDates.add(499.9);
        DecReports.add(new MaxHzReport(20161201.0,0.01));
        DecReports.add(new MaxHzReport(20161205.0,2.09));
        DecReports.add(new MaxHzReport(20161210.0,15.0));
        DecReports.add(new MaxHzReport(20161215.0,33.4));
        DecReports.add(new MaxHzReport(20161221.0,450.1));
        DecReports.add(new MaxHzReport(20161225.0,461.9));
        DecReports.add(new MaxHzReport(20161231.0,499.9));
        assertEquals(new BMISummary(new LinkedList < String > (),
                        new LinkedList < String > (),
                        new LinkedList < String > (),
                        new LinkedList < String > (Arrays.asList("Earnest")),
                B1.bmiReport(PHR4)));
    }
    @Test
    public void BMITest5(){
        LinkedList<Double> DSA1=new LinkedList<Double>();
        LinkedList<Double> DSA2=new LinkedList<Double>();
        LinkedList<Double> DSA3=new LinkedList<Double>();
        LinkedList<Double> DSA4=new LinkedList<Double>();
        LinkedList<Double> DSA5=new LinkedList<Double>();

        DSA1.add(25);
        DSA1.add(54);
        DSA1.add(38.33);
        DSA1.add(32);

        DSA2.add(45);
        DSA2.add(47.33);
        DSA2.add(43);
        DSA2.add(32);

        DSA3.add(55);
        DSA3.add(35);

        DSA4.add(49);

        DSA5.add(24);
        DSA5.add(37.33);
        DSA5.add(37.33);
        DSA5.add(55.66);
        DSA5.add(75);



        BMI1 B2 = new BMI1();
        LinkedList<PHR> PHR2 = new LinkedList<PHR>();
        PHR2.add(new PHR("Calvin", 5, 49, 45));
        PHR2.add(new PHR("Kyle", 6, 40.1, 45));
        PHR2.add(new PHR("Cassandra",2.0, 22, 52));
        PHR2.add(new PHR("Cain", 4.2, 90, 32));

        BMI1 B3 = new BMI1();
        LinkedList<PHR> PHR3 = new LinkedList<PHR>();
        PHR3.add(new PHR("Donald", 2, 29,55));
        PHR3.add(new PHR("Daffy", 2.5, 21, 35));

        BMI1 B4 = new BMI1();
        LinkedList<PHR> PHR4 = new LinkedList<PHR>();
        PHR4.add(new PHR("Earnest", 1, 49,49));

        BMI1 B5 = new BMI1();
        LinkedList<PHR> PHR5 = new LinkedList<PHR>();
        PHR5.add(new PHR("Foster", 1.2, 33, 24));
        PHR5.add(new PHR("Franco", 6, 39.7, 20));
        PHR5.add(new PHR("Fredward", 4.6, 25, 68));
        PHR5.add(new PHR("Filippe", 1.2, 42, 24));
        PHR5.add(new PHR("Fabayo", 3, 50, 75));


        Earthquake2 E2 = new Earthquake2();
        LinkedList<Double> noData = new LinkedList<Double>();
        LinkedList<Double> threeDates = new LinkedList<Double>();
        LinkedList<MaxHzReport> NovReports = new LinkedList<MaxHzReport>();
        LinkedList<MaxHzReport> DecReports = new LinkedList<MaxHzReport>();


        threeDates.add(20151013.0);
        threeDates.add(10.0);
        threeDates.add(5.0);
        threeDates.add(20151020.0);
        threeDates.add(40.0);
        threeDates.add(50.0);
        threeDates.add(45.0);
        threeDates.add(20151101.0);
        threeDates.add(6.0);
        NovReports.add(new MaxHzReport(20151101.0,6.0));
        threeDates.add(20161201.0);
        threeDates.add(0.01);
        threeDates.add(20161205.0);
        threeDates.add(2.09);
        threeDates.add(1.6);
        threeDates.add(20161210.0);
        threeDates.add(3.2);
        threeDates.add(3.3);
        threeDates.add(15.0);
        threeDates.add(20161215.0);
        threeDates.add(30.2);
        threeDates.add(33.4);
        threeDates.add(19.0);
        threeDates.add(20161221.0);
        threeDates.add(300.0);
        threeDates.add(450.1);
        threeDates.add(2.4);
        threeDates.add(20161225.0);
        threeDates.add(64.1);
        threeDates.add(340.5);
        threeDates.add(461.2);
        threeDates.add(80.4);
        threeDates.add(479.2);
        threeDates.add(461.9);
        threeDates.add(20161231.0);
        threeDates.add(499.9);
        DecReports.add(new MaxHzReport(20161201.0,0.01));
        DecReports.add(new MaxHzReport(20161205.0,2.09));
        DecReports.add(new MaxHzReport(20161210.0,15.0));
        DecReports.add(new MaxHzReport(20161215.0,33.4));
        DecReports.add(new MaxHzReport(20161221.0,450.1));
        DecReports.add(new MaxHzReport(20161225.0,461.9));
        DecReports.add(new MaxHzReport(20161231.0,499.9));
        assertEquals(new BMISummary(new LinkedList < String > (Arrays.asList("Franco", "Fredward","Fabayo")),
                        new LinkedList < String > (Arrays.asList("Foster")),
                        new LinkedList < String > (Arrays.asList("Filippe")),
                        new LinkedList < String > (),
                B1.bmiReport(PHR5)));
    }

    @Test
    public void dataSmooth1Test1() {
        LinkedList<Double> DSA1=new LinkedList<Double>();
        LinkedList<Double> DSA2=new LinkedList<Double>();
        LinkedList<Double> DSA3=new LinkedList<Double>();
        LinkedList<Double> DSA4=new LinkedList<Double>();
        LinkedList<Double> DSA5=new LinkedList<Double>();

        DSA1.add(25);
        DSA1.add(54);
        DSA1.add(38.33);
        DSA1.add(32);

        DSA2.add(45);
        DSA2.add(47.33);
        DSA2.add(43);
        DSA2.add(32);

        DSA3.add(55);
        DSA3.add(35);

        DSA4.add(49);

        DSA5.add(24);
        DSA5.add(37.33);
        DSA5.add(37.33);
        DSA5.add(55.66);
        DSA5.add(75);



        BMI1 B2 = new BMI1();
        LinkedList<PHR> PHR2 = new LinkedList<PHR>();
        PHR2.add(new PHR("Calvin", 5, 49, 45));
        PHR2.add(new PHR("Kyle", 6, 40.1, 45));
        PHR2.add(new PHR("Cassandra",2.0, 22, 52));
        PHR2.add(new PHR("Cain", 4.2, 90, 32));

        BMI1 B3 = new BMI1();
        LinkedList<PHR> PHR3 = new LinkedList<PHR>();
        PHR3.add(new PHR("Donald", 2, 29,55));
        PHR3.add(new PHR("Daffy", 2.5, 21, 35));

        BMI1 B4 = new BMI1();
        LinkedList<PHR> PHR4 = new LinkedList<PHR>();
        PHR4.add(new PHR("Earnest", 1, 49,49));

        BMI1 B5 = new BMI1();
        LinkedList<PHR> PHR5 = new LinkedList<PHR>();
        PHR5.add(new PHR("Foster", 1.2, 33, 24));
        PHR5.add(new PHR("Franco", 6, 39.7, 20));
        PHR5.add(new PHR("Fredward", 4.6, 25, 68));
        PHR5.add(new PHR("Filippe", 1.2, 42, 24));
        PHR5.add(new PHR("Fabayo", 3, 50, 75));


        Earthquake2 E2 = new Earthquake2();
        LinkedList<Double> noData = new LinkedList<Double>();
        LinkedList<Double> threeDates = new LinkedList<Double>();
        LinkedList<MaxHzReport> NovReports = new LinkedList<MaxHzReport>();
        LinkedList<MaxHzReport> DecReports = new LinkedList<MaxHzReport>();


        threeDates.add(20151013.0);
        threeDates.add(10.0);
        threeDates.add(5.0);
        threeDates.add(20151020.0);
        threeDates.add(40.0);
        threeDates.add(50.0);
        threeDates.add(45.0);
        threeDates.add(20151101.0);
        threeDates.add(6.0);
        NovReports.add(new MaxHzReport(20151101.0,6.0));
        threeDates.add(20161201.0);
        threeDates.add(0.01);
        threeDates.add(20161205.0);
        threeDates.add(2.09);
        threeDates.add(1.6);
        threeDates.add(20161210.0);
        threeDates.add(3.2);
        threeDates.add(3.3);
        threeDates.add(15.0);
        threeDates.add(20161215.0);
        threeDates.add(30.2);
        threeDates.add(33.4);
        threeDates.add(19.0);
        threeDates.add(20161221.0);
        threeDates.add(300.0);
        threeDates.add(450.1);
        threeDates.add(2.4);
        threeDates.add(20161225.0);
        threeDates.add(64.1);
        threeDates.add(340.5);
        threeDates.add(461.2);
        threeDates.add(80.4);
        threeDates.add(479.2);
        threeDates.add(461.9);
        threeDates.add(20161231.0);
        threeDates.add(499.9);
        DecReports.add(new MaxHzReport(20161201.0,0.01));
        DecReports.add(new MaxHzReport(20161205.0,2.09));
        DecReports.add(new MaxHzReport(20161210.0,15.0));
        DecReports.add(new MaxHzReport(20161215.0,33.4));
        DecReports.add(new MaxHzReport(20161221.0,450.1));
        DecReports.add(new MaxHzReport(20161225.0,461.9));
        DecReports.add(new MaxHzReport(20161231.0,499.9));
        assertEquals(DataSmooth1(PHR1), DSA1);
    }
    @Test
    public void dataSmooth1Test2() {
        LinkedList<Double> DSA1=new LinkedList<Double>();
        LinkedList<Double> DSA2=new LinkedList<Double>();
        LinkedList<Double> DSA3=new LinkedList<Double>();
        LinkedList<Double> DSA4=new LinkedList<Double>();
        LinkedList<Double> DSA5=new LinkedList<Double>();

        DSA1.add(25);
        DSA1.add(54);
        DSA1.add(38.33);
        DSA1.add(32);

        DSA2.add(45);
        DSA2.add(47.33);
        DSA2.add(43);
        DSA2.add(32);

        DSA3.add(55);
        DSA3.add(35);

        DSA4.add(49);

        DSA5.add(24);
        DSA5.add(37.33);
        DSA5.add(37.33);
        DSA5.add(55.66);
        DSA5.add(75);



        BMI1 B2 = new BMI1();
        LinkedList<PHR> PHR2 = new LinkedList<PHR>();
        PHR2.add(new PHR("Calvin", 5, 49, 45));
        PHR2.add(new PHR("Kyle", 6, 40.1, 45));
        PHR2.add(new PHR("Cassandra",2.0, 22, 52));
        PHR2.add(new PHR("Cain", 4.2, 90, 32));

        BMI1 B3 = new BMI1();
        LinkedList<PHR> PHR3 = new LinkedList<PHR>();
        PHR3.add(new PHR("Donald", 2, 29,55));
        PHR3.add(new PHR("Daffy", 2.5, 21, 35));

        BMI1 B4 = new BMI1();
        LinkedList<PHR> PHR4 = new LinkedList<PHR>();
        PHR4.add(new PHR("Earnest", 1, 49,49));

        BMI1 B5 = new BMI1();
        LinkedList<PHR> PHR5 = new LinkedList<PHR>();
        PHR5.add(new PHR("Foster", 1.2, 33, 24));
        PHR5.add(new PHR("Franco", 6, 39.7, 20));
        PHR5.add(new PHR("Fredward", 4.6, 25, 68));
        PHR5.add(new PHR("Filippe", 1.2, 42, 24));
        PHR5.add(new PHR("Fabayo", 3, 50, 75));


        Earthquake2 E2 = new Earthquake2();
        LinkedList<Double> noData = new LinkedList<Double>();
        LinkedList<Double> threeDates = new LinkedList<Double>();
        LinkedList<MaxHzReport> NovReports = new LinkedList<MaxHzReport>();
        LinkedList<MaxHzReport> DecReports = new LinkedList<MaxHzReport>();


        threeDates.add(20151013.0);
        threeDates.add(10.0);
        threeDates.add(5.0);
        threeDates.add(20151020.0);
        threeDates.add(40.0);
        threeDates.add(50.0);
        threeDates.add(45.0);
        threeDates.add(20151101.0);
        threeDates.add(6.0);
        NovReports.add(new MaxHzReport(20151101.0,6.0));
        threeDates.add(20161201.0);
        threeDates.add(0.01);
        threeDates.add(20161205.0);
        threeDates.add(2.09);
        threeDates.add(1.6);
        threeDates.add(20161210.0);
        threeDates.add(3.2);
        threeDates.add(3.3);
        threeDates.add(15.0);
        threeDates.add(20161215.0);
        threeDates.add(30.2);
        threeDates.add(33.4);
        threeDates.add(19.0);
        threeDates.add(20161221.0);
        threeDates.add(300.0);
        threeDates.add(450.1);
        threeDates.add(2.4);
        threeDates.add(20161225.0);
        threeDates.add(64.1);
        threeDates.add(340.5);
        threeDates.add(461.2);
        threeDates.add(80.4);
        threeDates.add(479.2);
        threeDates.add(461.9);
        threeDates.add(20161231.0);
        threeDates.add(499.9);
        DecReports.add(new MaxHzReport(20161201.0,0.01));
        DecReports.add(new MaxHzReport(20161205.0,2.09));
        DecReports.add(new MaxHzReport(20161210.0,15.0));
        DecReports.add(new MaxHzReport(20161215.0,33.4));
        DecReports.add(new MaxHzReport(20161221.0,450.1));
        DecReports.add(new MaxHzReport(20161225.0,461.9));
        DecReports.add(new MaxHzReport(20161231.0,499.9));
        assertEquals(DataSmooth1(PHR2, DSA2));
    }
    @Test
    public void dataSmooth1Test3() {
        LinkedList<Double> DSA1=new LinkedList<Double>();
        LinkedList<Double> DSA2=new LinkedList<Double>();
        LinkedList<Double> DSA3=new LinkedList<Double>();
        LinkedList<Double> DSA4=new LinkedList<Double>();
        LinkedList<Double> DSA5=new LinkedList<Double>();

        DSA1.add(25);
        DSA1.add(54);
        DSA1.add(38.33);
        DSA1.add(32);

        DSA2.add(45);
        DSA2.add(47.33);
        DSA2.add(43);
        DSA2.add(32);

        DSA3.add(55);
        DSA3.add(35);

        DSA4.add(49);

        DSA5.add(24);
        DSA5.add(37.33);
        DSA5.add(37.33);
        DSA5.add(55.66);
        DSA5.add(75);



        BMI1 B2 = new BMI1();
        LinkedList<PHR> PHR2 = new LinkedList<PHR>();
        PHR2.add(new PHR("Calvin", 5, 49, 45));
        PHR2.add(new PHR("Kyle", 6, 40.1, 45));
        PHR2.add(new PHR("Cassandra",2.0, 22, 52));
        PHR2.add(new PHR("Cain", 4.2, 90, 32));

        BMI1 B3 = new BMI1();
        LinkedList<PHR> PHR3 = new LinkedList<PHR>();
        PHR3.add(new PHR("Donald", 2, 29,55));
        PHR3.add(new PHR("Daffy", 2.5, 21, 35));

        BMI1 B4 = new BMI1();
        LinkedList<PHR> PHR4 = new LinkedList<PHR>();
        PHR4.add(new PHR("Earnest", 1, 49,49));

        BMI1 B5 = new BMI1();
        LinkedList<PHR> PHR5 = new LinkedList<PHR>();
        PHR5.add(new PHR("Foster", 1.2, 33, 24));
        PHR5.add(new PHR("Franco", 6, 39.7, 20));
        PHR5.add(new PHR("Fredward", 4.6, 25, 68));
        PHR5.add(new PHR("Filippe", 1.2, 42, 24));
        PHR5.add(new PHR("Fabayo", 3, 50, 75));


        Earthquake2 E2 = new Earthquake2();
        LinkedList<Double> noData = new LinkedList<Double>();
        LinkedList<Double> threeDates = new LinkedList<Double>();
        LinkedList<MaxHzReport> NovReports = new LinkedList<MaxHzReport>();
        LinkedList<MaxHzReport> DecReports = new LinkedList<MaxHzReport>();


        threeDates.add(20151013.0);
        threeDates.add(10.0);
        threeDates.add(5.0);
        threeDates.add(20151020.0);
        threeDates.add(40.0);
        threeDates.add(50.0);
        threeDates.add(45.0);
        threeDates.add(20151101.0);
        threeDates.add(6.0);
        NovReports.add(new MaxHzReport(20151101.0,6.0));
        threeDates.add(20161201.0);
        threeDates.add(0.01);
        threeDates.add(20161205.0);
        threeDates.add(2.09);
        threeDates.add(1.6);
        threeDates.add(20161210.0);
        threeDates.add(3.2);
        threeDates.add(3.3);
        threeDates.add(15.0);
        threeDates.add(20161215.0);
        threeDates.add(30.2);
        threeDates.add(33.4);
        threeDates.add(19.0);
        threeDates.add(20161221.0);
        threeDates.add(300.0);
        threeDates.add(450.1);
        threeDates.add(2.4);
        threeDates.add(20161225.0);
        threeDates.add(64.1);
        threeDates.add(340.5);
        threeDates.add(461.2);
        threeDates.add(80.4);
        threeDates.add(479.2);
        threeDates.add(461.9);
        threeDates.add(20161231.0);
        threeDates.add(499.9);
        DecReports.add(new MaxHzReport(20161201.0,0.01));
        DecReports.add(new MaxHzReport(20161205.0,2.09));
        DecReports.add(new MaxHzReport(20161210.0,15.0));
        DecReports.add(new MaxHzReport(20161215.0,33.4));
        DecReports.add(new MaxHzReport(20161221.0,450.1));
        DecReports.add(new MaxHzReport(20161225.0,461.9));
        DecReports.add(new MaxHzReport(20161231.0,499.9));
        assertEquals(DataSmooth1(PHR3, DSA3));
    }

    @Test
    public void dataSmooth1Test4() {
        LinkedList<Double> DSA1=new LinkedList<Double>();
        LinkedList<Double> DSA2=new LinkedList<Double>();
        LinkedList<Double> DSA3=new LinkedList<Double>();
        LinkedList<Double> DSA4=new LinkedList<Double>();
        LinkedList<Double> DSA5=new LinkedList<Double>();

        DSA1.add(25);
        DSA1.add(54);
        DSA1.add(38.33);
        DSA1.add(32);

        DSA2.add(45);
        DSA2.add(47.33);
        DSA2.add(43);
        DSA2.add(32);

        DSA3.add(55);
        DSA3.add(35);

        DSA4.add(49);

        DSA5.add(24);
        DSA5.add(37.33);
        DSA5.add(37.33);
        DSA5.add(55.66);
        DSA5.add(75);



        BMI1 B2 = new BMI1();
        LinkedList<PHR> PHR2 = new LinkedList<PHR>();
        PHR2.add(new PHR("Calvin", 5, 49, 45));
        PHR2.add(new PHR("Kyle", 6, 40.1, 45));
        PHR2.add(new PHR("Cassandra",2.0, 22, 52));
        PHR2.add(new PHR("Cain", 4.2, 90, 32));

        BMI1 B3 = new BMI1();
        LinkedList<PHR> PHR3 = new LinkedList<PHR>();
        PHR3.add(new PHR("Donald", 2, 29,55));
        PHR3.add(new PHR("Daffy", 2.5, 21, 35));

        BMI1 B4 = new BMI1();
        LinkedList<PHR> PHR4 = new LinkedList<PHR>();
        PHR4.add(new PHR("Earnest", 1, 49,49));

        BMI1 B5 = new BMI1();
        LinkedList<PHR> PHR5 = new LinkedList<PHR>();
        PHR5.add(new PHR("Foster", 1.2, 33, 24));
        PHR5.add(new PHR("Franco", 6, 39.7, 20));
        PHR5.add(new PHR("Fredward", 4.6, 25, 68));
        PHR5.add(new PHR("Filippe", 1.2, 42, 24));
        PHR5.add(new PHR("Fabayo", 3, 50, 75));


        Earthquake2 E2 = new Earthquake2();
        LinkedList<Double> noData = new LinkedList<Double>();
        LinkedList<Double> threeDates = new LinkedList<Double>();
        LinkedList<MaxHzReport> NovReports = new LinkedList<MaxHzReport>();
        LinkedList<MaxHzReport> DecReports = new LinkedList<MaxHzReport>();


        threeDates.add(20151013.0);
        threeDates.add(10.0);
        threeDates.add(5.0);
        threeDates.add(20151020.0);
        threeDates.add(40.0);
        threeDates.add(50.0);
        threeDates.add(45.0);
        threeDates.add(20151101.0);
        threeDates.add(6.0);
        NovReports.add(new MaxHzReport(20151101.0,6.0));
        threeDates.add(20161201.0);
        threeDates.add(0.01);
        threeDates.add(20161205.0);
        threeDates.add(2.09);
        threeDates.add(1.6);
        threeDates.add(20161210.0);
        threeDates.add(3.2);
        threeDates.add(3.3);
        threeDates.add(15.0);
        threeDates.add(20161215.0);
        threeDates.add(30.2);
        threeDates.add(33.4);
        threeDates.add(19.0);
        threeDates.add(20161221.0);
        threeDates.add(300.0);
        threeDates.add(450.1);
        threeDates.add(2.4);
        threeDates.add(20161225.0);
        threeDates.add(64.1);
        threeDates.add(340.5);
        threeDates.add(461.2);
        threeDates.add(80.4);
        threeDates.add(479.2);
        threeDates.add(461.9);
        threeDates.add(20161231.0);
        threeDates.add(499.9);
        DecReports.add(new MaxHzReport(20161201.0,0.01));
        DecReports.add(new MaxHzReport(20161205.0,2.09));
        DecReports.add(new MaxHzReport(20161210.0,15.0));
        DecReports.add(new MaxHzReport(20161215.0,33.4));
        DecReports.add(new MaxHzReport(20161221.0,450.1));
        DecReports.add(new MaxHzReport(20161225.0,461.9));
        DecReports.add(new MaxHzReport(20161231.0,499.9));
        assertEquals(DataSmooth1(PHR4, DSA4));
    }
    @Test
    public void dataSmooth1Test5() {
        LinkedList<Double> DSA1=new LinkedList<Double>();
        LinkedList<Double> DSA2=new LinkedList<Double>();
        LinkedList<Double> DSA3=new LinkedList<Double>();
        LinkedList<Double> DSA4=new LinkedList<Double>();
        LinkedList<Double> DSA5=new LinkedList<Double>();

        DSA1.add(25);
        DSA1.add(54);
        DSA1.add(38.33);
        DSA1.add(32);

        DSA2.add(45);
        DSA2.add(47.33);
        DSA2.add(43);
        DSA2.add(32);

        DSA3.add(55);
        DSA3.add(35);

        DSA4.add(49);

        DSA5.add(24);
        DSA5.add(37.33);
        DSA5.add(37.33);
        DSA5.add(55.66);
        DSA5.add(75);



        BMI1 B2 = new BMI1();
        LinkedList<PHR> PHR2 = new LinkedList<PHR>();
        PHR2.add(new PHR("Calvin", 5, 49, 45));
        PHR2.add(new PHR("Kyle", 6, 40.1, 45));
        PHR2.add(new PHR("Cassandra",2.0, 22, 52));
        PHR2.add(new PHR("Cain", 4.2, 90, 32));

        BMI1 B3 = new BMI1();
        LinkedList<PHR> PHR3 = new LinkedList<PHR>();
        PHR3.add(new PHR("Donald", 2, 29,55));
        PHR3.add(new PHR("Daffy", 2.5, 21, 35));

        BMI1 B4 = new BMI1();
        LinkedList<PHR> PHR4 = new LinkedList<PHR>();
        PHR4.add(new PHR("Earnest", 1, 49,49));

        BMI1 B5 = new BMI1();
        LinkedList<PHR> PHR5 = new LinkedList<PHR>();
        PHR5.add(new PHR("Foster", 1.2, 33, 24));
        PHR5.add(new PHR("Franco", 6, 39.7, 20));
        PHR5.add(new PHR("Fredward", 4.6, 25, 68));
        PHR5.add(new PHR("Filippe", 1.2, 42, 24));
        PHR5.add(new PHR("Fabayo", 3, 50, 75));


        Earthquake2 E2 = new Earthquake2();
        LinkedList<Double> noData = new LinkedList<Double>();
        LinkedList<Double> threeDates = new LinkedList<Double>();
        LinkedList<MaxHzReport> NovReports = new LinkedList<MaxHzReport>();
        LinkedList<MaxHzReport> DecReports = new LinkedList<MaxHzReport>();


        threeDates.add(20151013.0);
        threeDates.add(10.0);
        threeDates.add(5.0);
        threeDates.add(20151020.0);
        threeDates.add(40.0);
        threeDates.add(50.0);
        threeDates.add(45.0);
        threeDates.add(20151101.0);
        threeDates.add(6.0);
        NovReports.add(new MaxHzReport(20151101.0,6.0));
        threeDates.add(20161201.0);
        threeDates.add(0.01);
        threeDates.add(20161205.0);
        threeDates.add(2.09);
        threeDates.add(1.6);
        threeDates.add(20161210.0);
        threeDates.add(3.2);
        threeDates.add(3.3);
        threeDates.add(15.0);
        threeDates.add(20161215.0);
        threeDates.add(30.2);
        threeDates.add(33.4);
        threeDates.add(19.0);
        threeDates.add(20161221.0);
        threeDates.add(300.0);
        threeDates.add(450.1);
        threeDates.add(2.4);
        threeDates.add(20161225.0);
        threeDates.add(64.1);
        threeDates.add(340.5);
        threeDates.add(461.2);
        threeDates.add(80.4);
        threeDates.add(479.2);
        threeDates.add(461.9);
        threeDates.add(20161231.0);
        threeDates.add(499.9);
        DecReports.add(new MaxHzReport(20161201.0,0.01));
        DecReports.add(new MaxHzReport(20161205.0,2.09));
        DecReports.add(new MaxHzReport(20161210.0,15.0));
        DecReports.add(new MaxHzReport(20161215.0,33.4));
        DecReports.add(new MaxHzReport(20161221.0,450.1));
        DecReports.add(new MaxHzReport(20161225.0,461.9));
        DecReports.add(new MaxHzReport(20161231.0,499.9));
        assertEquals(DataSmooth1(PHR5, DSA5));
    }

    @Test
    public void instructorTestEQ() {
        LinkedList<Double> DSA1=new LinkedList<Double>();
        LinkedList<Double> DSA2=new LinkedList<Double>();
        LinkedList<Double> DSA3=new LinkedList<Double>();
        LinkedList<Double> DSA4=new LinkedList<Double>();
        LinkedList<Double> DSA5=new LinkedList<Double>();

        DSA1.add(25);
        DSA1.add(54);
        DSA1.add(38.33);
        DSA1.add(32);

        DSA2.add(45);
        DSA2.add(47.33);
        DSA2.add(43);
        DSA2.add(32);

        DSA3.add(55);
        DSA3.add(35);

        DSA4.add(49);

        DSA5.add(24);
        DSA5.add(37.33);
        DSA5.add(37.33);
        DSA5.add(55.66);
        DSA5.add(75);



        BMI1 B2 = new BMI1();
        LinkedList<PHR> PHR2 = new LinkedList<PHR>();
        PHR2.add(new PHR("Calvin", 5, 49, 45));
        PHR2.add(new PHR("Kyle", 6, 40.1, 45));
        PHR2.add(new PHR("Cassandra",2.0, 22, 52));
        PHR2.add(new PHR("Cain", 4.2, 90, 32));

        BMI1 B3 = new BMI1();
        LinkedList<PHR> PHR3 = new LinkedList<PHR>();
        PHR3.add(new PHR("Donald", 2, 29,55));
        PHR3.add(new PHR("Daffy", 2.5, 21, 35));

        BMI1 B4 = new BMI1();
        LinkedList<PHR> PHR4 = new LinkedList<PHR>();
        PHR4.add(new PHR("Earnest", 1, 49,49));

        BMI1 B5 = new BMI1();
        LinkedList<PHR> PHR5 = new LinkedList<PHR>();
        PHR5.add(new PHR("Foster", 1.2, 33, 24));
        PHR5.add(new PHR("Franco", 6, 39.7, 20));
        PHR5.add(new PHR("Fredward", 4.6, 25, 68));
        PHR5.add(new PHR("Filippe", 1.2, 42, 24));
        PHR5.add(new PHR("Fabayo", 3, 50, 75));


        Earthquake2 E2 = new Earthquake2();
        LinkedList<Double> noData = new LinkedList<Double>();
        LinkedList<Double> threeDates = new LinkedList<Double>();
        LinkedList<MaxHzReport> NovReports = new LinkedList<MaxHzReport>();
        LinkedList<MaxHzReport> DecReports = new LinkedList<MaxHzReport>();


        threeDates.add(20151013.0);
        threeDates.add(10.0);
        threeDates.add(5.0);
        threeDates.add(20151020.0);
        threeDates.add(40.0);
        threeDates.add(50.0);
        threeDates.add(45.0);
        threeDates.add(20151101.0);
        threeDates.add(6.0);
        NovReports.add(new MaxHzReport(20151101.0,6.0));
        threeDates.add(20161201.0);
        threeDates.add(0.01);
        threeDates.add(20161205.0);
        threeDates.add(2.09);
        threeDates.add(1.6);
        threeDates.add(20161210.0);
        threeDates.add(3.2);
        threeDates.add(3.3);
        threeDates.add(15.0);
        threeDates.add(20161215.0);
        threeDates.add(30.2);
        threeDates.add(33.4);
        threeDates.add(19.0);
        threeDates.add(20161221.0);
        threeDates.add(300.0);
        threeDates.add(450.1);
        threeDates.add(2.4);
        threeDates.add(20161225.0);
        threeDates.add(64.1);
        threeDates.add(340.5);
        threeDates.add(461.2);
        threeDates.add(80.4);
        threeDates.add(479.2);
        threeDates.add(461.9);
        threeDates.add(20161231.0);
        threeDates.add(499.9);
        DecReports.add(new MaxHzReport(20161201.0,0.01));
        DecReports.add(new MaxHzReport(20161205.0,2.09));
        DecReports.add(new MaxHzReport(20161210.0,15.0));
        DecReports.add(new MaxHzReport(20161215.0,33.4));
        DecReports.add(new MaxHzReport(20161221.0,450.1));
        DecReports.add(new MaxHzReport(20161225.0,461.9));
        DecReports.add(new MaxHzReport(20161231.0,499.9));
        assertEquals(NovReports,
                E1.dailyMaxForMonth(threeDates, 11));
    }
    @Test
    public void Earthquake2Test1() {
        LinkedList<Double> DSA1=new LinkedList<Double>();
        LinkedList<Double> DSA2=new LinkedList<Double>();
        LinkedList<Double> DSA3=new LinkedList<Double>();
        LinkedList<Double> DSA4=new LinkedList<Double>();
        LinkedList<Double> DSA5=new LinkedList<Double>();

        DSA1.add(25);
        DSA1.add(54);
        DSA1.add(38.33);
        DSA1.add(32);

        DSA2.add(45);
        DSA2.add(47.33);
        DSA2.add(43);
        DSA2.add(32);

        DSA3.add(55);
        DSA3.add(35);

        DSA4.add(49);

        DSA5.add(24);
        DSA5.add(37.33);
        DSA5.add(37.33);
        DSA5.add(55.66);
        DSA5.add(75);



        BMI1 B2 = new BMI1();
        LinkedList<PHR> PHR2 = new LinkedList<PHR>();
        PHR2.add(new PHR("Calvin", 5, 49, 45));
        PHR2.add(new PHR("Kyle", 6, 40.1, 45));
        PHR2.add(new PHR("Cassandra",2.0, 22, 52));
        PHR2.add(new PHR("Cain", 4.2, 90, 32));

        BMI1 B3 = new BMI1();
        LinkedList<PHR> PHR3 = new LinkedList<PHR>();
        PHR3.add(new PHR("Donald", 2, 29,55));
        PHR3.add(new PHR("Daffy", 2.5, 21, 35));

        BMI1 B4 = new BMI1();
        LinkedList<PHR> PHR4 = new LinkedList<PHR>();
        PHR4.add(new PHR("Earnest", 1, 49,49));

        BMI1 B5 = new BMI1();
        LinkedList<PHR> PHR5 = new LinkedList<PHR>();
        PHR5.add(new PHR("Foster", 1.2, 33, 24));
        PHR5.add(new PHR("Franco", 6, 39.7, 20));
        PHR5.add(new PHR("Fredward", 4.6, 25, 68));
        PHR5.add(new PHR("Filippe", 1.2, 42, 24));
        PHR5.add(new PHR("Fabayo", 3, 50, 75));


        Earthquake2 E2 = new Earthquake2();
        LinkedList<Double> noData = new LinkedList<Double>();
        LinkedList<Double> threeDates = new LinkedList<Double>();
        LinkedList<MaxHzReport> NovReports = new LinkedList<MaxHzReport>();
        LinkedList<MaxHzReport> DecReports = new LinkedList<MaxHzReport>();


        threeDates.add(20151013.0);
        threeDates.add(10.0);
        threeDates.add(5.0);
        threeDates.add(20151020.0);
        threeDates.add(40.0);
        threeDates.add(50.0);
        threeDates.add(45.0);
        threeDates.add(20151101.0);
        threeDates.add(6.0);
        NovReports.add(new MaxHzReport(20151101.0,6.0));
        threeDates.add(20161201.0);
        threeDates.add(0.01);
        threeDates.add(20161205.0);
        threeDates.add(2.09);
        threeDates.add(1.6);
        threeDates.add(20161210.0);
        threeDates.add(3.2);
        threeDates.add(3.3);
        threeDates.add(15.0);
        threeDates.add(20161215.0);
        threeDates.add(30.2);
        threeDates.add(33.4);
        threeDates.add(19.0);
        threeDates.add(20161221.0);
        threeDates.add(300.0);
        threeDates.add(450.1);
        threeDates.add(2.4);
        threeDates.add(20161225.0);
        threeDates.add(64.1);
        threeDates.add(340.5);
        threeDates.add(461.2);
        threeDates.add(80.4);
        threeDates.add(479.2);
        threeDates.add(461.9);
        threeDates.add(20161231.0);
        threeDates.add(499.9);
        DecReports.add(new MaxHzReport(20161201.0,0.01));
        DecReports.add(new MaxHzReport(20161205.0,2.09));
        DecReports.add(new MaxHzReport(20161210.0,15.0));
        DecReports.add(new MaxHzReport(20161215.0,33.4));
        DecReports.add(new MaxHzReport(20161221.0,450.1));
        DecReports.add(new MaxHzReport(20161225.0,461.9));
        DecReports.add(new MaxHzReport(20161231.0,499.9));
        assertEquals(DecReports,
                E2.dailyMaxForMonth(threeDates, 12));
    }
}
