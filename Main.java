class Main {
  public static void main(String[] args) {
    System.out.println("Hello Carla!");
    for (int i=1; i<200; i++){
      if(i%5==0){
        System.out.println(i+" ist durch 5 teilbar.");
      }
      if(i%10==8){
        System.out.println(i+" endet auf 8.");
      }
      int j=i-1;
      int k=i+j;
      if((i+j)%3==0){
        System.out.println(i+" und "+j+" addiert ergibt "+k+", was durch 3 teilbar ist.");
      }
    }
  }
}