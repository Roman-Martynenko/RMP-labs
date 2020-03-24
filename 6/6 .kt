import java.awt.Dimension
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType



fun main(args: Array<String>)
{
    open class Building
    {
        private var mLength : Int = 0
        private var mWidth : Int = 0
        private var mLotLength : Int = 0
        private var mLotWidth : Int = 0

        public fun Building(length: Int, Width: Int, LotLength: Int, LotWidth: Int)
        {
            mLength = length
            mWidth = Width
            mLotLength = LotLength
            mLotWidth = LotWidth
        }
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

    open class House : Building()
    {
        private var mOwner: String = ""
        private var mPool: Boolean = false
        public fun House(length: Int, Width: Int, LotLength: Int, LotWidth: Int) :Int
        {
            super.Building(length, Width, LotLength, LotWidth)
            mOwner = ""
            mPool = false
            return  0
        }
        public fun House(length: Int, Width: Int, LotLength: Int, LotWidth: Int, owner: String) :Int
        {
            House(length, Width, LotLength, LotWidth)
            mOwner = owner
            return  0
        }
        public fun House(length: Int, Width: Int, LotLength: Int, LotWidth: Int, owner: String, pool: Boolean) :Int
        {
            House(length, Width, LotLength, LotWidth, owner)
            mPool = pool
            return  0
        }
        public fun getOwner() :String { return  mOwner}
        public fun hasPool() :Boolean { return mPool }
        public fun setOwner(value: String) { mOwner = value }
        public fun setPool(value: Boolean) { mPool = value }
        public override fun toString() :String
        {
            var s :String = ""
            s += "Owner: "
            if (mOwner.isEmpty()) {s += "n/a"}
            else { s += "$mOwner" }
            if (hasPool()) s += "; has a pool"
            if (calcLotArea() > calcBuildingArea()) s += "; has a big open space"
            return  s
        }
        public  fun equals(value: House) :Boolean
        {
            if (value.mPool == mPool &&
                value.calcBuildingArea() == calcBuildingArea()) { return true}
            return  false
        }

    }

    class Cottage : House()
    {
        private var mSecondFlor: Boolean = true
        public fun Cottage(dimension: Int, LotLength: Int, LotWidth: Int) :Int
        {
            super.House(dimension, dimension, LotLength, LotWidth)
            return  0
        }
        public fun Cottage(dimension: Int, LotLength: Int, LotWidth: Int, owner: String) :Int
        {
            super.House(dimension, dimension, LotLength, LotWidth, owner)
            return  0
        }
        public fun hasSecondFloor() :Boolean { return mSecondFlor }
        public override fun toString() :String
        {
            var s :String = super.toString()
            if (hasSecondFloor()) s += " has a Second Floor;"
            s += " is a cottage"
            return  s
        }

    }

    class Office : Building()
    {
        private var mBusinessName: String = ""
        private var mParkingSpaces: Int = 0
        private var sTotalOffices: Int = 0
        public fun Office(length: Int, Width: Int, LotLength: Int, LotWidth: Int)
        {
            super.Building(length, Width, LotLength, LotWidth)
            mBusinessName = ""
            mParkingSpaces = 0
            sTotalOffices++
        }
        public fun Office(length: Int, Width: Int, LotLength: Int, LotWidth: Int, businessName: String)
        {
            Office(length, Width, LotLength, LotWidth)
            mBusinessName = businessName
        }
        public fun Office(length: Int, Width: Int, LotLength: Int, LotWidth: Int, businessName: String, parkingSpaces: Int)
        {
            Office(length, Width, LotLength, LotWidth, businessName)
            mParkingSpaces = parkingSpaces
        }
        public fun getBusinessName() :String { return  mBusinessName}
        public fun getParkingSpaces() :Int { return  mParkingSpaces}
        public fun setBusinessName(value: String) { mBusinessName = value}
        public fun setParkingSpaces(value: Int) { mParkingSpaces = value}
        public override fun toString() :String
        {
            var s :String = ""
            s += "Business: "
            if (mBusinessName.isEmpty()) {s += "unoccupied"}
            else { s += "$mBusinessName" }
            if (mParkingSpaces > 0) s += "; has $mParkingSpaces parking spaces"
            s += " (total offices: $sTotalOffices)"
            return  s
        }
        public  fun equals(value: Office) :Boolean
        {
            if (value.mParkingSpaces == mParkingSpaces &&
                value.calcBuildingArea() == calcBuildingArea()) { return true}
            return  false
        }

    }



}