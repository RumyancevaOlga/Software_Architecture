package InMemoryModel;

//Интерфейс для изменения модели
public interface IModelChanger {
    public void NotifyChange(IModelChanger sender);
}
