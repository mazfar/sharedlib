def cleanoldbuddy() {
  properties([
    buildDiscarder(logRotator(numToKeepStr: '5'))
  ])
}
