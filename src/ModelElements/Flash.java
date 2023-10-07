package ModelElements;

//Класс для работы с Флэш-объектами
public class Flash {
    public Point3D location;
    public Angle3D angle;
    public Color color;
    public float power;

    //Конструктор класса
    public Flash(Point3D location, Angle3D angle, Color color, float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    //Метод поворота флэш-объекта
    public void Rotate(Angle3D angle3D) {

    }

    //Метод переещения флэш-объекта
    public void Move(Point3D point3D) {

    }
}
