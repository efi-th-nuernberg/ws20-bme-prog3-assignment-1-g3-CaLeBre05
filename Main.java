class Main {
  public static void main(String[] args) {
    for (int i=1; i<200; i++){
      checkIfDividablyByFife(i);
      checkIfLastDigitEight(i);
      checkIfNumberAndPreviousDividablyByThree(i);
    }
  }

  private static void checkIfDividablyByFife(int i){
    if(i%5==0){
      System.out.println(i+" ist durch 5 teilbar.");
    }
  }

  private static void checkIfLastDigitEight(int i){
    if(i%10==8){
      System.out.println(i+" endet auf 8.");
    }
  }

  private static void checkIfNumberAndPreviousDividablyByThree(int i){
    int j=i-1;
    int k=i+j;
    if((i+j)%3==0){
      System.out.println(i+" und "+j+" addiert ergibt "+k+", was durch 3 teilbar ist.");
    }
  }
}