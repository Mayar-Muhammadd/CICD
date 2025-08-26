@Library('my-shared-lib') _

pipeline {
    agent any

    parameters {
        string(name: 'START', defaultValue: '1', description: 'Start number')
        string(name: 'END', defaultValue: '5', description: 'End number')
    }

    stages {
        stage('Build') {
            steps {
                echo "Building..."
            }
        }

        stage('Use Shared Library') {
            steps {
                script {
                    def numbers = bounds(params.START.toInteger(), params.END.toInteger())
                    echo "Generated numbers: ${numbers}"
                }
            }
        }

        stage('Parallel Stages') {
            parallel {
                stage('Job 1') {
                    steps {
                        echo "Running job 1"
                    }
                }
                stage('Job 2') {
                    steps {
                        echo "Running job 2"
                    }
                }
            }
        }
    }
}

