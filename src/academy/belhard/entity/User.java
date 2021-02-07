package academy.belhard.entity;

public class User extends Person{
        private String email; private String password;
        User(String firstName,String lastName,String email, String password){
            super(firstName,lastName);this.email=email;this.password=password;
        }
        public String getFullInfo(){
            return getFullName()+"\n"+this.email;
        }
        public boolean isPasswordCorrect(String password){
            if(this.password.equals(password)){return true;}else{return false;}
        }
}
