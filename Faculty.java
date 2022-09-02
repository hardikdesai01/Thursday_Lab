package labTest;

import java.util.*;

public class Faculty {
	public String name;
	private int basic;
	public int salary;
	public Faculty(String name, int basic, int salary) {
		
		this.name = name;
		this.basic = basic;
	}
	public double getSalary() {
		salary = basic;
		return salary;
	}
	public String getDetails() {
		return name+" "+getSalary();
	}
	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		int i=c.nextInt();c.nextLine();
		String name=c.nextLine();
		int basic=c.nextInt();
		int DA=c.nextInt();
		int MedAllowance=c.nextInt();
		int OtherAllowance=c.nextInt();
		AssistantProfessor ap1=new AssistantProfessor(name,basic,DA);
		AssociateProfessor ap2=new AssociateProfessor(name,basic,DA,MedAllowance);
		Professor p=new Professor(name,basic,DA,MedAllowance,OtherAllowance);
		if(i==1) {
			System.out.println(ap1.getDetails());
		}
		else if(i==2) {
			System.out.println(ap2.getDetails());
		}
		else {
			System.out.println(p.getDetails());
		}
	}

}
class AssistantProfessor extends Faculty{
	public int DA;
	public AssistantProfessor(String name, int basic,int DA) {
		super(name, basic, DA);
		
	}
	public double getSalary() {
		return super.getSalary()+((super.getSalary())*DA/100);
	}
	public String getDetails() {
		return "AsstProf "+name+" "+salary;
	}
}
class AssociateProfessor extends AssistantProfessor{
	public int MedAllowance;
	public AssociateProfessor(String name, int basic, int DA,int MedAllowance) {
		super(name, basic, DA);
		this.MedAllowance=MedAllowance;
		
	}
	public double getSalary() {
		return super.getSalary()+MedAllowance;
	}
	public String getDetails() {
		return "AsocProf "+name+" "+salary;
	}
}
class Professor extends AssociateProfessor{
	public int OtherAllowance;
	public Professor(String name, int basic, int DA, int MedAllowance,int OtherAllowance) {
		super(name, basic, DA, MedAllowance);
		this.OtherAllowance=OtherAllowance;
	}
	public double getSalary() {
		return super.getSalary()+((OtherAllowance*super.getSalary())/100);
	}
	public String getDetails() {
		return "Prof "+name+" "+salary;
	}
	
}