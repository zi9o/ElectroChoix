
CREATE DATABASE IF NOT EXISTS electroChoix_db;

DROP TABLE IF EXISTS electroChoix_db.ADMINISTRATEUR CASCADE;

DROP TABLE IF EXISTS electroChoix_db.CATEGORIE CASCADE;

DROP TABLE IF EXISTS electroChoix_db.CLIENT CASCADE;

DROP TABLE IF EXISTS electroChoix_db.COMMANDE CASCADE;

DROP TABLE IF EXISTS electroChoix_db.COMMANDE_PRODUIT CASCADE;

DROP TABLE IF EXISTS electroChoix_db.GALERIE CASCADE;

DROP TABLE IF EXISTS electroChoix_db.MARQUE CASCADE;

drop table if exists electroChoix_db. CASCADEPRODUIT;

drop table if exists electroChoix_db.PRODUIT_PROPRIETE CASCADE;

drop table if exists electroChoix_db.PROPRIETE CASCADE;


create table electroChoix_db.ADMINISTRATEUR
(
  ID_ADMIN int(10)  not null AUTO_INCREMENT,
  NOM varchar(40)    null,
  PRENOM  varchar(40)   null,
  EMAIL  varchar(100)   null,
  PASSWORD  varchar(40)    null,
  STATUT_DB int(1)   default 1,
  DATE_CREATION      dateTime  null,
  DATE_UPDATE        dateTime  null,
  primary key (ID_ADMIN)
) ENGINE=InnoDB;


create table electroChoix_db.CATEGORIE
( ID_CATEGORIE int(10) not null AUTO_INCREMENT,
  LIBELLE varchar(50) null,
  DESCRIPTION varchar(200) null,
  STATUT_DB int(1)   default 1,
  DATE_CREATION      dateTime  null,
  DATE_UPDATE        dateTime  null,
  primary key (ID_CATEGORIE)
) ENGINE=InnoDB;


create table electroChoix_db.CLIENT
(
  ID_CLIENT            int(10)                            not null AUTO_INCREMENT,
  CODE_CLIENT          int(10)                            null,
  NOM                  varchar(40)                        null,
  PRENOM               varchar(40)                        null,
  EMAIL                varchar(100)                        null,
  SEXE                 char(1)                           null,
  TELEPHONE            varchar(15)                        null,
  VILLE                varchar(40)                        null,
  REGION               varchar(50)                        null,
  ADRESSE              varchar(100)                        null,
  STATUT_DB int(1)   default 1,
  DATE_CREATION      dateTime  null,
  DATE_UPDATE        dateTime  null,
  primary key  (ID_CLIENT)
) ENGINE=InnoDB;


create table electroChoix_db.COMMANDE
(
  ID_COMMANDE          int(10)                            not null AUTO_INCREMENT,
  ID_CLIENT            int(10)                            null,
  NUM_COMMANDE         int(10)                            null,
  DATE_commande        dateTime                           null,
  MONTANT_TOTAL        float                          null,
  ETAT_REGLEMENT       varchar(50)                        null,
  TYPE_REGLEMENT       varchar (50)                       null,
  RECEPTION_BON_ACHAT  int(1)                           null,
  STATUT_DB int(1)   default 1,
  DATE_CREATION      dateTime  null,
  DATE_UPDATE        dateTime  null,
  primary key  (ID_COMMANDE)
) ENGINE=InnoDB;


create table electroChoix_db.COMMANDE_PRODUIT
(
  ID_COMMANDE_PRODUIT  int(10)                            not null AUTO_INCREMENT,
  ID_PRODUIT           int(10)                            null,
  ID_COMMANDE          int(10)                            null,
  QUANTITE             int(6)                            null,
  STATUT_DB int(1)   default 1,
  DATE_CREATION      dateTime  null,
  DATE_UPDATE        dateTime  null,
  primary key  (ID_COMMANDE_PRODUIT)
) ENGINE=InnoDB;


create table electroChoix_db.GALERIE
(
  ID_GALERIE           int(10)                            not null AUTO_INCREMENT,
  ID_PRODUIT           int(10)                            null,
  IMAGE                varchar(250)                        null,
  STATUT_DB int(1)   default 1,
  DATE_CREATION      dateTime  null,
  DATE_UPDATE        dateTime  null,
  primary key (ID_GALERIE)
) ENGINE=InnoDB;


