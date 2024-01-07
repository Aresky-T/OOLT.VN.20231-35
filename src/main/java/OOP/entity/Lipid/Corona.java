package OOP.entity.Lipid;

import OOP.entity.*;

public class Corona extends LipidVirus {


    public Corona(String name, Integer size, VirusShape shape, String capsid, String acidNucleic, String imageURL, String effect, String typeOfLipid) {
        super(name, size, shape, capsid, acidNucleic, imageURL, effect, typeOfLipid);
    }

    @Override
    public String toString() {
        return "CORONA "+ super.toString() +
                "spike='" + '\''
                ;
    }

    @Override
    public String infect() {
        return "src/main/resources/OOP/GUI/Lipid/Covid/animation.mp4";
    }
}
