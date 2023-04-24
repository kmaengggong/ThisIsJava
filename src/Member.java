package src;

public class Member {
    public String name;
    public String id;
    public String password;
    public int age;

    public Member(String name, String id){
        this.name = name;
        this.id = id;
    }

    public boolean login(String id, String password){
        if(id == "hong" && password == "12345") return true;
        else return false;
    }
    public void logout(String id){
        System.out.println(id + "님이 로그아웃 되었습니다");
    }
}
