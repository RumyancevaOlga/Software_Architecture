package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.util.ArrayList;

//Класс хранилища моделей
public class ModelStore implements IModelChanger {
    public ArrayList<PoligonalModel> models;
    public ArrayList<Scene> scenes;
    public ArrayList<Flash> flashes;
    public ArrayList<Camera> cameras;
    private ArrayList<IModelChangedObserver> changedObserver;

    //Конструктор класса
    public ModelStore(ArrayList<IModelChangedObserver> changedObserver) {
        this.models = new ArrayList<PoligonalModel>();
        this.scenes = new ArrayList<Scene>();
        this.flashes = new ArrayList<Flash>();
        this.cameras = new ArrayList<Camera>();
        this.changedObserver = changedObserver;
    }

    //Метод имплиментируемый из интерфейса IModelChanger
    @Override
    public void NotifyChange(IModelChanger sender) {

    }

    //Метод для возвращения сцены
    public Scene GetScene(int num) {
        return null; //заглушка
    }

    //геттер для приватной переменной changedObserver
    public ArrayList<IModelChangedObserver> getChangedObserver() {
        return changedObserver;
    }

    //cеттер для приватной переменной changedObserver
    public void setChangedObserver(ArrayList<IModelChangedObserver> changedObserver) {
        this.changedObserver = changedObserver;
    }
}
