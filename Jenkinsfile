pipeline {
    agent any 
    stages {
        stage("build") {
            steps {
                echo "i am done"
            }
        }
        stage ("test") {
            steps{
                mvn test
            }
        }
    }
}
