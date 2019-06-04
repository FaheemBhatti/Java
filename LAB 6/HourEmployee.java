

 public class HourEmployee extends Employee
{
	 private double hourlyWage;
	 private int hours_worked;
	 HourEmployee(double hourlyWage,int hours_worked)
	 {
		 super("FAHEEM");
		 this.hourlyWage=hourlyWage;
		 this.hours_worked=hours_worked;
		 
	 }
	 public void print()
	 {
		 System.out.print(hourlyWage);
		 System.out.print(hours_worked);
		 super.print();
	 }
	

}
