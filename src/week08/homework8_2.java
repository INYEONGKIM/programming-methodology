package week08;

abstract class Converter {
	abstract protected double convert(double src); // 추상 메소드

	abstract protected String getSrcString(); // 추상 메소드

	abstract protected String getDestString(); // 추상 메소드

	protected double ratio; // 비율

	public double run(double val) {
		System.out.println("convert " + val + " " + getSrcString() + " to " + getDestString());
		double res = convert(val);
		System.out.println(res + " " + getDestString());
		return res;
	}
}

class Won2Dollar extends Converter {

	public Won2Dollar(double ratio) {
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		return src / this.ratio;
	}

	@Override
	protected String getSrcString() {
		return "won";
	}

	@Override
	protected String getDestString() {
		return "dollar";
	}
}

class Km2Mile extends Converter {

	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}
	
	@Override
	protected double convert(double src) {
		return src/this.ratio;
	}

	@Override
	protected String getSrcString() {
		return "km";
	}

	@Override
	protected String getDestString() {
		return "mile";
	}
}

class homework8_2 {
	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
		toDollar.run(2400);
		Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6km
		toMile.run(3.2);
	}
}