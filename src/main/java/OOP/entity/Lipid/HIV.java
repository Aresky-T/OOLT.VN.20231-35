package OOP.entity.Lipid;

import OOP.entity.LipidVirus;
import OOP.entity.Virus;
import OOP.entity.VirusShape;

public class HIV extends LipidVirus {




    public HIV(String name, Integer size, VirusShape shape, String capsid, String acidNucleic, String imageURL, String effect, String typeOfLipid) {
        super(name, size, shape, capsid, acidNucleic, imageURL, effect,typeOfLipid);


    }



    @Override
    public String toString() {
        return "HIV " + super.toString()+
                "RNA='"  + '\'' +
                ", proteinP79='"  + '\'' ;
    }
    @Override
    public String infect() {
        return "src/main/resources/OOP/GUI/Lipid/Covid/animation.mp4";
    }
}
