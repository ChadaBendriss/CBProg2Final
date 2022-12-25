//First Name: Chada
//Last Name: Bendriss
//Student nember: 300266679


import java.util.List;
import java.util.ArrayList;

import java.io.*;  
import java.util.Scanner;  

public class Exp2 {
  
  // reads a csv file of 3D points (rethrow exceptions!)
  public static List<Point3D> read(String filename) throws Exception {
	  
    List<Point3D> points= new ArrayList<Point3D>(); 
	double x,y,z;
	
	Scanner sc = new Scanner(new File(filename));  
	// sets the delimiter pattern to be , or \n \r
	sc.useDelimiter(",|\n|\r");  

	// skipping the first line x y z
	sc.next(); sc.next(); sc.next();
	
	// read points
	while (sc.hasNext())  
	{  
		x= Double.parseDouble(sc.next());
		y= Double.parseDouble(sc.next());
		z= Double.parseDouble(sc.next());
		points.add(new Point3D(x,y,z));  
	}   
	
	sc.close();  //closes the scanner  
	
	return points;
  }
 

  
  public static void main(String[] args) throws Exception {  
  
      // // not reading args[0]
      // double eps= 0.05;
      
      //   // reads the csv file
      // List<Point3D> points= Exp2.read("Point_Cloud_1.csv");
      // long dureelin=0;
      
      // for(int i=0;i<points.size();i=i+10){
      //       Point3D query= points.get(i);
      //       // creates the NearestNeighbor instance
      //       NearestNeighbors nn= new NearestNeighbors(points);
      //       long startTime = System.nanoTime();
      //       List<Point3D> neighbors= nn.rangeQuery(query,eps);
      //       long endTime = System.nanoTime();
      //       long duration = (endTime - startTime);
      //       dureelin=dureelin+duration;
      //       //System.out.println("number of neighbors= "+neighbors.size());
      //       //System.out.println(neighbors);
      // }
      // double averagelin=0;
      // double diviseurlin=points.size()/10;
      // averagelin=dureelin/diviseurlin;
      // System.out.println("Average time for rangeQuery for file Point_Cloud_1: "+ averagelin);
      
      // System.out.println("time required for rangeQuery for file Point_Cloud_1 in nanoseconds: "+ dureelin);
      
      // long dureekd=0;
      
      // for(int i=0;i<points.size();i=i+10){
      //       Point3D query= points.get(i);
      //       // creates the NearestNeighbor instance
      //       NearestNeighborsKD nnKD= new NearestNeighborsKD(points);
      //       long startTimekd = System.nanoTime();
      //       List<Point3D> neighborsKD= nnKD.rangeQuery(query,eps);
      //       long endTimekd = System.nanoTime();
      //       long durationkd = (endTimekd - startTimekd);
      //       dureekd=dureekd+durationkd;
            

      //       //System.out.println("number of neighbors= "+neighborsKD.size());
      //       //System.out.println(neighborsKD);
      // }
      // double averagekd=0;
      // double diviseurkd=points.size()/10;
      // averagekd=dureekd/diviseurkd;
      // System.out.println("Average time for rangeQueryKD for file Point_Cloud_1:"+ averagekd);
      // System.out.println("time required for rangeQueryKD for file Point_Cloud_1 in nanoseconds: "+ dureekd);
      

      // List<Point3D> points2= Exp2.read("Point_Cloud_2.csv");
      // long dureelin2=0;
      
      // for(int i=0;i<points2.size();i=i+10){
      //       Point3D query= points2.get(i);
      //       // creates the NearestNeighbor instance
      //       NearestNeighbors nn= new NearestNeighbors(points2);
      //       long startTime = System.nanoTime();
      //       List<Point3D> neighbors= nn.rangeQuery(query,eps);
      //       long endTime = System.nanoTime();
      //       long duration = (endTime - startTime);
      //       dureelin2=dureelin2+duration;
      //       //System.out.println("number of neighbors= "+neighbors.size());
      //       //System.out.println(neighbors);
      // }
      // double averagelin2=0;
      // double diviseurlin2=points2.size()/10;
      // averagelin2=dureelin2/diviseurlin2;
      // System.out.println("Average time for rangeQuery for file Point_Cloud_2: "+ averagelin2);
      // System.out.println("time required for rangeQuery for file Point_Cloud_2 in nanoseconds: "+ dureelin2);
      
      // long dureekd2=0;
      // for(int i=0;i<points2.size();i=i+10){
      //       Point3D query= points2.get(i);
      //       // creates the NearestNeighbor instance
      //       NearestNeighborsKD nnKD= new NearestNeighborsKD(points2);
      //       long startTimekd = System.nanoTime();
      //       List<Point3D> neighborsKD= nnKD.rangeQuery(query,eps);
      //       long endTimekd = System.nanoTime();
      //       long durationkd = (endTimekd - startTimekd);
      //       dureekd2=dureekd2+durationkd;
      //       //System.out.println("number of neighbors= "+neighborsKD.size());
      //       //System.out.println(neighborsKD);
      // }
      // double averageKD2=0;
      // double diviseurKD2=points2.size()/10;
      // averageKD2=dureekd2/diviseurKD2;
      // System.out.println("Average time for rangeQueryKD for file Point_Cloud_2: "+ averageKD2);
      // System.out.println("time required for rangeQueryKD for file Point_Cloud_2 in nanoseconds: "+ dureekd2);

      // List<Point3D> points3= Exp2.read("Point_Cloud_3.csv");
      // long dureelin3=0;
      
      // for(int i=0;i<points3.size();i=i+10){
      //       Point3D query= points3.get(i);
      //       // creates the NearestNeighbor instance
      //       NearestNeighbors nn= new NearestNeighbors(points3);
      //       long startTime = System.nanoTime();
      //       List<Point3D> neighbors= nn.rangeQuery(query,eps);
      //       long endTime = System.nanoTime();
      //       long duration = (endTime - startTime);
      //       dureelin3=dureelin3+duration;
      //       //System.out.println("number of neighbors= "+neighbors.size());
      //       //System.out.println(neighbors);
      // }
      // double averagelin3=0;
      // double diviseurlin3=points3.size()/10;
      // averagelin3=dureelin3/diviseurlin3;
      // System.out.println("Average time for rangeQuery for file Point_Cloud_3: "+ averagelin3);
      // System.out.println("time required for rangeQuery for file Point_Cloud_3 in nanoseconds: "+ dureelin3);
      
      // long dureekd3=0;
      // for(int i=0;i<points3.size();i=i+10){
      //       Point3D query= points3.get(i);
      //       // creates the NearestNeighbor instance
      //       NearestNeighborsKD nnKD= new NearestNeighborsKD(points3);
      //       long startTimekd = System.nanoTime();
      //       List<Point3D> neighborsKD= nnKD.rangeQuery(query,eps);
      //       long endTimekd = System.nanoTime();
      //       long durationkd = (endTimekd - startTimekd);
      //       dureekd3=dureekd3+durationkd;
      //       //System.out.println("number of neighbors= "+neighborsKD.size());
      //       //System.out.println(neighborsKD);
      // }
      // double averageKD3=0;
      // double diviseurKD3=points3.size()/10;
      // averageKD3=dureekd3/diviseurKD3;
      // System.out.println("Average time for rangeQuery for file Point_Cloud_3: "+ averageKD3);
      // System.out.println("time required for rangeQueryKD for file Point_Cloud_3 in nanoseconds: "+ dureekd3);
      

       
    
      //GENERAL
      //Prendre les valeurs des arguments
      String methodspecific=args[0];
      //Convertir la valeur en double
      double eps22= Double.parseDouble(args[1]);
      //Lire le fichier csv
      List<Point3D> points22= Exp2.read(args[2]);
      int step= Integer.parseInt(args[3]);
       
      //Si le choix est la méthode lin
      if(methodspecific.equals("lin")){
        long totalLin=0;
        for(int i=0;i<points22.size();i=i+step){
          Point3D query= points22.get(i);
          NearestNeighbors nn= new NearestNeighbors(points22);
          long startTimelin = System.nanoTime();
          List<Point3D> neighbors= nn.rangeQuery(query,eps22);
          long endTimelin = System.nanoTime();
          long durationlin = (endTimelin - startTimelin);
          totalLin=totalLin+durationlin;
          //System.out.println("number of neighbors= "+neighbors.size());
          //System.out.println(neighbors);
        }
        //La moyenne est calculée en divisant le temps total par le nombre de point testés.
        double averagelinG=0;
        double diviseurlinG=points22.size()/step;
        averagelinG=totalLin/diviseurlinG;
        System.out.println("Average time: "+ averagelinG);
        System.out.println("time required for rangeQuery in nanoseconds: "+ totalLin);
        

      }//Si le choix est la méthode kd
      else if(methodspecific.equals("kd")){
        long totalKd=0;
        for(int i=0;i<points22.size();i=i+step){
          Point3D query= points22.get(i);
          NearestNeighborsKD nKD= new NearestNeighborsKD(points22);
          long startTime2 = System.nanoTime();
          List<Point3D> neighborsKD= nKD.rangeQuery(query,eps22);
          long endTime2 = System.nanoTime();
          long durationkdF = (endTime2 - startTime2);
          totalKd=totalKd+durationkdF;
          //System.out.println("number of neighbors= "+neighborsKD.size());
          //System.out.println(neighborsKD);
        }
        //La moyenne est calculée en divisant le temps total par le nombre de point testés.
        double averageKDG=0;
        double diviseurKDG=points22.size()/step;
        averageKDG=totalKd/diviseurKDG;
        System.out.println("Average time: "+ averageKDG);
        System.out.println("time required for rangeQueryKD in nanoseconds: "+ totalKd);
        
        //Si le choix n'a pas été fait correctement
      }else{
        System.out.println("choose either lin or kd method");
      }
    
 
    }

	
}

