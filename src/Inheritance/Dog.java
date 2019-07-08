    package Inheritance;

    public class Dog {
        String name;
        String breed;  // could be any breed like bulldog, labrador, german shepard etc
        int height; // in inches

        public Dog(String name, String breed, int height) {
            this.name = name;
            this.breed = breed;
            this.height = height;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }
        public static void bark(String name) {
            System.out.println(name+" dog barks loud");
        }
    }
