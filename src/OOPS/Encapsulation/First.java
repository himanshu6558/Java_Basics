package OOPS.Encapsulation;

public class First {

    public static void main(String[] args) {

        ABC abc = new ABC("him","p123");
        System.out.println(abc.getUsername());
        System.out.println(abc.getPassword());
        abc.setPassword("p234");
        abc.setUsername("himan");
        System.out.println(abc.getUsername());
        System.out.println(abc.getPassword());
    }
}

class ABC{
    private String username;
    private String password;

    ABC(String username, String password){
        this. username = username;
        this.password = password;
    }

    void setUsername(String username){
        this.username = username;
    }
    void setPassword(String password){
        this.password = password;
    }
    String getUsername(){
        return username;
    }
    String getPassword(){
        return password;
    }
}
