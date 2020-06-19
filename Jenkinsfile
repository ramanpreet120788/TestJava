pipeline
  {
    agent any
    stages
    {
      stage('Clone repository') 
      {
        steps
        {
	  checkout scm
        }
      }
	  
	  stage('Build') 
      {
        steps
        {
	  sh 'chmod 777'
	  sh "docker build -t python-flasp-app ."
        }
      }
	  
	  
	  
	  
     }
  }
