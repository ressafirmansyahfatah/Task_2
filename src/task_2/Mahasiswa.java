package task_2;

/**
 * 
 *  NIM = 1301154105
 *  Nama = Ressa Firmansyah Fatah
 * 
 */
public class Mahasiswa {
    private String NIM;
    private String Nama;
    private String Status;
    char ary[];
    int i;

    // constructor
    public Mahasiswa() {
        this.Status = "Tidak lulus";
        this.i = 0;
        this.ary = new char[10];
    }
    
    public Mahasiswa (String a, String b){
        this.NIM = a;
        this.Nama = b;
        this.Status = "Tidak lulus";
        this.i = 0;
        this.ary = new char[10];
    }
    
    
    
    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    

    
    public void addNilai(char nilai){
        if (i <= 10)
            this.ary[i] = nilai;
        i++;
    }
    
    public char getNilai(int i){
        return ary[i];
    }
    
    public String toString(){
        String p =  NIM + ", " + Nama + ", " + Status + ", nilai = ";
        for (int z = 0; z < i; z++){
            p = p + ary[z] + ",";
        }
        return p;
    }
    
    public char cekNilai(Mahasiswa m){
        char rt = 0;
        for (char x = 'A'; x <= 'E'; x++){
            for (int coun = 0; coun < i; coun++){
                if (ary[coun] == x){
                    for (int y = 0; y < m.i; y++){
                        if (m.ary[y] == x){
                            return x;
                        }
                    }
                }
            }
        }
        return rt;
    }
}