package id.infinitelearning.KotlinSubmission.exercise2
import java.time.LocalDate
import java.time.format.TextStyle
import java.util.Locale

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    val listGenap = mutableListOf<Int>()
    for (n in 1..100) {
        if (n % 2 == 0){
            listGenap.add(n)
        }
    }
    println(listGenap)

    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst... **/
    var months = mapOf(
       "Jan" to "January",
        "Feb" to "February",
        "Mar" to "March",
        "Apr" to "April",
        "May" to "May",
        "Jun" to  "June",
        "Jul" to "July",
        "Aug" to "August",
        "Sep" to "September",
        "Oct" to "October",
        "Nov" to "November",
        "Dec" to "December")

    /**Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...**/

    months.forEach { key, value ->
        println("$key -> $value")
    }

    /**Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    val now = LocalDate.now()
    val birthMonth = LocalDate.of(2003, 1, 9)

    val monthNow = now.month.getDisplayName(TextStyle.FULL, Locale.getDefault())
    val myBirthMonth = birthMonth.month.getDisplayName(TextStyle.FULL, Locale.getDefault())

    println("It's $monthNow now, I was born in $myBirthMonth")

}