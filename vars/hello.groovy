def call(String name){
  echo "Hello ${name}"
  sh 'echo "hi welcome to ubuntu ${name}" >> hello.txt'
}
