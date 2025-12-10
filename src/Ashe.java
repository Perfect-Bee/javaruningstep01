public class Ashe {
    // 필드 데이터
    private String name;        // 에쉬
    private int level;          // 레밸
    private int hp;             // 체력
    private int attackDamage;   // 공격력
    private int defence;        // 방어력

    public Ashe(String name, int level, int hp, int attackDamage, int defence){
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.attackDamage = attackDamage;
        this.defence = defence;
    }

    // 행위 설정
    // 피해량
    public void takeDamage(int damage){
        // 내 체력 - (내 방어력 - 적의 공격력) : 내 체력 - 실제 데미지
        int actualDamage = damage - this.defence;
        if( actualDamage < 0 ) actualDamage = 0;

        this.hp -= actualDamage;

        System.out.println("[ " + this.name + " ]" + "이(가) " + actualDamage + " 피해를 받았습니다!");
        System.out.println("현재 체력: " + this.hp);
    }

    // 체력
    public int getHp(){return this.hp;}
    // 이름
    public String getName(){return this.name;}
    // 이름 변경
    public void changeName(String name) {
        String name2 = this.name;
        this.name = name;
        System.out.println(name2 + "의 변경된 이름은 : " + this.name);
    }

    // 타격량 : 에쉬가 가렌을 공격했다.
    public void basicAttackToGaren(Garen garen){
        System.out.println("[ " + this.name + " ]" + "이(가) " + "[ " + garen.getName() + " ]" + "을(를) 기본 공격!");
        garen.takeDamage(this.attackDamage);//가렌의 takeDamage에 에쉬의 attackDamage 입력 = 피해량
    }

    // 스킬
    public void skillQAttackToGaren(Garen target){
        System.out.println("[ " + this.name + " ]" + "이(가) " + "[ " + target.getName() + " ]" + "을(를) 스킬 Q 공격!");
        target.takeDamage(this.attackDamage * 2);
    }
    public void skillWAttackToGaren(Garen target){
        System.out.println("[ " + this.name + " ]" + "이(가) " + "[ " + target.getName() + " ]" + "을(를) 스킬 W 공격!");
        target.takeDamage(this.attackDamage * 3);
    }
    public void skillEAttackToGaren(Garen target){
        System.out.println("[ " + this.name + " ]" + "이(가) " + "[ " + target.getName() + " ]" + "을(를) 스킬 E 공격!");
        target.takeDamage(this.attackDamage * 4);
    }
    public void skillRAttackToGaren(Garen target){
        System.out.println("[ " + this.name + " ]" + "이(가) " + "[ " + target.getName() + " ]" + "을(를) 스킬 R 공격!");
        target.takeDamage(this.attackDamage * 5);
    }
}
