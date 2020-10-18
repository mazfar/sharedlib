def call(String name = 'human') {
   command = "git clone " + name

def execute_state=sh(returnStdout: true, script: command)
    //echo "Hello, ${name}."
}
