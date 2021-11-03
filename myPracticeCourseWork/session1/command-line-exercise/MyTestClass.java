public class MyTestClass {

   public static void main(String[] args) {
      
       // this is a local comment which doesn't go in javadoc
       MyTestClass myTestClass = new MyTestClass();
       myTestClass.writeAboutMe();
        
   }

 /**
  * This is a javadoc comment on writeAboutMe
  *
  */
  public void writeAboutMe() {
         System.out.println("I am running the following java class: "+MyTestClass.class);
  }

}