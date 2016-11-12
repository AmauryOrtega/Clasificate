-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-11-2016 a las 04:39:55
-- Versión del servidor: 10.1.13-MariaDB
-- Versión de PHP: 7.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `clasificate`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipo`
--

CREATE TABLE `equipo` (
  `id` int(11) NOT NULL,
  `nombre` text NOT NULL,
  `nacionalidad` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `equipo`
--

INSERT INTO `equipo` (`id`, `nombre`, `nacionalidad`) VALUES
(29, 'ALL-STARS', 'CARTAGENA'),
(30, 'UDC', 'CARTAGENA'),
(31, 'NACIONAL', 'CARTAGENA'),
(32, 'equipoPrueba', 'USA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jugador`
--

CREATE TABLE `jugador` (
  `idJugador` int(11) NOT NULL,
  `cedula` text NOT NULL,
  `sexo` text NOT NULL,
  `edad` int(11) NOT NULL,
  `nombre_completo` text NOT NULL,
  `altura` float NOT NULL,
  `peso` float NOT NULL,
  `fuerzaBrazosCantidad` int(11) NOT NULL,
  `burpeeCantidad` int(11) NOT NULL,
  `saltoLargoDistancia` float NOT NULL,
  `saltoAltoDistancia` float NOT NULL,
  `ruffierP1` float NOT NULL,
  `ruffierP2` float NOT NULL,
  `ruffierP3` float NOT NULL,
  `elasticidadCantidad` int(11) NOT NULL,
  `cooperCantidad` int(11) NOT NULL,
  `idEquipo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `jugador`
--

INSERT INTO `jugador` (`idJugador`, `cedula`, `sexo`, `edad`, `nombre_completo`, `altura`, `peso`, `fuerzaBrazosCantidad`, `burpeeCantidad`, `saltoLargoDistancia`, `saltoAltoDistancia`, `ruffierP1`, `ruffierP2`, `ruffierP3`, `elasticidadCantidad`, `cooperCantidad`, `idEquipo`) VALUES
(54, '1527171177', 'MASCULINO', 19, 'Diaz Andres', 1.7, 98.0298, 14, 28, 2.58, 57, 74, 76, 86, -14, 2893, 29),
(55, '2171867180', 'MASCULINO', 20, 'Caballero Brandon', 2.21433, 61.2574, 39, 38, 2.35, 37, 62, 67, 65, -6, 2316, 29),
(56, '1227908845', 'MASCULINO', 21, 'Herazo Daniel', 1.7, 86.9471, 24, 35, 1.54, 45, 78, 53, 61, 6, 2038, 29),
(57, '1525328362', 'MASCULINO', 24, 'Reinoso Jose', 2.59099, 77.9917, 22, 28, 1.69, 32, 56, 61, 50, -19, 2280, 29),
(58, '1544925845', 'MASCULINO', 19, 'Padilla Diego', 2.05471, 62.0807, 38, 35, 2.51, 68, 57, 81, 64, 6, 2158, 29),
(59, '2319821909', 'MASCULINO', 19, 'Angulo Luis', 1.7, 74.5171, 36, 30, 2.11, 33, 58, 78, 90, 12, 2798, 29),
(60, '2332873912', 'FEMENINO', 23, 'Paula Rita', 1.57962, 77.9073, 12, 35, 1.14, 50, 88, 77, 100, -1, 2668, 29),
(61, '1837658458', 'MASCULINO', 22, 'Angulo Jesus', 1.7, 68.1229, 4, 26, 1.56, 55, 72, 85, 57, 3, 2477, 30),
(62, '1711262023', 'MASCULINO', 25, 'Stevenson Jefrie', 2.5, 86.5775, 20, 26, 1.87, 29, 72, 58, 67, 7, 2758, 30),
(63, '2200563356', 'FEMENINO', 22, 'Aurora Judith', 1.7, 61.5756, 27, 27, 1.02, 66, 69, 85, 72, 29, 2984, 30),
(64, '2285252643', 'MASCULINO', 20, 'Fuentes Eduard', 1.7, 69.5838, 25, 49, 1.37, 44, 86, 90, 95, -20, 2768, 30),
(65, '1627563296', 'MASCULINO', 21, 'Polo Santiago', 2.40307, 68.714, 19, 28, 2.16, 56, 93, 89, 99, -10, 2904, 30),
(66, '1229402432', 'FEMENINO', 20, 'Florina Ignacia', 1.7, 86.1861, 37, 25, 1.31, 32, 96, 96, 87, 9, 2875, 30),
(67, '2157094405', 'MASCULINO', 23, 'Martinez Danny', 1.7, 78.8583, 19, 50, 1.79, 67, 50, 91, 98, 28, 2596, 30),
(68, '2193432456', 'MASCULINO', 20, 'Martinez Juan', 2.03848, 72.5073, 5, 32, 2.22, 52, 94, 94, 85, -11, 2136, 30),
(69, '1399031609', 'MASCULINO', 21, 'Fuente Sebastian', 2.18696, 94.7536, 20, 39, 2.35, 25, 73, 62, 79, -13, 2524, 31),
(70, '1590575752', 'FEMENINO', 24, 'Samanta Amanda', 1.7, 79.8766, 35, 47, 1.82, 47, 66, 57, 73, 3, 2044, 31),
(71, '1989026291', 'MASCULINO', 20, 'Silva Jose', 2.5, 95.366, 6, 41, 1.21, 43, 77, 68, 70, 21, 2375, 31),
(72, '2321770765', 'FEMENINO', 24, 'Susana Blanca', 2.5, 75.9211, 39, 46, 1.26, 36, 84, 63, 59, -4, 2736, 31),
(73, '1881327553', 'MASCULINO', 25, 'Mejia Stiven', 2.5, 91.5027, 17, 37, 1.54, 70, 88, 84, 50, -20, 2226, 31),
(74, '1282554865', 'MASCULINO', 19, 'Mejia Mauricio', 1.77154, 82.6248, 12, 35, 1.03, 46, 90, 93, 65, 17, 2216, 31),
(75, '2055285411', 'FEMENINO', 19, 'Angelina Selena', 2.33377, 63.3587, 37, 50, 2.89, 59, 62, 90, 96, 21, 2902, 31),
(76, '2345153948', 'MASCULINO', 23, 'Jimenez Leonardo', 1.7, 84.0342, 13, 37, 2.41, 26, 70, 97, 71, -2, 2761, 31),
(77, '2312653077', 'MASCULINO', 19, 'Gutierrez David', 1.7, 76.6556, 31, 37, 1.22, 27, 72, 58, 51, 21, 2050, 31),
(78, '1143397229', 'MASCULINO', 19, 'Amaury Ortega', 1.7, 70, 28, 35, 2, 42, 100, 100, 50, 30, 2300, 32),
(79, '97011623623', 'MASCULINO', 19, 'Julian Martinez', 1.7, 60, 16, 55, 2.3, 57, 110, 110, 60, -1, 2801, 32),
(80, '1197874193', 'FEMENINO', 19, 'Jenniffer Alvarez', 1.7, 70, 15, 31, 1.85, 42, 100, 100, 50, 25, 2050, 32);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `jugador`
--
ALTER TABLE `jugador`
  ADD PRIMARY KEY (`idJugador`),
  ADD KEY `idEquipo` (`idEquipo`),
  ADD KEY `idJugador` (`idJugador`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `equipo`
--
ALTER TABLE `equipo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;
--
-- AUTO_INCREMENT de la tabla `jugador`
--
ALTER TABLE `jugador`
  MODIFY `idJugador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=81;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `jugador`
--
ALTER TABLE `jugador`
  ADD CONSTRAINT `jugador_ibfk_1` FOREIGN KEY (`idEquipo`) REFERENCES `equipo` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
