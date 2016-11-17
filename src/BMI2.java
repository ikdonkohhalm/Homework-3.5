import java.util.LinkedList;

class BMI2 {
  BMI2(){}
  
  public BMISummary bmiReport(LinkedList<PHR> phrs) {
    BMISummary report = new BMISummary (new LinkedList<String>(), new LinkedList<String>(), new LinkedList<String>(), new LinkedList<String>());
    for(PHR currentPHR: phrs)
    {
      if (currentPHR.bmiReportHelp()<18.5)
      {
        report.under.add(currentPHR.name);
      }
      else if (currentPHR.bmiReportHelp()<25 && currentPHR.bmiReportHelp()>= 18.5)
      {
        report.healthy.add(currentPHR.name);
      }
      else if (currentPHR.bmiReportHelp()<30 && currentPHR.bmiReportHelp()>= 25)
      {
        report.over.add(currentPHR.name);
      }
      else if (currentPHR.bmiReportHelp()>= 30)
      {
        report.obese.add(currentPHR.name);
      }
    }
    return report;
  }
}