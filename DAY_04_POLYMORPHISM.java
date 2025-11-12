class Ploy{
    void min (int a , int b){
        if (a<b){
            System.out.println(a);

        }
        else{
            System.out.println(b);
        }
    }
    void min  (int a , int b, int c){
        if (a<b){
            System.out.println(a);
        }
        else if (b<c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
}

class main{
    static void main(String[] args) {
        Ploy p = new Ploy();
        p.min(5,8,9);
        p.min(3,1);
    }
}