create table electroChoix_db.MARQUE
(
  ID_MARQUE            int(10)                            not null AUTO_INCREMENT,
  INTITULE             varchar(50)                        null,
  STATUT_DB int(1)   default 1,
  DATE_CREATION      dateTime  null,
  DATE_UPDATE        dateTime  null,
  primary key (ID_MARQUE)
) ENGINE=InnoDB;


create table electroChoix_db.PRODUIT
(
  ID_PRODUIT           int(10)                            not null AUTO_INCREMENT,
  ID_CATEGORIE         int(10)                            null,
  ID_MARQUE            int(10)                            null,
  DESIGNATION          varchar(50)                        null,
  PRIX                 float                          null,
  QUANTITE_STOCK       int(6)                            null,
  TAUX_REMISE          int(2)                            null,
  DESCRIPTION          varchar(250)                        null,
  STATUT_DB int(1)   default 1,
  DATE_CREATION      dateTime  null,
  DATE_UPDATE        dateTime  null,
  etat_produit         varchar(50)                        null,
  primary key (ID_PRODUIT)
) ENGINE=InnoDB;


create table electroChoix_db.PRODUIT_PROPRIETE
(
  ID_PRODUIT_PROPRIETE int(10)                            not null AUTO_INCREMENT,
  ID_PRODUIT           int(10)                            null,
  ID_PROPRIETE         int(10)                            null,
  VALEUR               varchar(50)                        null,
  STATUT_DB int(1)   default 1,
  DATE_CREATION      dateTime  null,
  DATE_UPDATE        dateTime  null,
  primary key (ID_PRODUIT_PROPRIETE)
) ENGINE=InnoDB;


create table electroChoix_db.PROPRIETE
(
  ID_PROPRIETE         int(10)                            not null AUTO_INCREMENT,
  ID_CATEGORIE         int(10)                            null,
  LIBELLE              varchar(50)                        null,
  STATUT_DB int(1)   default 1,
  DATE_CREATION      dateTime  null,
  DATE_UPDATE        dateTime  null,
  constraint PK_PROPRIETE primary key clustered (ID_PROPRIETE)
) ENGINE=InnoDB;


--
-- Contenu de la table `categorie`
--

INSERT INTO `categorie` (`ID_CATEGORIE`, `LIBELLE`, `DESCRIPTION`) VALUES
  (1, 'Ordinateur portable', 'Ordinateur pensé pour être mobile. Contrairement à l''ordinateur fixe, il est composé d''un seul bloc. L''écran se replie sur le clavier pour le protéger et faciliter les déplacements.\n\n'),
  (2, 'Ordinateur bureau', 'C''est un ordinateur personnel destiné à être utilisé sur un bureau. Il peut être connecté en permanence à plusieurs périphériques comme un ou des écrans, clavier, souris, tablette graphique, ...\n\n'),
  (3, 'Smartphone', 'Téléphone mobile doté de fonctionnalités comme la navigation Web, la messagerie instantanée ou encore le GPS.'),
  (4, 'Tablette', 'Ordinateur portable dépourvu de clavier à touches et munis d''un écran tactile, de la même dimension qu''une feuille A4 ou plus petits. \n'),
  (5, 'Clé USB', 'Outils de stockage de données informatiques amovible et de capacité variable. De petite taille, la clé USB (pour Universal Serial Bus) se branche directement sur le port du même nom d''un ordinateur ou'),
  (6, 'Disque dur externe', 'Support de stockage magnétique d''une grande capacité.');

-- --------------------------------------------------------

--
-- Contenu de la table `galerie`
--

