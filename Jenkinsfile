pipeline {
	agent any

	environment {
		mavenHome = tool 'maven-3.6.3'
	}

	tools {
		jdk 'java 11'
	}

	stages {

		stage('Build'){
			steps {
				sh "mvn clean install -DskipTests"
			}
		}

		stage('Test'){
			steps{
				sh "mvn test"
			}
		}
	}
}
