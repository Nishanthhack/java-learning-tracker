import org.w3c.dom.ls.LSOutput;

class heirachial{
    static void main() {
        uncle u  = new uncle();
        System.out.println(u.gender);

        mom m = new mom();
        System.out.println(m.gender);

    }

}

class grandfather2{
    char gender  = 'M';
}

class mom extends grandfather2{
    char gender  = 'F';

}

class uncle extends grandfather2{
    char gender  = 'M';
}