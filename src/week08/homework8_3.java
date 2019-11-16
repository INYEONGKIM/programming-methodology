package week08;

interface MyArray {
	int length(); // 현재 배열에 저장된 개수 리턴

	int capacity(); // 배열의 전체 저장 가능한 개수 리턴

	String get_remove(int index); // index에 해당하는 값 반환후, 배열에서 해당 값 없애기.

	boolean set(String val, int index); // index에 해당하는 값으로 val 저장
}

class StringArray implements MyArray {
	private int max_num; // 저장 가능한 값 개수
	private int num; // 저장한 값 개수
	private String[] arr;

	public StringArray(int num) {
		// fill here!
		this.max_num = num;
		this.num = 0;
		this.arr = new String[num];
	}

	public int length() {
		return this.num;
	}

	public int capacity() {
		return this.max_num;
	}

	public String get_remove(int index) {
		if (index < this.max_num) {
			String res = this.arr[index];
			for (int i = index; i < this.num - 1; i++) {
				this.arr[i] = this.arr[i + 1];
			}
			if (index == this.num) {
				this.arr[index] = null;
			}
			this.num--;
			return res;
		}
		return null;
	}

	public boolean set(String val, int index) {
		if (!(0 <= index && index < this.max_num) || this.arr[index] != null) {
			return false;
		} else {
			for (int i = 0; i < index - 1; i++) {
				if (this.arr[i] == null) {
					return false;
				}
			}
			this.arr[index] = val;
			this.num++;
			return true;
		}
	}
}

class homework8_3 {
	public static void main(String[] args) {
		MyArray arr = new StringArray(100);
		arr.set("a", 0);
		arr.set("b", 1);
		arr.set("c", 2);

		System.out.println(arr.get_remove(0));// a
		System.out.println(arr.get_remove(0));// b

	}
}