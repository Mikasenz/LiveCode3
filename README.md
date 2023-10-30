
# Praktikum3
Calculator Winrate Menghitung Jumlah Menang dan Kalah
Program Kalkulator Winrate Menghitung  Kemenangan-Kekalahan. Program ini bertujuan untuk menghitung jumlah kemenangan dan kekalahan berdasarkan jumlah total pertandingan dan tingkat kemenangan saat ini. Program ini meminta input dari pengguna untuk jumlah total pertandingan dan tingkat kemenangan, lalu menghitung dan menampilkan jumlah kemenangan dan kekalahan.

## Cara Menggunakannya 

**Program akan meminta input dari pengguna**
a.Program akan meminta Anda untuk memasukkan jumlah total pertandingan, didalam inputan tersebut.
```java
System.out.print("Enter the total number of games: ");
        int totalGames = input.nextInt();
```

b.Selanjutnya, program akan meminta untuk memasukkan Winrate saat ini dalam bentuk persentase dari 1 - 100.
```java
System.out.print("Enter the current win rate (0-100): ");
        double winRate = input.nextDouble();
```

c.Program akan menghitung jumlah kemenangan dan kekalahan lalu menampilkan hasilnya.
```java
if (winRate < 0 || winRate > 100) {
            System.out.println("Win rate must be in the range of 0 to 100.");
        } else {
            
            double wins = (winRate / 100) * totalGames;
            double losses = totalGames - wins;
            System.out.println("Number of Wins: " + wins);
            System.out.println("Number of Losses: " + losses);
        }
```