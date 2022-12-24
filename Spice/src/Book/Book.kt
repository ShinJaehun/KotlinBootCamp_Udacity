package Book

import java.util.*

const val maxNumBorrow = 3

class Book(val title: String, val author: String, val year: String, var pages: Int) {
    companion object {
        const val BASE_URL = "www.naver.com"
    }

    fun get_books(): Pair<String, String> {
        return title to author
    }
    fun get_book_info(): Triple<String, String, String> {
        return Triple(title, author, year)
    }
    fun canBorrow(numBorrow: Int): Boolean{
        return numBorrow < maxNumBorrow
    }
    fun printURL(){
//        println(Constants.BASE_URL + "/${title. replace("\\s".toRegex(), "")}.html")
        // 빈칸 삭제하는 방법
        println(BASE_URL + "/${title. replace("\\s".toRegex(), "")}.html")
    }
}

fun Book.get_weight(): Double{
    return pages * 1.5;
}

fun Book.tornPages(num_torn: Int){
    pages -= num_torn
}

val random = Random()
fun rand(from: Int, to: Int) : Int {
    return random.nextInt(to - from) + from
}

class Puppy(){
    fun playWithBook(book: Book){
        book.tornPages(rand(1, book.pages))
    }
}


object Constants {
    const val BASE_URL = "www.google.com"
}

fun main(){
    val book = Book("잭과 콩나무", "잭스패로우", "1999", 100)
//    print(book.get_books())
    val (one, two, three) = book.get_book_info()
//    print("Here is your book ${one} written by ${two} in ${three}")

    val allBooks = setOf<Book>(
        Book("Merchant of Venice", "William Shakespeare", "1600", 100),
        Book("Hamlet", "William Shakespeare", "1602", 100),
        Book("King Lear", "William Shakespeare", "1605", 100),
        Book("Romeo and Juliet", "William Shakespeare", "1597", 100)
    )

    val library = mapOf(
//        allBooks[0].title to allBooks[0].author,
//        allBooks[1].title to allBooks[1].author,
//        allBooks[2].title to allBooks[2].author,
//        allBooks[3].title to allBooks[3].author,
        "William Shakespeare" to allBooks
    )
//    print(library)
//    print(library.any { it.value.any { it.title.contains("Hamlet") }})

    val moreBooks = mutableMapOf(
        "Günter Wilhelm Graß" to Book("Die Blechtrommel", "Günter Wilhelm Graß", "1959", 100)
    )
    moreBooks.getOrPut("shinjaehun", {Book("masteringlinux", "shinjaehun", "2021", 100)})
//    print(moreBooks.forEach{k, v -> println("${v.title} written by $k")})

    allBooks.forEach{it.printURL()}

    val puppy = Puppy()
    while (book.pages > 1) {
        puppy.playWithBook(book)
        println("Book ${book.title} pages remain: ${book.pages}")
    }

}