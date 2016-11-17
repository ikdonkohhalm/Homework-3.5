import java.util.LinkedList;

class Earthquake1 {
  Earthquake1(){}

  // checks whether a datum is a date
  boolean isDate(double anum) { return (int)anum > 10000000; }
  // extracts the month from an 8-digit date
  int extractMonth(double dateNum) { return ((int)dateNum % 10000) / 100; }

  public LinkedList<MaxHzReport> dailyMaxForMonth(LinkedList<Double> data,
                                                  int month) {
    LinkedList<MaxHzReport> ansReport = new LinkedList<MaxHzReport>();
    int usedate;
    usedate = 0;
    double currentMax;
    currentMax = 0;
    double currentDate;
    currentDate = 0;

    for(int i = 0; i <= data.size()-1; i = i+1)
    {
      if (isDate(data.get(i)))
      {
        if (extractMonth(data.get(i)) == month)
        {
          usedate = 1;
          currentMax = 0;
          currentDate = data.get(i);
        }
        else
        {
          usedate = 0;
          currentMax = 0;
        }
      }
      else if(data.get(i) < 500 && data.get(i) > 0 && usedate == 1)
      {
        if (isDate(data.get(i+1)) || i == data.size())
        {
          if(currentMax > data.get(i))
          {
            ansReport.add(new MaxHzReport(currentDate,currentMax));
          }
          else if(currentMax < data.get(i))
          {
            currentMax = data.get(i);
            ansReport.add(new MaxHzReport(currentDate,currentMax));
          }
        }
        else if(currentMax < data.get(i))
        {
          currentMax = data.get(i);
        }
      }
    }

    return ansReport;
  }
}