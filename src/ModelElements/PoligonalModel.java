package ModelElements;

import java.util.ArrayList;

//Класс для работы с моделями полигонов
public class PoligonalModel {
    public ArrayList<Poligon> poligons;
    public ArrayList<Texture> textures;

    //Конструктор класса
    public PoligonalModel(ArrayList<Texture> textures) {
        this.poligons = new ArrayList<Poligon>();
        this.textures = textures;
        poligons.add(new Poligon(new ArrayList<Point3D>()));
    }
}
