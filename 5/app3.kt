import java.util.*

fun main(args: Array<String>) {
    var n = Notepad(100)
    n.CreateNote("Список звонков",Date(2020,3,25), "Позвонить +7978006262")
    n.CreateNote("Покупки",Date(2020,3,25), "Мясо, Сыр, Майонез")
    n.CreateNote("Пустая заметка",Date(2020,3,25), "")
    n.CreateNote("Сделать Kotlin!",Date(2020,3,26), "lab 6")
    n.info()
}



open class Notepad (size: Int){
    var notes: Array<Note?> = arrayOfNulls(size)

    class Note(name: String, data: Date, text: String)
    {
        val name = name
        val data = data
        val text = text
    }

    open fun CreateNote(name: String, data: Date, text: String)
    {
        for (i in notes.indices)
        {
            if (notes[i] == null)
            {
                notes.set(i, Note(name, data, text))
                break
            }
        }

    }


    open fun info()
    {
        println("Notepad:")
        for (i in notes.indices)
        {
            if(notes[i] != null)
            {
                println("Заметка: ${i}")
                println("    Дата: ${notes[i]?.data}")
                println("    Текст: ${notes[i]?.text}")
            }
        }
    }

}