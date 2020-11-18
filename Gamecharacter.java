public class gamecharacter {
    private String name;
    private int lifePoint = 100;
    private int attackHitPoint;
    private int attackKickPoint;

public String getname () {
    return name;
}

public void setname(String name) {
    this.name = name;
}

public int getlifePoint() {
    return lifePoint;
}
    
public void setlifePoint(int lifePoint) {
this.lifePoint = lifePoint;
}

public int getattackHitPoint() {
    return attackHitPoint;
}
    
public void setattackHitPoint(int attackHitPoint) {
this.attackHitPoint = attackHitPoint;
}

public int getattackKickPoint() {
    return attackKickPoint;
}
    
public void setattackKickPoint(int attackKickPoint) {
this.attackKickPoint = attackKickPoint;
}

public gamecharacter(String name, int attackHitPoint, int attackKickPoint) {
    this.name = name;
    this.attackHitPoint = attackHitPoint;
    this.attackKickPoint = attackKickPoint;
}

void Hit(gamecharacter lawan, int attackHitpoint) {
   this.attackHitPoint -= attackHitpoint;
   System.out.println(this.name + "Memukul" + lawan.name + "Dengan Kekuatan" + attackHitPoint);

   if(lifePoint >= attackHitPoint){
       lifePoint -= attackHitPoint;
       System.out.println(lifePoint);
   }
   
   else
   {
       lifePoint = 0;
   }
}

void Kick(gamecharacter lawan, int attackKickpoint) {
    this.attackKickPoint -= attackKickpoint;
    System.out.println(this.name + "Memukul" + lawan.name + "Dengan Kekuatan" + attackKickPoint);

    if(lifePoint >= attackKickPoint){
        lifePoint -= attackKickPoint;
        System.out.println(lifePoint);
    }
    
    else
    {
        lifePoint = 0;
    }
 }

 void Selesai(gamecharacter lawan){
     if(lifePoint == 0){
         System.out.println("Pemenang = " + this.name);
     }
 }

 int lifePoint(){
     return lifePoint;
 }

 String name(){
     return name;
 }

    public static void main(String[] args) {
        for (int i =1; i<=3; i++){
        System.out.println();
        
    }
      
        System.out.println("=====Start Game=====");
        System.out.println("LifePoint Raiden = 100");
        System.out.println("LIfePoint Sub-Zero = 100");

        gamecharacter GC1 = new gamecharacter("Raiden", 10, 20);
        gamecharacter GC2 = new gamecharacter("Sub-Zero", 5, 25);
      
        System.out.println();
        System.out.println(("===== RONDE 1 ====="));
        GC1.Kick(GC2, 20);
        GC2.Kick(GC1, 25);
        
        System.out.println();
        System.out.println(("===== RONDE 2 ====="));
        for (int i = 1; i <= 3; i++){
            GC1.Hit(GC2,5);
        }
        for (int i = 1; i <= 4; i++) {
         GC2.Kick(GC1,20);
        }
        System.out.println();

        System.out.println(("===== PENENTUAN ====="));
        GC1.Selesai(GC2);
        System.out.println();
    }
}