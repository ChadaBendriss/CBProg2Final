//First Name: Chada
//Last Name: Bendriss
//Student nember: 300266679


//La classe KDtree contient la classe KDnode
//Classe KDtree
public class KDtree {

    private static final int DIM = 3;
    private KDnode root;
    private int size;
    
    //Constructeur 
    public KDtree(){
        root=null;
        
    }
    //L’insertion dans un arbre se fait comme pour un arbre 
    //binaire de recherche sauf que la valeur utilisée 
    //pour la division alterne entre les différentes
    //coordonnées de niveau en niveau.
    private KDnode insert(Point3D p, KDnode node2, int axis2) {
        if(node2==null){
            node2 = new KDnode(p, axis2);
            //size++;
            //System.out.println("node is null");
        }else if(p.get(axis2) <= node2.getValue()){
        
            node2.left=insert(p,node2.getLeft(),(axis2+1)% DIM);
        }else{
           
            node2.right  = insert(p,node2.getRight(),(axis2+1) % DIM);
        }

        if(root==null){
            root = node2;
            
        }
        return node2;
    }
    //Ajouter le nouveau point
    public void add(Point3D p) {
        
        this.insert(p,root, 0);

    }
    //Retourne la racine
    public KDnode getRoot() {
        return this.root;
    }
    public class KDnode {

        // le Point3D associé à ce noeud
        // l’axe de division (x, y, or z) representé par les entiers 0, 1 or 2
        // la valeur de division (la valeur de la coordonnée de l’axe de division)
        // référence au noeud du sous-arbre de gauche (ou null)
        // référence au noeud du sous-arbre de droite (ou null)
        public Point3D pt;
        public int axis;
        public double value;
        public KDnode left;
        public KDnode right;
    
        public KDnode(Point3D pt, int axis){
            this.pt=pt;
            this.axis=axis;
            this.value=pt.get(axis);
            left=right=null;
    
        }
        //Retourne le point
        public Point3D getPt(){
            return pt;
    
        }
        //Retourne la valeur de l'axe
        public int getAxis(){
            return axis;
        }
        //Retourne la valeur
        public double getValue(){
            return value;
        }
        //Retourne la valeur a gauche
        public KDnode getLeft(){
            return left;
        }
        //Retourne la valeur à droite
        public KDnode getRight(){
            return right;
        }
        
    
        
    }
    //retourne la taille 
    public int size() {
        return size;
    }
  


    
}
