package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    try {
        // Membagi kue kepada teman
        distributeCakes(8,2)
        println("Pembagian kue selesai.")
    } catch (e: IllegalArgumentException) {
        println("Terjadi kesalahan: ${e.message}")
    } finally {
        println("Membersihkan peralatan pembagian kue.")
    }
}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

fun distributeCakes(totalCakes: Int, numberOfFriends: Int) {
    if (totalCakes <= 0 || numberOfFriends <= 0) {
        // jika input tidak valid
        throw IllegalArgumentException("Jumlah kue dan jumlah teman harus lebih dari 0.")
    }

    // Membagikan kue kepada teman
    val cakesPerFriend = totalCakes / numberOfFriends
    println("Setiap teman mendapatkan $cakesPerFriend kue.")
}

