//First Name: Chada
//Last Name: Bendriss
//Student nember: 300266679

/*
 * Incomplete Experiment 1 
 *
 * CSI2510 Algorithmes et Structures de Donnees
 * www.uottawa.ca
 *
 * Robert Laganiere, 2022
 *
*/ 

import java.util.List;
import java.util.ArrayList;

import java.io.*;  
import java.util.Scanner;  

public class Exp1 {
  
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
  public static void save (String filename, List<Point3D>NeighboursP) throws IOException{
    
	File file = new File(filename);
	FileWriter fw = new FileWriter(file);
	PrintWriter pw = new PrintWriter(fw);
	for(int i=0; i<NeighboursP.size();i++){
		pw.println(NeighboursP.get(i).toString());

	}
	
	pw.flush();
	pw.close();
	


  }
  
  public static void main(String[] args) throws Exception {  
  
    // // not reading args[0]
	// double eps= 0.05;
  
    // // reads the csv file
    // List<Point3D> points= Exp1.read("Point_Cloud_1.csv");
	// //System.out.println(points.get(1).getX());
	
	// Point3D query= new Point3D(Double.parseDouble("-5.429850155"),
	// 							Double.parseDouble( "0.807567048"),
	// 							Double.parseDouble("-0.398216823"));
	
	// //creates the NearestNeighbor instance
	// NearestNeighbors nn= new NearestNeighbors(points);
	// List<Point3D> neighbors= nn.rangeQuery(query,eps);
	
	// System.out.println("number of neighbors= "+neighbors.size());
	// System.out.println(neighbors);
	// save("pt1_lin.txt",neighbors);
 

	// //creates the NearestNeighbor instance with kd method
	// NearestNeighborsKD nKD= new NearestNeighborsKD(points);
	// List<Point3D> neighborsKD= nKD.rangeQuery(query,eps);
	
	// System.out.println("number of neighbors= "+neighborsKD.size());
	// System.out.println(neighborsKD);
	// save("pt1_kd.txt",neighborsKD);
	

	// //Second point

	// Point3D query2= new Point3D(Double.parseDouble("-12.97637373"),
	// 							Double.parseDouble( "5.09061138"),
	// 							Double.parseDouble("0.762238889"));
	
	// // creates the NearestNeighbor instance
	// NearestNeighbors nn2= new NearestNeighbors(points);
	// List<Point3D> neighbors2= nn2.rangeQuery(query2,eps);
	
	// System.out.println("number of neighbors= "+neighbors2.size());
	// System.out.println(neighbors2);
	// save("pt2_lin.txt",neighbors2);


    // //creates the NearestNeighbor instance with kd method
	// NearestNeighborsKD nKD2= new NearestNeighborsKD(points);
	// List<Point3D> neighborsKD2= nKD2.rangeQuery(query2,eps);
	
	// System.out.println("number of neighbors= "+neighborsKD2.size());
	// System.out.println(neighborsKD2);
	// save("pt2_kd.txt",neighborsKD2);

	// // //Third point
	// Point3D query3= new Point3D(Double.parseDouble("-36.10818686"),
	// 							Double.parseDouble( "14.2416184"),
	// 							Double.parseDouble("4.293473762"));
	
	// // creates the NearestNeighbor instance
	// NearestNeighbors nn3= new NearestNeighbors(points);
	// List<Point3D> neighbors3= nn3.rangeQuery(query3,eps);
	
	// System.out.println("number of neighbors= "+neighbors3.size());
	// System.out.println(neighbors3);
	// save("pt3_lin.txt",neighbors3);


    // //creates the NearestNeighbor instance with kd method
	// NearestNeighborsKD nKD3= new NearestNeighborsKD(points);
	// List<Point3D> neighborsKD3= nKD3.rangeQuery(query3,eps);
	
	// System.out.println("number of neighbors= "+neighborsKD3.size());
	// System.out.println(neighborsKD3);
	// save("pt3_kd.txt",neighborsKD3);


	// // // Fourth point
	
	// Point3D query4= new Point3D(Double.parseDouble("3.107437007"),
	// 							Double.parseDouble( "0.032869335"),
	// 							Double.parseDouble("0.428397562"));
	
	// // creates the NearestNeighbor instance
	// NearestNeighbors nn4= new NearestNeighbors(points);
	// List<Point3D> neighbors4= nn4.rangeQuery(query4,eps);
	
	// System.out.println("number of neighbors= "+neighbors4.size());
	// System.out.println(neighbors4);
	// save("pt4_lin.txt",neighbors4);


    // //creates the NearestNeighbor instance with kd method
	// NearestNeighborsKD nKD4= new NearestNeighborsKD(points);
	// List<Point3D> neighborsKD4= nKD4.rangeQuery(query4,eps);
	
	// System.out.println("number of neighbors= "+neighborsKD4.size());
	// System.out.println(neighborsKD4);
	// save("pt4_kd.txt",neighborsKD4);

	// // //Fivth point

	// Point3D query5= new Point3D(Double.parseDouble("11.58047393"),
	// 							Double.parseDouble( "2.990601868"),
	// 							Double.parseDouble("1.865463342"));
	
	// // creates the NearestNeighbor instance
	// NearestNeighbors nn5= new NearestNeighbors(points);
	// List<Point3D> neighbors5= nn5.rangeQuery(query5,eps);
	
	// System.out.println("number of neighbors= "+neighbors5.size());
	// System.out.println(neighbors5);
	// save("pt5_lin.txt",neighbors5);


	// //creates the NearestNeighbor instance with kd method
	// NearestNeighborsKD nKD5= new NearestNeighborsKD(points);
	// List<Point3D> neighborsKD5= nKD5.rangeQuery(query5,eps);
	
	// System.out.println("number of neighbors= "+neighborsKD5.size());
	// System.out.println(neighborsKD5);
	// save("pt5_kd.txt",neighborsKD5);

	// // //Sixth point
	// Point3D query6= new Point3D(Double.parseDouble("14.15982089"),
	// 							Double.parseDouble( "4.680702457"),
	// 							Double.parseDouble("-0.133791584"));
	
	// // creates the NearestNeighbor instance
	// NearestNeighbors nn6= new NearestNeighbors(points);
	// List<Point3D> neighbors6= nn6.rangeQuery(query6,eps);
	
	// System.out.println("number of neighbors= "+neighbors6.size());
	// System.out.println(neighbors6);
	// save("pt6_lin.txt",neighbors6);


    // //creates the NearestNeighbor instance with kd method
	// NearestNeighborsKD nKD6= new NearestNeighborsKD(points);
	// List<Point3D> neighborsKD6= nKD6.rangeQuery(query6,eps);
	
	// System.out.println("number of neighbors= "+neighborsKD6.size());
	// System.out.println(neighborsKD6);
	// save("pt6_kd.txt",neighborsKD6);

    // Genaral 
	
    String methodspecific=args[0];
	System.out.println(methodspecific);
	System.out.println(args[0]);

	double eps22= Double.parseDouble(args[1]);
  
    // // reads the csv file
    List<Point3D> points22= Exp1.read(args[2]);
	
	Point3D query22= new Point3D(Double.parseDouble(args[3]),
								Double.parseDouble( args[4]),
								Double.parseDouble(args[5]));

	// creates the NearestNeighbor instance with lin method
	if(args[0].equals("lin")){
		NearestNeighbors nn22= new NearestNeighbors(points22);
		List<Point3D> neighbors22= nn22.rangeQuery(query22,eps22);
		
		System.out.println("number of neighbors= "+neighbors22.size());
		System.out.println(neighbors22);
		save("pt_lin.txt",neighbors22);

    //creates the NearestNeighbor instance with kd method
	}else if(args[0].equals("kd")){
		NearestNeighborsKD nKD22= new NearestNeighborsKD(points22);
		List<Point3D> neighborsKD22= nKD22.rangeQuery(query22,eps22);
		
		System.out.println("number of neighbors= "+neighborsKD22.size());
		System.out.println(neighborsKD22);
		save("pt_kd.txt",neighborsKD22);

	}else{
		System.out.println("choose either one of these methods : lin or kd");
	}



	

	





	


	
  }   
}
