package thuan.nguyenngoc;

public class HinhKhoi3 extends HinhKhoi {
	private float bankinh;

	private float getBankinh() {
		return bankinh;
	}

	private void setBankinh(float bankinh) {
		this.bankinh = bankinh;
	}

	public HinhKhoi3() {
		this.bankinh = 0;
	}

	public HinhKhoi3(float chieucao, int bankinh) {
		super(chieucao);
		this.bankinh = bankinh;
	}

	public double theTich() {
		return chieucao * Math.PI * Math.pow(bankinh, 2);
	}

	@Override
	public String toString() {
		return super.toString() + " \n Ban kinh= " + bankinh;
	}
}