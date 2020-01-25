public class Main {

    public static void main(String[] args)
    {
       for(int a=0;a<=100;a++){

           for(int b=0;b<=100;b++){

               for(int c=0;c<=100;c++){

                   int sum=a+b+c;
                   if(sum==7){
                       System.out.println("when sum=7");
                       System.out.println("a="+a+"b="+b+"c="+c);
                       int sum2=(a*a)+(b*b)+(c*c);
                       System.out.println("sum2= "+sum2);
                       if(sum2==35){
                           System.out.println("when sum=35");
                           System.out.println("a= "+a+" b= "+b+" c= "+c);

                           int sum3=(a*a*a)+(b*b*b)+(c*c*c);
                           if (sum3==151){

                               System.out.println("when sum=151");
                               System.out.println("a="+a+"b="+b+"c="+c);
                           }

                       }

                   }

               }

           }

       }
    }
}
