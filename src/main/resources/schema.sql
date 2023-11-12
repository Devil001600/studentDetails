create table student_details (
    enrollment_id VARCHAR(07) PRIMARY KEY,
    first_name VARCHAR(50),
    middle_name VARCHAR(50),
    last_name VARCHAR(50),
    class VARCHAR(4),
    date_of_birth DATE,
	status VARCHAR(9)
);

alter table student_details
add constraint checkStatus check (status in ('active', 'suspended', 'expelled', 'graduated'));