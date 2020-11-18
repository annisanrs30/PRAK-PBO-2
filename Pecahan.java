public class Pecahan {
    public int pembilang;
    public int penyebut;

    public int getpembilang() {
     return pembilang;  
    }

    public int getpenyebut() {
     return penyebut;   
    }

    Pecahan(int pembilang, int penyebut) {
        this.penyebut = penyebut; 
        this.pembilang = pembilang; 
      }

    public Pecahan tambah(Pecahan p){
      int data1, data2; Pecahan d1;
      d1 = p;       data1 = p.penyebut;    data2 = p.pembilang;

      Pecahan d2 = new Pecahan(5,6);
      System.out.print("objek2 : ");     System.out.print(+d2.getpembilang());
      System.out.print("/"); System.out.print(+d2.getpenyebut());
      System.out.println();
      p.penyebut = data1 * d2.penyebut;
      p.pembilang = d2.penyebut*data2 + data1*d2.pembilang;
      return p;    
    }

  public static void main(String [] args)
    {
        Pecahan p;
        int x, y;
        Pecahan d1 = new Pecahan(3,2);
        System.out.print("objek1 : ");
        System.out.print(+d1.getpembilang());
        System.out.print("/");
        System.out.print(+d1.getpenyebut());
        System.out.println();
        //pecahan hasil = new pecahan(x, y);
        p = d1.tambah(d1);
        x = p.pembilang;
        y = p.penyebut;
        System.out.print( "hasil : " +x);
        System.out.print("/");
        System.out.print(+y);
        System.out.println();
       }
      }