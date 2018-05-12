package thuan.nguyenngoc;

public class HinhKhoi1 extends HinhKhoi {
	protected float chieudai;

	public HinhKhoi1(float chieudai, float chieucao) {
		super(chieucao);
		this.chieudai = chieudai;
	}

	public HinhKhoi1() {
		this.chieudai = 0;
	}

	public double theTich() {
		return chieucao * Math.pow(chieudai, 2);
	}
		@Override
	    public String toString() {
	        return super.toString() + "\n Chieu dai = " + chieudai;	
	}
	
}
