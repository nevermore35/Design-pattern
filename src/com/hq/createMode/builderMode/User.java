package com.hq.createMode.builderMode;

public class User {

    private String username;
    private String password;
    private int age;
    private String sex;

    private User(String username, String password, int age, String sex) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public static UserBuild builder(){
        return new UserBuild();
    }

    public static class UserBuild{
        private String username;
        private String password;
        private int age;
        private String sex;

        private UserBuild(){

        }
        public UserBuild username(String username){
            this.username = username;
            return this;
        }
        public UserBuild password(String password){
            this.password = password;
            return this;
        }
        public UserBuild age(int age){
            this.age = age;
            return this;
        }
        public UserBuild sex(String sex){
            this.sex = sex;
            return this;
        }
        public User build(){
            return new User(username,  password,  age,  sex);
        }
    }
}
