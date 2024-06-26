# Scene-Composer-Java
December 2021
A program in which a user can compose images using a list of predetermined image files.

The main source file, where my code is actually written and where the program is run, is called "Scene Composer.java", and here's how to navigate to it: assignment-9-fucaziswagg > src > assignment 9.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  The program starts by opening a standard draw file window and a input text box that prompts the user for a drawable parameter. The stdDraw file window first populates with a preprogrammed initial scene ("init"), which is a linked-list of multiple drawble objects (such as bubbles, trees, lines, leaves, and dragons).
  
  Drawable objects are stored in a hashMap using string and drawable key value pairs. If the user does not enter in a correct string key, an error message will display in the console window as well as a list of all possible input values and the drawables they correspond to. If a correct key is entered, the program adds the relative value to a linked-list of drawables that is then stored as a sequence object to be iterated over by the std.draw() command and ultimately displayed on screen. There are other input values a user can enter such as "clear" (which displays an empty standard draw window by clearing all of the drawable objects from the current linked-list) or "end" (which terminates the execution of the program).
  
  Their is also another feature, which allows users to create their own unique "scene" of drawble objects that they can call upon later. This process is initiated with the input value "record", and stops with the value "off". Users will be prompted to enter drawable objects in any order and any quantity to create their desired scene. The scene is stored as a linked-list of drawble objects under a string key of their choosing.
