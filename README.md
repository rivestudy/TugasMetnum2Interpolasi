!! WAJIB BACA KODE DALAM BAHASA JAVA

Metode penyelesaian yang digunakan yakni :

Langrange & Newton
default menggunakan Langrange
dapat diubah di class interpolationPlot
  >> double yi = LagrangeInterpolation.interpolate(x, y, xi);
  >> ubah ke  double yi = NewtonInterpolation.interpolate(x, y, xi);

Ubah nilai x dan y secara manual tiap class
data dapat diubah di main method tiap-tiap file (harus semua)

Penting!!
Perlu Library JFreeChart dan JFrame
Perlu setting Maven (pom.xml) untuk handle dependecy Librarynya

Tested in IntelliJ IDEA 2022.3.2 (Community Edition)
