public class day02W_SWITCHCASE {
    static void main() {
        char a = 'A';
        switch (a)
        {
            case 'O':
                System.out.println("ON-DUTY");
                break;
            case 'P':
                System.out.println("Present");
                break;
            case 'A':
                System.out.println("Absent");
                break;
            default:
                System.out.println("INVALID");


        }

    }
}