public class LogMessage {


    // part a
    public LogMessage (String message) {
        machineId = message.substring(0, message.indexOf(":"));
        desciption = message.substring(message.indexOf(":") + 1);

    }

    // part b
    public boolean containsWord (String keyword) {
        if (description.equals(keyword) != -1 || description.indexOf(" "+ keyword) != -1 || description.indexOf(keyword + " ") != -1 ) {
            return true;
        }
        return false;



    }

    // part c
    public List <LogMessage> removeMessages (String Keyword) {
         ArrayList <LogMessage> newList = new ArrayList <LogMessage> ();
         for (int i = 0; i < messageList.size(); i++) {
             if (messageList.get(i).containsWord(Keyword)) {
                 LogMessage  w = messageList.get(i);
                 newList.add(w);
                 messageList.remove(i);
                 i--;

         }


         }
         return newList;



    }



}
