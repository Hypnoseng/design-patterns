# 🏭 Factory Method Pattern (Payment Example)

Factory Method Pattern คือแนวคิดการออกแบบซอฟต์แวร์
ที่ช่วยแยกกระบวนการ **สร้าง object** ออกจากการใช้งาน
โดยมอบความรับผิดชอบในการเลือกชนิดของ object
ให้กับ subclass แทนการสร้างโดยตรงใน class หลัก

---

## ตัวอย่าง

ในระบบตัวอย่างนี้ `OrderService` ไม่จำเป็นต้องรู้ว่าระบบกำลังใช้
การชำระเงินแบบ CreditCard, PayPal หรือ PromptPay  
แต่รู้เพียงว่าเป็น object ประเภท `Payment` เท่านั้น

---

## Problem

ระบบต้องรองรับหลายวิธีการชำระเงิน และมีแนวโน้มที่จะเพิ่มรูปแบบใหม่ในอนาคต  
หาก `OrderService` อ้างอิงไปยัง concrete class โดยตรง
จะทำให้เกิด tight coupling และแก้ไขระบบได้ยากเมื่อมีการเปลี่ยนแปลง

---

## Solution

ใช้ **Factory Method Pattern** เพื่อแยกความรับผิดชอบในการสร้าง
Payment object ออกจาก business logic ของ `OrderService`

`OrderService` จะทำงานผ่าน abstraction (`Payment`)
โดยปล่อยให้ factory method เป็นผู้ตัดสินใจ
ว่าจะสร้าง payment แบบใด

---

## Structure (Diagram)

<img src="diagram/factory-method-diagram.png" style="width:100%;" />

---

## Diagram Explanation

### ฝั่งขวา: Payment Hierarchy

`Payment` เป็น interface ที่กำหนดพฤติกรรมหลักของการชำระเงิน ได้แก่

- `prepare()`
- `pay()`
- `receipt()`

Concrete class เช่น

- `CreditCardPayment`
- `PromptPayment`
- `PayPalPayment`

เป็นผู้ implement พฤติกรรมเหล่านี้

---

### ฝั่งซ้าย: Service และ Factory

`OrderService` มี dependency เพียง `Payment` interface
และไม่อ้างอิง concrete class ใดโดยตรง

การตัดสินใจว่าจะใช้ payment แบบใด
ถูกย้ายไปอยู่ในส่วนของ PaymentService (Factory)
แทนที่จะอยู่ใน `OrderService`

---

## Factory Method ในตัวอย่างนี้

Factory Method คือเมธอดที่ทำหน้าที่ตัดสินใจ
ว่าจะสร้าง PaymentService แบบใด
เช่น CreditCard, PromptPay หรือ PayPal

แนวคิดของ Factory Method ใน diagram นี้
คือจุดที่มีการคืนค่า object เช่น

```java
return new PayPalPaymentService();
```
## Runtime Behavior (Client Side)

ในตัวอย่าง `Main` จะเห็นว่า client สามารถเปลี่ยน
implementation ของ `OrderService` ได้ใน runtime
โดยไม่ต้องแก้ไข logic การประมวลผลคำสั่งซื้อ

```java
public static void client(OrderService orderService){
        System.out.println(orderService.processOrder());
}

public static void main(String[] args){
    OrderService order = new CeditCardPaymentService();
    client(order);

    order = new PromptPaymentService();
    client(order);

    order = new PayPalPaymentService();
    client(order);
}

```
```java
---------Processing---------
Preparing Credit card payment....
Paying with Credit card...
Credit card receipt generated.

---------Processing---------
Preparing PromptPay card payment....
Paying with PromptPay...
PromptPay receipt generated.

---------Processing---------
Preparing PayPal payment....
Paying with PayPal card...
PayPal receipt generated.
```
