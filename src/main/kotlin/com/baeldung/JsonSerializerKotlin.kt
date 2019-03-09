import java.awt.print.Book
import java.util.Date

fun main(args: Array<String>) {
	val user = Person(name = "Alice", birthdate = Date(), age = 19);
	println(serialize(user))
}

class Person(
	val name: String,
	val birthdate: Date,
	@JsonField("names(s)") val names: Array<String> = arrayOf(),
	@JsonIgnore val age: Int
)

annotation class JsonField(val name: String)

annotation class JsonIgnore

fun serialize(user: Person) = user.toString();