INSERT INTO `galerie` (`ID_GALERIE`, `ID_PRODUIT`, `IMAGE`) VALUES
  (1, 1, 'acer-predator-15-g9-591-71l2-1.jpg'),
  (2, 1, 'acer-predator-15-g9-591-71l2-2.jpg'),
  (3, 1, 'acer-predator-15-g9-591-71l2-3.jpg'),
  (4, 1, 'acer-predator-15-g9-591-71l2-4.jpg'),
  (5, 2, 'asus-zen-aio-s-z240icgt-1.jpg'),
  (6, 2, 'asus-zen-aio-s-z240icgt-2.jpg'),
  (7, 2, 'asus-zen-aio-s-z240icgt-3.jpg'),
  (8, 2, 'asus-zen-aio-s-z240icgt-4.jpg'),
  (9, 3, 'sony-xperia-c5-ultra-1.jpg'),
  (10, 3, 'sony-xperia-c5-ultra-2.jpg'),
  (11, 3, 'sony-xperia-c5-ultra-3.jpg'),
  (12, 3, 'sony-xperia-c5-ultra-4.jpg'),
  (13, 4, 'medion-lifetab-s10351-md-99666-1.jpg'),
  (14, 4, 'medion-lifetab-s10351-md-99666-2.jpg'),
  (15, 4, 'medion-lifetab-s10351-md-99666-3.jpg'),
  (16, 4, 'medion-lifetab-s10351-md-99666-4.jpg'),
  (17, 5, 'adam-elements-iklips-32-go-1.jpg'),
  (18, 5, 'adam-elements-iklips-32-go-2'),
  (19, 5, 'adam-elements-iklips-32-go-3.jpg'),
  (20, 5, 'adam-elements-iklips-32-go-4'),
  (21, 6, 'silicon-power-armor-a85-1-to-1.jpg'),
  (22, 6, 'silicon-power-armor-a85-1-to-2.jpg'),
  (23, 6, 'silicon-power-armor-a85-1-to-3.jpg'),
  (24, 7, 'toshiba-satellite-p50-c-186-1.jpg'),
  (25, 7, 'toshiba-satellite-p50-c-186-2.jpg'),
  (26, 7, 'toshiba-satellite-p50-c-186-3.jpg'),
  (27, 8, 'asus-zenfone-2-laser-ze500kl-1b189ww-1.jpg'),
  (28, 8, 'asus-zenfone-2-laser-ze500kl-1b189ww-2.jpg'),
  (29, 8, 'asus-zenfone-2-laser-ze500kl-1b189ww-3.jpg'),
  (30, 8, 'asus-zenfone-2-laser-ze500kl-1b189ww-4.jpg');

-- --------------------------------------------------------

--
-- Contenu de la table `marque`
--

INSERT INTO `marque` (`ID_MARQUE`, `INTITULE`) VALUES
  (1, 'Sony'),
  (2, 'Asus'),
  (3, 'Acer'),
  (4, 'Silicon Power'),
  (5, 'Adam Elements '),
  (6, 'Medion '),
  (7, 'Toshiba');

-- --------------------------------------------------------

--
-- Contenu de la table `produit`
--

INSERT INTO `produit` (`ID_PRODUIT`, `ID_CATEGORIE`, `ID_MARQUE`, `DESIGNATION`, `PRIX`, `QUANTITE_STOCK`, `TAUX_REMISE`, `DESCRIPTION`) VALUES
  (1, 1, 3, 'PREDATOR 15 (G9-591-71L2)', 1900, 20, 30, NULL),
  (2, 2, 2, 'ZEN AIO S (Z240ICGT-GJ130X)', 2500, 25, 40, NULL),
  (3, 1, 3, 'XPERIA C5 ULTRA', 399, 18, 10, NULL),
  (4, 4, 6, 'LIFETAB S10351 (MD 99666)', 229, 8, 30, NULL),
  (5, 5, 5, 'IKLIPS 32 GO', 79, 12, 45, NULL),
  (6, 6, 4, 'ARMOR A85 1 TO', 100, 50, 15, NULL),
  (7, 1, 7, 'SATELLITE P50-C-186', 900, 18, 10, NULL),
  (8, 3, 2, 'Zenfone 2 Laser (ZE500KL)', 169, 25, 40, NULL);

-- --------------------------------------------------------

--
-- Contenu de la table `propriete`
--

