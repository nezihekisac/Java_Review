package com.review.streams.exercises;

import com.review.enums.Status;
import com.review.oop.inharitance.Project;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {


    public static void main(String[] args) {

        getListOfProject();

    }

    /*TODO 1:
     */
   public static List<Project> getListOfProject(){

      return  DataGenerator.getProjects().stream().collect(Collectors.toList());

    }



    /*TODO 2:
     */
   public static List<Project> getListOfProject(Status status){

       return DataGenerator.getProjects().stream().collect(Collectors.toList());

    }




     /*TODO 3:

   public static List<Project> getListOfProject(User manager){

    }

    */

    /*TODO 4:

   public static List<Project> getListOfProjectCode(String projectCode){

    }

    */


    /*TODO 5:

   public static List<User> getListOfUser(){

    }

    */


     /*TODO 6:

   public static User getUserByFirstName(String firstName){

    }

    */


    /*TODO 7:

   public static String getUserById(Long id){

    }

    */


    /*TODO 8:

   public static List<User> deleteUser(String firstName){  //delete one  user and return remaining users

    }

    */


     /*TODO 9:

   public static List<Project> updateProjectStatus(Status oldStatus, Status newStatus){

    }

    */


    /*TODO 10:

   public static List<Project> findProjectByManager(User manager){

    }

    */

    /*TODO 11: use period()> finding total days between given range

   public static Integer totalProjectDurationForManager(User manager){

    }

    */

     /*TODO 12:

   public static long findTotalMaleInCompany(){

    }

    */


}
