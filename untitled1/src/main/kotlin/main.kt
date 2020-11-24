/*main.kt
This program contains a main method that creates objects,
calls methods, and allows user to set properties of class
PhotoMetadata.
CIS 211
Prof. Liss
Last edited by Pat Doyle 10/15/20
 */
fun main(args: Array<String>) {

    //Ask user to input values for properties of a PhotoMetadata object and convert to Double
    println("PHOTO 1:")
    println("Enter value for aperture.")
    var aperture1 = Integer.valueOf(readLine()).toDouble()
    println("Enter value for iso.")
    var iso1 = Integer.valueOf(readLine()).toDouble()
    println("Enter value for shutterSpeed.")
    var shutterSpeed1 = Integer.valueOf(readLine()).toDouble()
    println("Enter description of photo.")
    var description1 = readLine()

    //Ask user to input values for properties of a PhotoMetadata object and convert to Double
    println("PHOTO 2:")
    println("Enter value for aperture.")
    var aperture2 = Integer.valueOf(readLine()).toDouble()
    println("Enter value for iso.")
    var iso2 = Integer.valueOf(readLine()).toDouble()
    println("Enter value for shutterSpeed.")
    var shutterSpeed2 = Integer.valueOf(readLine()).toDouble()
    println("Enter description of photo.")
    var description2 = readLine()

    //create objects with user property values
    val photo1 = PhotoMetadata(aperture1, iso1, shutterSpeed1)
    photo1.description = description1!!
    val photo2 = PhotoMetadata(aperture2, iso2, shutterSpeed2)
    photo2.description = description2!!

    //call methods to print properties of both objects
    println("Photo 1: ")
    photo1.printAll()
    println("Photo 2: ")
    photo2.printAll()
}//end main