[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/57HVEcop)
Fahmid Zahid 100920129 - Q1 and Q2
Bilal Brohi 100919644 - Most of Q3
Logan Yee 100833629 - Some of Q3 and Q4

Example of an MVC design based on Swing. Answer questions 1 & 2 in this README file.

Question 1: The Java Swing framework is a part of the Java Foundation Classes that provides a set of Graphical User Interface components for building desktop applications. Swing is built on top of the Abstract Window Toolkit and gives advanced, lightweight, and platform-independent components such as buttons, text fields, tables, and panels. Its purpose is to enable developers to create interactive and visually appealing interfaces in Java using an object-oriented and event-driven architecture. Swing supports the MVC design pattern internally, separating data, user interface, and user interactions to make applications easier to maintain and extend.

Class Diagram:
Question 2: This example implements the MVC pattern by separating the program into three parts: the Model, the View, and the Controller. The Model class stores the data and has getter and setter methods, keeping it independent of the user interface. The View class builds the graphical interface using Swing components such as labels, text fields, and buttons, but it does not contain logic, it simply displays the UI and provides access to its elements through getter methods. The Controller connects the Model and View, handling user interactions by listening to button clicks, updating the Model with input from the View, and displaying messages or updating the UI. The MySwingMVCApp class brings everything together by creating the Model, View, and Controller and initializing their interactions.

However, this implementation differs from a conventional MVC setup. The Controller directly updates both the Model and the View, so the View does not automatically reflect changes in the Model. In a traditional MVC, the View often observes the Model and updates itself automatically, making the components more loosely coupled. Here, all updates flow manually through the Controller, resulting in tighter coupling. Despite this, the code still demonstrates the key idea of MVC by clearly separating data management, user interface, and control logic.
