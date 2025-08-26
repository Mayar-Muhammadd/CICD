node {
    stage('Checkout') {
        git branch: 'main', url: 'https://github.com/Mayar-Muhammadd/CICD'
    }

    stage('Build') {
        // Use Maven to build
        withMaven(maven: 'Maven3', jdk: 'Java17') {
            sh 'mvn clean install'
        }
    }

    stage('Test') {
        withMaven(maven: 'Maven3', jdk: 'Java17') {
            sh 'mvn test'
        }
    }

    stage('Deploy') {
        echo "Deploy stage (can be extended later)"
    }
}
