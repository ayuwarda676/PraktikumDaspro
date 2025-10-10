# Jawaban latihan Pertemuan ke 6
Ini adalah markdown yang berisi jawaban dari soal latihan daspro pertemuan minggu ke 6

## Flowchart dan Pseudocode nomor 1
![Flowchart](https://file%2B.vscode-resource.vscode-cdn.net/Users/user/Downloads/Flowchart%20Nomor1.drawio.png?version%3D1760109002617)

Pseudocode
Program 
Pemberian Izin Masuk Perpus Kampus

Deklarasi
String bawaKartuMahasiswa
String registrasiOnline

Algoritma
Input bawaKartuMahasiswa
Input registrasiOnline

IF bawaKartuMahasiswa == "Ya" THEN
  Print "boleh masuk perpus"
ELSE IF registrasiOnline == "Ya" THEN
  Print "boleh masuk perpus"
ELSE 
  Print "tidak boleh masuk perpus karena syaratnya tidak terpenuhi"
END IF

## Flowchart dan Pseudocode nomor 2
![Flowchart 2](https://file%2B.vscode-resource.vscode-cdn.net/Users/user/Downloads/Flowchart%202.drawio.png?version%3D1760110943441)

Pseudocode
Program
Akses Layanan WiFi Gratis

Deklarasi
String jenisPengguna
int jumlahSKS

Algoritma
Input jenisPengguna
Input jumlahSKS

IF jenisPengguna adalah "dosen" THEN
  Print "akses WiFi diberikan"
ELSE IF jenispengguna adalah "mahasiswa" THEN
  IF jumlahSKS >= 12 THEN
    Print "akses WiFi diberikan"
  ELSE 
    Print "pemberian akses ditolak karena bukan dosen atau mahasiswa"
  END IF
ELSE 
  Print "pemberian akses ditolak karena SKS < 12"
END IF