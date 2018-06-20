pipeline{
    agent any
    stages{
        stage('Compilacion'){
            steps{
                bat 'mvn clean package -DskipsTests'
            }
        }
        stage('Pruebas'){
            steps{
                bat 'mvn test'
            }
        }
        stage('Ejecutar:develop'){
            when{
                branch 'develop'
            }
            steps{
                bat 'java -jar target/jenkins-1.0-SNAPSHOT.jar 2 2'
            }
        }
        stage('Ejecutar:master'){
            when{
                branch 'master'
            }
            steps{
                bat 'java -jar target/jenkins-1.0-SNAPSHOT.jar 5 5'
            }
        }
    }
}
