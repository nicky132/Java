package src.com.guigu.inheritance1;

public class ManKind {
    private int sex;
    private int salary;
    public void manOrWoman(int sex) {
    	if(sex == 1) {
    		System.out.println("man");
    		return;
    	}
    	System.out.println("woman");
    }
    public void employeed(int salary) {
    	if(salary == 0) {
    		System.out.println("no job");
    		return;
    	}
    	System.out.println("job");
    }
    public void setSalary(int salary) {
    	this.salary = salary;
    	System.out.println(this.getSalary());
    }
    public int getSalary() {
    	return salary;
    }
}
