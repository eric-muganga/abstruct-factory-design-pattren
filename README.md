# Furniture Store (Abstract Factory Pattern)

This repository demonstrates the **Abstract Factory** design pattern using a simple furniture store example. The program can produce matching sets of furniture—Chair, Sofa, and CoffeeTable—in different styles (Modern or Victorian), without the client code needing to know which style is being used.

## Table of Contents
- [Project Structure](#project-structure)
- [Pattern Explanation](#pattern-explanation)
- [Classes Overview](#classes-overview)
- [Source Code](#source-code)
  - [Main Application](#main-application)
  - [Abstract Products](#abstract-products)
  - [Concrete Products](#concrete-products)
  - [Abstract Factory](#abstract-factory)
  - [Concrete Factories](#concrete-factories)
- [How to Run](#how-to-run)
- [License](#license)

---

## Project Structure

![image](https://github.com/user-attachments/assets/593b454b-a798-4609-86dc-eaf8e5f83398)

---

## Pattern Explanation

**Abstract Factory** is a creational design pattern that provides an interface for creating **families** of related objects (in this case, furniture) without specifying their concrete classes. Here, each **FurnitureFactory** (Modern or Victorian) can produce a consistent set of products:

- `Chair`
- `Sofa`
- `CoffeeTable`

The **client code** (`App`) does not directly create the products. Instead, it relies on the **FurnitureFactory** to provide the corresponding family of furniture items. This ensures that all products match the chosen style (Modern or Victorian) and keeps the client code independent of concrete product classes.

---

## Classes Overview

1. **Abstract Products** (interfaces):  
   - `Chair`  
   - `Sofa`  
   - `CoffeeTable`

2. **Concrete Products**:
   - **Modern**: `ModernChair`, `ModernSofa`, `ModernCoffeeTable`
   - **Victorian**: `VictorianChair`, `VictorianSofa`, `VictorianCoffeeTable`

3. **Abstract Factory**:
   - `FurnitureFactory`: Declares methods to create each product type.

4. **Concrete Factories**:
   - `ModernFurnitureFactory`: Produces Modern furniture.
   - `VictorianFurnitureFactory`: Produces Victorian furniture.

5. **Client**:
   - `App`: Uses a `FurnitureFactory` to create the `Chair`, `Sofa`, and `CoffeeTable` objects and demonstrates each product’s functionality.

---

## Source Code

### Main Application

```java
package com.eric;

import com.eric.AbstractFactory.FurnitureFactory;
import com.eric.AbstractProducts.Chair;
import com.eric.AbstractProducts.CoffeeTable;
import com.eric.AbstractProducts.Sofa;
import com.eric.ConcreteFactories.ModernFurnitureFactory;

/**
 * Hello world!
 */
public class App
{
    private Chair chair;
    private Sofa sofa;
    private CoffeeTable table;

    public App(FurnitureFactory factory) {
        this.chair = factory.createChair();
        this.sofa = factory.createSofa();
        this.table = factory.createCoffeeTable();
    }

    public void furnishRoom() {
        chair.sitOn();
        sofa.lieOn();
        table.placeItemsOn();
    }

    public static void main(String[] args) {
        // Suppose a customer selects "Modern" style:
        FurnitureFactory factory = new ModernFurnitureFactory();

        // Alternatively, for "Victorian" style:
        // FurnitureFactory factory = new VictorianFurnitureFactory();

        App storeApp = new App(factory);
        storeApp.furnishRoom();
    }
}
```

### Abstract Products

```java
package com.eric.AbstractProducts;

public interface Chair {
    void sitOn();
}
```

```java
package com.eric.AbstractProducts;

public interface CoffeeTable {
    void placeItemsOn();
}
```

```java
package com.eric.AbstractProducts;

public interface Sofa {
    void lieOn();
}
```

### Concrete Products

```java
package com.eric.ConcreteProducts;

import com.eric.AbstractProducts.Chair;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Modern Chair.");
    }
}
```

```java
package com.eric.ConcreteProducts;

import com.eric.AbstractProducts.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on a Modern Sofa.");
    }
}
```

```java
package com.eric.ConcreteProducts;

import com.eric.AbstractProducts.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void placeItemsOn() {
        System.out.println("Placing items on a Modern Coffee Table.");
    }
}
```

### Abstract Factory

```java
package com.eric.AbstractFactory;

import com.eric.AbstractProducts.Chair;
import com.eric.AbstractProducts.CoffeeTable;
import com.eric.AbstractProducts.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}
```

---

## How to Run

1. Clone or Download this repository.
2. Open it in your favorite IDE (Eclipse, IntelliJ, VS Code, etc.) or navigate via terminal.
3. Compile the project (e.g., `mvn clean install` if it’s a Maven project, or let your IDE handle it).
4. Run the `com.eric.App` main class.
5. By default, it uses `ModernFurnitureFactory`. You can switch to the Victorian style by changing:

```java
FurnitureFactory factory = new ModernFurnitureFactory();
// to
// FurnitureFactory factory = new VictorianFurnitureFactory();
```

6. Observe the console output to see the furniture actions corresponding to the chosen style.

---

## License

This project is provided as a simple educational example of the Abstract Factory pattern. You may use and modify it freely for personal or commercial projects.
