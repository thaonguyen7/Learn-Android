const val CONSTANT1 = "top level constant"

object Constants {
    const val CONSTANT2 = "object constant"
}

class MyClass {
    companion object {
        const val CONSTANT3 = "constant inside companion"
    }
}

val foo = Constants.CONSTANT2
val bar = MyClass.CONSTANT3
