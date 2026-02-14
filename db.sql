Create database SKFARTS;
USE SKFARTS;
CREATE TABLE users (
    Name VARCHAR(20) NOT NULL,
    Email VARCHAR(20) NOT NULL UNIQUE,
    Dob DATE NOT NULL,
    Gender ENUM('Male', 'Female', 'Other') NOT NULL,
    Phoneno VARCHAR(9) NOT NULL UNIQUE,
    Username VARCHAR(10) NOT NULL UNIQUE,
    password VARCHAR(8) NOT NULL
);
alter table users modify Phoneno varchar(10);
INSERT into users (Name,Email,Dob,Gender,Phoneno,Username,Password)values('Harini','admin@gmail.com','Female','9500655522','Admin','ad@123');
Select * from users;
alter table users drop column Dob;
INSERT into users (Name,Email,Gender,Phoneno,Username,Password)values('Harini','admin@gmail.com','Female','9500655522','Admin','ad@123');
select * from users;
commit;
select * from users;
ALTER TABLE users ADD COLUMN role VARCHAR(20) DEFAULT 'Employee';
UPDATE users SET role = 'Manager' WHERE username = 'Admin';
SELECT * FROM USERS;
commit;
USE SKFARTS;
select * from users;
select * from users;
commit;
delete from users where password='ram123';
DELETE FROM users WHERE password = 'sow@91';
SET SQL_SAFE_UPDATES = 0;
DELETE FROM users WHERE password = 'ram123';
SET SQL_SAFE_UPDATES = 1;
commit;
DELETE FROM users WHERE password = 'sow@91';
SET SQL_SAFE_UPDATES = 0;
DELETE FROM users WHERE password = 'jokl90';
SET SQL_SAFE_UPDATES = 0;
CREATE TABLE supplier (
         sid INT PRIMARY KEY,
         sname VARCHAR(15)UNIQUE NOT NULL,
         contact BIGINT UNIQUE NOT NULL,
         remail VARCHAR(15) UNIQUE NOT NULL,
         address VARCHAR(20) NOT NULL
     );
drop table supplier;
CREATE TABLE resources (
    rid INT PRIMARY KEY,
    rname VARCHAR(15) NOT NULL,
    rtype VARCHAR(12) NOT NULL,
    rquantity INT CHECK (rquantity >= 0),
    unit INT NOT NULL,
    sname VARCHAR(15),
    FOREIGN KEY (sname) REFERENCES supplier(sname) ON DELETE SET NULL
);
CREATE TABLE employees (
         eid INT PRIMARY KEY,
         ename VARCHAR(15) NOT NULL,
         role VARCHAR(12) NOT NULL,
		 contact BIGINT UNIQUE NOT NULL
     );
drop table resources;
CREATE TABLE resources (
    rid INT PRIMARY KEY,
    rname VARCHAR(15) NOT NULL,
    rtype VARCHAR(12) NOT NULL,
    rquantity INT CHECK (rquantity >= 0),
    unit INT NOT NULL,
    purchase_date DATE NOT NULL,
    sname VARCHAR(15),
    FOREIGN KEY (sname) REFERENCES supplier(sname) ON DELETE SET NULL
);
ALTER TABLE employees 
MODIFY eid INT AUTO_INCREMENT;
ALTER TABLE employees
MODIFY role VARCHAR(30) NOT NULL;
INSERT INTO supplier (sid, sname, contact, remail, address) 
VALUES (1, 'Ram', 9876543210, 'ram@supplier.com', 'No.12, Anna Nagar, Chennai');
INSERT INTO supplier (sid, sname, contact, remail, address) 
VALUES (2, 'Anita', 9123456780, 'anita@supplies.in', '45 Gandhi Street, Coimbatore');
INSERT INTO supplier (sid, sname, contact, remail, address) 
VALUES (3, 'Kumar', 9988776655, 'kumar@rawmats.org', '3rd Cross Road, Madurai');
INSERT INTO supplier (sid, sname, contact, remail, address) 
VALUES (4, 'Meena', 9090909090, 'meena@supplyhub.net', '7-A Rockfort Area, Trichy');
INSERT INTO supplier (sid, sname, contact, remail, address) 
VALUES (5, 'Vishal', 9012345678, 'vishal@inkpress.com', '22 North Main Road, Erode');
ALTER TABLE supplier
MODIFY remail VARCHAR(30),
MODIFY address VARCHAR(50);
select *from resources;
select *from employees;
drop table employees;
select * from users;
CREATE TABLE machine (
         mid INT PRIMARY KEY,
         name VARCHAR(15) NOT NULL,
      type VARCHAR(15) NOT NULL,
     status VARCHAR(12) CHECK (status IN ('Active', 'Inactive', 'Maintenance')));
