    class A{
        int x=67;
        void display(){
            System.out.println("The value of x: "+x);
        }
    }
    class B extends A{
        int x=76;
        void display(){
            System.out.println("Class B is being used, Value of x: "+x);
        }
    }

    class Override{
    public static void main(String args[]){
        A obj1 = new A();
        B obj2 = new B();
        obj1.display();
        obj2.display();

    }
}

