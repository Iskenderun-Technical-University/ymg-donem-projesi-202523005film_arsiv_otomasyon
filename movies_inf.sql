-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 29 May 2023, 02:22:33
-- Sunucu sürümü: 10.4.28-MariaDB
-- PHP Sürümü: 8.1.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `film_arsiv`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `movies_inf`
--

CREATE TABLE `movies_inf` (
  `movie_id` int(11) NOT NULL,
  `movie_name` varchar(50) NOT NULL,
  `imdb_point` double(10,2) NOT NULL,
  `subject` varchar(300) NOT NULL,
  `movie_link` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `movies_inf`
--

INSERT INTO `movies_inf` (`movie_id`, `movie_name`, `imdb_point`, `subject`, `movie_link`) VALUES
(0, 'Ahlat Ağacı', 8.10, 'Nuri Bilge Ceylan Ahlat Ağacı’yla birlikte bir kez daha taşranın yolunu tutuyor ve odağına bir baba-oğul ilişkisini alıyor. Üniversiteyi bitirip memleketine geri dönen 20’li yaşlarındaki Sinan, kitabını basabilecek bir sponsor ararken hem ailesiyle ilgili sorunlarla yüzleşiyor hem de bir dönem tanıd', 'https://kultfilmler.com/ahlat-agaci-izle/');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `movies_inf`
--
ALTER TABLE `movies_inf`
  ADD PRIMARY KEY (`movie_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
