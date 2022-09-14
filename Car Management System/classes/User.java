

package classes;
import java.lang.*;

    public abstract class User
    {
        protected String userName;
       
        protected String userNid;
        protected String userAddress;
        protected String userPhoneNo;

        public User(String userName, String userNid, String userAddress, String userPhoneNo) {
            this.userName = userName;
            this.userNid = userNid;
            this.userAddress = userAddress;
            this.userPhoneNo = userPhoneNo;
        }
		
		 public abstract void showDetails();

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }


        public String getUserNid() {
            return userNid;
        }

        public void setUserNid(String userNid) {
            this.userNid = userNid;
        }



        public String getUserAddress() {
            return userAddress;
        }

        public void setUserAddress(String userAddress) {
            this.userAddress = userAddress;
        }

        public String getUserPhoneNo() {
            return userPhoneNo;
        }

        public void setUserPhoneNo(String userPhoneNo) {
            this.userPhoneNo = userPhoneNo;
        }

       

    }
