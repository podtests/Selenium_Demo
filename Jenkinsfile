pipeline {
  agent { docker { image 'maven:3.3.3' } }  
  stages {
    stage("Build") {
      steps {
        echo "Build stage Done"        
        }
      }
     stage("test") {
      steps {
        sh 'mvn test'
        }
       }
   }
}
  
