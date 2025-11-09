# Jawaban Jobsheet 8

## Percobaan 1
1. Jika i = 1 diganti dengan i = 0 maka bintang yang akan muncul lebih 1 dari nilai n yang dimasukkan karena perhitangannya dimulai dari 0
2. Hasilnya akan berbeda karena jika i <= n maka nilai n nya juga ikut, dan jika i < n maka nilai yang muncul terakhir adalah nilai dibawah n
3. Jika i > n maka program langsung berhenti dan tidak menampilkan bintang sama sekali karena kondisi awalnya langsung false
4. Jika i++ diganti dengan i-- maka program akan mencetak bintang terus menerus karena perulangan terjadi secara terus menerus
5. Jika i++ diganti dengan i += 2 maka setiap melakukan perulangan akan ditambah dengan 2 maka hasilnya bintang yang keluar adalah 3 jika nilai yang dimasukkan adalah 6

## Percobaan 2
1. Jika iOuter=1 diganti dengan iOuter=0 maka jumlah baris bintang lebih 1 dari nilai N karena perhitungan barisnya dimulai dari 0
2. Jika i = 1 diubah menjadi i = 0 maka jumlah kolom bintang lebih 1 dari nilai n karena perhitungan kolomnya dimulai dari 0
3. Fungsi dari perulangan luar yaitu untuk mengatur jumlah baris yang akan dicetak, dan fungsi dari perulangan dalam yaitu untuk mengatur isi/kolom yang akan dicetak
4. System.out.println(); diperlukan untuk mengganti baris antar perulangan, jika sintaks tersebut dihilangkan maka hasilnya akan memanjang antara hasil perulangan 1 dan perulangan yang lainnya.

## Percobaan 3
1. Belum sesuai
2. Tambahkan sintaks System.out.println(); untuk mengganti baris antar perulangan
4. variabel i digunakan untuk menentukan jumlah baris dan variabel j digunakan untuk menentukan jumlah isi dari baris tersebut, variabel j diset 0 di awal karena jika tidak di set 0 maka perhitungan bintang akan terus berlanjut dari baris sebelumnya

## percobaan 4
1. totalNilai direset ke 0 di dalam outer loop agar setiap kelompok mahasiswa tidak menumpuk dengan kelompok sebelumnya.
Jika inisialisasi totalNilai = 0 diletakkan di luar outer loop, maka hasil rata-rata yang dihasilkan akan salah karena penjumlahan tidak pernah diulang dari awal