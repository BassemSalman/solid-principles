Liskov Substitution Principle:
Every subclass must be substitutable for their parent class

In other words:
- Implemented methods must work normally and respect structure of superclass
- Objects of superclass must be interchangeable with subclass with no errors / exceptions ..

(Polymorphism on steroids as well :P)

Pros:
- Code Reusability
- Modularity
- Encapsulation

By adhering to the LSP, you can write code that relies on abstractions and interfaces, making it easier to switch implementations and promote loose coupling between components.

=> Logic should be correct, not only working code!

Example:
All classes implementing List have add - remove .. methods 
Thus all are callable and respect invariants, preconditions and postconditions.
