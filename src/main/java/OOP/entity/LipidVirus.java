package OOP.entity;

import java.util.List;

public class LipidVirus extends Virus {
    private  String effect;
    private String typeOfLipid;

//    public  LipidVirus(String name, Integer size, VirusShape shape, Capsid capsid, AcidNucleic acidNucleic){
//
//    }


    public LipidVirus(String name, Integer size, VirusShape shape, String capsid, String acidNucleic, String imageURL, String effect, String typeOfLipid) {
        super(name, size, shape, capsid, acidNucleic, imageURL);
        this.effect = effect;
        this.typeOfLipid = typeOfLipid;
    }



    @Override
    public String toString() {
        return super.toString()+ "LipidVirus{" +
                "lipidEnvelope='" + '\''
                ;
    }

    @Override
    public String infect() {
        System.out.println("Enveloped virus infects a cell via endocytosis.");
        return "";
    }
}
