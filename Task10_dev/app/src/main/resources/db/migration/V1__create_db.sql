CREATE TABLE IF NOT EXISTS client (
    id IDENTITY PRIMARY KEY,
    name VARCHAR(200) NOT NULL CHECK (length(name) >= 3)
);

CREATE TABLE IF NOT EXISTS planet (
    id VARCHAR PRIMARY KEY,
    name VARCHAR(500) NOT NULL
);

CREATE TABLE IF NOT EXISTS ticket(
	ticket_id IDENTITY PRIMARY KEY,
	created_at TIMESTAMP,
	client_id BIGINT REFERENCES client(id) ON DELETE CASCADE,
	from_planet_id VARCHAR REFERENCES planet(id) ON DELETE CASCADE,
	to_planet_id VARCHAR REFERENCES planet(id) ON DELETE CASCADE
);