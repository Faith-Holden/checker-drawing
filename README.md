# checker-drawing

NOTE: This is a javafx program. It requires the javafx library as a dependency.
(See bottom of this README for javafx instructions).

My solution to Chapter 3 problem 8 of "Introduction to Programming Using Java".

Problem Description:
Write a GUI program that draws a checkerboard. Base your solution on the sample program
SimpleGraphicsStarter.java You will draw the checkerboard in the drawPicture()
subroutine, after erasing the code that it already contains.
The checkerboard should be 400-by-400 pixels. You can change the size of the drawing
area in SimpleGraphicsStarter.java by modifying the first two lines of the start()
subroutine to set width and height to 400 instead of 800 and 600. A checkerboard
contains 8 rows and 8 columns of squares. If the size of the drawing area is 400, that
means that each square should be 50-by-50 pixels. The squares are red and black (or
whatever other colors you choose). Here is a tricky way to determine whether a given
square should be red or black: The rows and columns can be thought of as numbered from
0 to 7. If the row number of the square and the column number of the square are either
both even or both odd, then the square is red. Otherwise, it is black. Note that a square
is just a rectangle in which the height is equal to the width, so you can use the subroutine
g.fillRect() to draw the squares.


Javafx setup instructions:
1) Download javafx from:
    https://gluonhq.com/products/javafx/
(I used javafx 12).
Save it to a location of your choice.
2) Unpack the zip folder.
3) Open my project with your IDE of choice (I use itellij IDEA).
4) Add the javafx/lib folder as an external library for the project. For intellij, this means going to "project structure" -> "libraries" -> "add library" ->{javafx location}/lib
5) Add the following as a VM argument for the project:
--module-path "{full path to your javafx/lib folder}" --add-modules javafx.controls,javafx.fxml,javafx.base,javafx.graphics,javafx.media,javafx.swing,javafx.web
6) Build and run the project as normal.
