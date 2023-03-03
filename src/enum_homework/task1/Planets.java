package enum_homework.task1;

public enum Planets {
   MERCURY("Mercury" , 88){

      void toLowerCaseName(){
         System.out.println(name().toLowerCase());
      }


   }, VENUS("Venus" , 225){


      void toLowerCaseName(){
         System.out.println(name().toLowerCase());
      }
   }, EARTH("Earth" , 365){


      void toLowerCaseName(){
         System.out.println(name().toLowerCase());
      }
   }, MARS("Mars" , 687){


      void toLowerCaseName(){
         System.out.println(name().toLowerCase());
      }
   } , JUPITER("Jupiter" , 4333) {


      void toLowerCaseName(){
         System.out.println(name().toLowerCase());
      }
   }, SATURN("Saturn" , 10759) {

      void toLowerCaseName(){
         System.out.println(name().toLowerCase());
      }
   }, URANUS("Uranus" , 30687) {

      void toLowerCaseName(){
         System.out.println(name().toLowerCase());
      }
      }, NEPTUNE("Neptune" , 60200) {

      void toLowerCaseName(){
         System.out.println(getName().toLowerCase());
      }
   };

   void toLowerCaseName(){
      System.out.println(getName().toLowerCase());
   }

   private String name;
   private int yearLength;

   Planets(String name, int yearLength) {
      this.name = name;
      this.yearLength = yearLength;
   }

   public String getName() {
      return name;
   }

   public int getYearLength() {
      return yearLength;
   }

   public static void main(String[] args) {
       Planets S = Planets.MARS;
       System.out.println(S.name());
       System.out.println(S.yearLength);
   }
}
