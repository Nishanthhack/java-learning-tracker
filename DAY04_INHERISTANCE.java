import org.w3c.dom.ls.LSOutput;

class animal {
    int nolegs = 4 ;

    void eat(){
        System.out.println("animal eating");
    }
}

class dog extends animal {
    boolean bark = true;
}

class call{
    static void main(String[] args) {
        animal deep = new animal();
        System.out.println(deep.nolegs);
        deep.eat();

        dog dogs = new dog();
        System.out.println(dogs.nolegs);
        dogs.eat();
        System.out.println(dogs.bark);

    }

}