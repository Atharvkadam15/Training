public class eh3 {
    public class invalidfundException extends Exception{
        public invalidfundException(String message ){
            super( message );

        }
    public static void main(String[] args) {
            try {
                int fund=0;
                if(fund<=0){
                    throw new invalidfundException("insufficient funds");
                }
            }
            catch (invalidfundException e){
                System.out.println(e.getMessage());
            }

    }
}



}
