// PACKAGE
package com.example.employeeMangement.entity;

// IMPORTS
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity //An ANNOTATION which is used to create a table
@Table(name="employee_data") //An ANNOTATION which is used to give name to a table

public class Employee
{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(length = 50, nullable = false)
        private String firstName;

        @Column(length = 50, nullable = false)
        private String lastName;

        @Column(unique = true)
        private String email;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
        
        
}
