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
			checkout scm
			sh "docker build -t python-flasp-app ."
        }
      }
	  
	  
	  
	  
     }
  }
