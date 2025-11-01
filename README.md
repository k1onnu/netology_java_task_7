# Product Management System

Java OOP project demonstrating inheritance, polymorphism, and interfaces.

## Task Requirements

Implement a class hierarchy with the following requirements:

- **Abstract base class** as the foundation of the hierarchy
- **Protected fields** in all classes
- **Constructors** with default and parameters, including chain calling
- **Getters/Setters** for all class fields
- **Overridden toString()** method
- **Polymorphism** demonstrated through common methods
- **Search methods** with various criteria
- **Two interfaces** with single abstract methods each
- **Instanceof checks** for interface method calls

## Class Hierarchy

- Product (abstract)
  - Toy (concrete)
  - FoodProduct (abstract)
    - DairyProduct (concrete)

## Interfaces

- **Usable** - `use()` method (implemented by all products)
- **Storable** - `store()` method (implemented by specific classes)

## Features

- Polymorphic behavior through `getDescription()` method
- Search products by price, age group, fat content, manufacturer
- Interface method calls with instanceof verification
- Modern Java features (pattern matching in instanceof)

## How to Run
```bash
javac src/Main.java src/classes/*.java src/interfaces/*.java
java -cp src Main
```
