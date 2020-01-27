-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 11 Nov 2019 pada 17.52
-- Versi Server: 10.1.19-MariaDB
-- PHP Version: 7.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbsarpras`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `approval`
--

CREATE TABLE `approval` (
  `Diminta Oleh` varchar(50) NOT NULL,
  `Jabatan` varchar(50) NOT NULL,
  `Tgl Dibutuhkan` varchar(50) NOT NULL,
  `Tanggal` varchar(50) NOT NULL,
  `Bidang` varchar(50) NOT NULL,
  `Alasan` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `approval`
--

INSERT INTO `approval` (`Diminta Oleh`, `Jabatan`, `Tgl Dibutuhkan`, `Tanggal`, `Bidang`, `Alasan`) VALUES
('', '', '', '', '', ''),
('', '', '', '', '', ''),
('sda', 'sad', 'dsa', 'dsa', 'das', 'dsa'),
('sda', 'dsa', 'dsa', 'dsa', 'das', 'adsdsa'),
('Rian', 'Bos', '12', '12', 'asd', 'wrfgfg'),
('sda', 'dsa', 'dsa', 'dsa', 'dsa', 'dsadsadsad'),
('saddsa', 'saddsa', 'sasda', 'asdd', 'asdsda', 'sasdsadsad');

-- --------------------------------------------------------

--
-- Struktur dari tabel `formpbjk`
--

CREATE TABLE `formpbjk` (
  `DimintaOleh` varchar(50) NOT NULL,
  `Jabatan` varchar(50) NOT NULL,
  `TglDibutuhkan` varchar(30) NOT NULL,
  `Tanggal` varchar(30) NOT NULL,
  `Bidang` varchar(50) NOT NULL,
  `NamaBarang` varchar(50) NOT NULL,
  `Harga` int(9) NOT NULL,
  `JumlahBarang` int(20) NOT NULL,
  `Kepsek` varchar(50) NOT NULL,
  `Wakasek` varchar(50) NOT NULL,
  `Alasan` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `formpbjk`
--

INSERT INTO `formpbjk` (`DimintaOleh`, `Jabatan`, `TglDibutuhkan`, `Tanggal`, `Bidang`, `NamaBarang`, `Harga`, `JumlahBarang`, `Kepsek`, `Wakasek`, `Alasan`) VALUES
('asdsasafasfadsa', 'sadasdas', '213', '564546', 'AP', 'sadsa', 213, 123, 'Diterima', 'Diterima', 'dagdxvcxv'),
('jijij', 'asdsadad', '342343242', '556546', 'MP', 'dfsfdsfdsf', 345435, 12313, 'Ditolak', '', 'dgfdhtyuiuyjuy'),
('mana', 'iui', '324353452', '768606865', 'TKJ', 'asdazxcxz', 34243242, 5464564, 'Diterima', '', 'fsfdsfsdfsfds'),
('sad', 'sads', 'asdsad', 'sada', 'RPL', 'asdsd', 213, 213, 'Diterima', '', 'sdadads'),
('sda', 'sad', '213', '213', 'RPL', 'ad', 213, 123, '-', '', 'sdadsa'),
('sda2133', 'sad', '213', '213', 'RPL', 'ad', 213, 123, '', '', 'sdadsa');

-- --------------------------------------------------------

--
-- Struktur dari tabel `formpbjnk`
--

CREATE TABLE `formpbjnk` (
  `DimintaOleh` varchar(50) NOT NULL,
  `Jabatan` varchar(50) NOT NULL,
  `TglDibutuhkan` varchar(30) NOT NULL,
  `Tanggal` varchar(30) NOT NULL,
  `Bidang` varchar(50) NOT NULL,
  `NamaBarang` varchar(50) NOT NULL,
  `Harga` int(10) NOT NULL,
  `JumlahBarang` int(20) NOT NULL,
  `Kepsek` varchar(50) NOT NULL,
  `Wakasek` varchar(50) NOT NULL,
  `Alasan` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `formpbjnk`
--

INSERT INTO `formpbjnk` (`DimintaOleh`, `Jabatan`, `TglDibutuhkan`, `Tanggal`, `Bidang`, `NamaBarang`, `Harga`, `JumlahBarang`, `Kepsek`, `Wakasek`, `Alasan`) VALUES
('ASDAD', 'ASD', '123', '3123', 'AP', 'SAD', 213, 2131, 'Diterima', 'Ditolak', 'SADASD'),
('SADASDADASDXZ', 'SADBOI', '32432', '23123', 'RPL', 'ADDSA', 123, 12141, 'Ditolak', 'Diterima', 'sdad');

-- --------------------------------------------------------

--
-- Struktur dari tabel `formpengambilanbarang`
--

CREATE TABLE `formpengambilanbarang` (
  `Nama` varchar(100) NOT NULL,
  `UntukBagian` varchar(50) NOT NULL,
  `No` int(100) NOT NULL,
  `Hari/Tanggal` date NOT NULL,
  `Alasan` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `inventorytambah`
--

CREATE TABLE `inventorytambah` (
  `NamaBarang` varchar(150) NOT NULL,
  `KodeBarang` varchar(50) NOT NULL,
  `Jumlah` int(200) NOT NULL,
  `Stok` int(50) NOT NULL,
  `MinStok` int(50) NOT NULL,
  `Status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `inventorytambah`
