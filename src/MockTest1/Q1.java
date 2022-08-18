
package MockTest1;

/* INSERT */

public class Q1 {
    public static void main(String[] args){
   // this clas is shop
  //  Order order = null;
  //  Item item = null;}
}}

/*

*       There are two right answer here to Fixed the error we have Option A for order and B for items.
*    Option A : import orders.*;
*               import orders.items.*;
*    Option B : import orders.Order;
*               import orders.items.Item;
*
*       If you check the directory structure, you will find that directory "orders" contains "items",
*       but orders and orders.items are different packages.import orders.*; will only import all the classes in
*       orders package but not in orders.items package.

        You need to import Order and Item classes. To import Order class, use either import orders.Order;
        * OR import orders.*; and to import Item class, use either import orders.items.Item;
        * OR import orders.items.*;
*
* */
