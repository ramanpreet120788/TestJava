pipeline
  {
    agent any
    stages
    {
        stage('Build')
        {
                steps
                {    
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
