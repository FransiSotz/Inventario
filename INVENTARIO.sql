USE InventarioSusy--Usar InventarioSusy
GO
--/****** Object:  Database [InventarioSusy]    Script Date: 14/01/2021 21:20:29 ******/
--CREATE DATABASE [InventarioSusy]
-- CONTAINMENT = NONE
-- ON  PRIMARY 
--( NAME = N'InventarioSusy', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLEXPRESS\MSSQL\DATA\InventarioSusy.mdf' , SIZE = 5120KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
-- LOG ON 
--( NAME = N'InventarioSusy_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLEXPRESS\MSSQL\DATA\InventarioSusy_log.ldf' , SIZE = 2048KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
--GO
ALTER DATABASE [InventarioSusy] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [InventarioSusy].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [InventarioSusy] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [InventarioSusy] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [InventarioSusy] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [InventarioSusy] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [InventarioSusy] SET ARITHABORT OFF 
GO
ALTER DATABASE [InventarioSusy] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [InventarioSusy] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [InventarioSusy] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [InventarioSusy] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [InventarioSusy] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [InventarioSusy] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [InventarioSusy] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [InventarioSusy] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [InventarioSusy] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [InventarioSusy] SET  DISABLE_BROKER 
GO
ALTER DATABASE [InventarioSusy] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [InventarioSusy] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [InventarioSusy] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [InventarioSusy] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [InventarioSusy] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [InventarioSusy] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [InventarioSusy] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [InventarioSusy] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [InventarioSusy] SET  MULTI_USER 
GO
ALTER DATABASE [InventarioSusy] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [InventarioSusy] SET DB_CHAINING OFF 
GO
ALTER DATABASE [InventarioSusy] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [InventarioSusy] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [InventarioSusy] SET DELAYED_DURABILITY = DISABLED 
GO
USE [InventarioSusy]
GO
/****** Object:  Table [dbo].[Categoria]    Script Date: 14/01/2021 21:20:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Categoria](
	[idCategoria] [int] IDENTITY(1000,1) NOT NULL,
	[nombreCategoria] [varchar](75) NOT NULL,
	[fecha] [datetime] NOT NULL,
	[idUsuario] [int] NOT NULL,
 CONSTRAINT [pk_Categoria] PRIMARY KEY CLUSTERED 
(
	[idCategoria] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Cliente]    Script Date: 14/01/2021 21:20:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Cliente](
	[idCliente] [int] IDENTITY(100,1) NOT NULL,
	[nombreCliente] [varchar](75) NOT NULL,
	[apellidoCliente] [varchar](75) NOT NULL,
	[direccionCliente] [varchar](100) NULL,
	[nitCliente] [varchar](20) NULL,
	[fechaNacimiento] [varchar](15) NULL,
	[correoCliente] [varchar](75) NULL,
	[telefonoCliente] [varchar](200) NULL,
	[idUsuario] [int] NOT NULL,
 CONSTRAINT [pk_Cliente] PRIMARY KEY CLUSTERED 
(
	[idCliente] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[DetalleVenta]    Script Date: 14/01/2021 21:20:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DetalleVenta](
	[idDetalleVenta] [int] NOT NULL,
	[idVenta] [int] NOT NULL,
	[idProducto] [int] NOT NULL,
	[cantidad] [int] NOT NULL,
	[precioVenta] [float] NOT NULL,
 CONSTRAINT [pk_DetalleVenta] PRIMARY KEY CLUSTERED 
(
	[idDetalleVenta] ASC,
	[idVenta] ASC,
	[idProducto] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Producto]    Script Date: 14/01/2021 21:20:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Producto](
	[idProducto] [int] IDENTITY(10000,1) NOT NULL,
	[idCategoria] [int] NOT NULL,
	[nombreProducto] [varchar](75) NOT NULL,
	[precioProducto] [float] NOT NULL,
	[stockProducto] [int] NOT NULL,
	[fecha] [datetime] NOT NULL,
	[idUsuario] [int] NOT NULL,
 CONSTRAINT [pk_Producto] PRIMARY KEY CLUSTERED 
(
	[idProducto] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Rol]    Script Date: 14/01/2021 21:20:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Rol](
	[idRol] [int] IDENTITY(1,1) NOT NULL,
	[nombreRol] [varchar](75) NOT NULL,
	[idUsuario] [int] NOT NULL,
 CONSTRAINT [pk_Rol] PRIMARY KEY CLUSTERED 
(
	[idRol] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Usuario]    Script Date: 14/01/2021 21:20:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Usuario](
	[idUsuario] [int] IDENTITY(1,1) NOT NULL,
	[idRol] [int] NOT NULL,
	[usuario] [varchar](25) NOT NULL,
	[nombreUsuario] [varchar](75) NOT NULL,
	[passwordUsuario] [varchar](200) NOT NULL,
	[idUsuarioAlter] [int] NOT NULL,
 CONSTRAINT [pk_Usuario] PRIMARY KEY CLUSTERED 
(
	[idUsuario] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Vendedor]    Script Date: 14/01/2021 21:20:29 ******/


/****** Object:  Table [dbo].[Venta]    Script Date: 14/01/2021 21:20:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Venta](
	[idVenta] [int] IDENTITY(1,1) NOT NULL,
	[idVendedor] [int] NOT NULL,
	[idCliente] [int] NOT NULL,
	[fechaVenta] [varchar](15) NOT NULL,
	[fechaEntrada] [datetime] NOT NULL,
	[totalVenta] [float] NOT NULL,
	[idUsuario] [int] NOT NULL,
	[estadoVenta] varchar(7), 
 CONSTRAINT [pk_Venta] PRIMARY KEY CLUSTERED 
(
	[idVenta] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
ALTER TABLE [dbo].[Categoria] ADD  DEFAULT (getdate()) FOR [fecha]
GO
ALTER TABLE [dbo].[Producto] ADD  DEFAULT (getdate()) FOR [fecha]
GO
ALTER TABLE [dbo].[Venta] ADD  DEFAULT (getdate()) FOR [fechaEntrada]
GO
ALTER TABLE [dbo].[Venta] ADD  DEFAULT ('ACTIVO') FOR [estadoVenta]
GO
ALTER TABLE [dbo].[DetalleVenta]  WITH CHECK ADD  CONSTRAINT [FK_DetalleVenta_Producto] FOREIGN KEY([idProducto])
REFERENCES [dbo].[Producto] ([idProducto])
GO
ALTER TABLE [dbo].[DetalleVenta] CHECK CONSTRAINT [FK_DetalleVenta_Producto]
GO
ALTER TABLE [dbo].[DetalleVenta]  WITH CHECK ADD  CONSTRAINT [FK_DetalleVenta_Venta] FOREIGN KEY([idVenta])
REFERENCES [dbo].[Venta] ([idVenta])
GO
ALTER TABLE [dbo].[DetalleVenta] CHECK CONSTRAINT [FK_DetalleVenta_Venta]
GO
ALTER TABLE [dbo].[Producto]  WITH CHECK ADD  CONSTRAINT [FK_Producto_Categoria] FOREIGN KEY([idCategoria])
REFERENCES [dbo].[Categoria] ([idCategoria])
GO
ALTER TABLE [dbo].[Producto] CHECK CONSTRAINT [FK_Producto_Categoria]
GO
ALTER TABLE [dbo].[Usuario]  WITH CHECK ADD  CONSTRAINT [FK_Usuario_Rol] FOREIGN KEY([idRol])
REFERENCES [dbo].[Rol] ([idRol])
GO
ALTER TABLE [dbo].[Usuario] CHECK CONSTRAINT [FK_Usuario_Rol]
GO
ALTER TABLE [dbo].[Venta]  WITH CHECK ADD  CONSTRAINT [FK_Venta_Cliente] FOREIGN KEY([idCliente])
REFERENCES [dbo].[Cliente] ([idCliente])
GO
ALTER TABLE [dbo].[Venta] CHECK CONSTRAINT [FK_Venta_Cliente]
GO
ALTER TABLE [dbo].[Venta]  WITH CHECK ADD  CONSTRAINT [FK_Venta_Usuario] FOREIGN KEY([idUsuario])
REFERENCES [dbo].[Usuario] ([idUsuario])
GO
ALTER TABLE [dbo].[Venta] CHECK CONSTRAINT [FK_Venta_Usuario]
GO

/****** Object:  StoredProcedure [dbo].[BACKUPDB]    Script Date: 14/01/2021 21:20:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[BACKUPDB]
AS
DECLARE @QUERY VARCHAR (300)
       ,@DB VARCHAR (30) = 'InventarioSusy'
	   ,@NOMBRE VARCHAR(100) = 'InventarioSusy' + CONVERT(VARCHAR,GETDATE(),112)
SET @QUERY = 'BACKUP DATABASE ' + @DB + ' TO DISK=' + CHAR(39) + 'C:\DB\' + @NOMBRE + '.BAK' + CHAR(39)
EXEC(@QUERY)

GO
/****** Object:  StoredProcedure [dbo].[Buscar]    Script Date: 14/01/2021 21:20:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[Buscar]
(@nombre varchar(100))
AS 
begin
select * from Categoria where nombreCategoria like  concat(@nombre, '%')
end


GO
/****** Object:  StoredProcedure [dbo].[buscarCliente]    Script Date: 14/01/2021 21:20:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[buscarCliente]
(@nombre varchar(100))
AS 
begin
select * 
from InventarioSusy..Cliente 
where nombreCliente like  concat('%', @nombre, '%')
or apellidoCliente like concat('%', @nombre, '%')
or direccionCliente like concat('%', @nombre, '%')
or nitCliente like concat(@nombre, '%')
end


GO
/****** Object:  StoredProcedure [dbo].[buscarProducto]    Script Date: 14/01/2021 21:20:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[buscarProducto]
(@nombre varchar(100))
AS 
begin
select * from InventarioSusy..Producto where nombreProducto like  concat(@nombre, '%')
end


GO
/****** Object:  StoredProcedure [dbo].[buscarRol]    Script Date: 14/01/2021 21:20:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[buscarRol]
(@nombre varchar(100))
AS 
begin
select * from Rol where nombreRol like  concat(@nombre, '%')
end


GO
/****** Object:  StoredProcedure [dbo].[buscarUsuario]    Script Date: 14/01/2021 21:20:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[buscarUsuario]
(@nombre varchar(100))
AS 
begin
select * from InventarioSusy..Usuario where Usuario like  concat(@nombre, '%')
end


GO
/****** Object:  StoredProcedure [dbo].[buscarVendedor]    Script Date: 14/01/2021 21:20:29 ******/


GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'Buscar por nombre Dentro de Categoria ' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'PROCEDURE',@level1name=N'Buscar'
GO
USE [master]
GO
ALTER DATABASE [InventarioSusy] SET  READ_WRITE 
GO
insert into InventarioSusy..Rol(nombreRol,idUsuario)Values('Administrador',1)
Insert into InventarioSusy..Usuario(idRol,usuario,nombreUsuario,passwordUsuario,idUsuarioAlter)values(1,'Admin','Admin','KcQTZZZffZU=',1)

--EXEC BACKUPDB
