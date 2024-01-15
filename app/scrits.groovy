

def buildApp(){
    echo "building the application"
    echo "cloning project with credintials..."
    withCredentials([usernamePassword(credentialsId: 'global', usernameVariable: 'USERNAME', passwordVariable: 'USERPASS')]) {
        sh 'echo "username: $USERNAME password: $USERPASS"'
    }
}

def testApp(){
    echo 'testing the appplication.....'
}

def stageApp(){
    echo 'deploying to staging the appplication.....'
}

def deployApp(){
    echo 'deploying to production the appplication.....'
}

return this