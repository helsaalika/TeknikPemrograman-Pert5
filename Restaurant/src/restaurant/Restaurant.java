package restaurant;
import java.util.Scanner;

public class Restaurant {
	
	public MenuMakanan[] menu;
	public static byte id=1;
	
	Scanner scan = new Scanner(System.in);
	
	public Restaurant() {
		menu = new MenuMakanan[10];
		for(int i = 0; i<10; i++) {
			menu[i] = new MenuMakanan();
		}
		id = 1;
	}
	
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		this.menu[id].setNama_makanan(nama);
		this.menu[id].setHarga_makanan(harga);
		this.menu[id].setStok(stok);
	}
	
	public void tampilMenuMakanan(){
		System.out.println("\tMenu Makanan");
		System.out.println("********************************");
		for(int i =0; i<=id;i++){
			if(!isOutOfStock(i)){
				System.out.println(i+". "+menu[i].getNama_makanan() +"["+menu[i].getStok()+"]"+"\tRp. "+menu[i].getHarga_makanan());
			}
		}
	}
	
	public void StokBerkurang(int id, int pesanan) {
		int stok = 0;
		
		stok = menu[id].getStok() - pesanan;
		menu[id].setStok(stok);
	}
	
	public void Pemesanan() {
		int pesanan, idMakanan;
		
		System.out.println("");
		System.out.println("\tSilahkan Pesan Makanan");
		System.out.println("********************************");
		System.out.println("Masukkan nomor makanan = ");
		idMakanan = scan.nextInt();
		System.out.println("Berapa yang di pesan ? ");
		pesanan = scan.nextInt();
		
		if (isOutOfStock(idMakanan)==true) {
			System.out.println("Stok habis! silahkan kembali dan pilih yang tersedia");
		} else {
			StokBerkurang(idMakanan, pesanan);
		}
		
	}
	
	public boolean isOutOfStock(int id){
		if(menu[id].getStok() == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public static void nextId(){
		id++;
	}


}
