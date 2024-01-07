package OOP.entity;

import java.util.List;

public class NonLipidVirus extends Virus{
    public NonLipidVirus(String name, Integer size, VirusShape shape, String capsid, String  acidNucleic, String imageURL) {
        super(name, size, shape, capsid, acidNucleic, imageURL);
    }

    @Override
    public String infect() {
        System.out.println("Non-enveloped virus infects a cell by penetrating the cell membrane.");
        return super.infect();
    }
}
