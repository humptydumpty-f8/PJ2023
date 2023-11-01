package lec7;

/**
 * Клас як тип і модуль одночасно
 */
public class StudentV1 {
    final static String UNIVERSITY_NAME="Igor Sikorsky Kyiv Polytechnic Institute";
    final  String DEPARTMENT="Institute of Nuclear and Thermal Energy";

    String fullName;
    String group;
    static int counter;

    /*початок блоку ініціалізатора*/
    {
        System.out.println("\tУвага! Створений екземпляр Student #" + (counter+1));
        fullName = "so-and-so";
        group = "undefined";
    }
    /*кінець блоку ініціалізатора*/

    /*початок блоку статичного ініціалізатора*/
    static{
        System.out.println("\tУвага! Розпочато роботу з класом Student!");
        counter = 10;
        }
    /*кінець блоку статичного ініціалізатора*/


    StudentV1(){
        ++counter;
    }
    StudentV1(String fullName){
        this.fullName=fullName;
        ++counter;
    }

    StudentV1(String fullName, String group){
        this.fullName=fullName;
        this.group=group;
        ++counter;
    }
    void getInfo(){

        System.out.printf("%s \t %s \t %d \n", fullName,group,counter);
    }
    static void printUnivName(){

        System.out.printf("%s%n", UNIVERSITY_NAME);
    }

    protected void finalize() throws Throwable
    {
        System.out.println(fullName + " destroyed");
    }

}
