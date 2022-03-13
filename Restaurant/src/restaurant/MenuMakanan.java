package restaurant;

public class MenuMakanan {
	
	private String nama_makanan;
	private double harga_makanan;
	private int stok;
	
	public String getNama_makanan() {
		return nama_makanan;
	}

	public void setNama_makanan(String nama_makanan) {
		this.nama_makanan = nama_makanan;
	}

	public double getHarga_makanan() {
		return harga_makanan;
	}

	public void setHarga_makanan(double harga_makanan) {
		this.harga_makanan = harga_makanan;
	}

	public int getStok() {
		return stok;
	}

	public void setStok(int stok) {
		this.stok = stok;
	}

	public MenuMakanan() {
		this.nama_makanan = " ";
		this.harga_makanan = 0;
		this.stok = 0;
	}
}
