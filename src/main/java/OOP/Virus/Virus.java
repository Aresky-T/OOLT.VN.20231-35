package OOP.Virus;

public class Virus {
    public String ten = "covid";
    public int kichThuoc=6;
    public String anh="D:\\D\\intellij\\OOP_Project\\OOP_Project_1\\src\\main\\resources\\OOP\\GUI\\Lipid\\Covid\\Covid.png";
    public String video="src/main/resources/OOP/GUI/Lipid/Covid/animation.mp4";

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(int kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Virus{" +
                "ten='" + ten + '\'' +
                ", kichThuoc=" + kichThuoc +
                '}';
    }
}
