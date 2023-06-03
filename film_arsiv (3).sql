-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 03 Haz 2023, 22:06:21
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
-- Tablo için tablo yapısı `admin_login`
--

CREATE TABLE `admin_login` (
  `admin_id` int(11) NOT NULL,
  `admin_name` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `admin_login`
--

INSERT INTO `admin_login` (`admin_id`, `admin_name`, `password`) VALUES
(1, 'admin', 'a');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `comminicate`
--

CREATE TABLE `comminicate` (
  `comment_id` int(11) NOT NULL,
  `movie1_id` varchar(300) NOT NULL,
  `usr_name` varchar(50) NOT NULL,
  `commennts` varchar(300) NOT NULL,
  `point` double(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `comminicate`
--

INSERT INTO `comminicate` (`comment_id`, `movie1_id`, `usr_name`, `commennts`, `point`) VALUES
(5, 'otomatik portakal', 'yorgun kedi', 'güzel bir film', 10.00),
(6, 'scarface', 'baybay', 'güzelll değil', 7.20),
(7, 'scarface', 'baybay', 'güzelll değil', 7.20),
(8, 'scarface', 'baybay', 'güzelll değil', 7.20),
(9, 'ahlat ağacı', 'bleda', 'güzel değildi', 8.60),
(10, 'fight club', 'ahmet', 'güzeldi', 8.50),
(11, 'Shutter Island', 'bleda', 'güzel değildi', 8.60),
(12, 'Shutter Island', 'ali', 'güzel', 8.70),
(13, 'otomatik portakal', 'ayşe', 'güzel', 6.20),
(14, 'Shutter Island', 'fatma', 'güzel değildi', 0.00),
(15, 'otomatik portakal', 'levent', 'ortalama', 5.00),
(16, 'scarface', 'melike', 'güzel değildi', 3.00),
(17, 'scarface', 'fazıl', 'yeterince güzel değildi', 3.30);

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
(17, 'baybars', 'baybars@hotmail.com', 'a'),
(18, 'semanur', 'sema@hotmail.com', 'a'),
(19, 'defne', 'defne@hotmail.com', 'b'),
(20, 'a', 'b', 'c'),
(21, 'bleda', 'bleda@hotmail.com', 'a'),
(22, 'ahmet', 'ahmet@hotmail.com', 'c'),
(23, 'mehmet', 'mehmet@hotmail.com', 'a'),
(24, 'fatma', 'fatma@hotmail.com', '1'),
(25, 'levent', 'levent@hotmail.com', 'a'),
(26, 'melek', 'melek@hotmail.com', 'a'),
(27, 'fazıl', 'fazıl@hotmail.com', 'a');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `movies_inf`
--

CREATE TABLE `movies_inf` (
  `movie_id` int(11) NOT NULL,
  `movie_name` varchar(50) NOT NULL,
  `imdb_point` double(10,2) NOT NULL,
  `subject` varchar(3000) NOT NULL,
  `movie_link` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `movies_inf`
--

INSERT INTO `movies_inf` (`movie_id`, `movie_name`, `imdb_point`, `subject`, `movie_link`) VALUES
(1, 'Ahlat Ağacı', 8.10, 'Nuri Bilge Ceylan Ahlat Ağacı’yla birlikte bir kez daha taşranın yolunu tutuyor ve odağına bir baba-oğul ilişkisini alıyor. Üniversiteyi bitirip memleketine geri dönen 20’li yaşlarındaki Sinan, kitabını basabilecek bir sponsor ararken hem ailesiyle ilgili sorunlarla yüzleşiyor hem de bir dönem tanıd', 'https://kultfilmler.com/ahlat-agaci-izle/'),
(2, 'barda', 7.00, '18-25 yaşları arasındaki bir grup genç, bir arkadaşlarının barında sık sık toplanırlar. Bir gün yine barda toplanırlar ancak son biralarını bitirdikten sonra eve dönmeye hazırlandıklarında beş yabancı tarafından silah zoruyla esir alınırlar. Ağızları, elleri ve ayakları bağlıyken ertesi sabaha kadar işkence görür ve öldürülürler.', 'https://kultfilmler.com/barda-izle/'),
(6, 'Fight Club', 8.80, 'Geceleri uyuyamayan ve asabi bir karaktere sahip olan karakterimiz sıkıcı hayatından kurtulmak için yeni bir şeylere ihtiyaç duyar. Bir kanser destek grubuna katılır ancak grupta yaptıkları tek şey birbirlerinin göğsüne ağlamaktır. Bir uçak yolculuğu esnasında sabun satıcısı bir adamla tanışır. Zamanla iki sıkı dost haline gelirler, bir gün ikili durduk yere yumruk yumruğa kavga eder bu saldırma içgüdüleri beklenmedik bir şekilde bilinmeyen bir tedavi şekline dönüşür. Zamanla aralarına yeni insanlarda alırlar ve aralarına katılan insan sayısı her geçen gün artar. Yarattıkları kavram beğenilmiştir, her şehirde yasa dışı dövüş kulüpleri kurulmaya başlar.', 'https://kultfilmler.com/fight'),
(7, 'Taxi Driver', 8.20, 'New York Şehrinde taksi şoförü olan Travis Bickle etrafındaki hayatın çirkin yolsuzluğunu yansıtan bir karakterdir. Kendi yalnızlığı ve yabancılaşması nedeniyle giderek bu durumdan daha fazla rahatsız olmaya başlıyor. Hayatının neredeyse her aşamasında, hiç kimseyle duygusal temas kuramayan bu adam bir gün Betsy adında bir kadınla tanışır. Betsy\'yi kendisiyle kahve içmeye davet ediyor ve sonra onunla çıkmaya başlar. Peki bu durumu onu onu geceler boyu uyuyamadığı için, dikkat dağıtmak amacıyla yerel sinemaları ziyaret edip erotik filmler izleyip çaresizce bu iç karartıcı varoluşunu düşünmesinden alıkoyabilecek mi?', 'https://kultfilmler.com/taxi-driver-taksi-soforu-izle/'),
(8, 'Shutter Island', 8.10, '1954\'te, ABD\'li bir adli polis olan Teddy Daniels, Boston\'daki Shutter Island Ashecliffe Hastanesinde bir hastanın ortadan kayboluşunu araştırmakla görevlendirilir. Buraya gelmekteki diğer bir amacı karısının ölümüne neden olan bir kundakçınında adadaki akıl hastanesinde olabileceği düşüncesidir. Teddy kuvvetli araştırma becerileri sayesinde umut verici bir ipucu bulur ancak hastane yönetimi olayın kendi üzerlerine yıkılacağını düşünüp kayıtlara erişimini reddeder. Teddy araştırmaya devam ederken çok geçmeden oraya acımasız tedavi yöntemleriyle hastaları denek olarak kullandığını düşündüğü hastane doktorları tarafından bir komplonun parçası olarak getirildiği fikrine kapılır. Kasırga anakara ile iletişimi keserken tehlikeli hastalar tüm bu karışıklığın içinde kaçarken, şaşırtıcı ipuçları çoğalıyor ve Teddy her şeyden şüphe etmeye başlıyor. Hafızası, ortağı ve hatta kendi akıl sağlığı...', 'https://kultfilmler.com/shutter-island-zindan-adasi-izle/'),
(9, 'Scarface', 8.30, 'Tony Montana, 1980\'deki göç sırasında Küba\'dan Amerikaya gelir. İlk zamanlar Florida mülteci kampında kalır, arkadaşı Manny\'nin buradan kaçmak için bir çıkış yolu vardır. Dışarı çıktıklarında uyuşturucu satıcısı Frank Lopez için çalışmaya başlarlar. Sabırsız Tony bir süre sonra Frank\'in imparatorluğu ve metresi Elvira Hancock da dahil olmak üzere her şeyi istemeye başlayacaktır. Kült Filmlerden 1080p görüntü kalitesiyle Yaralı Yüz izle yebilirsiniz.', 'https://kultfilmler.com/scarface-yarali-yuz-izle/'),
(10, 'The Worst Person in the World', 7.90, 'ünyanın En Kötü İnsanı, çağdaş Oslo\'da aşk ve anlam arayışı hakkında modern bir dramadır. Film aşk hayatının sıkıntılı sularında dolaşan ve kariyer yolunu bulmak için mücadele ederken aynı zamanda onun gerçekte kim olduğunu gerçekçi bir şekilde öğrenmeye çalışan genç bir kadın olan Julie\'nin hayatındaki dört yılı anlatıyor.', 'https://kultfilmler.com/the-worst-person-in-the-world-dunyanin-en-kotu-insani/'),
(11, 'Gone Girl', 8.10, 'Gone Girl, modern bir evliliğin kalbindeki sırları açığa çıkarıyor. Beşinci evlilik yıl dönümünlerini kutlamaya hazırlanırken Amy aniden ortadan yok olur. Nick karısından uzun süre haber alamayınca kaybolduğunu anlar ve polise bildirir. Eve gelen dedektif Rhonda Boney ve polis memuru Jim Gilpin her yeri inceliyor. Rhonda, mutfakta küçük bir kan sıçraması görüyor. Bunun üzerine polisten Nick\'ten şüphelenip üzerinde baskı kurmaya başlıyor. Yakında ortaya çıkan yalanları, aldatmaları ve garip davranışları herkesin aynı karanlık soruyu sormasına neden olacaktır:', 'https://kultfilmler.com/gone-girl-kayip-kiz-izle/'),
(12, 'Everything Everywhere All at Once', 8.20, 'Çamaşırhanesi başarısızlığın eşiğinde sallanırken ve pısırık kocası Waymond ile olan evliliğinden dolayı çok çalışan Evelyn Wang, yargılayıcı babası Gong Gong ve kızı Joy ile olan yıpranmış bir ilişki de dahil olmak üzere her şeyle başa çıkmak için mücadele ediyor.', 'https://kultfilmler.com/gone-girl-kayip-kiz-izle/'),
(13, 'The Pianist', 8.50, 'Piyanist, İkinci Dünya Savaşı sırasında yaşanan gerçek bir dramı konu alır. Polonya’lı ünlü piyanist Wladyslaw Szpilman’ın anılarını anlattığı aynı isimli kitaptan sinemaya uyarlanan film, Nazi işgali altındaki Polonya’da yaşamanın imkansızlaştırıldığı bir dönemde, bir şekilde esir kampına gitmekten kurtulan ünlü piyanistin Varşova’nın kenar mahallelerindeki hayatta kalma mücadelesine odaklanır. Varoşlarda tam anlamıyla sefil bir hayat süren müzisyen, diğer halkla birlikte, kıtlığa ve aşağılanmalara maruz kalsa da kahramanca mücadele edecektir. Günü gelip oradan kaçma şansı bulduğundaysa başkentin harabelerine sığınacak, beklemediği bir anda gelen bir yardımla umudunu yeniden kazanacaktır.', 'https://kultfilmler.com/the-pianist-piyanist-izle/'),
(14, 'Requiem For A Dream', 8.30, 'Sara Goldfarb, tv bağımlısı dul bir kadındır. Oğlu Harry ise kız arkadaşı Marion ve uyuşturucu satıcısı Tyrone\'la takılan madde bağımlısı bir çocuktur. Sara, bir tv şovuna çıkmaya hak kazanır bu yüzden çok heyecanlıdır. Ödül olan kırmızı elbiseye girebilmek için kilo vermeye çalışır ve diyet haplarından kullanmaya başlar. Diğer yandan Harry ve arkadaşları, hiç durmadan eroin ve kokain kullanmaya devam ediyorlar. Bu bağımlılıklar zamanla aileyi bir felakete sürükleyecektir...', 'https://kultfilmler.com/requiem-for-a-dream-bir-ruya-icin-agit/'),
(15, 'Se7en', 8.60, '7 ölümcül günahı işleyenleri kendi vahşi yöntemleriyle öldüren bir seri katil ve onun peşindeki iki polis dedektifin çabalarını konu alan bir gerilim başyapıtı.Yönetmen David Fincher imzalı film, gerek sürükleyici konusu gerekse oyuncuların performanslarıyla gişede büyük başarı yakalamıştı. En iyi kurgu dalında 1996\'da ödüle aday olan film bu ödülü alamamıştı.Özellikle sürpriz kötü adamı ve çarpıcı finali ile şimdiden bir klasik olarak yerini aldı.', 'https://kultfilmler.com/se7en-yedi-izle/'),
(17, 'A Clockwork Orange', 8.30, 'Alex Delarge, genelde cinsellikle kurbanlarına saygı göstermeden şiddet davranışları sergileyen bir haydut çetesinin \"drooglar\" lideridir. Alex, Ludwig van Beethoven\'ın eserlerini sever. Şiddet davranışları sergilerken onu dinlediğinde, daha fazla yoğunlaşır ve ilham alır. Sonunda Alex cinayet ve tecavüzden tutuklanır mahkum edilir. Hapiste şiddet davranışını azaltmaya yönelik bir deney için gönüllü olur ancak işler planlandığı gibi gitmez....', 'https://kultfilmler.com/otomatik-portakal-a-clockwork-orange/'),
(18, 'Life Is Beautiful', 8.60, 'Roberto Benigni imzalı bu İtalyan filmi, savaşın kurbanları üstündeki tesirini ve çocuk dimağlardaki yansımasını öyle hoş bir üslupla anlatmış ki, bu şaheser üç Oscar\'la ödüllendirilmiş. Birkaç sene önce evlenip, bir de çocukları olan mutlu bir çiftin yolları İkinci Dünya Savaşı ile ayrılıyor. Tutsak kampına çocuğuyla beraber sevk edilen Guido için güç şartlara sabretmek ikincil emel olarak kalıyor ve oğluyla bir oyun oynamaya başlıyor. Bu oyun savaşın korkusunu oğlunun sezmemesi üzerine kurulu..', 'https://kultfilmler.com/life-is-beautiful-hayat-guzeldir-izle/'),
(23, 'Irreversible', 7.10, 'Alex adında genç bir kadın bir tünelde yabancı bir kişi tarafından tecavüze uğrar. Erkek arkadaşı Marcus ve eski erkek arkadaşı Pierre, adaleti kendileri sağlamaya karar verir. Film sebep ve sonucun yıkıcı doğasını ve zamanın her şeyi nasıl yok ettiğini hem güzel hem de korkunç yönleriyle gözler önüne seriyor.', 'https://kultfilmler.com/irreversible-donus-yok-izle/');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `admin_login`
--
ALTER TABLE `admin_login`
  ADD PRIMARY KEY (`admin_id`);

--
-- Tablo için indeksler `comminicate`
--
ALTER TABLE `comminicate`
  ADD PRIMARY KEY (`comment_id`);

--
-- Tablo için indeksler `login_form`
--
ALTER TABLE `login_form`
  ADD PRIMARY KEY (`user_id`);

--
-- Tablo için indeksler `movies_inf`
--
ALTER TABLE `movies_inf`
  ADD PRIMARY KEY (`movie_id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `admin_login`
--
ALTER TABLE `admin_login`
  MODIFY `admin_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Tablo için AUTO_INCREMENT değeri `comminicate`
--
ALTER TABLE `comminicate`
  MODIFY `comment_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- Tablo için AUTO_INCREMENT değeri `login_form`
--
ALTER TABLE `login_form`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- Tablo için AUTO_INCREMENT değeri `movies_inf`
--
ALTER TABLE `movies_inf`
  MODIFY `movie_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
