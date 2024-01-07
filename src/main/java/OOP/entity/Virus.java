package OOP.entity;

import java.util.List;

public class Virus  implements InfectionBehavior, DiseaseCausingBehavior {
    private String name;

    private Integer size; // Kích thước của virus
    private VirusShape shape; // Hình dạng của virus
    private String capsid;
    private String acidNucleic;
    private String imageURL; // Link ảnh virus
    private List<Disease> associatedDiseases; // Các bệnh gây ra bở virus lên vật chủ

//    public Virus() {
//    }
//
//
//    public Virus(  List<Disease> associatedDiseases) {
//
//
//        this.associatedDiseases = associatedDiseases;
//    }

    public Virus(String name, Integer size, VirusShape shape, String capsid, String acidNucleic) {
        this.name = name;
        this.size = size;
        this.shape = shape;
        this.capsid = capsid;
        this.acidNucleic = acidNucleic;
    }

    public Virus(String name, Integer size, VirusShape shape, String capsid, String acidNucleic, String imageURL) {
        this.name = name;
        this.size = size;
        this.shape = shape;
        this.capsid = capsid;
        this.acidNucleic = acidNucleic;
        this.imageURL = imageURL;
    }

    public Virus(String name, Integer size, VirusShape shape, String capsid, String acidNucleic, String imageURL, List<Disease> associatedDiseases) {
        this.name = name;
        this.size = size;
        this.shape = shape;
        this.capsid = capsid;
        this.acidNucleic = acidNucleic;
        this.imageURL = imageURL;
        this.associatedDiseases = associatedDiseases;
    }

//    public Virus(int size, VirusShape shape, String imageURL) {
//        this.size = size;
//        this.shape = shape;
//
//        this.imageURL = imageURL;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCapsid() {
        return capsid;
    }

    public void setCapsid(String capsid) {
        this.capsid = capsid;
    }

    public String getAcidNucleic() {
        return acidNucleic;
    }

    public void setAcidNucleic(String acidNucleic) {
        this.acidNucleic = acidNucleic;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public VirusShape getShape() {
        return shape;
    }

    public void setShape(VirusShape shape) {
        this.shape = shape;
    }





    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public List<Disease> getAssociatedDiseases() {
        return associatedDiseases;
    }

    public void setAssociatedDiseases(List<Disease> associatedDiseases) {
        this.associatedDiseases = associatedDiseases;
    }

    // Hấp thụ (hay bám dính) - sự liên kết với phân tử đặc hiệu trên bề mặt tế bào
    public String adsorption() {
        return "";
    };

    // Xâm nhập - xâm nhập vào trong tế bào chủ bằng hình thức nhập bào hoặc hòa màng với tế bào
    public String penetration() {
        return "";
    };

    // Cởi áo (hay giải phóng lõi) - vỏ capsid của virus bị enzyme virus hoặc enzyme của tế bào chủ phá hủy -> giải phóng lõi acid nucleic
    public String uncoating() {
        return "";
    };

    // Tổng hợp (hay sao chép) - tế bào chủ sử dụng ARN của virus để tạo ra protein cho virus sử dụng
    public String replication() {
        return "";
    };

    // Lắp ráp - các protein virus và acid nucleic lắp ráp theo khuôn mẫu tạo ra virus mới
    public String assembly() {
        return "";
    };

    // Giải phóng - tế bào bị vỡ ra, virus được giải phóng ra ngoài, một số virus như HIV giải phóng một cách nhẹ nhàng hơn nhờ quá trình nảy chồi
    public String release() {
        return "";
    };


    // Hành vi Lây nhiễm
    @Override
    public String infect() {
        adsorption();
        penetration();
        return "";
    }


    // Hành vi gây bệnh
    @Override
    public void causeDisease() {
        uncoating();
        replication();
        assembly();
        release();
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", size=" + size +
                ", shape=" + shape +
                ", capsid=" + capsid +
                ", acidNucleic=" + acidNucleic
                ;
    }
}
