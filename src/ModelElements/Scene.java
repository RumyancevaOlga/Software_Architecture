package ModelElements;

import java.lang.reflect.Type;
import java.util.ArrayList;

//Класс для работы со сценами
public class Scene {
    public int id;
    public ArrayList<PoligonalModel> models;
    public ArrayList<Flash> flashes;

    //Конструктор класса
    public Scene(int id, ArrayList<PoligonalModel> models, ArrayList<Flash> flashes) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
    }


    //первый метод сцены
    public Type method1(Type arg) {

        return null; //заглушка
    }

    //второй метод сцены
    public Type method2(Type arg1, Type arg2) {
        return null; //заглушка
    }
}
