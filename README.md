# MudahSoal1 – Program Biaya Pengiriman

Program sederhana berbasis Java untuk menghitung **total biaya pengiriman paket** berdasarkan jarak, ukuran, dan berat.

---

## 💡 Fitur
- Menginput jarak pengiriman (KM)
- Menginput ukuran paket (panjang, lebar, tinggi)
- Menginput berat paket (KG)
- Menghitung biaya otomatis berdasarkan ketentuan:
  - Jarak ≤ 10 km → Rp 4.250 per kg
  - Jarak > 10 km → Rp 6.000 per kg
  - Tambahan Rp 50.000 jika volume paket > 100 cm³

---

## 🧮 Logika Program Singkat

  - Input data dari pengguna (jarak, panjang, lebar, tinggi, berat).

  - Menentukan biaya dasar berdasarkan jarak.

  - Menghitung volume paket.

  - Jika volume > 100 cm³ → tambah Rp 50.000.

  - Hitung total biaya: biaya * berat.

  - Tampilkan hasil akhir.

---

## 🖥️ Contoh Output 

```bash
==============================
   PROGRAM BIAYA PENGIRIMAN
==============================
Masukkan Jarak Pengiriman (KM): 8
------------------------------
Masukkan Ukuran Paket (cm):
Panjang : 10
Lebar   : 5
Tinggi  : 3
------------------------------
Berat Paket (KG): 2
==============================
Total Biaya Pengiriman : 8500 Rupiah
==============================
```
---

## 🏷️ Informasi Tambahan

📁 **Nama File:** `MudahSoal1.java`

🧑‍🎓 **Dibuat oleh:** Deniza Nabiel Akbar Al Fatih

🏫 **Kelas / Absen:** X RPL 5 / 13

💼 **Tugas:** Soal 1 Level Mudah ( Latihan Soal UKL )

📅 **Tanggal**: 3 November 2025

