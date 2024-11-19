abstract class Weapon {
    // Поля (инкапсуляция)
    protected String name;
    protected int damage;
    protected String material;

    private static int objectCounter = 0;

    public Weapon() {
        objectCounter++;
    }

    public Weapon(String name, int damage, String material) {
        this.name = name;
        this.damage = damage;
        this.material = material;
        objectCounter++;
    }

    public abstract void displayInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public static int getObjectCounter() {
        return objectCounter;
    }
}

class Sword extends Weapon {
    private int bladeLength;

    public Sword() {
        super();
    }

    public Sword(String name, int damage, String material, int bladeLength) {
        super(name, damage, material);
        this.bladeLength = bladeLength;
    }

    @Override
    public void displayInfo() {
        System.out.println("Информация о мече:");
        System.out.println("Название: " + name);
        System.out.println("Урон: " + damage);
        System.out.println("Материал: " + material);
        System.out.println("Длина клинка: " + bladeLength + " см");
        System.out.println("Меч наносит урон " + damage + " очкам.");
    }
}

class Bow extends Weapon {
    private int range;

    public Bow() {
        super();
    }

    public Bow(String name, int damage, String material, int range) {
        super(name, damage, material); 
        this.range = range;
    }

    @Override
    public void displayInfo() {
        System.out.println("Информация о луке:");
        System.out.println("Название: " + name);
        System.out.println("Урон: " + damage);
        System.out.println("Материал: " + material);
        System.out.println("Дальность стрельбы: " + range + " метров");
        System.out.println("Лук наносит урон " + damage + " очкам на расстоянии " + range + " метров.");
    }
}

class Wand extends Weapon {
    private String magicType;

    public Wand() {
        super();
    }

    public Wand(String name, int damage, String material, String magicType) {
        super(name, damage, material);
        this.magicType = magicType;
    }

    @Override
    public void displayInfo() {
        System.out.println("Информация о волшебной палочке:");
        System.out.println("Название: " + name);
        System.out.println("Урон: " + damage);
        System.out.println("Материал: " + material);
        System.out.println("Тип магии: " + magicType);
        System.out.println("Волшебная палочка наносит урон " + damage + " очкам с помощью заклинания " + magicType + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание объектов
        Sword sword = new Sword("Нарсиль", 50, "Сталь", 100);
        Sword new_sword = new Sword("Меч рыцаря Гондора", 50, "Сталь", 150);
        Bow bow = new Bow("Лук Мирквуда", 30, "Дерево", 150);
        Wand wand = new Wand("Потрескавшийся Легендарный Посох", 40, "Древесина вишни", "Огненный шар");
        Bow orobow = new Bow("Лук  орков Гундабада", 150, "Кости Эльфов", 150);
        Wand white_wand = new Wand("Посох Гендальфа", 60, "Древесина Мэллорна", "Силы Света");


        sword.displayInfo();
        System.out.println();
        bow.displayInfo();
        System.out.println();
        wand.displayInfo();
        System.out.println();
        new_sword.displayInfo();
        System.out.println();
        orobow.displayInfo();
        System.out.println();
        white_wand.displayInfo();
        System.out.println();

        System.out.println("Всего создано оружия: " + Weapon.getObjectCounter());
    }
}