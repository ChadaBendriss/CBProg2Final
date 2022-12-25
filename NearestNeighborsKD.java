//First Name: Chada
//Last Name: Bendriss
//Student nember: 300266679

import java.util.ArrayList;
import java.util.List;

//Une instance de KDtree sera embarquée dans cette classe. Le constructeur de
//NearestNeighborsKD va créer une instance de cet arbre and y ajoutera tous les points 
public class NearestNeighborsKD {
    private List<Point3D>pts;
    private KDtree kdtree;

    //Permet de recevoir une liste des points
    //Constructeur de la classe NearestNeighborsKD
    public NearestNeighborsKD(List<Point3D>pts){
        this.pts=pts;
        kdtree= new KDtree();
        List<Point3D>ListN=new ArrayList<Point3D>();
        for(Point3D p: pts){
            kdtree.add(p);

        }

    }
    //La recherche des voisins dans le k-d tree
    private void rangeQuery(Point3D p, double eps,List<Point3D>Ne, KDtree.KDnode node ){
        //Verifie si le noeud est null
        if(node==null){
            return;
        }
        //Comparaison de la distance entre deux points
        if(p.distance(node.getPt())<eps){
            Ne.add(node.getPt());
     
        }

        if(p.get(node.getAxis())-eps <= node.getValue()){
            rangeQuery(p, eps, Ne, node.getLeft());

        }
        if(p.get(node.getAxis())+ eps>node.getValue()){
            rangeQuery(p, eps, Ne, node.getRight());
            
        }
        

    }
    //La recherche des voisins dans le k-d tree sera fait par la méthode suivante (appelée par la
    //méthode rangeQuery originale)
    public List<Point3D> rangeQuery(Point3D p, double eps){
        List<Point3D>N=new ArrayList<Point3D>();
        rangeQuery(p,eps,N,kdtree.getRoot());
        return N;
        

    }
    
}
