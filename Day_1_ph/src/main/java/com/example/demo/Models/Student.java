package com.example.demo.Models;

public class Student {
        public String studentName;
        public String message;
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(String studentName, String message) {
			super();
			this.studentName = studentName;
			this.message = message;
		}
        
}
