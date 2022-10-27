-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 10 Jun 2022 pada 07.53
-- Versi server: 10.4.14-MariaDB
-- Versi PHP: 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sunib_resto`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `menus`
--

CREATE TABLE `menus` (
  `ID` char(5) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `Price` int(11) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Category` varchar(255) NOT NULL,
  `Description` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `menus`
--

INSERT INTO `menus` (`ID`, `Name`, `Price`, `Quantity`, `Category`, `Description`) VALUES
('MN001', 'Escargots a la Bourguignonne', 28000, 10, 'Appetizer', 'halal'),
('MN002', 'Honey Lime Rainbow Fruit Salad', 25000, 8, 'Appetizer', 'vegan'),
('MN003', 'Vegetable Salad', 25000, 9, 'Appetizer', 'vegan'),
('MN004', 'Duck Pate en Croute', 65000, 10, 'Appetizer', 'halal'),
('MN005', 'Gougeres', 40000, 11, 'Appetizer', 'halal'),
('MN006', 'Fromage Blanc Spread', 30000, 11, 'Appetizer', 'halal'),
('MN007', 'Boeuf Bourguignon', 120000, 20, 'MainCourse', 'halal'),
('MN008', 'Croque Monsieur', 80000, 15, 'MainCourse', 'normal'),
('MN009', 'Bouillabaisse', 75000, 17, 'MainCourse', 'halal'),
('MN010', 'Chicken Cordon Bleu Pasta', 150000, 18, 'MainCourse', 'normal'),
('MN011', 'Coq au vin', 125000, 20, 'MainCourse', 'halal'),
('MN012', 'Honey-Lacquered Duck Breast', 140000, 25, 'MainCourse', 'halal'),
('MN013', 'Spicy Fish and Olive Spaghetti', 90000, 20, 'MainCourse', 'halal'),
('MN014', 'Venison Stew', 115000, 19, 'MainCourse', 'halal'),
('MN015', 'Chicken and Sausage Cassoulet', 130000, 18, 'MainCourse', 'halal'),
('MN016', 'Vanilla Ice Cream', 8000, 30, 'Dessert', 'Vanilla'),
('MN017', 'Choco Glazed Ice Cream', 9000, 45, 'Dessert', 'Chocolate'),
('MN018', 'Strawberry Shortcake', 12000, 40, 'Dessert', 'Strawberry'),
('MN019', 'Chocolate Bomb Cake', 20000, 20, 'Dessert', 'Chocolate'),
('MN020', 'Lemon Tea', 5000, 100, 'Drink', 'Medium'),
('MN021', 'Lemon Tea', 7000, 100, 'Drink', 'Large'),
('MN022', 'Coffee', 6000, 120, 'Drink', 'Large'),
('MN023', 'Orange Juice', 8000, 35, 'Drink', 'Large'),
('MN024', 'Coke', 9000, 20, 'Drink', 'Medium '),
('MN025', 'Matcha Latte', 9000, 9, 'Drink', 'Medium');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `menus`
--
ALTER TABLE `menus`
  ADD PRIMARY KEY (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
