pipeline {
    agent any

    stages{
        stage('Build') {
            when {
                branch 'main'
            }
            steps{
                echo 'building the appplication.....'
                script {
                    def test = 2+2>3 ? 'cool': 'not cool'
                    echo test
                }
            }

        }
        stage('Test') {
            when {
                branch 'main'
            }
            steps{
                echo 'testing the appplication.....'
            }

        }
        stage('Staging') {
            when {
                branch 'staging'
            }
            steps{
                echo 'deploying to staging the appplication.....'
            }

        }
        stage('Deploy') {
            when {
                branch 'production'
            }
            steps{
                echo 'deploying to production the appplication.....'
            }
        }
    }
    post{
        always{
            echo 'Always defines all outcome whether success, failure etc.'
        }
    }
}