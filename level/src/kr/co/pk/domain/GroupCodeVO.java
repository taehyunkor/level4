package kr.co.pk.domain;

public class GroupCodeVO {
	public String gcode;
	public String gname;
	
	public String getGcode() {
		return gcode;
	}
	public void setGcode(String gcode) {
		this.gcode = gcode;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	
	@Override
	public String toString() {
		return "GroupCodeVO [gcode=" + gcode + ", gname=" + gname + "]";
	}
}
