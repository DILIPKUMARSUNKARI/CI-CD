def downloadGitCode(gitLink){
  git '${gitLink}'
}

def shellCommand(command){
  sh '${command}'
}

def deployToServer(credentialsId,path,privateIP,contextPath,artifactPath){
  deploy adapters: [tomcat9(credentialsId: '${credentialsId}', path: '${path}', url: '${privateIP}')], contextPath: '${contextPath}', war: '${artifactPath}'
}