INSERT INTO `propriete` (`ID_PROPRIETE`, `ID_CATEGORIE`, `LIBELLE`) VALUES
  (1, 1, 'Processeur'),
  (2, 1, 'Fréquence du processeur(GHz)'),
  (3, 1, 'Quantité de mémoire vive'),
  (4, 1, 'Type de mémoire vive'),
  (5, 1, 'Capacité de stockage principal(Go)'),
  (6, 1, 'Type de stockage principal'),
  (7, 1, 'Interface de stockage principal'),
  (8, 1, 'Type de stockage secondaire'),
  (9, 1, 'Capacité de stockage secondaire (Go)'),
  (10, 1, ' Lecteur optique'),
  (11, 1, ' Type de lecteur optique'),
  (12, 1, 'Résolution WebCam'),
  (13, 2, 'Processeur'),
  (14, 2, 'Quantité de mémoire vive'),
  (15, 2, 'Type de mémoire vive'),
  (16, 2, 'Type de stockage principal'),
  (17, 2, 'Capacité de stockage principal (Go)'),
  (18, 2, 'Interface stockage principal'),
  (19, 2, 'Capacité de stockage secondaire (Go)'),
  (20, 2, 'Lecteur optique'),
  (21, 2, 'Type de lecteur optique'),
  (22, 2, 'Carte graphique dédiée'),
  (23, 2, 'Processeur graphique'),
  (24, 2, 'Quantité de mémoire graphique'),
  (25, 3, 'Système'),
  (26, 3, 'Interface utilisateur'),
  (27, 3, 'Processeur'),
  (28, 3, 'Nombre de coeurs'),
  (29, 3, 'Fréquence processeur'),
  (30, 3, 'Puce graphique'),
  (31, 3, 'Support cartes mémoire'),
  (32, 3, 'Type de cartes supportées'),
  (33, 3, 'Mémoire vive (RAM)'),
  (34, 3, 'Mémoire flash Libre (Mo)'),
  (35, 3, 'Indice DAS (W/kg)'),
  (36, 3, 'Double SIM'),
  (37, 4, 'Système'),
  (38, 4, 'Interface utilisateur'),
  (39, 4, 'Processeur'),
  (40, 4, 'Mémoire vive (Mo)'),
  (41, 4, 'Puce graphique'),
  (42, 4, 'Capacité de stockage disponible (Mo)'),
  (43, 4, 'Support cartes mémoire'),
  (44, 4, 'Type de cartes supportées'),
  (45, 5, 'Capacité'),
  (48, 5, 'Type de sécurité'),
  (49, 5, 'Norme USB'),
  (50, 5, 'Logiciels fournis'),
  (51, 5, 'Accessoires fournis'),
  (52, 5, 'Sécurité'),
  (53, 6, 'Format'),
  (54, 6, 'Capacité de stockage (Go)'),
  (55, 6, 'Vitesse de rotation'),
  (56, 6, 'Système de fichiers par défaut'),
  (57, 6, 'Logiciels fournis'),
  (58, 6, 'Accessoires fournis');

--
-- Contenu de la table `produit_propriete`
--

INSERT INTO `produit_propriete` (`ID_PRODUIT_PROPRIETE`, `ID_PRODUIT`, `ID_PROPRIETE`, `VALEUR`) VALUES
  (1, 1, 1, 'Intel Core i7 - 6700HQ'),
  (2, 1, 2, '2.60'),
  (3, 1, 3, '16 Go'),
  (4, 1, 4, 'DDR4'),
  (5, 1, 5, '128'),
  (6, 1, 6, 'SSD'),
  (7, 1, 7, 'M.2 + Serial ATA III'),
  (8, 1, 8, '7200tr/mn'),
  (9, 1, 9, '1000'),
  (10, 1, 10, 'Oui'),
  (11, 1, 11, 'DVD+/-RW DL'),
  (12, 1, 12, '0,9 Mpixels'),
  (13, 2, 13, 'Intel Core i7-6700T 2.8 GHz'),
  (14, 2, 14, '32 Go'),
  (16, 2, 15, 'DDR4'),
  (17, 2, 16, 'SSD'),
  (18, 2, 17, '512'),
  (19, 2, 18, 'M.2'),
  (20, 2, 19, '0'),
  (21, 2, 20, 'Non'),
  (22, 2, 21, 'Non'),
  (23, 2, 22, 'Oui'),
  (24, 2, 23, 'Nvidia GeForce GTX 960M'),
  (25, 2, 24, '4096 Mo dédiée'),
  (26, 3, 25, 'Android 5.0'),
  (27, 3, 26, 'Sony UX'),
  (28, 3, 27, 'MTK MT6752'),
  (29, 3, 28, '8'),
  (30, 3, 29, '1,7 GHz'),
  (31, 3, 30, 'ARM Mali T760'),
  (32, 3, 31, 'Oui'),
  (33, 3, 32, 'MicroSD, MicroSDHC et MicroSDXC'),
  (34, 3, 33, '2048 Mo'),
  (35, 3, 34, '16000'),
  (36, 3, 35, '0.62'),
  (37, 3, 36, 'Oui'),
  (38, 4, 37, 'Android 5.0'),
  (39, 4, 38, 'Non'),
  (40, 4, 39, 'MTK MT8735'),
  (41, 4, 40, '1024 Mo'),
  (42, 4, 41, 'ARM Mali T720 MP2'),
  (43, 4, 42, '10800'),
  (44, 4, 43, 'Oui'),
  (45, 4, 44, 'MicroSD, MicroSDHC et MicroSDXC'),
  (46, 5, 45, '32 Go'),
  (47, 5, 48, 'Non'),
  (48, 5, 49, '3.0'),
  (49, 5, 50, 'Non'),
  (50, 5, 51, 'Housse de transport'),
  (51, 5, 52, 'Non'),
  (52, 6, 53, '2,5 pouces'),
  (53, 6, 54, '1000'),
  (54, 6, 55, '5400tr/mn'),
  (55, 6, 56, 'FAT32'),
  (56, 6, 57, 'SP Widget et SP HDD Lock Utility (à télécharger)'),
  (57, 6, 58, 'Câble USB 3.0'),
  (58, 7, 1, 'Intel Core i7 - 6500U'),
  (59, 7, 2, '2.50'),
  (60, 7, 3, '8 Go'),
  (61, 7, 4, 'DDR3'),
  (62, 7, 5, '1000'),
  (63, 7, 6, '5400tr/mn'),
  (64, 7, 7, 'Serial ATA II'),
  (65, 7, 10, 'Oui'),
  (66, 7, 11, 'DVD+/-RW DL'),
  (67, 7, 12, '0,9 Mpixels'),
  (68, 8, 25, 'Android 5.0.2'),
  (69, 8, 26, 'ZenUI 2.0'),
  (70, 8, 27, 'Qualcomm Snapdragon 410'),
  (71, 8, 28, '4'),
  (72, 8, 29, '1,2 GHz'),
  (73, 8, 30, 'Qualcomm Adreno 306'),
  (74, 8, 31, 'Oui'),
  (75, 8, 32, 'MicroSD, MicroSDHC et MicroSDXC'),
  (76, 8, 33, '2048 Mo'),
  (77, 8, 34, '9930'),
  (78, 8, 35, '0.44'),
  (79, 8, 36, 'Oui');

