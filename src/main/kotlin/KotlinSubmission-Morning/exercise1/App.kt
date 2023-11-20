package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile(){
    var firstName : String = "Nurmila"
    var lastName : String = "Fauziyah"
    var age : Number = 20
    var isSingle  : Boolean = true
    println("========= My Profile ==========")
    println("Nama depan saya $firstName")
    println("Nama belakang saya $lastName")
    println("Umur saya saat ini $age tahun")
    println("Fakta bahwa saya single alias jomblo adalah $isSingle hehe")
}

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    val groupMemberString : String = groupMember.joinToString(", ")
    println("========= My Team =============")
    println("Grup saya bernama $groupId")
    println("Memiliki 11 anggota, yaitu $groupMemberString")
    println("Kami bersebelas berada di sesi $session")
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val myTeam = listOf("Akmal", "Mila", "Paisal", "Rafly", "Haerul", "Abdi", "Aini", "Irby", "Rahmat", "Nugraha", "Syamsul")
    var myName = listOf(myTeam[1])
    println("========= My Nickname =========")
    return myName
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Kak Jovian", "Kak Imam", "Kak Reynaldi", "Kak Raihan") //Kak Rey mentor individual saya, Kak Raihan sering muncul di zoom jadi inget ekek
    val myTeam = arrayOf<String>("Akmal", "Mila", "Paisal", "Rafly", "Haerul", "Abdi", "Aini", "Irby", "Rahmat", "Nugraha", "Syamsul")
    val totalMentor = mentor.count()
    val totalMyTeam = myTeam.count()
    return totalMentor + totalMyTeam
}

fun main() {

    myProfile()

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Massive Bareng", listOf("Akmal", "Mila", "Paisal", "Rafly", "Haerul", "Abdi", "Aini", "Irby", "Rahmat", "Nugraha", "Syamsul"), "Morning-A")

    println(myTeam().joinToString(", "))

    val totalMember = totalMember()
    println("========= Total Member ========")
    println("Total Member Group : $totalMember")
    println("===============================")

}