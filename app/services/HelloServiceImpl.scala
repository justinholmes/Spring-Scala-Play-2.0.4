package services

@org.springframework.stereotype.Service
class HelloServiceImpl extends HelloService {
  var string = "hello world"
  def hello: String = string
  def setHello(s:String) = string = s
}
