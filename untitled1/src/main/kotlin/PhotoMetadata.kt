/*PhotoMetadata.kt
This program contains a class that stores photo metadata and
contains methods that allow users to access this metadata
CIS 211
Prof. Liss
Last edited by Pat Doyle 10/14/20
 */
import kotlin.math.log2
import kotlin.math.pow
import kotlin.math.roundToInt

//Class PhotoMetadata
//primary constructor: accepts aperture, iso, shutterSpeed
class PhotoMetadata(var aperture : Double, var iso : Double, var shutterSpeed : Double) {

    //Properties: aperture, iso, and shutterSpeed are defined in constructor
    //Description is initialized to empty string + has custom setter to
    //ensure text is capitalized
    var description = ""
    set(value) {
        field = if(value != value.toUpperCase()){
            value.toUpperCase()
        } else value
    }
    //ev and lux are calculated properties
    var ev = (log2((aperture.pow(2))/shutterSpeed) + (log2(iso/100)))
    var lux =  2.5 * (2.0).pow(ev)

    //printAll() function prints all properties of class object
    fun printAll(){
        println("Aperture: $aperture")
        println("Iso: $iso")
        println("Shutterspeed: $shutterSpeed")
        println("Description: $description")
        println("EV: $ev")
        println("Lux: $lux")
    }

}//end class PhotoMetadata