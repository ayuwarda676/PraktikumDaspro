# Jawaban Soal Praktikum Daspro
Ini adalah jawaban dari soal-soal pada setiap percobaan di Praktikum Daspro

## Percobaan 1
1. pengecekan pada struktur IF tersebut tidak melibatkan kondisi dengan operator relasional karena tidak semua keputusan membutuhkan perbandingan nilai dan pada kondisi diatas yang dicek hanya nilai benar/salah.
2. Ketika program tersebut di isi dengan false maka program langsung berhenti karena tidak ada kode else yang menampilkan hasil dari false.
3. ![Modifikasi Percobaan 1](https://file%2B.vscode-resource.vscode-cdn.net/Users/user/Desktop/Screenshot%202025-10-11%20at%2010.39.30.png?version%3D1760154007062)

## Percobaan 2
1. Fungsi dari sintaks break adalah untuk menghentikan perulangan dan melanjutkan ke baris kode setelahnya.
2. Peran sintaks default adalah sebagai bagian yang dijalankan ketika tidak ada nilai pada case yang sesuai dengan nilai kondisi.
3. ![Modifikasi Percobaan 2](https://file%2B.vscode-resource.vscode-cdn.net/Users/user/Desktop/Screenshot%202025-10-11%20at%2010.18.25.png?version%3D1760152743707)

## Percobaan 3
1. Jika menjawab "No" maka program memunculkan pesan "Gagal! Mahasiswa masih memiliki tanggungan kompen" karena Kondisi 1 bernilai salah.
2. maksud dari kode program if (bimbinganP1 >= 8 && bimbinganP2 >= 4) { yaitu program ini bertujuan untuk memeriksa dua syarat sekaligus atau secara bersama-sama, jika salah satunya tidak terpenuhi maka hasilnya akan gagal atau tidak memenuhi syarat.
3. Pada baris ke 8 sampai 12 merupakan pengumpulan input awal.
Pada baris ke 14 merupakan pemeriksaan program bebas kompen. Jika menjawab selain "Ya" maka akan muncul pesan "Gagal! Mahasiswa masih memiliki tanggungan kompen." karena bernilai Salah, dan jika menjawab "Ya" maka program akan berlanjut sampai muncul pesan bebas kompen karena bernilai Benar. 
Pada baris ke 15 sampai baris ke 23 merupakan syarat-syarat yang harus dipenuhi agar mahasiswa dapat mendaftar ujian skripsi.
Pada baris ke 15 if (bimbinganP1 >= 8 && bimbinganP2 >= 4) bernilai BENAR. maka program akan mencetak pesan "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi."
Pada baris ke 17 apabila if pertama SALAH. Program lanjut ke else if baris ke 17: (bimbinganP1 < 8 || bimbinganP2 < 4) jika bernilai BENAR P1 kurang dari 8 DAN P2 kurang dari 4 kedua kondisi di dalam if Baris ke 15 gagal. maka program akan mencetak pesan "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali."
Pada baris ke 19 apabila if baris ke 15 dan else if baris ke 17 SALAH. Program lanjut ke else if baris ke 19: (bimbinganP1 < 8) dan jika bernilai BENAR bimbingan P1 kurang dari 8. maka program akan mencetak pesan "Gagal! Log bimbingan P1 belum mencapai 8 kali."
Pada baris ke 21 apabila semua if dan else if di atas SALAH. Program masuk ke blok else terakhir dalam pemeriksaan bimbingan yaitu pada baris ke 21. maka program akan mencetak pesan "Gagal! Log bimbingan P2 belum mencapai 4 kali."
Pada bagian akhir yaitu pada baris ke 27 merupakan kode yang berisi hasil akhir dari salah satu kondisi pada baris ke 15, 17, 19, dan 21