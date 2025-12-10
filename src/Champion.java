import javax.crypto.Cipher;
import java.util.Random;

public abstract class Champion {
    private String name;        // 이름
    private int level;          // 레밸
    private int hp;             // 체력
    private int attackDamage;   // 공격력
    private int defence;        // 방어력
    
    private int critical;         // 치명타 확률

    // 생성자는 이름만 다름.
    public Champion(String name, int level, int hp, int attackDamage, int defence) {
        this.name = name;                   // 이름
        this.level = level;                 // 레밸
        this.hp = hp;                       // 체력
        this.attackDamage = attackDamage;   // 공격력
        this.defence = defence;             // 방어력
    }

    // 레밸업!
    public void levelUp(Champion target) {
        this.level++;              // 레밸
        this.hp += 50;             // 체력
        this.attackDamage += 10;   // 공격력
        this.defence += 5;         // 방어력
        System.out.println("level : " + this.level + "\n" +
                "hp : " + this.hp + "\n" + "attackDamage : " + this.attackDamage + "\n" + "defence : " + this.defence );
    }

    // 피해량
    public void takeDamage(int damage){
        // 내 체력 - (내 방어력 - 적의 공격력) : 내 체력 - 실제 데미지
        int actualDamage = damage - this.defence;
        if( actualDamage < 0 ) actualDamage = 0;

        System.out.println("[ " + this.name + " ]" + "이(가) " + actualDamage + " 피해를 받았습니다!");

        this.hp -= actualDamage;
        if (this.hp <= 0) {
            System.out.println( this.name + "이(가) 사망하였습니다!");
            hp = 0; // 초기화
        }
        System.out.println(this.name + "의 현재 체력: " + this.hp + "\n");
    }

    // 체력
    public int getHp(){return this.hp;}
    // 이름
    public String getName(){return this.name;}
    // 이름 변경
    public void changeName(String name){
        String name2 = this.name;
        this.name = name;
        System.out.println(name2 + "에서 변경된 이름은 : " + this.name);
    }
    // 공격력
    public int getAttackDamage(){return this.attackDamage;}

    // 스킬
    public abstract void useQ(Champion target);
    public abstract void useW(Champion target);
    public abstract void useE(Champion target);
    public abstract void useR(Champion target);

    // 타격량 : [때리는 얘].basicAttack([맞는 얘])
    public void basicAttack(Champion target){
        System.out.println("[ " + getName() + " ]" + "이(가) " + "[ " + target.getName() + " ]" + "을(를) 기본 공격!");
        // 치명타 적용 : 랜덤 돌려서 1~100 중 10 이하이면 2배
        target.takeDamage(this.attackDamage);
    }
    
}