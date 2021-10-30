//Product: id, наименование, цена, срок хранения, количество
//Создать массив объектов. Вывести: а) список товаров для заданного наименования
//b) список товаров для заданного наименования, цена которых не превосходит заданную
//c) список товаров, срок хранения которых больше заднного

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product products[] = new Product[4];
        products[0] = new Product(12345,200000,2023,300,"телевизор");
        products[1] = new Product(34856,180000,2021,400,"холодильник");
        products[2] = new Product(84657,170000,2024,150,"ноутбук");
        products[3] = new Product(29341,55000,2025,200,"утюг");
        System.out.println("Список товаров для заданного наименование: ");
        String aty = sc.nextLine();
        for (int i = 0; i <4 ; i++) {
            if(products[i].getName().equals(aty)){
                System.out.println(products[i].toString());
            }
        }
        System.out.println("Цена до:");
        int b = sc.nextInt();
        for (int i = 0; i < 4 ; i++) {
            if(b >= products[i].getPrice()){
                System.out.println(products[i].toString());
            }
        }
        System.out.println("Срок хранения от:");
        int c = sc.nextInt();

        for (int i = 0; i < 4 ; i++) {
            if(c <= products[i].getShelf_life()){
                System.out.println(products[i].toString());
            }
        }

    }
}

class Product {
    private long id;
    private int price;
    private int shelf_life;
    private int quantity;
    private String name;

    public Product (long id, int price, int shelf_life, int quantity, String name) {
        this.id = id;
        this.price = price;
        this.shelf_life = shelf_life;
        this.quantity = quantity;
        this.name = name;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public int getShelf_life() {
        return shelf_life;
    }
    public void setShelf_life(int shelf_life) {
        this.shelf_life = shelf_life;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Product{ " +
                "Id = " + id +
                ", Name = '" + name + '\'' +
                ", Price = '" + price + '\'' +
                ", Shelf-life = '" + shelf_life + '\'' +
                ", Quantity = '" + quantity + '\'' +
                '}';
    }

}

