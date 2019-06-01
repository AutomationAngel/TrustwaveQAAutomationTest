public class CreateNewMerchant {

    public static void main(String[] args) {


        //Test1 create user
        TrustwaveLogin.loginMain();
        TrustwaveCreateNewMerchant.createNewMerchant();
        TrustwaveLogout.logoutMain();


        //Test2 search for newly created user
        TrustwaveLogin.loginMain();
        TrustwaveCustomerSearch.customerSearch();
        TrustwaveLogout.logoutMain();




    }
}
