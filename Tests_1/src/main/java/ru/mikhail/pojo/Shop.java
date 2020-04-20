package ru.mikhail.pojo;

public class Shop {
    public Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
               products[i] = products[i + 1];
               products[products.length - 1] = null;
        }
        return products;
    }
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

       // for (int index = 0; index < products.length; index++) {
         //   Product product = products[index];
          //  if (product != null) {
            //    System.out.println(product.getName() + " " + product.getCount());
           // }
       // }
        Shop shop = new Shop();
        shop.delete(products, 1);

        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

      //  System.out.println();
       // System.out.println("Удаляем значение ячейки с ндексом 1.");
      //  products[1] = null;
       // for (int index = 0; index < products.length; index++) {
          //  Product product = products[index];
           // if (product != null) {
            //    System.out.println(product.getName() + " " + product.getCount());
           // } else {
               // System.out.println("null");
           // }
       // }
       // System.out.println();
        //System.out.println("Записываем в ячейку с индексом 1 из ячейки с индексом 2 и удаляем ячейку с индексом 2.");
       // products[1] = products[2];
       // products[2] = null;

        //for (int index = 0; index < products.length; index++) {
         //   Product product = products[index];
          //  if (product != null) {
         //       System.out.println(product.getName() + " " + product.getCount());
          //  } else {
                //System.out.println("null");
           // }
      //  }
       // Product[] pro = new Product[8];
      //  pro[0] = new Product("Milk", 10);
       // pro[2] = new Product("Bread", 4);
       // pro[5] = new Product("Egg", 14);

       // for (int index = 0; index < pro.length; index++) {
        //    Product product = pro[index];
          //  if (product != null) {
             //   System.out.println(product.getName() + " " + product.getCount());
          //  } else {
            //    System.out.println("null");
         //   }
       // }

    }
}
