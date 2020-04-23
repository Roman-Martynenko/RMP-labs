import java.awt.Dimension
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

fun main(args: Array<String>)
{
    val createBuilding = :: Building
    val build1 = createBuilding(20,20,30,30)

}

open class Building
{
    private var mLength : Int = 0
    private var mWidth : Int = 0
    private var mLotLength : Int = 0
    private var mLotWidth : Int = 0

    constructor(length: Int, Width: Int, LotLength: Int, LotWidth: Int) {
        mLength = length
        mWidth = Width
        mLotLength = LotLength
        mLotWidth = LotWidth }
    public fun getLength() :Int { return  mLength}
    public fun getWidth() :Int { return  mWidth}
    public fun getLotLength() :Int { return  mLotLength}
    public fun getLotWidth() :Int { return  mLotWidth}
    public fun setLength(value: Int) { mLength = value}
    public fun setWidth(value: Int) { mWidth = value}
    public fun setLotLength(value: Int) { mLotLength = value}
    public fun setLotWidth(value: Int) { mLotWidth = value}
    public fun calcBuildingArea() :Int { return  mLength * mWidth}
    public fun calcLotArea() :Int { return  mLotLength * mLotWidth}
    public override fun toString() :String
    {
        var s :String = ""
        s += "BuildingArea: "
        s += calcBuildingArea().toString()
        s += "; LotArea: "
        s += calcLotArea().toString()
        return  s
    }
}
