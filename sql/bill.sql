-- -- Bill Table
-- CREATE TABLE Bill (
--     bill_id INTEGER PRIMARY KEY AUTO_INCREMENT,
--     bill_number VARCHAR(50) NOT NULL,
--     bill_date DATE NOT NULL,
--     due_date DATE NOT NULL,
--     flat_number VARCHAR(10) NOT NULL,
--     name VARCHAR(100) NOT NULL,
--     period VARCHAR(50) NOT NULL,
--     total_amount DECIMAL(10, 2) NOT NULL,
--     amount_in_words VARCHAR(255) NOT NULL
-- );
-- -- Bill Details Table
-- CREATE TABLE Bill_Details (
--     detail_id INTEGER PRIMARY KEY AUTO_INCREMENT,
--     bill_id INTEGER NOT NULL,
--     line_number INTEGER NOT NULL,
--     description VARCHAR(255) NOT NULL,
--     amount DECIMAL(10, 2) NOT NULL,
--     FOREIGN KEY (bill_id) REFERENCES Bill(bill_id)
-- );
-- -- Insert Bill
-- INSERT INTO Bill (bill_number, bill_date, due_date, flat_number, name, period, total_amount, amount_in_words)
-- VALUES 
-- ('B001', '2024-06-01', '2024-06-30', 'A101', 'John Doe', 'June 2024', 1500.00, 'One Thousand Five Hundred');

-- -- Insert Bill Details
-- INSERT INTO Bill_Details (bill_id, line_number, description, amount)
-- VALUES 
-- (1, 1, 'Maintenance', 500.00),
-- (1, 2, 'Water Charges', 300.00),
-- (1, 3, 'Electricity', 200.00),
-- (1, 4, 'Parking', 100.00),
-- (1, 5, 'Miscellaneous', 400.00);

-- -- Select query to fetch bill details
-- SELECT 
--     b.bill_number,
--     b.bill_date,
--     b.flat_number,
--     b.due_date,
--     b.name,
--     b.period,
--     d.line_number,
--     d.description,
--     d.amount,
--     b.total_amount,
--     b.amount_in_words 
-- FROM 
--     Bill b
-- JOIN 
--     Bill_Details d ON b.bill_id = d.bill_id
-- WHERE 
--     b.bill_id = 1;  -- Replace with the specific bill_id or use a parameter for dynamic querying

CREATE TABLE `maintenanceBill` (
  `bill_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `bill_date` VARCHAR(50) NOT NULL,
  `userName` VARCHAR(50) NOT NULL,
  `flat_number` VARCHAR(4) NOT NULL,
  `due_date` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`bill_id`),
  CONSTRAINT `fk_userName` FOREIGN KEY (`userName`) REFERENCES `user`(`userName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;