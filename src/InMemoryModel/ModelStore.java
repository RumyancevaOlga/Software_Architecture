package InMemoryModel;

import ModelElements.*;

import java.util.ArrayList;

//Класс хранилища моделей
public class ModelStore implements IModelChanger {
    public ArrayList<PoligonalModel> models;
    public ArrayList<Scene> scenes;
    public ArrayList<Flash> flashes;
    public ArrayList<Camera> cameras;
    private ArrayList<IModelChangedObserver> changedObserver;

    //Конструктор класса
    public ModelStore(ArrayList<IModelChangedObserver> changedObserver) throws Exception {
        this.models = new ArrayList<PoligonalModel>();
        this.scenes = new ArrayList<Scene>();
        this.flashes = new ArrayList<Flash>();
        this.cameras = new ArrayList<Camera>();
        this.changedObserver = changedObserver;

        models.add(new PoligonalModel(new ArrayList<Texture>()));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene(0, models, flashes, cameras));
    }

    //Метод имплиментируемый из интерфейса IModelChanger
    @Override
    public void NotifyChange(IModelChanger sender) {

    }

    //Метод для возвращения сцены
    public Scene GetScene(int id) {
        for (Scene scene : scenes) {
            if (scene.id == id) {
                return scene;
            }
        }
        return null;
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
