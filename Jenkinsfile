@Library('docker') _

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
				bat "mvn clean install -DskipTests"
			}
		}

		stage('Test'){
			steps{
				bat "mvn test"
			}
		}
		stage('Dockerize'){
            steps {
                  script {
                        docker.build("jenkins-demo:${env.BUILD_NUMBER}", "-f Dockerfile .")
                        docker.image("jenkins-demo:${env.BUILD_NUMBER}").run("-p 6565:6565")
                         }
                  }
        }
	}
}
