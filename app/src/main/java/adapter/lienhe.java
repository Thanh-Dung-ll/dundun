package adapter;

public class lienhe {
    private String Ten;
    private String Mahocsinh;
    private int Mau;
    public lienhe(String name, String idStudent, int color) {
        this.Ten = name;
        this.Mahocsinh = idStudent;
        this.Mau = color;

    }
    public String getName()
    {
        return Ten;
    }
    public void setName(String name) {
        this.Ten = name;
    }
    public String getIdStudent() {
        return Mahocsinh;
    }
    public void setIdStudent(String idStudent) {
        this.Mahocsinh = idStudent;
    }
    public int getColor() {
        return Mau;
    }

    public void setColor(int color) {
        this.Mau = color;
    }
}
