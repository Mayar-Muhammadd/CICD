pipeline {
    agent any

    tools {
        maven 'Maven3'   // You must install Maven in Jenkins and name it "Maven3"
        jdk 'Java17'     // You must install JDK in Jenkins and name it "Java17"
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Archive') {
            steps {
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }
    }

    post {
        success {
            echo 'Build and tests completed successfully!'
        }
        failure {
            echo 'Build failed. Please check the logs.'
        }
    }
}