--

INSERT INTO `inventorytambah` (`NamaBarang`, `KodeBarang`, `Jumlah`, `Stok`, `MinStok`, `Status`) VALUES
('babik', '5158', 5158, 12, 20, '12'),
('dawd', '213', 217, 21, 31, '21'),
('sdsd', '6555', 0, 12, 55, 'ada'),
('strange', '20', 20, 12, 343466, '434466');

-- --------------------------------------------------------

--
-- Struktur dari tabel `kepsek`
--

CREATE TABLE `kepsek` (
  `Diminta Oleh` varchar(50) NOT NULL,
  `Jabatan` varchar(50) NOT NULL,
  `Tgl Dibutuhkan` varchar(50) NOT NULL,
  `Tanggal` varchar(50) NOT NULL,
  `Bidang` varchar(50) NOT NULL,
  `Kepsek` varchar(10) NOT NULL,
  `Wakasek` varchar(10) NOT NULL,
  `Alasan` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `pbjk`
--

CREATE TABLE `pbjk` (
  `Diminta Oleh` varchar(50) NOT NULL,
  `Jabatan` varchar(50) NOT NULL,
  `Tgl Dibutuhkan` varchar(50) NOT NULL,
  `Tanggal` varchar(50) NOT NULL,
  `Bidang` varchar(50) NOT NULL,
  `Nama Barang` varchar(100) NOT NULL,
  `Harga` int(255) NOT NULL,
  `Jumlah Barang` int(50) NOT NULL,
  `Alasan` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pbjk`
--

INSERT INTO `pbjk` (`Diminta Oleh`, `Jabatan`, `Tgl Dibutuhkan`, `Tanggal`, `Bidang`, `Nama Barang`, `Harga`, `Jumlah Barang`, `Alasan`) VALUES
('sad', 'sadda', 'sadads', 'sadsad', 'sadasd', '', 0, 0, 'sdsadsad'),
('awd', 'dsa', 'asd', 'ads', '12313', 'asd', 123, 12313, 'sad'),
('asd', 'asd', 'adsdsa', 'sdad', 'asdsad', 'sad', 453535, 543543, 'sadsadsad');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pbjnk`
--

CREATE TABLE `pbjnk` (
  `Diminta Oleh` varchar(50) NOT NULL,
  `Jabatan` varchar(50) NOT NULL,
  `Tgl Dibutuhkan` varchar(50) NOT NULL,
  `Tanggal` varchar(50) NOT NULL,
  `Bidang` varchar(50) NOT NULL,
  `Nama Barang` varchar(100) NOT NULL,
  `Harga` int(255) NOT NULL,
  `Jumlah Barang` int(50) NOT NULL,
  `Alasan` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pbjnk`
--

INSERT INTO `pbjnk` (`Diminta Oleh`, `Jabatan`, `Tgl Dibutuhkan`, `Tanggal`, `Bidang`, `Nama Barang`, `Harga`, `Jumlah Barang`, `Alasan`) VALUES
('sda', 'dsadsa', 'dsadsa', 'sad', 'sadasd', '', 0, 0, 'asdasda'),
('sad', 'hfghfh', 'fggdg', 'sdfdsf', 'dfsfdsf', 'dsfdsfs', 324234324, 324342423, 'sfdsf');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pengambilan_barang`
--

CREATE TABLE `pengambilan_barang` (
  `Nama` varchar(50) NOT NULL,
  `UntukBagian` varchar(50) NOT NULL,
  `No` int(50) NOT NULL,
  `HariTgl` varchar(50) NOT NULL,
  `KodeBarang` varchar(10) NOT NULL,
  `NamaBarang` varchar(50) NOT NULL,
  `JumlahBarang` int(50) NOT NULL,
  `Kepsek` varchar(50) NOT NULL,
  `Wakasek` varchar(50) NOT NULL,
  `Alasan` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pengambilan_barang`
--

INSERT INTO `pengambilan_barang` (`Nama`, `UntukBagian`, `No`, `HariTgl`, `KodeBarang`, `NamaBarang`, `JumlahBarang`, `Kepsek`, `Wakasek`, `Alasan`) VALUES
('das', 'sadsda', 1, 'sadsad', '12351', 'Kursi', 0, 'Diterima', 'Diterima', 'sadsadas'),
('sad', 'sda', 12, 'sad', 'dassad', 'saddsa', 4645654, 'Diterima', 'Ditolak', 'sadsa'),
('sdad', 'gfhgfh', 213, 'sdasd', 'sadsa', 'gghhg', 213, '', 'Diterima', 'adsadsa'),
('gfhgfbvcbvc', 'asdsadsaz', 23424, 'sadsad', 'gfgft', 'gfdgdgfdg', 34, 'Ditolak', '', 'asdsadsadasdad'),
('Maman', 'asda', 123, 'dsadasd', '123sad', 'asdasd', 23, 'Ditolak', '', 'sadasd');

-- --------------------------------------------------------

--
-- Struktur dari tabel `register`
--

CREATE TABLE `register` (
  `Nama` varchar(100) NOT NULL,
  `Bidang` varchar(50) NOT NULL,
  `Username` varchar(20) NOT NULL,
  `Kata Sandi` varchar(15) NOT NULL,
  `Ketik Ulang Kata Sandi` varchar(15) NOT NULL,
  `E-mail` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `register`
--

INSERT INTO `register` (`Nama`, `Bidang`, `Username`, `Kata Sandi`, `Ketik Ulang Kata Sandi`, `E-mail`) VALUES
('', '', '', '', '', ''),
('ardian', 'sapras', 'huhih', '1234', '1234', 'ardianjs@gmail.com'),
('ghighan', 'rpl', 'gigan99', 'ghighan', 'ghighan', 'ghighan12@gmail.com'),
('kiass', 'rpl', 'kiass22', 'gere', 'gere', 'kiass@ymail.com'),
('parah', 'yayasan', 'parah223', '6969parah', '6969parah', '6969parah@gmail.com');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tambahcheckout`
--

CREATE TABLE `tambahcheckout` (
  `NamaBarang` varchar(50) NOT NULL,
  `TanggalPembelian` date NOT NULL,
  `TanggalPengiriman` date NOT NULL,
  `Status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tambahcheckout`
--

INSERT INTO `tambahcheckout` (`NamaBarang`, `TanggalPembelian`, `TanggalPengiriman`, `Status`) VALUES
('sad', '2019-09-10', '2019-10-08', 'Ada'),
('Meja', '2020-07-10', '2020-10-09', 'Kosong');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tambahdp`
--

CREATE TABLE `tambahdp` (
  `Nama Barang` varchar(50) NOT NULL,
  `Tanggal Pembelian` varchar(50) NOT NULL,
  `Tanggal Pengiriman` varchar(50) NOT NULL,
  `No Resi` varchar(16) NOT NULL,
  `Via` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tambahuser`
--

CREATE TABLE `tambahuser` (
  `Nama` varchar(50) NOT NULL,
  `NIP` varchar(25) NOT NULL,
  `Alamat` varchar(255) NOT NULL,
  `JenisKelamin` varchar(10) NOT NULL,
  `TTL` varchar(30) NOT NULL,
  `NoTelepon` varchar(13) NOT NULL,
  `Umur` int(2) NOT NULL,
  `Email` varchar(27) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tambahuser`
--

INSERT INTO `tambahuser` (`Nama`, `NIP`, `Alamat`, `JenisKelamin`, `TTL`, `NoTelepon`, `Umur`, `Email`) VALUES
('Rian', '', '', '~', '', '21', 12, ''),
('213', '123', 'asddasdsadadasd', 'Laki-Laki', '231321313213', '212132131323', 89, '233@gmail.com'),
('sad', '21', '21', 'Perempuan', '21', '21', 12, ''),
('ssda', '213', 'sda', 'Laki-Laki', 'asd', '213', 12, ''),
('sda', '2131', 'sda', 'Laki-Laki', '2019-09-09', '32', 34, ''),
('ARDIAN', '343', 'SADASD', 'Laki-Laki', 'JAMBI 07 07 2002', '0896532222', 17, 'ardianjulianto@gmail.com'),
('lucky', '343432', '', 'Laki-Laki', 'bandung 03 06 2002', '08963423424', 17, 'lucky@gmail.com'),
('123', 'dsa', 'sad', 'Perempuan', '213', '321', 2, '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tambahvendor`
--

CREATE TABLE `tambahvendor` (
  `NamaPerusahaan` varchar(50) NOT NULL,
  `Alamat` varchar(200) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `NoTelepon` varchar(13) NOT NULL,
  `AtasNama` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tambahvendor`
--

INSERT INTO `tambahvendor` (`NamaPerusahaan`, `Alamat`, `Email`, `NoTelepon`, `AtasNama`) VALUES
('evy', 'gatsu', 'evylimbon@gmail.com', '0816966969', 'david yanto idris'),
('fajar', 'CIWASTRA', 'fajarciwastraclan69@gmail.com', '081322984528', 'pepen'),
('FORZA DEVELOPMET', 'DEFEFE', 'FEFEFE', '0821689898', 'DADWADWA'),
('NAUFAL', 'GATSU', 'naufalfacrul@gmail.com', '08696969695', 'ahyuu'),
('PAKBOY', 'fefe', 'fefef', '454354', 'grgrgrg'),
('RIAN DEV', 'CIWASTRA', 'RIANMEH@GMAIL.COM', '081322987785', 'IAN NF'),
('sipe', 'defefe', 'vedfveve@gmail.com', '08516541651', 'efefeff');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `formpbjk`
--
ALTER TABLE `formpbjk`
  ADD PRIMARY KEY (`DimintaOleh`);

--
-- Indexes for table `formpbjnk`
--
ALTER TABLE `formpbjnk`
  ADD PRIMARY KEY (`DimintaOleh`);

--
-- Indexes for table `formpengambilanbarang`
--
ALTER TABLE `formpengambilanbarang`
  ADD PRIMARY KEY (`Nama`);

--
-- Indexes for table `inventorytambah`
--
ALTER TABLE `inventorytambah`
  ADD PRIMARY KEY (`NamaBarang`);

--
-- Indexes for table `register`
--
ALTER TABLE `register`
  ADD PRIMARY KEY (`Nama`);

--
-- Indexes for table `tambahdp`
--
ALTER TABLE `tambahdp`
  ADD PRIMARY KEY (`Nama Barang`);

--
-- Indexes for table `tambahuser`
--
ALTER TABLE `tambahuser`
  ADD PRIMARY KEY (`NIP`);

--
-- Indexes for table `tambahvendor`
--
ALTER TABLE `tambahvendor`
  ADD PRIMARY KEY (`NamaPerusahaan`),
  ADD KEY `Nama Perusahaan` (`NamaPerusahaan`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
