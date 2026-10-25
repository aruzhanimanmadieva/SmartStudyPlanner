# Assignment #5 — Strategy Pattern

**Course:** Software Design Patterns

**Student:** Aruzhan Imanmadiyeva

**Group:** SE-2514

**Project Name:** SmartStudyPlanner

## 1. Project Description

SmartStudyPlanner is a Java project that demonstrates the Strategy design pattern.

The purpose of this project is to show how different study strategies can be selected and changed at runtime.

The program provides three study strategies:

* **TheoryFirst** — focuses on studying theory and calculating the remaining topics.
* **PracticeFirst** — focuses on practical tasks and calculates the remaining tasks.
* **RevisionFirst** — focuses on revision and calculates incorrect answers.

The user can switch between these strategies without changing the `StudyPlanner` class.

## 2. Strategy Pattern Components

### Strategy Interface

**Class:** `StudyBehaviour`

The interface declares the `startStudying()` method, which is implemented by all concrete strategies.

### Concrete Strategies

The project contains three concrete strategies:

* `TheoryFirst`
* `PracticeFirst`
* `RevisionFirst`

Each class implements the `StudyBehaviour` interface and provides its own implementation of the study algorithm.

### Context

**Class:** `StudyPlanner`

The Context stores a reference to the `StudyBehaviour` interface. It allows the strategy to be changed using the `setStudyBehaviour()` method and delegates execution to the selected strategy.

The Context does not use `if` or `switch` statements to select a strategy.

### Client

**Class:** `Main`

The Client creates the `StudyPlanner` object, selects a strategy, and starts its execution. It demonstrates how the strategy can be changed at runtime.

## 3. Clean Code Principles

### 1. Meaningful Names

Class and method names clearly describe their purpose. For example, `TheoryFirst` represents a strategy that starts with theory.

### 2. Single Responsibility Principle (SRP)

Each concrete strategy has one main responsibility. `TheoryFirst` calculates the remaining topics, `PracticeFirst` calculates the remaining tasks, and `RevisionFirst` calculates incorrect answers.

### 3. Polymorphism

All concrete strategies implement the same `StudyBehaviour` interface. However, each class provides its own implementation of the `startStudying()` method.

### 4. Context Is Algorithm-Agnostic

The `StudyPlanner` class does not contain the internal logic of the concrete strategies. It only calls the method defined by the `StudyBehaviour` interface.

### 5. Open/Closed Principle

The project can be extended by adding a new strategy that implements `StudyBehaviour`. The existing `StudyPlanner` class does not need to be modified.

## 4. Project Structure

```text
SmartStudyPlanner/
├── src/
│   ├── StudyBehaviour.java
│   ├── TheoryFirst.java
│   ├── PracticeFirst.java
│   ├── RevisionFirst.java
│   ├── StudyPlanner.java
│   └── Main.java
└── README.md
```

## 5. Technologies Used

* Java
* IntelliJ IDEA
* Git
* GitHub

## 6. Conclusion

This project demonstrates the Strategy design pattern by separating study algorithms into different classes.

The pattern allows the Client to select and change strategies at runtime. The Context delegates execution to the selected strategy through a common interface.

The implementation also demonstrates several Clean Code principles, including meaningful naming, single responsibility, polymorphism, separation of responsibilities, and extensibility.
