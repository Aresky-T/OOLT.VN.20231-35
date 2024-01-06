package hust.soict.hedspi.miniproject.sourcecode.entity;

public enum VirusType {
    LIPIT("Virus có vỏ Lipit"), NON_LIPIT("Virus không có vỏ Lipit");

    private final String type;

    private VirusType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}