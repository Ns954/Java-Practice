//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 class Main2 {
    int a = 10;
    static int b = 20;
    public static void main(String[] args) {
//        int x = 20;
//        String s = (x == 20) ? "yes Its 10" : "No its not 10";
//        System.out.println(s);
//        countDigit(78);
//    Ispalindrome(1221);
//        countViaLog(56478);
        primeNumber(26);
    }

    public static void countDigit(int num){
//        int count = (int)Math.log(num) + 1;
//        if(num == 0){
//            System.out.println("Power of any number is 0 = 1");
//        }
//        IsArmstrong();
//        System.out.println(count);

    }

    public static void reverseNumber(int num) {
      int res = 0;

      while(num > 0){
          int rem = num % 10;
           res =  res * 10 + rem ;
           num= num/10;
      }
      System.out.println(res);
    }

    public static void Ispalindrome(int num){
        int number = num;
        int reversedNumber = 0;
        while(num > 0){
            int mod = num % 10;
              reversedNumber = reversedNumber* 10 + mod;
              num = num/10;
        }
        if(reversedNumber == number){
            System.out.println("Palindrome number");
        }else{
            System.out.println("not Palindrome number");
        }
    }
    public static void countViaLog(int num){
        int res = (int)Math.log(num)+1;
        System.out.println(res);
    }
    public static  void primeNumber(int num){
        if(num == 0 || num == 1){
            System.out.println("Not a prime Number");
        }
        int sqrt = (int)Math.sqrt(num);
        int count = 2;
        while(count <= sqrt){
            if(num % count == 0 ){
               System.out.println(" not prime number");
               return;
            }
            count++;
        }
        System.out.println("prime number");
    }

}
