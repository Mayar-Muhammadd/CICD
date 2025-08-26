node {
    stage('Checkout') {
        git 'https://github.com/Mayar-Muhammadd/CICD'
    }

    stage('Build') {
        sh 'mvn clean install'
    }

    stage('Test') {
        sh 'mvn test'
    }
}

