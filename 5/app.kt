
fun main(args: Array<String>)
{
    var stud: Student = Student(822201)
    var ex: Array<String> = arrayOf("Механика", "Программирование")
    var marks: Array<Int> = arrayOf(2, 9)
    stud.setExams(ex, marks)
    println(stud.toString())
}

open class  Student(id: Int)
{
    private var id: Int = id
    private var exams: Array<ExamsResult> = emptyArray()

    private inner class ExamsResult(name: String){
        private var name: String = name
        private var mark: Int = 0
        private var passed: Boolean = false

        open fun passExam(){
            passed = true
        }

        open fun setMark(mark: Int){
            this.mark = mark
        }

        open fun getMark() = mark

        open fun getPassedMark() : Int{
            val PASSED_MARK: Int = 4;
            return PASSED_MARK
        }

        open fun getName() = name
        open fun isPassed() = passed

    }

    open fun setExams(name: Array<String>, marks: Array<Int>){
        if (name.size != marks.size)
            throw IllegalArgumentException()
        exams = Array(name.size) { ExamsResult("null") }
        for (i in name.indices)
        {
            exams.set(i, ExamsResult(name[i]))
            exams[i].setMark(marks[i])
            if (exams[i].getMark() >= exams[i].getPassedMark())
                exams[i].passExam()
        }
    }

    open override fun toString(): String {
        var res: String = "Студетн: $id\n"
        for (i in exams.indices)
        {
            if (exams[i].isPassed())
                res += exams[i].getName() + " сдал \n"
            else
                res += exams[i].getName() + " не сдал \n"
        }
        return res
    }

}
