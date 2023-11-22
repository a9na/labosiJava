import java.io.File;

public class DiskHierarchy {

    public static void displayDiskHierarchy(File directory, int level, int maxDepth) {
        if (level > maxDepth) {
            return;
        }

        File[] contents = directory.listFiles();

        if (contents != null) {
            for (File item : contents) {
                String itemName = item.getName();
                String itemType = item.isDirectory() ? "Directory" : "File";

                if (itemName.charAt(0) >= 'a' && itemName.charAt(0) <= 'n') {
                    itemName = Character.toUpperCase(itemName.charAt(0)) + itemName.substring(1);
                } else if (itemName.charAt(0) >= 'o' && itemName.charAt(0) <= 'z') {
                    itemName = itemName.toUpperCase();
                }

                System.out.println("  ".repeat(level) + itemType + ": " + itemName);

                if (item.isDirectory()) {
                    displayDiskHierarchy(item, level + 1, maxDepth);
                }
            }
        }
    }

    public static void main(String[] args) {
        String rootDirectory = "C:/";
        File root = new File(rootDirectory);
        int maxDepth = 3;

        if (root.exists() && root.isDirectory()) {
            System.out.println("Directory: " + root.getName());
            displayDiskHierarchy(root, 1, maxDepth);
        } else {
            System.out.println("Invalid root directory.");
        }
    }
}

