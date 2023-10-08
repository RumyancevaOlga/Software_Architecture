package ModelElements;

import java.lang.reflect.Type;
import java.util.ArrayList;

//Класс для работы со сценами
public class Scene {
    public int id;
    public ArrayList<PoligonalModel> models;
    public ArrayList<Flash> flashes;
    public ArrayList<Camera> cameras;

    //Конструктор класса
    public Scene(int id, ArrayList<PoligonalModel> models, ArrayList<Flash> flashes, ArrayList<Camera> cameras) throws Exception {
        this.id = id;
        this.flashes = flashes;
        if (!models.isEmpty()) {
            this.models = models;
        } else {
            throw new Exception("At least one model is needed");
        }
        if (!flashes.isEmpty()) {
            this.cameras = cameras;
        } else {
            throw new Exception("At least one camera is needed");
        }
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
