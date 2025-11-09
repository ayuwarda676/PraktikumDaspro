# Jawaban Pertanyaan Percobaan Pada Jobsheet 7

## Percobaan 1
1. for (int i = 1; i <= 10; i++) 
int i = 1 merupakan initialisasi
i <= 10 merupakan kondisi
i++ merupakan increment/decrement
2. variabel tertinggi diinisialisasi dengan 0 karena tidak ada nilai yang lebih rendah dari 0, dan nilai terendah diinisialisasi dengan 100 karena tidak ada nilai yang lebih tinggi dari 100. jika diblaik maka program tidak akan menemukan nilai tertinggi dan terendah yang sebenarnya
3. Fungsi dari kode program tersebut adalah untuk mencari nilai tertinggi dan nilai terendah
Cara kerja pada kode if (nilai > tertinggi) { yaitu Jika nilai yang sedang diperiksa lebih besar daripada nilai tertinggi maka akan menghasilkan perintah tertinggi = nilai;
Cara kerja pada kode if (nilai < terendah) { yaitu jika nilai yang sedang diperiksa lebih kecil daripada nilai terendah maka akan menghasilkan perintah terendah = nilai;

## Percobaan 2
1. a. Maksud dari sintaks (nilai < 0 || nilai > 100) yaitu untuk mengecek/memeriksa apakah nilai lebih kecil dari 0 atau nilai lebih besar dari 100 untuk menjalankan programnya. 
b. Fungsi sintaks Continue adalah untuk melewati 1 iterasi dan melanjutkan ke iterasi berikutnya 
2. i++ diletakkan diakhir karena jika kondisi i++ diletakkan diawal maka perulangan ke 1 tidak akan pernah tercetak
3. Jika jumlah mahasiswa yang dimaskkan adalah 19 maka akan terjadi 19 kali looping 

## Percobaan 3
1. Jika nama pertama pelanggan diketik batal maka perulangan akan berlangsung hanya 1 kali
2. Kondisi berhenti pada program tersebut adalah if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
3. Nilai true digunakan untuk menjalankan perulangan secara terus menerus karena kondisi perulangan selalu benar (true)
4. perulangan akan tetap berjalan karena ada nilai (true) untuk menjalankan perulangan secara terus menerus, dan untuk menghentikannya adalah dengan perintah break
