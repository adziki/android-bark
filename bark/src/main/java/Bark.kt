import android.util.Log

class Bark {

    companion object {
        fun post() {
            //TODO persist data model, update event bus
            Log.d("Bark", "Hey, someone barked at me")
        }
    }

}
