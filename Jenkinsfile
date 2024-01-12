pipeline {
    agent any

    stages{
        stage('Build') {
            steps{
                echo 'building the appplication.....'
                script {
                    def test = 2+2>3 ? 'cool': 'not cool'
                    echo test
                }
            }

        }
        stage('Test') {
            steps{
                echo 'testing the appplication.....'
                l
            }

        }
        stage('Deploy') {
            steps{
                echo 'depploying the appplication.....'
            }

        }
    }
}