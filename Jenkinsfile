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
	  sh "docker build -t python-flasp-app ."
        }
      }
	  
	  
	  
	  
     }
  }
