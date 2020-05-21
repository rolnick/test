#!/usr/bin/env groovy

folder('Examples') {
    displayName('Example Jobs')
    description('Folder for example jobs')
}

folder('DockerImages') {
    displayName('Docker Images')
    description('Folder for jobs baking Docker images')
}

folder('test') {
    displayName('test')
    description('Folder for example jobs')
}

multibranchPipelineJob("myjob") {
  branchSources {
    branchSource {
      source {
        bitbucket {
          credentialsId('bitbucket-login-user-pass')
          repoOwner('myteam')
          repository('myrepo')
        }
      }
    }
  }
}