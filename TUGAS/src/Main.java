public class Main {
    public static void main(String[] args) {
       
        //PEGAWAI
        Pegawai p1 = new Pegawai("2131710103","Khosyi Nasywa","Cimahi");
        Pegawai p2 = new Pegawai("2131710102","Elvia Amandaa","Bogor");

        //DOSEN
        Dosen d1 = new Dosen("221713433","Bambang","Ciamis");
        d1.setSKS(22);
        Dosen d2 = new Dosen("221723432","Praban Arifin","Purwokerto");
        d2.setSKS(20);
        Dosen d3 = new Dosen("221732342","Edi Wicaksono","Sukabumi");
        d3.setSKS(21);

        //GAJI
        DaftarGaji gaji = new DaftarGaji(2500000);
        gaji.addPegawai(p1);
        gaji.addPegawai(p2);
        gaji.addPegawai(d1);
        gaji.addPegawai(d2);
        gaji.addPegawai(d3);
        gaji.printSemuaGaji();

        System.out.println("");
    
    }
}
