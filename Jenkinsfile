pipeline {
  agent any
  tools {
    maven 'maven'
  }
  stages {
    stage("Build") {
      steps {
        echo "Build stage Done"
        echo "M2_HOME = ${M2_HOME}"
        }
      }
     stage("test") {
      steps {
        sh 'mvn test'
        }
       }
   }
}
  
