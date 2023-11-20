package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    try {
        val myTeam = arrayOf(
            "Akmal",
            "Mila",
            "Paisal",
            "Rafly",
            "Haerul",
            "Abdi",
            "Aini",
            "Irby",
            "Rahmat",
            "Nugraha",
            "Syamsul"
        )
        var memberTeam = myTeam[12]
        println("Iyaps, $memberTeam adalah salah satu anggota kelompok saya.")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("${e.message} sedangkan kelompok saya hanya terdiri dari 11 mahasiswa.")
    } finally {
        println("Udah kan keponya? Sekian terima gaji.")
    }
}