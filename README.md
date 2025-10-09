[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/57HVEcop)
Fahmid Zahid 100920129 - (Q1 and Q2)
Bilal Brohi 100919644 - (Most of Q3)
Logan Yee 100833629 - (Some of Q3 and Q4)

Example of an MVC design based on Swing. Answer questions 1 & 2 in this README file.


Source: https://www.geeksforgeeks.org/java/introduction-to-java-swing/



Question 1: The Java Swing framework is a part of the Java Foundation Classes and serves as an extension of the Abstract Window Toolkit. Its main purpose is to enable developers to create graphical user interfaces that are flexible, lightweight, and platform-independent. Unlike AWT, which relies on native operating system components, Swing is entirely written in Java and provides a richer set of UI elements, better event handling, and a pluggable look and feel that can be customized without restarting the application. Swing follows the MVC architecture, making it easier to manage user interaction, visual presentation, and data separately. It includes advanced GUI components such as tables, tabbed panes, sliders, color choosers, and progress bars, making it suitable for developing complex, modern desktop applications.



Class Diagram:
<img width="1044" height="531" alt="image" src="https://github.com/user-attachments/assets/e5e207b3-524f-409c-ac33-d5d2fa5995fc" />





Question 2: This example implements the MVC pattern by separating the program into three parts: the Model, the View, and the Controller. The Model class stores the data and has getter and setter methods, keeping it independent of the user interface. The View class builds the graphical interface using Swing components such as labels, text fields, and buttons, but it does not contain logic, it simply displays the UI and provides access to its elements through getter methods. The Controller connects the Model and View, handling user interactions by listening to button clicks, updating the Model with input from the View, and displaying messages or updating the UI. The MySwingMVCApp class brings everything together by creating the Model, View, and Controller and initializing their interactions.

This implementation does not really follow a conventional MVC setup. The Controller directly updates both the Model and the View, so the View does not automatically reflect changes in the Model. In a traditional MVC, the View often observes the Model and updates itself automatically, making the components more loosely coupled. Here, all updates flow manually through the Controller, resulting in tighter coupling. Despite this, the code still demonstrates the key idea of MVC by clearly separating data management, user interface, and control logic.
