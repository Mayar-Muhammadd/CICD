@Library('my-shared-lib') _   

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "Building..."
            }
        }

        stage('Use Shared Library') {
            steps {
                script {
                    def numbers = bounds(1, 5)   // calling your function from vars/bounds.groovy
                    echo "Generated numbers: ${numbers}"
                }
            }
        }
    }
}
