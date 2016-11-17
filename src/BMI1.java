import java.util.LinkedList;

class BMI1 {
  BMI1(){}
  
  public BMISummary bmiReport(LinkedList<PHR> phrs) {
    BMISummary report = new BMISummary (new LinkedList<String>(), new LinkedList<String>(), new LinkedList<String>(), new LinkedList<String>());
    for(PHR currentPHR: phrs)
    {
      double BMI;
      BMI = currentPHR.weight / ( currentPHR.height * currentPHR.height );
      if (BMI<18.5)
      {
        report.under.add(currentPHR.name);
      }
      else if (BMI<25 && BMI>= 18.5)
      {
        report.healthy.add(currentPHR.name);
      }
      else if (BMI<30 && BMI>= 25)
      {
        report.over.add(currentPHR.name);
      }
      else if (BMI>= 30)
      {
        report.obese.add(currentPHR.name);
      }
    }
    return report;
  }
}