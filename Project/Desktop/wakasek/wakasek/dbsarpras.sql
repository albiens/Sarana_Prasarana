-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 24, 2019 at 10:07 AM
-- Server version: 10.1.32-MariaDB
-- PHP Version: 5.6.36

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
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
-- Table structure for table `formpbjk`
--

CREATE TABLE `formpbjk` (
  `Diminta Oleh` varchar(50) NOT NULL,
  `Jabatan` varchar(50) NOT NULL,
  `Tgl Dibutuhkan` varchar(30) NOT NULL,
  `Tanggal` varchar(30) NOT NULL,
  `Bidang` varchar(50) NOT NULL,
  `Alasan` varchar(200) NOT NULL,
  `Nama Barang` varchar(200) NOT NULL,
  `Harga Barang` int(100) NOT NULL,
  `Jumlah Barang` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `formpbjk`
--

INSERT INTO `formpbjk` (`Diminta Oleh`, `Jabatan`, `Tgl Dibutuhkan`, `Tanggal`, `Bidang`, `Alasan`, `Nama Barang`, `Harga Barang`, `Jumlah Barang`) VALUES
('ee', 'eeeee', 'eee', 'eee', 'eeeee', 'eeeeeeeeeeeeeeeeeeee', '', 0, 0),
('ray', 'sarpras', '20191031', '20191023', 'kung', 'kungking', 'meja', 500000, 3);

-- --------------------------------------------------------

--
-- Table structure for table `formpbjnk`
--

CREATE TABLE `formpbjnk` (
  `Diminta Oleh` varchar(50) NOT NULL,
  `Jabatan` varchar(50) NOT NULL,
  `Tgl Dibutuhkan` varchar(30) NOT NULL,
  `Tanggal` varchar(30) NOT NULL,
  `Bidang` varchar(50) NOT NULL,
  `Alasan` varchar(200) NOT NULL,
  `Nama Barang` varchar(100) NOT NULL,
  `Harga Barang` int(50) NOT NULL,
  `Jumlah Barang` int(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `formpbjnk`
--

INSERT INTO `formpbjnk` (`Diminta Oleh`, `Jabatan`, `Tgl Dibutuhkan`, `Tanggal`, `Bidang`, `Alasan`, `Nama Barang`, `Harga Barang`, `Jumlah Barang`) VALUES
('aSADFDSG', 'ASDAFSGD', '8765456', '76543', 'SDFGCVCB', 'CVB', '', 0, 0),
('awertyu', 'ewretryu', 'ghdsfgh', 'frghr', 'dsafgfh', 'dfgfhjdfgh', '', 0, 0),
('dfghjgjfhdgsf', 'dertyhjukl', 'sderhjk', '34567', 'esrtyu', 'efwrtyjukil', '', 0, 0),
('naufal', 'presiden kungking', '20191004', '20191001', 'kungkung', 'kungkingkang', 'Laptop', 500000, 100),
('Rayhan', 'President Kungking', '14-10-02', '1236', 'kungkung', 'bbfiblblwbfif', '', 0, 0),
('rian', 'kepsek', '20091030', '20191004', 'kung', 'testing', 'kursi', 200000, 5),
('sdfgh', 'fghj', 'fdgh', '98765', 'ccdfvgbh', 'fgbhgjm', '', 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `formpengambilanbarang`
--

CREATE TABLE `formpengambilanbarang` (
  `Nama` varchar(100) NOT NULL,
  `Untuk bagian` varchar(50) NOT NULL,
  `No` int(100) NOT NULL,
  `Hari/Tgl` date NOT NULL,
  `Alasan` varchar(200) NOT NULL,
  `Nama Barang` varchar(100) NOT NULL,
  `Kode Barang` int(100) NOT NULL,
  `Jumlah Barang` int(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `formpengambilanbarang`
--

INSERT INTO `formpengambilanbarang` (`Nama`, `Untuk bagian`, `No`, `Hari/Tgl`, `Alasan`, `Nama Barang`, `Kode Barang`, `Jumlah Barang`) VALUES
('jidun', 'sarpras', 7656543, '2019-10-04', 'kung', 'Meja', 765432, 3),
('kungking', 'sarprass', 78910, '2019-10-04', 'pc geming', 'pc', 1000000, 1),
('rayhan', 'sarpras', 8765, '2000-10-04', 'kung', '', 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `inventorytambah`
--

CREATE TABLE `inventorytambah` (
  `Nama Barang` varchar(150) NOT NULL,
  `Kode Barang` varchar(50) NOT NULL,
  `Stok` int(50) NOT NULL,
  `Minstok` int(50) NOT NULL,
  `Status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `inventorytambah`
--

INSERT INTO `inventorytambah` (`Nama Barang`, `Kode Barang`, `Stok`, `Minstok`, `Status`) VALUES
('babik', '5158', 20, 12, 'ada'),
('sdsd', '6555', 12, 55, 'ada'),
('strange', '20', 343466, 434466, 'fefe');

-- --------------------------------------------------------

--
-- Table structure for table `register`
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
-- Dumping data for table `register`
--

INSERT INTO `register` (`Nama`, `Bidang`, `Username`, `Kata Sandi`, `Ketik Ulang Kata Sandi`, `E-mail`) VALUES
('', '', '', '', '', ''),
('ardian', 'sapras', 'huhih', '1234', '1234', 'ardianjs@gmail.com'),
('ghighan', 'rpl', 'gigan99', 'ghighan', 'ghighan', 'ghighan12@gmail.com'),
('kiass', 'rpl', 'kiass22', 'gere', 'gere', 'kiass@ymail.com'),
('parah', 'yayasan', 'parah223', '6969parah', '6969parah', '6969parah@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `tambahdp`
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
-- Table structure for table `tambahuser`
--

CREATE TABLE `tambahuser` (
  `Nama` varchar(50) NOT NULL,
  `Nip` varchar(25) NOT NULL,
  `Jenis Kelamin` varchar(10) NOT NULL,
  `Tempat Tanggal Lahir` varchar(30) NOT NULL,
  `No Telepon` varchar(13) NOT NULL,
  `Umur` int(2) NOT NULL,
  `Email` varchar(27) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tambahuser`
--

INSERT INTO `tambahuser` (`Nama`, `Nip`, `Jenis Kelamin`, `Tempat Tanggal Lahir`, `No Telepon`, `Umur`, `Email`) VALUES
('ARDIAN', '343', 'Laki-Laki', 'JAMBI 07 07 2002', '0896532222', 17, 'ardianjulianto@gmail.com'),
('lucky', '343432', 'Laki-Laki', 'bandung 03 06 2002', '08963423424', 17, '');

-- --------------------------------------------------------

--
-- Table structure for table `tambahvendor`
--

CREATE TABLE `tambahvendor` (
  `Nama Perusahaan` varchar(50) NOT NULL,
  `Alamat` varchar(200) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `No Telepon` varchar(13) NOT NULL,
  `Atas Nama` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tambahvendor`
--

INSERT INTO `tambahvendor` (`Nama Perusahaan`, `Alamat`, `Email`, `No Telepon`, `Atas Nama`) VALUES
('evy', 'gatsu', 'evylimbong@gmail.com', '0816966969', 'david yanto idris'),
('fajar', 'CIWASTRA', 'fajarciwastraclan69@gmail.com', '081322984528', 'pepen'),
('FORZA DEVELOPMET', 'DEFEFE', 'FEFEFE', '0821689898', 'DADWADWA'),
('NAUFAL', 'GATSU', 'naufalfacrul@gmail.com', '08696969695', 'ahyuu'),
('Pakboy', 'sdada', 'asddad@gmail.com', '098808', 'qdkdhk'),
('RIAN DEV', 'CIWASTRA', 'RIANMEH@GMAIL.COM', '081322987785', 'IAN NF'),
('sipe', 'defefe', 'vedfveve@gmail.com', '08516541651', 'efefeff');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `formpbjk`
--
ALTER TABLE `formpbjk`
  ADD PRIMARY KEY (`Diminta Oleh`);

--
-- Indexes for table `formpbjnk`
--
ALTER TABLE `formpbjnk`
  ADD PRIMARY KEY (`Diminta Oleh`);

--
-- Indexes for table `formpengambilanbarang`
--
ALTER TABLE `formpengambilanbarang`
  ADD PRIMARY KEY (`Nama`);

--
-- Indexes for table `inventorytambah`
--
ALTER TABLE `inventorytambah`
  ADD PRIMARY KEY (`Nama Barang`);

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
  ADD PRIMARY KEY (`Nama`);

--
-- Indexes for table `tambahvendor`
--
ALTER TABLE `tambahvendor`
  ADD PRIMARY KEY (`Nama Perusahaan`),
  ADD KEY `Nama Perusahaan` (`Nama Perusahaan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
