package encapsulation;
class Demo {
	private int ssn;
    private String empName;
    private int empAge;
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

    
}


  class EncapsulationDemo extends Demo {

		public static void main(String[] args) {
			 Demo obj = new Demo();
	         obj.setEmpName("Mario");
	         obj.setEmpAge(32);
	         obj.setSsn(112233);
	         System.out.println("Employee Name: " + obj.getEmpName());
	         System.out.println("Employee SSN: " + obj.getSsn());
	         System.out.println("Employee Age: " + obj.getEmpAge());
	    
		}

	}
		

	
