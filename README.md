# ID1018: Programming I (Java)

Course assignments from **ID1018 Programming I** at KTH Royal Institute of Technology.

The course covers fundamental programming concepts in Java: data types, control structures, algorithms, object-oriented design, inheritance, polymorphism, and exception handling.

---

## Assignments

### Lab 1: Temperature Statistics
**Concepts:** Arrays, methods, structured decomposition, I/O

Two independent implementations (`Temperatures1` and `Temperatures2`) that read temperature data and compute:
- Min, max, and average temperature per week
- Min, max, and average over the entire measurement period

Built custom methods for all calculations — standard library methods were intentionally avoided to practice implementing logic from scratch. Both classes perform the same job but are fully independent of each other.

---

### Lab 2: Synonym Handler
**Concepts:** String processing, static methods, file I/O, algorithms

A two-class system for reading, manipulating, and saving synonym data:
- `SynonymHandler` — static methods for handling synonym data in various ways
- `SynonymUser` — reads synonym data from file, applies transformations, and writes results to a new file

Implemented without `java.util` classes or `String.contains()`, requiring custom string-searching logic.

---

### Lab 3: Number Sequence (Array vs Linked List)
**Concepts:** Interfaces, OOP, linked lists, time and space complexity

Defined a `NumberSequence` interface representing a sequence of real numbers, then implemented it two ways:
- `ArrayNumberSequence` — backed by an array
- `LinkedNumberSequence` — backed by a linked list of nodes (no array conversion)

A test class (`NumberSequenceTest`) verifies both implementations against the same interface. The assignment required conscious reasoning about time and space complexity for each operation in each implementation.

---

## Language & Tools

- Java
- No external libraries (standard library used minimally by assignment design)

---

## Author

**Emilia Lindqvist** — KTH Information Technology  
[GitHub Profile](https://github.com/EmiliaMeta)
