package ModelElements;

import java.util.ArrayList;

//Класс для работы с моделями полигонов
public class PoligonalModel {
    public ArrayList<Poligon> poligons;
    public ArrayList<Texture> textures;

    //Конструктор класса
    public PoligonalModel(ArrayList<Poligon> poligons, ArrayList<Texture> textures) {
        this.poligons = poligons;
        this.textures = textures;
    }
}
