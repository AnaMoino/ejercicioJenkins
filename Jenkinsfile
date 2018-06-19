pipeline{
    agent any
    stages{
        stage('Compilacion'){
            steps{
                sh 'mvn clean package -DskipsTests'
            }
        }
        stage('Pruebas'){
            steps{
                sh 'mvn test'
            }
        }
        stage('Ejecutar:develop'){
            when{
                branch 'develop'
            }
            steps{
                sh 'java -jar target/ejercicioJenkins-1.0-SNAPSHOT.jar 2 2'
            }
        }
        stage('Ejecutar:master'){
            when{
                branch 'master'
            }
            steps{
                sh 'java -jar target/ejercicioJenkins-1.0-SNAPSHOT.jar 5 5'
            }
        }
    }
}
