package bean;

public class School
{
	private int reg;
	private String schoolname;
	private String city;
	private String board;
	
	public School() 
	{
	
	}
	public School(int reg)
	{
		this.reg=reg;
	}
	public School(int reg,String schoolname,String city,String board)
	{
		this.reg=reg;
		this.schoolname=schoolname;
		this.city=city;
		this.board=board;
	}
	public int getReg() {
		return reg;
	}
	public void setReg(int reg) {
		this.reg = reg;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBoard() {
		return board;
	}
	public void setBoard(String board) {
		this.board = board;
	}

	@Override
	public String toString() 
	{
	
		return reg+" "+schoolname+" "+city+" "+board;
	}
}