CREATE TABLE scoring (
           rid INT NOT NULL,
          scoringdate DATE NOT NULL,
         outputquantity INT CHECK (outputquantity >= 0),
         PRIMARY KEY (rid),
        FOREIGN KEY (rid) REFERENCES resources(rid) ON DELETE CASCADE);
CREATE TABLE laminating (
		 id INT AUTO_INCREMENT PRIMARY KEY,
		 rid INT NOT NULL,
         mid VARCHAR(10) NULL,
         laminationdate DATE NOT NULL,
         outputquantity INT CHECK (outputquantity >= 0),
         UNIQUE (rid, mid),
         FOREIGN KEY (rid) REFERENCES resources(rid) ON DELETE CASCADE,
		 FOREIGN KEY (mid) REFERENCES machine(mid) ON DELETE SET NULL);
CREATE TABLE designtype (
        designtypeid INT PRIMARY KEY,
       typename VARCHAR(20) NOT NULL UNIQUE
   );
   CREATE TABLE designing (
		 did INT PRIMARY KEY,
         softwareused VARCHAR(20) NOT NULL,
         projectname VARCHAR(20) NOT NULL,
         creationdate DATE NOT NULL,
         designtypeid INT NOT NULL,
         FOREIGN KEY (designtypeid) REFERENCES designtype(designtypeid) ON DELETE CASCADE
    );
    commit;
INSERT INTO designtype (designtypeid, typename) VALUES (1, 'Logo Design');
INSERT INTO designtype (designtypeid, typename) VALUES (2, 'Brochure');
INSERT INTO designtype (designtypeid, typename) VALUES (3, 'Poster');
INSERT INTO designtype (designtypeid, typename) VALUES (4, 'Business Card');
INSERT INTO designtype (designtypeid, typename) VALUES (5, 'Social Media Post');
INSERT INTO designtype (designtypeid, typename) VALUES (6, 'Flyer');
INSERT INTO designtype (designtypeid, typename) VALUES (7, 'Infographic');
INSERT INTO designtype (designtypeid, typename) VALUES (8, 'Banner');
INSERT INTO designtype (designtypeid, typename) VALUES (9, 'Invitation');
INSERT INTO designtype (designtypeid, typename) VALUES (10, 'Magazine Layout');
select *from machine;
select *from scoring;
ALTER TABLE machine MODIFY mid VARCHAR(10);
ALTER TABLE machine MODIFY mid VARCHAR(10);
ALTER TABLE laminating MODIFY mid VARCHAR(10);
drop table laminating;
SELECT * FROM laminating;
SELECT * FROM machine WHERE mid = 'AB01';
ALTER TABLE laminating DROP FOREIGN KEY laminating_ibfk_2;
ALTER TABLE machine MODIFY mid VARCHAR(10);
ALTER TABLE laminating MODIFY mid VARCHAR(10);
SELECT * FROM designtype;
DELIMITER $$
CREATE PROCEDURE GetLowStockResources()
BEGIN
    SELECT r.rid, r.rname, r.rquantity, s.sname, s.contact,
           CASE 
               WHEN r.rquantity <= 5 THEN 'Low Stock Warning'
               ELSE ''
           END AS error_message,
           CASE 
               WHEN r.rquantity <= 5 THEN 'Order ASAP'
               ELSE 'Sufficient'
           END AS order_details
    FROM resources r
    JOIN supplier s ON r.sname = s.sname;
END$$
DELIMITER ;
commit;
select *from scoring;
ALTER TABLE laminating ADD COLUMN mid VARCHAR(20);
DESCRIBE laminating;
DROP TABLE MACHINE;
DELIMITER //

CREATE PROCEDURE update_resource (
    IN p_rid INT,
    IN p_rname VARCHAR(100),
    IN p_rquantity INT,
    IN p_purchase_date DATE,
    IN p_sname VARCHAR(100),
    IN p_rtype VARCHAR(50)
)
BEGIN
    UPDATE resources
    SET rname = p_rname,
        rquantity = p_rquantity,
        purchase_date = p_purchase_date,
        sname = p_sname,
        rtype = p_rtype
    WHERE rid = p_rid;
