package thuan.nguyenngoc;

public class HinhKhoi2 extends HinhKhoi1 {
	protected float chieurong;

	public HinhKhoi2(float chieudai, float chieucao, float chieurong) {
		super(chieudai, chieucao);
		this.chieurong = chieurong;
	}

	float getChieurong() {
		return chieurong;
	}

	public void setChieurong(float chieurong) {
		this.chieurong = chieurong;
	}

	public HinhKhoi2() {
		this.chieurong = 0;
	}
	
	@Override
    public double theTich(){
        return chieucao * chieudai * chieurong;
    }

	@Override
	public String toString() {
		return super.toString() + "\n chieu rong = " + chieurong;
	}
}
