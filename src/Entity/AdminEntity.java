package Entity;

public class AdminEntity
{
    // private String nama;
    private String username, password;

    public AdminEntity(/*String nama,*/ String username , String password )
    {
        //this.nama   =nama;
        this.username =username;
        this.password = password;
    }

   /* public String getNama() {
        return nama;
    }*/

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

   /* public void setNama(String nama) {
        this.nama = nama;
    }*/

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
