package OOP.entity.NonLipid;

import OOP.entity.NonLipidVirus;
import OOP.entity.VirusShape;

public class Polio extends NonLipidVirus {
    public Polio(String name, Integer size, VirusShape shape, String capsid, String acidNucleic, String imageURL) {
        super(name, size, shape, capsid, acidNucleic, imageURL);
    }

    @Override
    public String toString() {
        return "Polio"+ super.toString();
    }

    @Override
    public String infect() {
        super.infect();
        return "src/main/resources/OOP/GUI/Lipid/HIV/hiv.mp4";
    }
}
