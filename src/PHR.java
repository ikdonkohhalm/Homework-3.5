class PHR {
  String name;
  double height; // in meters
  double weight; // in kilograms
  int heartRate; // in beats-per-minute

  PHR(String name, double height, double weight, int heartRate) {
    this.name = name;
    this.height = height;
    this.weight = weight;
    this.heartRate = heartRate;
  }
  
   public double bmiReportHelp() {
    double BMI;
    BMI = this.weight / ( this.height * this.height );
    return BMI;
  }
}
