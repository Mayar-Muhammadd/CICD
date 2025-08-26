node {
    stage('Checkout') {
        git branch: 'newbranch', url: 'https://github.com/Mayar-Muhammadd/CICD'
    }

    stage('Build') {
        sh 'mvn clean install'
    }

    stage('Test') {
        sh 'mvn test'
    }
}

