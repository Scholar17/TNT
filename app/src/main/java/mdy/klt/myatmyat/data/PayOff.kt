package mdy.klt.myatmyat.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import mdy.klt.myatmyat.common.Constants
import java.util.*

@Entity(tableName = Constants.TABLE_NAME)
data class PayOff(
    val timeStamp : Long,
    val totalBalance: Float,
    val netBalance : Float,
    val tnt : Float,
    val each : Float,
    val isMorning : Boolean,
    val currentTime : String,
){
    @PrimaryKey(autoGenerate = true)
    var id : Long? = null
}
