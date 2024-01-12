pipeline {
    agent any
    environment {
        NEW_VERSION = '1.1.0'
    }

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

                echo "cloning project with credintials..."
                withCredentials([usernameColonPassword(credentialsId: 'global', usernameVariable: 'USERNAME', passwordVariable: 'USERPASS')]) {
                            sh 'echo "username: $USERNAME password: $USERPASS"'
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
            echo "the build [version]: ${NEW_VERSION} | [jobID]: ${BUILD_ID} | [url]: ${BUILD_URL}"
        }
    }
}