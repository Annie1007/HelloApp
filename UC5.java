public class UC5 {
    public static void main(String[] args) {
        StringBuilder names = new StringBuilder();

        if (args.length == 0) {
            names.append("World");
        } else {
            for (int i = 0; i < args.length; i++) {
                names.append(args[i]);
                if (i < args.length - 1) {
                    names.append(", ");
                }
            }
        }

        System.out.println("Hello, " + names.toString() + "!");
    }
}