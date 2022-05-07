package school.management.system;

public class Student {
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	public Student(int id,String name,int grade) {
		this.feesPaid=0;
		this.feesTotal=30000;
		this.id=id;
		this.name=name;
		this.grade=grade;
		
		
	}
	public int getId() {
			return id;
	}
	public String getName() {
		   return name;
	}
	public int getGrade() {
		return grade;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"has paid"+feesPaid;
	}
	public int getfeesPaid() {
		return feesPaid;
	}
	public int getfeesTotal() {
		return feesTotal;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public void payfees(int fees) {
		feesPaid=feesPaid+fees;
		School.updateTotalMoneyEarned(feesPaid);
	}
	public int getRemainingFees() {
		return feesTotal-feesPaid;
		
	}
		
	

}
