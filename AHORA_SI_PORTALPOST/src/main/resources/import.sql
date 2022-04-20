-- SE CREAN LOS PERMISOS QUE PUEDE TENER UN USUARIO --
INSERT INTO operation (operation_id, operationname) VALUES (1, 'P2C');
INSERT INTO operation (operation_id, operationname) VALUES (2, 'C2P');

INSERT INTO role (role_id, role_name, role_description, createdat, modifiedat) VALUES(1, 'Admin', 'Usuario autorizado para realizar todas las operaciones', sysdate(), sysdate());
INSERT INTO role (role_id, role_name, role_description, createdat, modifiedat) VALUES(2, 'Usuario de Vueltos', 'Usuario solo para dar vueltos', sysdate(), sysdate());

INSERT INTO role_operation (role_id, operation_id) VALUES (1, 1);
INSERT INTO role_operation (role_id, operation_id) VALUES (1, 2);
INSERT INTO role_operation (role_id, operation_id) VALUES (2, 1);

-- SE CREA LA EMPRESA --
INSERT INTO business (business_id, rif, business_name, mail_business, createdat, modifiedat) VALUES(1, '264747178', 'Deverik_ORG', 'presidencia@deverik.com.ve', '2022-04-20', '2022-04-20');

-- SE CREAN LOS USUARIOS CON SU ROLE Y EMPRESA --
INSERT INTO user (user_id, identification, username, password, names, surnames, email, avatar, createdat, modifiedat, lastlogin, enabled, role_id, business_id) VALUES(1, '26474717', 'EPACHECOG', '$2a$10$C3Uln5uqnzx/GswADURJGOIdBqYrly9731fnwKDaUdBkt/M3qvtLq', 'Erikson Jeomar', 'Pacheco Gimenez', 'epachecog@gmail.com', 'upload/user/epachecog/imagen.png', '2018-01-01', '2018-01-01', '2018-01-01', true, 1, 1);
INSERT INTO user (user_id, identification, username, password, names, surnames, email, avatar, createdat, modifiedat, lastlogin, enabled, role_id, business_id) VALUES(2, '12345678', 'MARTINVEG', '$2a$10$RmdEsvEfhI7Rcm9f/uZXPebZVCcPC7ZXZwV51efAvMAp1rIaRAfPK', 'Martin von', 'Vega Martinez', 'Upamarvega@gmail.com', 'upload/user/chacrlon/otraimg.jpg', '2022-01-01', '2022-01-01', '2022-01-01', true, 1, 1);