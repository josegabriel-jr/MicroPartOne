-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 31-05-2022 a las 05:46:06
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `uvemegxn6u`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `articulo`
--

CREATE TABLE `articulo` (
  `id_articulo` int(100) NOT NULL,
  `nombre_revista` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `titulo_articulo` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `autores_articulo` varchar(70) COLLATE utf8_unicode_ci NOT NULL,
  `fecha_articulo` date NOT NULL,
  `volumen_articulo` int(10) NOT NULL,
  `pagina_inical` int(10) NOT NULL,
  `pagina_final` int(100) NOT NULL,
  `issn_articulo` int(20) NOT NULL,
  `url_articulo` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `doi_articulo` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria_especifica`
--

CREATE TABLE `categoria_especifica` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `categoria_general` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `categoria_especifica`
--

INSERT INTO `categoria_especifica` (`id`, `descripcion`, `categoria_general`) VALUES
(1, ' Artículos de investigación', 1),
(2, 'Notas científicas', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria_general`
--

CREATE TABLE `categoria_general` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(200) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `categoria_general`
--

INSERT INTO `categoria_general` (`id`, `descripcion`) VALUES
(1, 'Productos resultados de actividades de Generación de Nuevo Conocimiento.'),
(2, 'Productos resultados de actividades de Desarrollo Tecnológico e Innovación.'),
(3, 'Productos resultados de actividades de Apropiación Social del Conocimiento y\r\nDivulgación Pública de la Ciencia.'),
(4, 'Productos de actividades relacionadas con la Formación de Recurso Humano para\r\nCTeI.');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamento`
--

CREATE TABLE `departamento` (
  `id` int(11) NOT NULL,
  `Nombre` varchar(400) COLLATE utf8_unicode_ci NOT NULL,
  `ProgramaAcademico` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `departamento`
--

INSERT INTO `departamento` (`id`, `Nombre`, `ProgramaAcademico`) VALUES
(1, 'prueba\r\n', 0),
(3, 'sisa', 0),
(4, 'siuuuuuuuuuuu', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facultad`
--

CREATE TABLE `facultad` (
  `id` int(11) NOT NULL,
  `nombre` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=COMPACT;

--
-- Volcado de datos para la tabla `facultad`
--

INSERT INTO `facultad` (`id`, `nombre`) VALUES
(1, 'Ingenieria'),
(2, 'Ciencias Agrarias y del Medio Ambiente'),
(3, 'Ciencias de la Salud'),
(4, 'Ciencias Empresariales'),
(5, 'Educacion, Artes y Humanidades');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grupo`
--

CREATE TABLE `grupo` (
  `id` int(11) NOT NULL,
  `Nombre` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `director` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `lineaInvestigacion` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `cantidad_Integrantes` int(10) NOT NULL,
  `fecha_conformacion` date NOT NULL,
  `id_semillero` int(11) NOT NULL,
  `id_departamento` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `grupo`
--

INSERT INTO `grupo` (`id`, `Nombre`, `director`, `lineaInvestigacion`, `cantidad_Integrantes`, `fecha_conformacion`, `id_semillero`, `id_departamento`) VALUES
(1, 'prueba', '', '', 4, '2022-04-12', 1, 1),
(3, 'siuuuuuuuu', '', '', 2, '2019-09-20', 2, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libro`
--

CREATE TABLE `libro` (
  `id_libro` int(100) NOT NULL,
  `titulo_libro` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `isbn_libro` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `fecha_publicacion_libro` date NOT NULL,
  `autores_libro` varchar(70) COLLATE utf8_unicode_ci NOT NULL,
  `editorial_libro` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `lugar_publicacion_libro` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `certificado_creditos_libro` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `certificado_investigacion_libro` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `numero_capitulos_libro` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `libro`
--

INSERT INTO `libro` (`id_libro`, `titulo_libro`, `isbn_libro`, `fecha_publicacion_libro`, `autores_libro`, `editorial_libro`, `lugar_publicacion_libro`, `certificado_creditos_libro`, `certificado_investigacion_libro`, `numero_capitulos_libro`) VALUES
(1010, 'Prueba1', '1024896542', '2022-03-16', 'Felipe', 'Pruebas', 'Cúcuta', 'Certificado1', 'Certificado inv', 6),
(1020, 'Prueba2', '1024896542', '2022-03-16', 'Felipe', 'Pruebas', 'Cúcuta', 'Certificado1', 'Certificado inv', 6),
(1234, 'abcd', '12345', '2022-01-01', 'abcd', 'andaluz', 'bucaramanga', '123455', 'asdasdasd', 24),
(8989, '8989', '03030', '2022-01-01', 'Pombo', 'Lorna', 'Medellin', '9090', '0303', 21),
(31231, '122', '2', '2022-02-02', '2', '2', '2', '2', '2', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id` int(11) NOT NULL,
  `nombre` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `cantidad` int(11) NOT NULL,
  `subcategoria` int(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `grupo` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `programa` int(50) NOT NULL,
  `facultad` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id`, `nombre`, `cantidad`, `subcategoria`, `fecha`, `grupo`, `programa`, `facultad`) VALUES
(1, 'prueba1', 1, 1, '2022-01-25', '1', 111, 1),
(3, 'prueba3', 1, 4, '2022-02-05', '3', 112, 2),
(4, 'Prueba4', 4, 7, '2022-03-11', '3', 115, 2),
(5, 'prueba5', 1, 3, '2022-04-05', '1', 116, 2),
(6, 'Revista Cientifiica', 30, 6, '2022-04-27', '1', 111, 4),
(7, 'Prueba llist', 23, 6, '2022-06-01', '1', 1, 0),
(8, 'abc', 23, 4, '2022-01-01', '3', 116, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `programa_academico`
--

CREATE TABLE `programa_academico` (
  `id` int(11) NOT NULL,
  `nombre` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `id_facultad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=COMPACT;

--
-- Volcado de datos para la tabla `programa_academico`
--

INSERT INTO `programa_academico` (`id`, `nombre`, `id_facultad`) VALUES
(25, 'pruebaA', 2),
(26, 'pruebaB', 3),
(27, 'pruebaC', 1),
(28, 'pruebaD', 2),
(111, 'Ing Biotecnologica', 1),
(112, 'Ing Agroindustrial', 2),
(115, 'Ing de Sistemas', 1),
(116, 'Ing Civil', 1),
(118, 'Ing Biotecnologica', 2),
(135, 'Biologia', 2),
(168, 'Enfermeria', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

CREATE TABLE `rol` (
  `id` int(11) NOT NULL,
  `name` varchar(30) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=COMPACT;

--
-- Volcado de datos para la tabla `rol`
--

INSERT INTO `rol` (`id`, `name`) VALUES
(1, 'Admin'),
(2, 'User');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `semillero`
--

CREATE TABLE `semillero` (
  `id` int(11) NOT NULL,
  `Sigla` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `Nombre` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `cantidad_grupos` int(11) NOT NULL,
  `cantidad_estudiantes` int(11) NOT NULL,
  `fecha_conformacion` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `semillero`
--

INSERT INTO `semillero` (`id`, `Sigla`, `Nombre`, `cantidad_grupos`, `cantidad_estudiantes`, `fecha_conformacion`) VALUES
(1, '', 'prueba', 3, 0, '2022-04-19'),
(2, '', 'Siuuuuuuuuuuuuu', 5, 0, '2021-04-11'),
(3, '', 'prueba3', 6, 0, '2020-04-18');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `subcategoria_producto`
--

CREATE TABLE `subcategoria_producto` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `categoria_especifica` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `subcategoria_producto`
--

INSERT INTO `subcategoria_producto` (`id`, `descripcion`, `categoria_especifica`) VALUES
(1, 'ART_A1', 1),
(2, 'ART_A2', 1),
(3, 'ART_B', 1),
(4, 'ART_C', 1),
(5, 'ART_D', 1),
(6, 'N_A1', 2),
(7, 'N_A2', 2),
(8, 'N_B', 2),
(9, 'N_C', 2),
(10, 'N_D', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id` int(30) NOT NULL,
  `Nombre` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `username` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Rol` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `Nombre`, `username`, `password`, `Rol`) VALUES
(12, 'Felipe', 'Felipe123', '1234', 1),
(13, 'BrayamCaicedo', 'StevenCaicedo', '1234', 2),
(14, 'Danilo Gomez', 'ElDanilo', '1234', 1),
(15, 'Gabriel', 'Gabriel_1234', '1234', 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `articulo`
--
ALTER TABLE `articulo`
  ADD PRIMARY KEY (`id_articulo`);

--
-- Indices de la tabla `categoria_especifica`
--
ALTER TABLE `categoria_especifica`
  ADD PRIMARY KEY (`id`),
  ADD KEY `categoria_general` (`categoria_general`);

--
-- Indices de la tabla `categoria_general`
--
ALTER TABLE `categoria_general`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `departamento`
--
ALTER TABLE `departamento`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `facultad`
--
ALTER TABLE `facultad`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `grupo`
--
ALTER TABLE `grupo`
  ADD PRIMARY KEY (`id`),
  ADD KEY `grupo_ibfk_2` (`id_departamento`),
  ADD KEY `id_semillero` (`id_semillero`);

--
-- Indices de la tabla `libro`
--
ALTER TABLE `libro`
  ADD PRIMARY KEY (`id_libro`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id`),
  ADD KEY `categoria` (`subcategoria`);

--
-- Indices de la tabla `programa_academico`
--
ALTER TABLE `programa_academico`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_facultad` (`id_facultad`);

--
-- Indices de la tabla `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `semillero`
--
ALTER TABLE `semillero`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `subcategoria_producto`
--
ALTER TABLE `subcategoria_producto`
  ADD PRIMARY KEY (`id`),
  ADD KEY `subcategoria` (`categoria_especifica`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`),
  ADD KEY `Rol` (`Rol`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `articulo`
--
ALTER TABLE `articulo`
  MODIFY `id_articulo` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `categoria_especifica`
--
ALTER TABLE `categoria_especifica`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `categoria_general`
--
ALTER TABLE `categoria_general`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `departamento`
--
ALTER TABLE `departamento`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `facultad`
--
ALTER TABLE `facultad`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `grupo`
--
ALTER TABLE `grupo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `rol`
--
ALTER TABLE `rol`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `semillero`
--
ALTER TABLE `semillero`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `subcategoria_producto`
--
ALTER TABLE `subcategoria_producto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `categoria_especifica`
--
ALTER TABLE `categoria_especifica`
  ADD CONSTRAINT `categoria_especifica_ibfk_1` FOREIGN KEY (`categoria_general`) REFERENCES `categoria_general` (`id`);

--
-- Filtros para la tabla `grupo`
--
ALTER TABLE `grupo`
  ADD CONSTRAINT `grupo_ibfk_2` FOREIGN KEY (`id_departamento`) REFERENCES `departamento` (`id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `grupo_ibfk_3` FOREIGN KEY (`id_semillero`) REFERENCES `semillero` (`id`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`subcategoria`) REFERENCES `subcategoria_producto` (`id`);

--
-- Filtros para la tabla `programa_academico`
--
ALTER TABLE `programa_academico`
  ADD CONSTRAINT `programa_academico_ibfk_1` FOREIGN KEY (`id_facultad`) REFERENCES `facultad` (`id`);

--
-- Filtros para la tabla `subcategoria_producto`
--
ALTER TABLE `subcategoria_producto`
  ADD CONSTRAINT `subcategoria_producto_ibfk_1` FOREIGN KEY (`categoria_especifica`) REFERENCES `categoria_especifica` (`id`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`Rol`) REFERENCES `rol` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
