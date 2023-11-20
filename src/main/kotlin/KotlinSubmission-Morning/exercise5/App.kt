package id.infinitelearning.KotlinSubmission.exercise5

fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */

    var hero = Hero()

    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */

    hero.setProfile(name = "Nurmila Fauziyah", age = 30, height = 155)

    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */

    hero.profile()

    /**
    Challenge:
    ===============Class A Morning===============
    Massive Bareng -> jalan 3x, lari 1x, makan 5x, minum 1x, lompat 5x, duduk 3x
    **/

    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     *
     */

    //jalan 3x
    repeat(3){
        hero.jalan()
    }

    //lari 1x
    hero.lari()

    //makan 5x
    repeat(5){
        hero.makan()
    }

    //minum 1x
    hero.minum()

    //lompat 5x
    repeat(5){
        hero.lompat()
    }

    //duduk 3x
    repeat(3) {
        hero.duduk()
    }

    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */

    hero.profile()

}