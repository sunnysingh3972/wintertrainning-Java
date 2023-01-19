public class output {


        class grandparent{
            static{
                System.out.println("static-grandparent");
            }

            {
                System.out.println("instance-grandparent");
            }
            public grandparent(){
                System.out.println("constructor grandparent");
            }
        }

        class parent extends grandparent{
            {
                System.out.println("instance-parent");
            }
            public parent(){
                System.out.println("constructor parent");
            }
            static{
                System.out.println("static-parent");
            }

        }

        class child extends parent{
            {
                System.out.println("instance-child");
            }
            public child(){
                System.out.println("constructor-child");
            }
            static{
                System.out.println("static-child");
            }

        }
    public static void main(String[] args) {
//            child c= new child();
}
}
