package src.com.guigu.inheritance1;

public class Kids extends ManKind{
    private int yearsOld;
//    public void printAge() {
//    	System.out.println("年龄：" + yearsOld);
//    }
    public int printAge() {
    	return yearsOld;
    }
    public void setAge(int yearsOld) {
    	this.yearsOld = yearsOld;
    }
}
