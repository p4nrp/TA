package Controller;

import Entity.AdminEntity;

import Model.Admin;
import View.LoginPage;
public class LoginController {
    public void redirect()
    {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }

    public boolean loginstep(String username, String password)
    {
        AdminEntity adminEntity = Admin.findusername(username);

        if (adminEntity != null) {
            if (adminEntity.getPassword().equals(password))
            {
                return true;
            }
        }

            return false;
    }
}
