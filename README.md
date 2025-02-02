  * SOLID principles are set of rules that should be considered by developers for
	* better code maintainability, readability, and scalability.
	*
	* S - Single Responsibility  - each class should have one reason to change or modify.
	*
	* this helps in keeping code clean as if one class have all your functionality and
	* if we need to change any specific function, it may affect other as well as cause
	* testing of all functionality., also lacks readability and complex to understand.
	*
	* O - Open for extension and closed for modification.
	*
	* Code should be designed such a way if new feature need to be added, instead of
	* modifying existing code, it should extend properties from existing code for better
	* maintainability.
	*
	* L - Liskov Substitution Principle (LSP). It states that objects of a superclass
	* should be replaceable with objects of a subclass without affecting the correctness
	*  of the program.
	*
	* if class B is a subclass of class A, you should be able to use an instance of B
	* wherever you would use an instance of A, and the program should still work as expected.
	* This ensures that subclasses enhance the functionality of the parent class without
	* changing the expected behavior.
	*
	* I -  Interface Segregation Principle (ISP). This principle suggests that clients
	* (classes or modules) should not be forced to depend on interfaces they do not use.
	*
	* it's better to have several small, specific interfaces than one large, general-purpose interface.
	* This way, classes only need to implement the methods that are relevant to them,
	* avoiding unnecessary dependencies or bloated interfaces.
	*
	* D - Dependency Inversion Principle (DIP). This principle suggests that high-level
	* modules (which contain the core logic of the program) should not depend on low-level
	* modules (which deal with more specific tasks or implementations), but both should
	* depend on abstractions. Additionally, abstractions should not depend on details;
	* details should depend on abstractions.
	*
	* Instead of having classes tightly coupled to specific implementations, you introduce
	* interfaces or abstract classes.High-level modules communicate with low-level modules
	* through these abstractions, not directly with concrete classes.
