class sample{
    int roll;
    String name;
    sample(int rnum , String nam ){
        System.out.println("THE CONSTRUCTED IS EXCUTED");
        roll = rnum;
        name = nam;
    }

    void display(){
        System.out.println(roll+" "+name);
    }
}

class setvalue{
    static void main(String[] args) {
        int roll = 22;
        String name = "NISHANTH";
        sample nis = new sample( roll , name);
        nis.display();

    }



}