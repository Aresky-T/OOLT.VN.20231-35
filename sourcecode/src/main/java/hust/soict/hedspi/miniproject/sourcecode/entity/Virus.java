package hust.soict.hedspi.miniproject.sourcecode.entity;

import java.util.List;

public class Virus  implements InfectionBehavior, DiseaseCausingBehavior {
    private String name;
    private String geneticMaterial; // Acid nucleic
    private String protein; // Protein của virus
    private Integer size; // Kích thước của virus
    private VirusShape shape; // Hình dạng của virus
    private VirusType type; // Phân loại virus (Có vỏ hoặc không có vỏ lipit)
    private String imageURL; // Link ảnh virus
    private List<Disease> associatedDiseases; // Các bệnh gây ra bở virus lên vật chủ

    public Virus() {
    }

    public Virus(String geneticMaterial, String protein) {
        this.geneticMaterial = geneticMaterial;
        this.protein = protein;
    }

    public Virus(String geneticMaterial, String protein, List<Disease> associatedDiseases) {
        this.geneticMaterial = geneticMaterial;
        this.protein = protein;
        this.associatedDiseases = associatedDiseases;
    }

    public Virus(int size, VirusShape shape, VirusType type, String imageURL) {
        this.size = size;
        this.shape = shape;
        this.type = type;
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeneticMaterial() {
        return geneticMaterial;
    }

    public void setGeneticMaterial(String geneticMaterial) {
        this.geneticMaterial = geneticMaterial;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
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

    public VirusType getType() {
        return type;
    }

    public void setType(VirusType type) {
        this.type = type;
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

    public String toString(){
        return "Virus: " + "[ type: " + this.type + ", shape: " + this.shape + " ]";
    }


    // Hành vi Lây nhiễm
    @Override
    public String infect() {
        adsorption();
        penetration();
        return "src/main/resources/hust/soict/hedspi/miniproject/sourcecode/GUI/virus_details/animation.mp4";
    }


    // Hành vi gây bệnh
    @Override
    public void causeDisease() {
        uncoating();
        replication();
        assembly();
        release();
    }
}
