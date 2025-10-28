// def call(String repoUrl, String branch = 'main', String credentialsId = null) {
//      def script = this

//     script.echo "Checking out ${repoUrl} on branch ${branch}..."

//     script.git branch: branch,
//                  credentialsId: credentialsId,
//                  url: repoUrl
// }

def call(Map stageParams) {

    checkout(
        scmGit(
            branches: [[name:  stageParams.branch ]],
            userRemoteConfigs: [[ url: stageParams.url ]]
        )
    )
}