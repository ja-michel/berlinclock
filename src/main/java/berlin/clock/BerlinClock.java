package berlin.clock;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BerlinClock {

	private String time;
	
	private String hoursSet1;
	
	private String hoursSet2;
	
	private String minSet1;
	
	private String minSet2;
	
	private String sec;
	

	public BerlinClock() {
		super();
	}

	public BerlinClock(final String time, final String hoursSet1, final String hoursSet2,
			final String minSet1, final String minSet2, final String sec) {
		super();
		this.time = time;
		this.hoursSet1 = hoursSet1;
		this.hoursSet2 = hoursSet2;
		this.minSet1 = minSet1;
		this.minSet2 = minSet2;
		this.sec = sec;
	}

	public BerlinClock(final String time){
		this(time, null, null, null, null, null);
	}

	public String getTime() {
		return time;
	}

	public void setTime(final String time) {
		this.time = time;
	}

	public String getHoursSet1() {
		return hoursSet1;
	}

	public void setHoursSet1(final String hoursSet1) {
		this.hoursSet1 = hoursSet1;
	}

	public String getHoursSet2() {
		return hoursSet2;
	}

	public void setHoursSet2(final String hoursSet2) {
		this.hoursSet2 = hoursSet2;
	}

	public String getMinSet1() {
		return minSet1;
	}

	public void setMinSet1(final String minSet1) {
		this.minSet1 = minSet1;
	}

	public String getMinSet2() {
		return minSet2;
	}

	public void setMinSet2(final String minSet2) {
		this.minSet2 = minSet2;
	}

	public String getSec() {
		return sec;
	}


	public void setSec(final String sec) {
		this.sec = sec;
	}

	@Override
	public String toString() {
		return "BerlinClock [time=" + time + ", hoursSet1=" + hoursSet1 + ", hoursSet2=" + hoursSet2 + ", minSet1=" + minSet1 + ", minSet2=" + minSet2 + ", sec=" + sec + "]";
	}
	
}
