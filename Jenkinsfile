pipeline {
	agent any
	stages {
		stage('Build') {
			steps {
				checkout scm
				sh 'rm -f private.gradle'
				sh './gradlew setupCiWorkspace clean build'
				archive 'build/libs/*jar'
			}
		}
	}
}
