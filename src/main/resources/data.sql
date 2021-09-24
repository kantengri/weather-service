CREATE TABLE IF NOT EXISTS WEATHER_DATA (
    id BIGINT IDENTITY NOT NULL,
    date DATE,
    location_id BIGINT
);

CREATE TABLE IF NOT EXISTS LOCATION(
    id BIGINT IDENTITY NOT NULL,
    lat INT,
    lon INT,
    city VARCHAR(45),
    state VARCHAR(45)
);

CREATE TABLE IF NOT EXISTS WEATHER_DATA_TEMPERATURE (
    weather_data_id BIGINT IDENTITY NOT NULL,
    temperature DOUBLE
);
