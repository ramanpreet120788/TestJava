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
                sh 'echo "HelloWOrld" '
               sh "docker --version"
               sh "docker build -t python-flasp-app ."
                
                 }
         }
         stage('Run')
         {
         steps
         {
          sh "docker run -d python-flasp-app -p 5000:5000"
         }
         }
     }
}
