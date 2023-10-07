package InMemoryModel;

//Интерфейс для изменения модели наблюдателем
public interface IModelChangedObserver {
    public void ApplyUpdateModel();
}
