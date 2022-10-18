package org.example;

    class polymorphism{
        private static final polymorphism lib = new polymorphism();
        private polymorphism(){}

        public static polymorphism getInstance(){
            return lib;
        }

        public int square(int a){
            return a*a;
        }
    }
    class SingletonPattern {

        public static void main(String[] args) {

//  userLibrary lb = new userLibrary(); cannot use this.

            polymorphism lib = polymorphism.getInstance();
            System.out.println(lib.square(5));
        }
    }

