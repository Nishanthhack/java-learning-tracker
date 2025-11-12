import org.w3c.dom.ls.LSOutput;

class Multilevel{
    static void main() {
    son s = new son();
        System.out.println(s.gender);
        s.print();
        mother m = new mother();
        System.out.println(m.gender);
        m.print();
    }

}


class grandfather{
    char gender  = 'M';
    public static void print(){
        System.out.println("The grandparent class");
    }
}

class mother extends grandfather{

    public static void print() {
        System.out.println("The parent class");
    }
}

class son extends mother{
    char gender  = 'F';
}