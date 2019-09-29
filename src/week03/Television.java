package week03;

public class Television {
	private String BrandName;
	private boolean Powered = false;
	private int Channel = 1;
	int Volume = 0;
	
	public Television() {
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
	    String str = "Brandname: " + BrandName + "\n";
	    str = str + "IsPowered: " + Powered + "\n";
	    str = str + "Channel: " + Channel + "\n";
	    str = str + "Volume: " + Volume;
	    return str;
	  }
	
	public String getBrandName() {
		return BrandName;
	}

	public int getVolume() {
		return Volume;
	}

	public void setVolume(int volume) {
		Volume = volume;
	}

	public void setBrandName(String brandName) {
		BrandName = brandName;
	}

	public boolean isPowered() {
		return Powered;
	}

	public void setPowered(boolean powered) {
		Powered = powered;
	}

	public int getChannel() {
		return Channel;
	}

	public void setChannel(int channel) {
		Channel = channel;
	}
	
	public int incrementChannel() {
		return this.Channel++;
	}
	
	public int decrementChannel() {
		return this.Channel--;
	}
	public int incrementVolume() {
		return this.Volume++;
	}
	
	public int decrementVolume() {
		return this.Volume--;
	}
}
