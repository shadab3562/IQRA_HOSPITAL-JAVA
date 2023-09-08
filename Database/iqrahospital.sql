-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 05, 2023 at 02:47 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `iqrahospital`
--

-- --------------------------------------------------------

--
-- Table structure for table `bankaccount`
--

CREATE TABLE `bankaccount` (
  `AccountNumber` int(255) NOT NULL,
  `IdCard` int(11) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `AccountTitle` varchar(255) NOT NULL,
  `cvv` int(255) NOT NULL,
  `exp` int(255) NOT NULL,
  `balance` int(255) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bankaccount`
--

INSERT INTO `bankaccount` (`AccountNumber`, `IdCard`, `Email`, `password`, `AccountTitle`, `cvv`, `exp`, `balance`) VALUES
(54321, 3562, 'iqrahospital3@gmail.com', 'qsvWiV/En7kBcyIOrY8Onq+TBk+f9dECIDl4cLpWlCSXO3scU5ldqlt0GdIv2RPT', 'IQRA HOSPITAL', 230, 8982, 4655),
(54338, 20772, 'sharjel034@gmail.com', 'XfoZXYiPLbFO5D60dBu4pKW2twb5BEqVbblXs+0+5BeMdFAg/wXByCIjRWgUcmyR', 'SharjeelAhmed', 524, 156, 1400),
(54339, 52412, 'shadabakhund14@gmail.com', 'ZhzGDU5pR9mSffTm/9Ncf5z6dmrws97+01RUyNFyo6dxyL149OEzXKPwR0q/SUMa', 'Shadab Ahmed', 726, 3309, 11508);

-- --------------------------------------------------------

--
-- Table structure for table `doctors`
--

CREATE TABLE `doctors` (
  `id` int(255) NOT NULL,
  `DoctorName` varchar(255) NOT NULL,
  `fees` int(255) NOT NULL,
  `Speciality` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctors`
--

INSERT INTO `doctors` (`id`, `DoctorName`, `fees`, `Speciality`) VALUES
(19, 'Dr. Omer Ehtisham', 1500, 'General Physicians'),
(20, 'Dr. Syed Ikram', 800, 'General Physicians'),
(21, 'Dr. Faiza Naseem', 500, 'General Physicians'),
(23, 'Dr. Rumsha', 1000, 'Cardiologists'),
(24, 'Dr. Aliza Ahmed', 1500, 'Cardiologists'),
(25, 'Dr. Kamran Khan', 350, 'Cardiologists'),
(26, 'Dr. Warda Amin Shaikh', 1000, 'Dermatologist'),
(27, 'Dr. Summaya Jamal', 900, 'Dermatologist'),
(28, 'Dr. Muhammad Rizwan', 600, 'Dermatologist'),
(29, 'Dr. Aliyan', 350, 'Orthopedic'),
(30, 'Dr. Shadab Ahmed', 900, 'Orthopedic'),
(31, 'Dr. Abu Sufyan', 100, 'Orthopedic'),
(32, 'Dr. Salman Khan', 350, 'Orthopedic');

-- --------------------------------------------------------

--
-- Table structure for table `patientdata`
--

CREATE TABLE `patientdata` (
  `MrNumber` int(6) NOT NULL,
  `RecordNumber` int(255) NOT NULL DEFAULT 0,
  `FirstName` varchar(255) NOT NULL,
  `LastName` varchar(266) NOT NULL,
  `age` int(3) NOT NULL,
  `gender` varchar(6) NOT NULL,
  `email` varchar(255) NOT NULL,
  `speciality` varchar(255) NOT NULL DEFAULT 'NA',
  `Doctor` varchar(255) NOT NULL DEFAULT 'NA',
  `day` text NOT NULL DEFAULT 'NA',
  `timeSlot` varchar(255) NOT NULL DEFAULT 'NA',
  `paymentStatus` varchar(20) NOT NULL DEFAULT 'NA',
  `date` text NOT NULL,
  `patientStatus` text NOT NULL DEFAULT 'waiting'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patientdata`
--

INSERT INTO `patientdata` (`MrNumber`, `RecordNumber`, `FirstName`, `LastName`, `age`, `gender`, `email`, `speciality`, `Doctor`, `day`, `timeSlot`, `paymentStatus`, `date`, `patientStatus`) VALUES
(1244, 137, 'Shadab', 'ahmed', 33, 'Male', 'sharjel034@gmail.com', 'Cardiologists', 'Dr. Aliza Ahmed', 'Wednesday', 'Wednesday (6:00 - 8:30 PM))', 'Paid', '04 Sep 2023, 06:56 AM', 'waiting'),
(1250, 0, 'Shadab', 'NA', 25, 'Female', 'habbahbaad', 'General Physicians', 'Dr. Omer Ehtisham', 'Tuesday', 'Tuesday (1:00 - 4:00 PM))', 'NA', '04 Sep 2023, 08:20 AM', 'waiting'),
(1251, 139, 'Shadab', 'Ahmed', 21, 'Male', 'shadabakhund14@gmail.com', 'Cardiologists', 'Dr. Rumsha', 'Monday', 'Monday (8:00 - 11:00 AM))', 'unpaid', '05 Sep 2023, 02:31 AM', 'Checked'),
(1253, 141, 'Sharjeel', 'Akhund', 21, 'Male', 'shadabakhund14@gmail.com', 'Cardiologists', 'Dr. Rumsha', 'Monday', 'Monday (8:00 - 11:00 AM))', 'Paid', '05 Sep 2023, 02:43 AM', 'Checked'),
(1255, 142, 'Murtaza', 'Hassan', 25, 'Male', 'shadabakhund14@gmail.com', 'Cardiologists', 'Dr. Rumsha', 'Monday', 'Monday (8:00 - 11:00 AM))', 'unpaid', '05 Sep 2023, 12:46 PM', 'Checked'),
(1256, 143, 'sharjeel', 'NA', 20, 'Male', 'asma.qaiser@iqra.edu.pk', 'Cardiologists', 'Dr. Rumsha', 'Monday', 'Monday (8:00 - 11:00 AM))', 'unpaid', '05 Sep 2023, 03:08 PM', 'Checked'),
(1257, 144, 'sharjeel', 'ahmed', 77, 'Female', 'shadabakhund14@gmail.com', 'Cardiologists', 'Dr. Rumsha', 'Monday', 'Monday (8:00 - 11:00 AM))', 'Paid', '05 Sep 2023, 03:11 PM', 'Checked'),
(1258, 144, 'sharjeel', 'ahmed', 77, 'Female', 'shadabakhund14@gmail.com', 'NA', 'NA', 'NA', 'NA', 'NA', '05 Sep 2023, 03:16 PM', 'waiting');

-- --------------------------------------------------------

--
-- Table structure for table `records`
--

CREATE TABLE `records` (
  `RecordNumber` int(255) NOT NULL,
  `FirstName` text NOT NULL,
  `LastName` text NOT NULL,
  `age` int(255) NOT NULL,
  `gender` text NOT NULL,
  `email` text NOT NULL,
  `date` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `records`
--

INSERT INTO `records` (`RecordNumber`, `FirstName`, `LastName`, `age`, `gender`, `email`, `date`) VALUES
(137, 'Shadab', 'ahmed', 33, 'Male', 'sharjel034@gmail.com', '04 Sep 2023, 06:56 AM'),
(139, 'Shadab', 'Ahmed', 21, 'Male', 'shadabakhund14@gmail.com', '05 Sep 2023, 02:31 AM'),
(141, 'Shadab', 'Akhund', 21, 'Male', 'shadabakhund14@gmail.com', '05 Sep 2023, 02:43 AM'),
(142, 'Murtaza', 'Hassan', 25, 'Male', 'shadabakhund14@gmail.com', '05 Sep 2023, 12:46 PM'),
(143, 'sharjeel', 'NA', 20, 'Male', 'asma.qaiser@iqra.edu.pk', '05 Sep 2023, 03:08 PM'),
(144, 'sharjeel', 'ahmed', 77, 'Female', 'shadabakhund14@gmail.com', '05 Sep 2023, 03:11 PM');

-- --------------------------------------------------------

--
-- Table structure for table `timeslots`
--

CREATE TABLE `timeslots` (
  `id` int(255) NOT NULL,
  `DoctorName` text NOT NULL,
  `day` text NOT NULL,
  `timeslot` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `timeslots`
--

INSERT INTO `timeslots` (`id`, `DoctorName`, `day`, `timeslot`) VALUES
(27, 'Dr. Omer Ehtisham', 'Monday', '10:00 - 1:00 AM'),
(29, 'Dr. Omer Ehtisham', 'Tuesday', '1:00 - 4:00 PM'),
(30, 'Dr. Omer Ehtisham', 'Wednesday', '7:00 - 9:00 PM'),
(31, 'Dr. Syed Ikram', 'Thursday', '8:00 - 10:00 AM'),
(32, 'Dr. Syed Ikram', 'Saturday', '3:00 - 6:00 PM'),
(33, 'Dr. Syed Ikram', 'Friday', '5:00 - 9:00'),
(34, 'Dr. Faiza Naseem', 'Monday', '8:00 - 12:00 AM'),
(35, 'Dr. Faiza Naseem', 'Wednesday', '7:00 - 10:00 PM'),
(36, 'Dr. Faiza Naseem', 'Saturday', '2:00 - 7:00 PM'),
(37, 'Dr. Rumsha', 'Monday', '8:00 - 11:00 AM'),
(38, 'Dr. Rumsha', 'Tuesday', '6:00 - 11:00 PM'),
(39, 'Dr. Rumsha', 'Wednesday', '2:00 - 5:00 PM'),
(40, 'Dr. Aliza Ahmed', 'Monday', '8:30 - 10:00 AM'),
(41, 'Dr. Aliza Ahmed', 'Wednesday', '6:00 - 8:30 PM'),
(42, 'Dr. Aliza Ahmed', 'Saturday', '1:00 - 3:00 AM'),
(43, 'Dr. Kamran Khan', 'Monday', '4:00 - 9:00 PM'),
(44, 'Dr. Kamran Khan', 'Tuesday', '4:00 - 9:00 PM'),
(45, 'Dr. Kamran Khan', 'Thursday', '6:00 - 10:00 PM'),
(46, 'Dr. Warda Amin Shaikh', 'Monday', '9:30 - 11:30 AM'),
(47, 'Dr. Warda Amin Shaikh', 'Tuesday', '7:30 - 9:30 PM'),
(48, 'Dr. Warda Amin Shaikh', 'Thursday', '1:30 - 3:30 PM'),
(49, 'Dr. Summaya Jamal', 'Sunday', '9:30 - 11:30 AM'),
(50, 'Dr. Summaya Jamal', 'Friday', '5:30 - 9:30 PM'),
(51, 'Dr. Summaya Jamal', 'Tuesday', '9:30 - 11:30 AM'),
(52, 'Dr. Muhammad Rizwan', 'Monday', '2:30 - 5:30 PM'),
(53, 'Dr. Muhammad Rizwan', 'Tuesday', '9:30 - 11:30 AM'),
(54, 'Dr. Muhammad Rizwan', 'Wednesday', '5:00 - 8:30 AM'),
(55, 'Dr. Aliyan', 'Monday', '8:00 - 6:00 PM'),
(56, 'Dr. Aliyan', 'Tuesday', '10:00 - 5:00 PM'),
(57, 'Dr. Aliyan', 'Thursday', '8:00 - 10:00 AM'),
(58, 'Dr. Shadab Ahmed', 'Sunday', '8:30 - 11:30 AM'),
(59, 'Dr. Shadab Ahmed', 'Thursday', '8:00 - 10:00 AM'),
(60, 'Dr. Shadab Ahmed', 'Saturday', '8:00 - 8:00 PM'),
(61, 'Dr. Abu Sufyan', 'Monday', '9:00 - 11:30 AM'),
(62, 'Dr. Abu Sufyan', 'Tuesday', '12:30 - 9:00 PM'),
(63, 'Dr. Abu Sufyan', 'Thursday', '7:00 - 8:30 PM');

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

CREATE TABLE `transaction` (
  `id` int(255) NOT NULL,
  `SenderNo` int(255) NOT NULL,
  `SenderName` text NOT NULL,
  `ReceiverNo` int(255) NOT NULL,
  `ReceiverName` text NOT NULL,
  `Amount` int(255) NOT NULL,
  `date` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaction`
--

INSERT INTO `transaction` (`id`, `SenderNo`, `SenderName`, `ReceiverNo`, `ReceiverName`, `Amount`, `date`) VALUES
(10, 54338, 'SharjeelAhmed', 54338, 'SharjeelAhmed', 5000, '04 Sep 2023, 06:34 AM'),
(11, 54338, 'SharjeelAhmed', 54321, 'IQRA HOSPITAL', 1500, '04 Sep 2023, 06:58 AM'),
(12, 54338, 'SharjeelAhmed', 54321, 'IQRA HOSPITAL', 1300, '04 Sep 2023, 08:18 AM'),
(13, 54338, 'SharjeelAhmed', 54321, 'IQRA HOSPITAL', 800, '05 Sep 2023, 02:47 AM'),
(18, 54339, 'Shadab Ahmed', 54321, 'IQRA HOSPITAL', 800, '05 Sep 2023, 03:14 PM');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bankaccount`
--
ALTER TABLE `bankaccount`
  ADD PRIMARY KEY (`AccountNumber`);

--
-- Indexes for table `doctors`
--
ALTER TABLE `doctors`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `patientdata`
--
ALTER TABLE `patientdata`
  ADD PRIMARY KEY (`MrNumber`);

--
-- Indexes for table `records`
--
ALTER TABLE `records`
  ADD PRIMARY KEY (`RecordNumber`);

--
-- Indexes for table `timeslots`
--
ALTER TABLE `timeslots`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `transaction`
--
ALTER TABLE `transaction`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bankaccount`
--
ALTER TABLE `bankaccount`
  MODIFY `AccountNumber` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=54351;

--
-- AUTO_INCREMENT for table `doctors`
--
ALTER TABLE `doctors`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT for table `patientdata`
--
ALTER TABLE `patientdata`
  MODIFY `MrNumber` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1259;

--
-- AUTO_INCREMENT for table `records`
--
ALTER TABLE `records`
  MODIFY `RecordNumber` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=145;

--
-- AUTO_INCREMENT for table `timeslots`
--
ALTER TABLE `timeslots`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=64;

--
-- AUTO_INCREMENT for table `transaction`
--
ALTER TABLE `transaction`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
