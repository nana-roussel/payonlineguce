pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
               cd C:\Users\tchanko\Downloads\Compressed\Katalon_Studio_Engine_Windows_64-8.0.5
katalonc -noSplash -runMode=console -projectPath="C:\Users\tchanko\git\payonlineguce\payonlineguce.prj" -retry=0 -testSuitePath="Test Suites/suite du test de fonctionnement" -executionProfile="default" -browserType="Chrome" -apiKey="babd032b-eac4-44aa-bd7c-7a6d76ed1fe1" --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}