-- --------------------------------------------------------


alter table electroChoix_db.COMMANDE
add constraint FK_COMMANDE_REFERENCE_CLIENT foreign key (ID_CLIENT)
references CLIENT (ID_CLIENT)
  on update restrict
  on delete restrict;

alter table electroChoix_db.COMMANDE_PRODUIT
add constraint FK_COMMANDE_REFERENCE_PRODUIT foreign key (ID_PRODUIT)
references PRODUIT (ID_PRODUIT)
  on update restrict
  on delete restrict;

alter table electroChoix_db.COMMANDE_PRODUIT
add constraint FK_COMMANDE_REFERENCE_COMMANDE foreign key (ID_COMMANDE)
references COMMANDE (ID_COMMANDE)
  on update restrict
  on delete restrict;

alter table electroChoix_db.GALERIE
add constraint FK_GALERIE_REFERENCE_PRODUIT foreign key (ID_PRODUIT)
references PRODUIT (ID_PRODUIT)
  on update restrict
  on delete restrict;

alter table electroChoix_db.PRODUIT
add constraint FK_PRODUIT_REFERENCE_MARQUE foreign key (ID_MARQUE)
references MARQUE (ID_MARQUE)
  on update restrict
  on delete restrict;

alter table electroChoix_db.PRODUIT
add constraint FK_PRODUIT_REFERENCE_CATEGORI foreign key (ID_CATEGORIE)
references CATEGORIE (ID_CATEGORIE)
  on update restrict
  on delete restrict;

alter table electroChoix_db.PRODUIT_PROPRIETE
add constraint FK_PRODUIT__REFERENCE_PRODUIT foreign key (ID_PRODUIT)
references PRODUIT (ID_PRODUIT)
  on update restrict
  on delete restrict;

alter table electroChoix_db.PRODUIT_PROPRIETE
add constraint FK_PRODUIT__REFERENCE_PROPRIET foreign key (ID_PROPRIETE)
references PROPRIETE (ID_PROPRIETE)
  on update restrict
  on delete restrict;

alter table electroChoix_db.PROPRIETE
add constraint FK_PROPRIET_REFERENCE_CATEGORI foreign key (ID_CATEGORIE)
references CATEGORIE (ID_CATEGORIE)
  on update restrict
  on delete restrict;