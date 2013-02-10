import Global.Global
import org.specs2.mutable.Specification

@ContextConfiguration(locations = { "classpath:/path/to/root-config.xml" })
class LoginUnitTest extends Specification{
  "" should {
    "" in {

      Global.loginService.login mustEqual  true
      1 mustEqual 1
    }
  }

}
