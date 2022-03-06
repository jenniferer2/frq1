import java.util.ArrayList;


public class runner {
    public static void main (String [] args) {
        ArrayList<LogMessage> w = new  ArrayList<LogMessage> () ;
        LogMessage l = new LogMessage ("SERVER1: read error on disk DSK1");
        w.add(l);
        LogMessage x = new LogMessage ("SERVER2:file not found");
        w.add(x);
        LogMessage y = new LogMessage ("SERVER1:write error on disk DSK2");
        w.add(y);
        SystemLog r = new SystemLog (w);

        System.out.println(l.containsWord("disk"));
        System.out.println(x.containsWord("disk"));
        System.out.println(y.containsWord("disk"));





     ArrayList<LogMessage> v = r.removeMessages("disk");
     for (LogMessage u : v) {
         System.out.println(u.getMachineId() + ":" + u.getDescription() );
     }


    }
}
