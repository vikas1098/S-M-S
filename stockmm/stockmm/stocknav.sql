USE [master]
GO
/****** Object:  Database [stocknav]    Script Date: 04/05/2021 11:53:20 ******/
CREATE DATABASE [stocknav] ON  PRIMARY 
( NAME = N'stocknav', FILENAME = N'c:\Program Files\Microsoft SQL Server\MSSQL10_50.MSSQLSERVER\MSSQL\DATA\stocknav.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'stocknav_log', FILENAME = N'c:\Program Files\Microsoft SQL Server\MSSQL10_50.MSSQLSERVER\MSSQL\DATA\stocknav_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [stocknav] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [stocknav].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [stocknav] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [stocknav] SET ANSI_NULLS OFF
GO
ALTER DATABASE [stocknav] SET ANSI_PADDING OFF
GO
ALTER DATABASE [stocknav] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [stocknav] SET ARITHABORT OFF
GO
ALTER DATABASE [stocknav] SET AUTO_CLOSE OFF
GO
ALTER DATABASE [stocknav] SET AUTO_CREATE_STATISTICS ON
GO
ALTER DATABASE [stocknav] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [stocknav] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [stocknav] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [stocknav] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [stocknav] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [stocknav] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [stocknav] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [stocknav] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [stocknav] SET  DISABLE_BROKER
GO
ALTER DATABASE [stocknav] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [stocknav] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [stocknav] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [stocknav] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [stocknav] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [stocknav] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [stocknav] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [stocknav] SET  READ_WRITE
GO
ALTER DATABASE [stocknav] SET RECOVERY SIMPLE
GO
ALTER DATABASE [stocknav] SET  MULTI_USER
GO
ALTER DATABASE [stocknav] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [stocknav] SET DB_CHAINING OFF
GO
USE [stocknav]
GO
/****** Object:  Table [dbo].[tbf4]    Script Date: 04/05/2021 11:53:22 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbf4](
	[f4id] [int] IDENTITY(1,1) NOT NULL,
	[cname] [nvarchar](50) NOT NULL,
	[f4no] [nvarchar](50) NOT NULL,
	[pname] [nvarchar](50) NOT NULL,
	[pcode] [nvarchar](50) NOT NULL,
	[rmi] [nvarchar](50) NOT NULL,
	[stock] [nvarchar](50) NOT NULL,
	[date] [nvarchar](50) NOT NULL
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[tbf4] ON
INSERT [dbo].[tbf4] ([f4id], [cname], [f4no], [pname], [pcode], [rmi], [stock], [date]) VALUES (10, N'Deep Precision Industries', N'1819', N'DCV LIVER BUSH', N'DP38761AB           ', N'4/792/3', N'1983', N'12/22/2020')
INSERT [dbo].[tbf4] ([f4id], [cname], [f4no], [pname], [pcode], [rmi], [stock], [date]) VALUES (11, N'Deep Precision Industries', N'1209', N'DCV LIVER BUSH', N'DP38761AB           ', N'4/588/1', N'10342', N'10/26/2020')
INSERT [dbo].[tbf4] ([f4id], [cname], [f4no], [pname], [pcode], [rmi], [stock], [date]) VALUES (12, N'Deep Precision Industries', N'1928', N'SPRING ADJUSTER', N'763007              ', N'30/149/1', N'3360', N'01/02/2021')
INSERT [dbo].[tbf4] ([f4id], [cname], [f4no], [pname], [pcode], [rmi], [stock], [date]) VALUES (13, N'Deep Precision Industries', N'1964', N'BODY 2013', N'SO2013-001 01       ', N'5/3865/1', N'16188', N'01/06/2021')
INSERT [dbo].[tbf4] ([f4id], [cname], [f4no], [pname], [pcode], [rmi], [stock], [date]) VALUES (14, N'Deep Precision Industries', N'2127', N'DCV LIVER BUSH', N'DP38761AB           ', N'4/588/1', N'8049', N'01/20/2021')
INSERT [dbo].[tbf4] ([f4id], [cname], [f4no], [pname], [pcode], [rmi], [stock], [date]) VALUES (15, N'Deep Precision Industries', N'2251', N'SPRING ADJUSTER', N'763007              ', N'22/4467/1', N'200', N'02/03/2021')
INSERT [dbo].[tbf4] ([f4id], [cname], [f4no], [pname], [pcode], [rmi], [stock], [date]) VALUES (16, N'Deep Precision Industries', N'2261', N'SPRING ADJUSTER', N'763007              ', N'22/4467/1', N'50', N'02/04/2021')
INSERT [dbo].[tbf4] ([f4id], [cname], [f4no], [pname], [pcode], [rmi], [stock], [date]) VALUES (17, N'Deep Precision Industries', N'2344', N'SPRING ADJUSTER', N'763007              ', N'22/4467/1', N'8715', N'02/12/2021')
INSERT [dbo].[tbf4] ([f4id], [cname], [f4no], [pname], [pcode], [rmi], [stock], [date]) VALUES (18, N'Deep Precision Industries', N'2309', N'SPRING ADJUSTER', N'763007              ', N'22/4467/1', N'5191', N'02/09/2021')
SET IDENTITY_INSERT [dbo].[tbf4] OFF
/****** Object:  Table [dbo].[tb_vistock]    Script Date: 04/05/2021 11:53:22 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_vistock](
	[cname] [nvarchar](50) NOT NULL,
	[pname] [nvarchar](50) NOT NULL,
	[pcode] [nvarchar](50) NOT NULL,
	[57f4] [nvarchar](50) NOT NULL,
	[qtypcs] [nvarchar](50) NOT NULL,
	[qtykg] [nvarchar](50) NULL,
	[date] [nvarchar](50) NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tb_vendor]    Script Date: 04/05/2021 11:53:22 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_vendor](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[cname] [nvarchar](50) NULL,
	[pname] [nvarchar](50) NULL,
	[pcode] [nvarchar](50) NULL,
	[sdata] [nvarchar](50) NULL,
	[f4] [nvarchar](50) NULL,
	[date] [nvarchar](50) NULL,
	[skg] [nchar](10) NULL
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[tb_vendor] ON
INSERT [dbo].[tb_vendor] ([id], [cname], [pname], [pcode], [sdata], [f4], [date], [skg]) VALUES (1, N'SHIV GORAKH NATH AUTO ENGG.', N'NUT TWOING HOOK', N'58278ME             ', N'1785', N'277', N'12/29/2020', N'314.12    ')
INSERT [dbo].[tb_vendor] ([id], [cname], [pname], [pcode], [sdata], [f4], [date], [skg]) VALUES (2, N'SHIV GORAKH NATH AUTO ENGG.', N'NUT TWOING HOOK', N'58278ME             ', N'2093', N'261', N'12/24/2020', N'368.54    ')
SET IDENTITY_INSERT [dbo].[tb_vendor] OFF
/****** Object:  Table [dbo].[tb_stockjw]    Script Date: 04/05/2021 11:53:22 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_stockjw](
	[ccname] [nvarchar](50) NOT NULL,
	[pname] [nvarchar](50) NOT NULL,
	[pcode] [nvarchar](50) NOT NULL,
	[rmino] [nvarchar](50) NULL,
	[f4] [nvarchar](50) NOT NULL,
	[challan] [nvarchar](50) NOT NULL,
	[qtypcs] [int] NOT NULL,
	[qtykg] [nvarchar](50) NULL,
	[date] [nvarchar](50) NOT NULL
) ON [PRIMARY]
GO
INSERT [dbo].[tb_stockjw] ([ccname], [pname], [pcode], [rmino], [f4], [challan], [qtypcs], [qtykg], [date]) VALUES (N'Deep Precision Industries', N'SPRING ADJUSTER', N'763007              ', N'30/149/1', N'1878', N'1', 30, N'2', N'12/29/2020')
INSERT [dbo].[tb_stockjw] ([ccname], [pname], [pcode], [rmino], [f4], [challan], [qtypcs], [qtykg], [date]) VALUES (N'Deep Precision Industries', N'SPRING ADJUSTER', N'763007              ', N'30/149/1', N'1878', N'2', 70, N'5', N'12/29/2020')
INSERT [dbo].[tb_stockjw] ([ccname], [pname], [pcode], [rmino], [f4], [challan], [qtypcs], [qtykg], [date]) VALUES (N'Deep Precision Industries', N'SPRING ADJUSTER', N'763007              ', N'30/149/1', N'1833', N'5', 10, N'2', N'12/22/2020')
INSERT [dbo].[tb_stockjw] ([ccname], [pname], [pcode], [rmino], [f4], [challan], [qtypcs], [qtykg], [date]) VALUES (N'Deep Precision Industries', N'SPRING ADJUSTER', N'763007              ', N'30/149/1', N'1670', N'240', 546, N'33.9', N'12/17/2020')
INSERT [dbo].[tb_stockjw] ([ccname], [pname], [pcode], [rmino], [f4], [challan], [qtypcs], [qtykg], [date]) VALUES (N'Deep Precision Industries', N'SPRING ADJUSTER', N'763007              ', N'30/149/1', N'1670', N'243', 911, N'56.54', N'12/18/2020')
INSERT [dbo].[tb_stockjw] ([ccname], [pname], [pcode], [rmino], [f4], [challan], [qtypcs], [qtykg], [date]) VALUES (N'Deep Precision Industries', N'SPRING ADJUSTER', N'763007              ', N'30/149/1', N'1670', N'247', 269, N'16.6', N'12/19/2020')
INSERT [dbo].[tb_stockjw] ([ccname], [pname], [pcode], [rmino], [f4], [challan], [qtypcs], [qtykg], [date]) VALUES (N'Deep Precision Industries', N'SPRING ADJUSTER', N'763007              ', N'30/149/1', N'1670', N'248', 1000, N'62', N'12/20/2020')
INSERT [dbo].[tb_stockjw] ([ccname], [pname], [pcode], [rmino], [f4], [challan], [qtypcs], [qtykg], [date]) VALUES (N'Deep Precision Industries', N'SPRING ADJUSTER', N'763007              ', N'30/149/1', N'1670', N'208', 506, N'31.4', N'12/07/2020')
INSERT [dbo].[tb_stockjw] ([ccname], [pname], [pcode], [rmino], [f4], [challan], [qtypcs], [qtykg], [date]) VALUES (N'Deep Precision Industries', N'SPRING ADJUSTER', N'763007              ', N'30/149/1', N'1670', N'257', 1250, N'77.5', N'12/22/2020')
INSERT [dbo].[tb_stockjw] ([ccname], [pname], [pcode], [rmino], [f4], [challan], [qtypcs], [qtykg], [date]) VALUES (N'Deep Precision Industries', N'SPRING ADJUSTER', N'763007              ', N'30/149/1', N'1928', N'354', 732, N'45.4', N'01/29/2021')
INSERT [dbo].[tb_stockjw] ([ccname], [pname], [pcode], [rmino], [f4], [challan], [qtypcs], [qtykg], [date]) VALUES (N'Deep Precision Industries', N'SPRING ADJUSTER', N'763007              ', N'30/149/1', N'1670', N'271', 661, N'41', N'12/28/2020')
INSERT [dbo].[tb_stockjw] ([ccname], [pname], [pcode], [rmino], [f4], [challan], [qtypcs], [qtykg], [date]) VALUES (N'Deep Precision Industries', N'SPRING ADJUSTER', N'763007              ', N'30/149/1', N'1928', N'364', 339, N'21', N'02/01/2021')
INSERT [dbo].[tb_stockjw] ([ccname], [pname], [pcode], [rmino], [f4], [challan], [qtypcs], [qtykg], [date]) VALUES (N'Deep Precision Industries', N'SPRING ADJUSTER', N'763007              ', N'30/149/1', N'1928', N'366', 524, N'32.1', N'02/02/2021')
INSERT [dbo].[tb_stockjw] ([ccname], [pname], [pcode], [rmino], [f4], [challan], [qtypcs], [qtykg], [date]) VALUES (N'Deep Precision Industries', N'SPRING ADJUSTER', N'763007              ', N'30/149/1', N'1928', N'374', 395, N'23.7', N'02/03/2021')
INSERT [dbo].[tb_stockjw] ([ccname], [pname], [pcode], [rmino], [f4], [challan], [qtypcs], [qtykg], [date]) VALUES (N'Deep Precision Industries', N'SPRING ADJUSTER', N'763007              ', N'22/4467/1', N'2251', N'375', 200, N'12.2', N'02/04/2021')
INSERT [dbo].[tb_stockjw] ([ccname], [pname], [pcode], [rmino], [f4], [challan], [qtypcs], [qtykg], [date]) VALUES (N'Deep Precision Industries', N'DCV LIVER BUSH', N'DP38761AB           ', N'4/588/1', N'1209', N'236', 665, N'62.8', N'12/14/2020')
INSERT [dbo].[tb_stockjw] ([ccname], [pname], [pcode], [rmino], [f4], [challan], [qtypcs], [qtykg], [date]) VALUES (N'Deep Precision Industries', N'DCV LIVER BUSH', N'DP38761AB           ', N'4/588/1', N'1209', N'278', 900, N'85.3', N'12/30/2020')
INSERT [dbo].[tb_stockjw] ([ccname], [pname], [pcode], [rmino], [f4], [challan], [qtypcs], [qtykg], [date]) VALUES (N'Deep Precision Industries', N'DCV LIVER BUSH', N'DP38761AB           ', N'4/588/1', N'1209', N'288', 733, N'69.6', N'01/04/2021')
INSERT [dbo].[tb_stockjw] ([ccname], [pname], [pcode], [rmino], [f4], [challan], [qtypcs], [qtykg], [date]) VALUES (N'Deep Precision Industries', N'DCV LIVER BUSH', N'DP38761AB           ', N'4/588/1', N'1209', N'292', 300, N'28.5', N'01/05/2021')
INSERT [dbo].[tb_stockjw] ([ccname], [pname], [pcode], [rmino], [f4], [challan], [qtypcs], [qtykg], [date]) VALUES (N'Deep Precision Industries', N'DCV LIVER BUSH', N'DP38761AB           ', N'4/588/1', N'1209', N'336', 1141, N'105', N'01/28/2021')
INSERT [dbo].[tb_stockjw] ([ccname], [pname], [pcode], [rmino], [f4], [challan], [qtypcs], [qtykg], [date]) VALUES (N'Deep Precision Industries', N'DCV LIVER BUSH', N'DP38761AB           ', N'4/588/1', N'1209', N'323', 600, N'57', N'01/20/2021')
INSERT [dbo].[tb_stockjw] ([ccname], [pname], [pcode], [rmino], [f4], [challan], [qtypcs], [qtykg], [date]) VALUES (N'Deep Precision Industries', N'DCV LIVER BUSH', N'DP38761AB           ', N'4/588/1', N'1209', N'365', 849, N'80.4', N'02/02/2021')
INSERT [dbo].[tb_stockjw] ([ccname], [pname], [pcode], [rmino], [f4], [challan], [qtypcs], [qtykg], [date]) VALUES (N'Deep Precision Industries', N'DCV LIVER BUSH', N'DP38761AB           ', N'4/588/1', N'1209', N'379', 914, N'81.3', N'02/05/2021')
INSERT [dbo].[tb_stockjw] ([ccname], [pname], [pcode], [rmino], [f4], [challan], [qtypcs], [qtykg], [date]) VALUES (N'Deep Precision Industries', N'DCV LIVER BUSH', N'DP38761AB           ', N'4/588/1', N'1209', N'390', 1075, N'101.4', N'02/09/2021')
/****** Object:  Table [dbo].[tb_item]    Script Date: 04/05/2021 11:53:22 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_item](
	[pid] [int] IDENTITY(1,1) NOT NULL,
	[cname] [nvarchar](50) NOT NULL,
	[pname] [nvarchar](50) NOT NULL,
	[pcode] [nchar](20) NOT NULL,
	[hsn] [nchar](10) NOT NULL,
 CONSTRAINT [PK_tb_item_1] PRIMARY KEY CLUSTERED 
(
	[pcode] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[tb_item] ON
INSERT [dbo].[tb_item] ([pid], [cname], [pname], [pcode], [hsn]) VALUES (5, N'KUMAR AUTOMATES', N'22 Hex Nut', N'11104-p-001.1-2     ', N'9988      ')
INSERT [dbo].[tb_item] ([pid], [cname], [pname], [pcode], [hsn]) VALUES (3, N'KUMAR AUTOMATES', N'NUT TWOING HOOK', N'58278ME             ', N'7318      ')
INSERT [dbo].[tb_item] ([pid], [cname], [pname], [pcode], [hsn]) VALUES (1, N'Deep Precision Industries', N'SPRING ADJUSTER', N'763007              ', N'9988      ')
INSERT [dbo].[tb_item] ([pid], [cname], [pname], [pcode], [hsn]) VALUES (2, N'Deep Precision Industries', N'DCV LIVER BUSH', N'DP38761AB           ', N'7318      ')
INSERT [dbo].[tb_item] ([pid], [cname], [pname], [pcode], [hsn]) VALUES (4, N'Deep Precision Industries', N'BODY 2013', N'SO2013-001 01       ', N'7318      ')
SET IDENTITY_INSERT [dbo].[tb_item] OFF
/****** Object:  Table [dbo].[tb_customer]    Script Date: 04/05/2021 11:53:22 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_customer](
	[ccode] [int] IDENTITY(1,1) NOT NULL,
	[cname] [nvarchar](50) NOT NULL,
	[address] [nvarchar](200) NOT NULL,
	[gst] [nvarchar](50) NOT NULL,
	[contact] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_tb_customer] PRIMARY KEY CLUSTERED 
(
	[gst] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[tb_customer] ON
INSERT [dbo].[tb_customer] ([ccode], [cname], [address], [gst], [contact]) VALUES (7, N'SHIV GORAKH NATH AUTO ENGG.', N'Sainik Colony Rohtak', N'-', N'9671814352')
INSERT [dbo].[tb_customer] ([ccode], [cname], [address], [gst], [contact]) VALUES (3, N'N A V Enterprises', N'Plot No 9, Sainik Colony, Hissar Bhiwani Link Raod Rohtak-124001', N'06AAQFN5583K1ZK', N'7056102457')
INSERT [dbo].[tb_customer] ([ccode], [cname], [address], [gst], [contact]) VALUES (1, N'KUMAR AUTOMATES', N'Sainik Colony, Hissar Road, Rohtak-124001', N'06AHTPK0342B1ZP', N'9355100010')
INSERT [dbo].[tb_customer] ([ccode], [cname], [address], [gst], [contact]) VALUES (2, N'Deep Precision Industries', N'Plot no. 7, sector 31B, IMT Kheri Sadh, Rohtak-124001', N'06APDPS5123C1Z9', N'devi_precizion@yahoo.co.in')
SET IDENTITY_INSERT [dbo].[tb_customer] OFF
