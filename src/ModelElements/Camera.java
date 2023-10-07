package ModelElements;

//Класс для работы с камерой
public class Camera {
    public Point3D location;
    public Angle3D angle;

    //Конструктор класса
    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    //Метод вращения камеры
    public void Rotate(Angle3D angle3D) {

    }

    //Метод перемещения камеры
    public void Move(Point3D point3D) {

    }
}
