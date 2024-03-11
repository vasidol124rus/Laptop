import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class LaptopFilter {

    private List<Laptop> laptops;

    public LaptopFilter(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    public void filterLaptops() {
        // Создать карту для хранения критериев фильтрации
        Map<Integer, String> filterCriteria = new HashMap<>();
        filterCriteria.put(1, "ОЗУ");
        filterCriteria.put(2, "Объем ЖД");
        filterCriteria.put(3, "Диагональ экрана");
        filterCriteria.put(4, "Цвет");

        // Запросить у пользователя критерии фильтрации
        System.out.println("Ноутбуки в наличии: " + laptops);
        System.out.println();
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println();
        for (Map.Entry<Integer, String> entry : filterCriteria.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        int criterion = Integer.parseInt(System.console().readLine());


    public static void main(String[] args) {
        // Создать множество ноутбуков
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Lenovo", 8, 512, 17.3, "Черный"));
        laptops.add(new Laptop("HP", 16, 1024, 14.0, "Серебристый"));
        laptops.add(new Laptop("Dell", 32, 2048, 15.3, "Синий"));
        laptops.add(new Laptop("Acer", 16, 512, 15.3, "Красный"));
        laptops.add(new Laptop("Asus", 8, 256, 17.3, "Белый"));

        // Создать объект фильтра ноутбуков
        LaptopFilter filter = new LaptopFilter(laptops);

        // Отфильтровать ноутбуки
        filter.filterLaptops();
    }
}

class Laptop {

    private String brand;
    private int ram;
    private int hdd;
    private Double diagonal;
    private String color;

    public Laptop(String brand, int ram, int hdd, Double diagonal, String color) {
        this.brand = brand;
        this.ram = ram;
        this.hdd = hdd;
        this.diagonal = diagonal;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public Double getDiagonal() {
        return diagonal;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Ноутбук: " + brand + ", ОЗУ: " + ram + " ГБ, Объем ЖД: " + hdd + " ГБ, Диагональ экрана " + diagonal + ", Цвет: " + color;
    }
}