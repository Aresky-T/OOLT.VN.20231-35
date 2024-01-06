package hust.soict.hedspi.miniproject.sourcecode.service;

import hust.soict.hedspi.miniproject.sourcecode.entity.Virus;
import hust.soict.hedspi.miniproject.sourcecode.entity.VirusShape;
import hust.soict.hedspi.miniproject.sourcecode.entity.VirusType;

import java.util.ArrayList;
import java.util.List;

public class VirusDataService {
    private static final VirusDataService instance = new VirusDataService();
    private final List<Virus> virusList = new ArrayList<>();

    private VirusDataService(){
        Virus covid = new Virus();
        covid.setName("Corona virus");
        covid.setGeneticMaterial("ARN");
        covid.setProtein("Spike (S), Envelope (E), Membrane (M) và Nucleo capsid (N)");
        covid.setSize(125);
        covid.setShape(VirusShape.XOAN_OC);
        covid.setType(VirusType.LIPIT);
        covid.setImageURL("https://biochain.vn/wp-content/uploads/2020/03/Coronavirus-anh-huong-den-nong-san-va-thuc-pham.jpg");

        Virus rotavirus = new Virus();
        rotavirus.setName("Rotavirus");
        rotavirus.setGeneticMaterial("ARN");
        rotavirus.setProtein("Capsid protein");
        rotavirus.setSize(70);
        rotavirus.setShape(VirusShape.HINH_CAU);
        rotavirus.setType(VirusType.LIPIT);
        rotavirus.setImageURL("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/Rotavirus.jpg/280px-Rotavirus.jpg");

        Virus hivVirus = new Virus();
        hivVirus.setName("HIV Virus");
        hivVirus.setGeneticMaterial("ARN");
        hivVirus.setProtein("Enveloped protein");
        hivVirus.setSize(120);
        hivVirus.setShape(VirusShape.HINH_CAU);
        hivVirus.setType(VirusType.LIPIT);
        hivVirus.setImageURL("https://www.shutterstock.com/image-illustration/3d-rendered-hiv-virus-blood-260nw-559306498.jpg");

        Virus nonLipitVirus1 = new Virus();
        nonLipitVirus1.setName("Virus không vỏ lipit 1");
        nonLipitVirus1.setType(VirusType.NON_LIPIT);


        virusList.add(covid);
        virusList.add(rotavirus);
        virusList.add(hivVirus);
        virusList.add(nonLipitVirus1);
    }

    public static VirusDataService getInstance(){
        return instance;
    }

    public List<Virus> getVirusList(){
        return virusList;
    }
}