END //
DELIMITER ;
select *from designing;
Create database Onlinecertificates;
use Onlinecertificates;
CREATE TABLE Students (
    ID INT PRIMARY KEY,
    Name VARCHAR(100),
    Department VARCHAR(50),
    Year INT,
    Email VARCHAR(100),
    RegisterNo VARCHAR(30),
    DOB DATE,
    Fees DECIMAL(10,2)
);
CREATE TABLE Principal (
    Name VARCHAR(100) PRIMARY KEY
);
CREATE TABLE Staff (
    StaffID INT PRIMARY KEY,
    Name VARCHAR(100),
    PrincipalName VARCHAR(100),
    FOREIGN KEY (PrincipalName) REFERENCES Principal(Name)
);
CREATE TABLE Payment (
    PaymentID INT PRIMARY KEY,
    Mode VARCHAR(50),
    DoneOrNot ENUM('Done', 'Not')
);
CREATE TABLE BonafideCertificate (
    BonID INT PRIMARY KEY,
    Template TEXT,
    Reason VARCHAR(255),
    Amount DECIMAL(10,2)
);
CREATE TABLE TransferCertificate (
    TCID INT PRIMARY KEY,
    Template TEXT,
    Reason VARCHAR(255),
    Amount DECIMAL(10,2)
);
CREATE TABLE ConductCertificate (
    CCID INT PRIMARY KEY,
    Template TEXT,
    Performance VARCHAR(255),
    Amount DECIMAL(10,2)
);
CREATE TABLE Certificate (
    CertID INT PRIMARY KEY AUTO_INCREMENT,
    ID INT,
    BonID INT,
    TCID INT,
    CCID INT,
    StaffID INT,
    PaymentID INT,
    DateIssued DATE,

    FOREIGN KEY (ID) REFERENCES Students(ID),
    FOREIGN KEY (BonID) REFERENCES BonafideCertificate(BonID),
    FOREIGN KEY (TCID) REFERENCES TransferCertificate(TCID),
    FOREIGN KEY (CCID) REFERENCES ConductCertificate(CCID),
    FOREIGN KEY (StaffID) REFERENCES Staff(StaffID),
    FOREIGN KEY (PaymentID) REFERENCES Payment(PaymentID)
);
Create database msdn;
use msdn;
CREATE TABLE datasets (
    dataset_id INT PRIMARY KEY,
    size INT,
    features VARCHAR(255),
    labels VARCHAR(255)
);

CREATE TABLE models (
    model_id INT PRIMARY KEY,
    model_type VARCHAR(100),
    trained_on INT,
    duplicate_flag TINYINT(1),
    FOREIGN KEY (trained_on) REFERENCES datasets(dataset_id)
);

CREATE TABLE command_centers (
    center_id INT PRIMARY KEY,
    request_time DATETIME,
    aggregated_votes INT
);

CREATE TABLE controllers (
    controller_id INT PRIMARY KEY,
    local_dataset_id INT,
    local_model_id INT,
    error_set VARCHAR(255),
    vote_list VARCHAR(255),
    status VARCHAR(50),
    center_id INT,
    FOREIGN KEY (center_id) REFERENCES command_centers(center_id)
);

CREATE TABLE votes (
    vote_id INT PRIMARY KEY,
    voter_id INT,
    suspect_id INT,
    vote_time DATETIME,
    center_id INT,
    FOREIGN KEY (center_id) REFERENCES command_centers(center_id),
    FOREIGN KEY (voter_id) REFERENCES controllers(controller_id),
    FOREIGN KEY (suspect_id) REFERENCES controllers(controller_id)
);

CREATE TABLE topologies (
    topology_id INT PRIMARY KEY,
    num_hosts INT,
    num_switches INT,
    controller_id INT,
    FOREIGN KEY (controller_id) REFERENCES controllers(controller_id)
);

CREATE TABLE devices (
    device_id INT PRIMARY KEY,
    device_type VARCHAR(100),
    port_stats VARCHAR(255),
    topology_id INT,
    FOREIGN KEY (topology_id) REFERENCES topologies(topology_id)
);

CREATE TABLE samples (
    sample_id INT PRIMARY KEY,
    features VARCHAR(255),
    label VARCHAR(255),
    dataset_id INT,
    FOREIGN KEY (dataset_id) REFERENCES datasets(dataset_id)
);

CREATE TABLE errors (
    error_id INT PRIMARY KEY,
    source_model_id INT,
    dest_controller_id INT,
    error_value FLOAT,
    computation_time FLOAT,
    controller_id INT,
    FOREIGN KEY (controller_id) REFERENCES controllers(controller_id),
    FOREIGN KEY (source_model_id) REFERENCES models(model_id),
    FOREIGN KEY (dest_controller_id) REFERENCES controllers(controller_id)
);

CREATE TABLE attack_params (
    theta FLOAT,
    detection_scale FLOAT,
    num_compromised INT,
    controller_id INT,
    model_id INT,
    PRIMARY KEY (theta, controller_id, model_id),
    FOREIGN KEY (controller_id) REFERENCES controllers(controller_id),
    FOREIGN KEY (model_id) REFERENCES models(model_id)
);

CREATE TABLE controller_model_transfers (
    controller_id INT,
    model_id INT,
    PRIMARY KEY (controller_id, model_id),
    FOREIGN KEY (controller_id) REFERENCES controllers(controller_id),
    FOREIGN KEY (model_id) REFERENCES models(model_id)
);



