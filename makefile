all: Main.class

Main.class: Main.java Owner.class Pet.class Fish.class Bird.class Attribute.class Color.class	
	javac Main.java

Owner.class: Owner.java
	javac Owner.java

Pet.class: Pet.java
	javac Pet.java

Fish.class: Fish.java
	javac Fish.java

Bird.class: Bird.java
	javac Bird.java

Attribute.class: Attribute.java
	javac Attribute.java

Color.class: Color.java
	javac Color.java

run: all
	java Main

jar: all
	jar cfe PetGame.jar Main Main.class Owner.class Pet.class Fish.class Bird.class Attribute.class Color.class

clean:
	rm -f *.class *.jar

