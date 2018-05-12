package thuan.nguyenngoc;

public class HinhKhoi {
	protected float chieucao;

	public HinhKhoi(float chieucao) {
		this.chieucao = chieucao;
	}

	public HinhKhoi() {
		this.chieucao = 0;
	}

	@Override
	public String toString() {
		return "Hinh khoi: " + "\n Chieu cao: " + chieucao;
	}

}
