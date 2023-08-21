INSERT INTO client (name) VALUES
        'John Smith',
		'Al`Pachino',
		'Cameron Diaz',
		'Donald Tramp',
		'James Bond',
		'Amanda Belushee',
		'Adriano Chelentano',
		'Alesandro DelPiero',
		'Manchester City',
		'Zoiberg',
		'Bender Iron Asss';

INSERT INTO planet (id, name) VALUES
    ('MARS','MARS'),
    ('VEN','VENUS'),
    ('EAR','EARTH'),
    ('SAT','SATURN'),
    ('URAN','URANUS');

INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES
('2022-12-31 23.59.59', 1, 'EAR', 'MARS'),
('2022-11-21 00.30.59', 2, 'EAR', 'URAN'),
('2022-01-25 21.30.59', 3, 'EAR', 'VEN'),
('2022-02-23 21.00.59', 4, 'EAR', 'VEN'),
('2023-02-22 19.00.59', 5, 'EAR', 'SAT'),
('2023-06-09 19.45.59', 6, 'EAR', 'VEN'),
('2023-07-10 15.45.59', 7, 'EAR', 'SAT'),
('2023-06-01 15.45.59', 8, 'EAR', 'SAT'),
('2023-05-21 11.30.59', 9, 'EAR', 'URAN'),
('2023-08-11 11.30.59', 10, 'EAR', 'URAN');