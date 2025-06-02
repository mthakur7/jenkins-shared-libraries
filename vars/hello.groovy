def call(String name){
  echo "Hello ${name}"
  sh "echo \"Hello ${name}\" >> hello.txt"
}
