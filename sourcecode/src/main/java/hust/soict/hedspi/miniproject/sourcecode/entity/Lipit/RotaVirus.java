package hust.soict.hedspi.miniproject.sourcecode.entity.Lipit;

import hust.soict.hedspi.miniproject.sourcecode.entity.LipitVirus;
import hust.soict.hedspi.miniproject.sourcecode.entity.VirusShape;

public class RotaVirus extends LipitVirus {
    public RotaVirus(String name, String acidNucleic, String capsid, Integer size, VirusShape shape, String imageURL, String effect, String typeOfLipid) {
        super(name, acidNucleic, capsid, size, shape, imageURL, effect, typeOfLipid);
    }

    @Override
    public String toString() {
        return "Rota " + super.toString();
    }
}
