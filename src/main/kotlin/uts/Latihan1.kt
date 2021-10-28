package uts

fun main(){
    println("Jenis: ")
    val jenis = readLine()?.single();
    println("Kode: ")
    val kode = readLine();
    println("Harga: ")
    val harga = readLine()?.toDouble();

    val diskon: String = when (jenis){
        'A' -> "20%"
        'B' -> "30%"
        'C' -> "40%"
        else -> "0%"
    }
    val didiskon: Int = when(jenis){
        'A' -> (0.9 * harga!!).toInt()
        'B' -> (0.85 * harga!!).toInt()
        'C' -> (0.8 * harga!!).toInt()
        else -> 0
    }
    println("Jenis Barang $jenis dengan code barang $kode Mendapatkan Diskon $diskon, Harga Setelah didiskon = $didiskon")
}