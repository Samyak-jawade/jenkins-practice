pipeline   {
    agent any 
        stages{
            stage ('Pull') {
                steps {
                     git changelog: false, poll: false, url: 'https://github.com/Samyak-jawade/studentapp.ui.git'
                     echo "pull done"
                }
            }
            stage ('Build') {
                steps {
                    sh '/opt/apache-3.9.6/bin/mvn clean package'
                     echo "build done"
                }
            }
            stage ('Test') {
                steps {
                     echo "test done"
                }
            } 
            stage ('Quality-Test') {
                steps {
                     echo "Quality-check done"
                }
            }
            stage ('Depoly') {
                steps {
                     echo "depoly done"
                }
            }                                   
        }
    
}