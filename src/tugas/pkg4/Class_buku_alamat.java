Template Class
public class bukualamat {
    private String nama;
    private String alamat;
    private String telp;
    private String email;
    
    public bukualamat () {
        nama = null;
        alamat = null;
        telp = null;
        email = null;
    }
    public bukualamat (String n, String a, String t, String e){
        nama = n;
        alamat = a;
        telp = t;
        email = e;
    }
    public void setNama (String n) {
        nama = n;
    }
    public void setAlamat (String a) {
        alamat = a;
    }
    public void setTelp (String t) {
        telp = t;
    }
    public void setEmail (String e) {
        email = e;
    }
    public String getNama () {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public String getTelp () {
        return telp;
    }
    public String getEmail () {
        return email;
    }
    public void info () {
        System.out.println("Nama        : "+nama);
        System.out.println("Alamat      : "+alamat);
        System.out.println("No. Telp    : "+telp);
        System.out.println("E-mail      : "+email);
    }
}
