package org.design.creational_patterns.builder;

public class User {
    private String name;
    private int age;

    public User(Builder builder){
       name = builder.name;
       age = builder.age;
    }
  public static class Builder{
        private String name;
        private int age;

//        public Builder(String name, int age){
//            this.name = name;
//            this.age = age;
//        }

       public Builder name(String name) {
           this.name = name;
           return this;
       }
      public Builder age(int age) {
          this.age = age;
          return this;
      }
      public User build(){
            return new User(this);
      }
   }

    @Override
    public String toString() {
        return "Name: "+ name + ", Age: "+ age ;
    }
}
