import core.Films;

public class Menu extends Films {
    public Admin admin;
    public Films pelem;

    public Menu() {
        this.admin = new Admin();
        pelem = new Films();
    }

    public boolean compare(String user, String password) {
        if (user.equals(admin.User) && password.equals(admin.Password)) {
            return true;
        } else
            return false;
    }

    public void MenuLogin() {
        System.out.print("Masukkan user : ");
        String user = input.nextLine();
        System.out.print("Masukkan password : ");
        String password = input.nextLine();
        if (compare(user, password) == true) {
            menuBuku();
        } else {
            System.out.println("user dan password salah");
        }
    }

    public void menuBuku() {
        boolean ulang = true;


        do {
            System.out.println("====================================================================");
            System.out.println("1. Tambahkan Data Film");
            System.out.println("2. Edit Data Film");
            System.out.println("3. Hapus Data Film");
            System.out.println("4. Tampilkan semua Data Film");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan anda : ");
            int pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    addFilm();
                    break;
                case 2:
                    editFilm();
                    break;
                case 3:
                    removeFilm();
                    break;
                case 4:
                    tampilkanFilm();
                    break;
                case 5:
                    ulang = false;
                    break;
                default:
                    System.out.println("Pilihlah sesuai dimenu");
            }
        } while (ulang);

    }
}
