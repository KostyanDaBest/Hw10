public class Run {
    public static void main(String[] args) {

        Fignya fignya = new Fignya("Stuka", 1);
        Fignya fignya1 = new Fignya("Stuka1", 10);
        Fignya fignya2 = new Fignya("Stuka2", 100);

        User orUser = new User("Kirpich1", 10);
        User clUser = null;
        String cloneType = "deep";

        if (cloneType.equals("deep")) {
            clUser = new User(orUser.getName(), orUser.getId());
        } else if (cloneType.equals("shallow")) {
            clUser = (User) orUser.clone();
        }

            System.out.println("Original User: " + orUser);
            System.out.println("Cloned User: " + clUser);

            System.out.println(fignya1.toString());
            System.out.println(fignya2.equals(fignya1));
            System.out.println(fignya1.hashCode());
        }
    }


