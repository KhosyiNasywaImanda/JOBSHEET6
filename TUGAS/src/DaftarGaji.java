import java.util.ArrayList;

public class DaftarGaji {
    public int gaji;
    public Pegawai[] listPegawai;
    ArrayList <Pegawai> peg = new ArrayList();

    public DaftarGaji(int gaji){
        this.gaji = gaji;
    }

    public void addPegawai(Pegawai p){
        p.gaji = p.getGaji() + this.gaji;
        peg.add(p);
    }

    public void printSemuaGaji(){
        System.out.println("----------------------------------------------------------");
        System.out.println("NIP\t\t| NAMA\t\t  | ALAMAT\t| GAJI");
        System.out.println("----------------------------------------------------------");

        for (int i=0; i<peg.size(); i++){
            System.out.println(peg.get(i).nip+"\t| "+peg.get(i).nama+"\t  | "+peg.get(i).alamat+"\t| "+peg.get(i).gaji);
        }

    }


}
