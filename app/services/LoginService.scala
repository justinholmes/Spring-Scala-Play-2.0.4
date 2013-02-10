package services

import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired

@Service
class LoginServiceImpl extends LoginService{
  def login = true
}


trait LoginService {
    def login:Boolean
}