-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 26 May 2023, 20:47:42
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
-- Tablo için tablo yapısı `login_form`
--

CREATE TABLE `login_form` (
  `user_id` int(11) NOT NULL,
  `user_name` varchar(50) NOT NULL,
  `user_mail` varchar(50) NOT NULL,
  `user_password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `login_form`
--

INSERT INTO `login_form` (`user_id`, `user_name`, `user_mail`, `user_password`) VALUES
(1, 'bleda', 'bleda@hotmail.com', 'a'),
(2, 'semanur', 'sema@hotmail.com', 'b'),
(10, 'a', '@', 'c'),
(11, 'c', 'b', 'a'),
(12, 'b', 'bleda', 'b'),
(16, 'bleda', 'a', 'b');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `login_form`
--
ALTER TABLE `login_form`
  ADD PRIMARY KEY (`user_id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `login_form`
--
ALTER TABLE `login_form`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
