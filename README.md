# SOLID Principles Refactoring - Order System

## Description of the Problem
The original code violates multiple SOLID principles:

- **Interface Segregation Principle (ISP)**: The `Order` interface is a "fat interface" containing four unrelated methods. Every implementing class is forced to implement methods it may not need (as noted in the comment: "These methods might not be needed for all orders").
- **Single Responsibility Principle (SRP)**: `OrderAction` handles **four different responsibilities** (calculation, placement, invoicing, and email notification). A class should have only **one reason to change**.
- **Dependency Inversion Principle (DIP)**: High-level code was tightly coupled to a monolithic concrete implementation.
- **Open-Closed Principle (OCP)**: Adding new behavior (e.g., a different notification method) required modifying the existing class.

This design is rigid, hard to maintain, and difficult to extend for different order types (online, offline, etc.).

## Solution Applied
The code was refactored as follows:
- Split the fat `Order` interface into **four small, focused interfaces** (ISP).
- Created **separate classes** for each responsibility (SRP).
- High-level code (`OrderTest`) now depends only on abstractions (DIP).
- New implementations can be added without changing existing code (OCP).
- All implementations are substitutable (LSP).

## UML Class Diagram

![image](https://github.com/JLNerecina/SOLID_Principles/blob/main/SOLID%20Principles.png)
