-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 23, 2019 at 09:34 AM
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
-- Database: `dbpindah1`
--

-- --------------------------------------------------------

--
-- Table structure for table `formpermohonanbarang`
--

CREATE TABLE `formpermohonanbarang` (
  `Nama` varchar(100) NOT NULL,
  `UntukBagian` varchar(50) NOT NULL,
  `No` int(100) NOT NULL,
  `Hari/Tanggal` date NOT NULL,
  `Alasan` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tuser`
--

CREATE TABLE `tuser` (
  `Nama` varchar(100) NOT NULL,
  `NIP` int(20) NOT NULL,
  `Alamat` varchar(200) NOT NULL,
  `JenisKelamin` varchar(100) NOT NULL,
  `TTL` date NOT NULL,
  `No_Hp` int(50) NOT NULL,
  `Umur` int(50) NOT NULL,
  `Email` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
