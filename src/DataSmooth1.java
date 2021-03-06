import java.util.LinkedList;

class DataSmooth1 {
  DataSmooth1(){}

  public LinkedList<Double> dataSmooth(LinkedList<PHR> phrs) {
    double currentAvg;
    currentAvg = 0;
    LinkedList<Double> anslist = new LinkedList<Double>();
    anslist.add( (double)phrs.get(0).heartRate);
    for (int i = 1; i < (phrs.size()-1); i = i+1) {
      currentAvg =  (double)(phrs.get(i-1).heartRate +
              phrs.get(i).heartRate +
              phrs.get(i+1).heartRate)/3;
      anslist.add(currentAvg);
    }
    anslist.add( (double)phrs.get(phrs.size()-1).heartRate);
    return anslist;
  }
}