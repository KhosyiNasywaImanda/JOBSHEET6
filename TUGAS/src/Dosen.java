public class Dosen extends Pegawai {
    private int jumlahSKS=0;
    private int Tarif_SKS=120000;

    public Dosen(String nip ,String nama , String alamat){
        super(nip,nama,alamat);
    }

    public void setSKS(int sks){
        jumlahSKS += sks;
    }

    public int getGaji(){
        gaji = (super.getGaji() + (jumlahSKS * Tarif_SKS));
        return gaji;
    }
    
    
}
