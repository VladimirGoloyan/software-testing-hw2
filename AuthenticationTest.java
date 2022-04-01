


public class AuthenticationTest {

    @Test
    public void testValidateUserName1(){
        Boolean expected = true;
        Boolean actualResult = Authentication.validateUsername('someusername')
        Assert.asserEquals(expectedResult,actualResult);
    }

    @Test
    public void testValidateUserName2(){
        Boolean expected = false;
        Boolean actualResult = Authentication.validateUsername('wrong')
        Assert.asserEquals(expectedResult,actualResult);
    }

    @Test
    public void testValidatePassword1(){
        Boolean expectedResult = true;
        Boolean actualResult = Authentication.validatePassword("this is my password");
        Assert.asserEquals(expectedResult,actualResult);
    }

    @Test
    public void testValidatePassword2(){
        Boolean expectedResult = false;
        Boolean actualResult = Authentication.validatePassword("wr");
        Assert.asserEquals(expectedResult,actualResult);
    }

    @Test
    public void testValidateEmail1(){
        Boolean expectedResult = true;
        String actualResult = Authentication.validateEmail('someEmail@test.test');
        Assert.asserEquals(expectedResult,actualResult);
    }

    @Test
    public void testValidateEmail2(){
        Boolean expectedResult = false;
        String actualResult = Authentication.validateEmail('somewrongemail');
        Assert.asserEquals(expectedResult,actualResult);
    }

    @Test
    public void testValidateUser1(){
        Boolean expectedResult = true;
        String actualResult = Authentication.validateUser(Authentication.validateUsername('username'),Authentication.validatePassword('password'),Authentication.validateEmail('email@test.test'));
        Assert.asserEquals(expectedResult,actualResult);
    }

    @Test
    public void testValidateUser2(){
        Boolean expectedResult = false;
        String actualResult = Authentication.validateUser(Authentication.validateUsername('u'),Authentication.validatePassword('password'),Authentication.validateEmail('email'));
        Assert.asserEquals(expectedResult,actualResult);
    }
    
    @Test
    public void testValidateUser3(){
        Boolean expectedResult = false;
        String actualResult = Authentication.validateUser(Authentication.validateUsername('u'),Authentication.validatePassword('p'),Authentication.validateEmail('e'));
        Assert.asserEquals(expectedResult,actualResult);
    }
}
