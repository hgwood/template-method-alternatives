# Template Method vs The World

What alternatives are there to the  [Template Method Pattern](https://en.wikipedia.org/wiki/Template_method_pattern)?

## Power Plant Example

### Situation

A hierarchy of classes where some methods are overriden by descendants while one method should absolutly not be overriden, otherwise it would break the functionality of the hierarchy. This is embodied using an abstract root class with some abstract method and one final concrete method: the template method.

### Proposed Alternative

The abstract root class is refactored to an interface with only the method that are meant to be overriden. A new class is created, the orchestrator, in which a method is created to contain the fixed logic. This method takes an instance of the root interface as a parameter to act on.

Derived Principle: if a piece of logic is indenpendant from its location in a class hierarchy, then it could live outside the hierarchy.
