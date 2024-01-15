def gv = this

pipeline {
    agent any
    environment {
        NEW_VERSION = '1.1.0'
    }

    stages{
        stage('Init') {
            steps {
                script{
                    gv = load 'script.groovy'
                }
            }
        }

        stage('Build') {
            when {
                branch 'main'
            }
            steps{              
                script {
                    gv.buildApp()
                }
            }

        }
        stage('Test') {
            when {
                branch 'main'
            }
            steps{
                script {
                    gv.testApp()
                }
            }

        }
        stage('Staging') {
            when {
                branch 'staging'
            }
            steps{
                script {
                    gv.stageApp()
                }                
            }

        }
        stage('Deploy') {
            when {
                branch 'production'
            }
            steps{
                script {
                    gv.deployApp()
                }
            }
        }
    }
    post{
        always{
            echo 'Always defines all outcome whether success, failure etc.'
            echo "the build [version]: ${NEW_VERSION} | [jobID]: ${BUILD_ID} | [url]: ${BUILD_URL}"
        }
    }
}