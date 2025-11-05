public class Die {
    private int n;
    public Die(int n){
        this.n = n;
    }
    public int dieThrow(){
        return (int)(Math.random()*this.n)+1;
    }
    public static void main(String[] args) {
        Die a = new Die(4);
        System.out.println(a.dieThrow());
    }
}
