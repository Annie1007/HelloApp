public class UC5 {
    public static void main(String[] args) {
        StringBuilder names = new StringBuilder();

        if (args.length == 0) {
            names.append("World");
        } else {
            boolean first = true;
            for (String arg : args) {
                if (!first) {
                    names.append(", ");
                }
                names.append(arg);
                first = false;
            }
        }

        System.out.println("Hello, " + names.toString() + "!");
    }
}