public abstract class Champion {
    private String name;        // 이름
    private int level;          // 레밸
    private int hp;             // 체력
    private int attackDamage;   // 공격력
    private int defence;        // 방어력

    // 생성자는 이름만 다름.
    public Champion(String name, int level, int hp, int attackDamage, int defence) {
        this.name = name;                   // 이름
        this.level = level;                 // 레밸
        this.hp = hp;                       // 체력
        this.attackDamage = attackDamage;   // 공격력
        this.defence = defence;             // 방어력
    }

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
    public void changeName(String name){
        // 현재 설정된 이름(private 씌운)에 name 덮어쓰기
        this.name = name;
        System.out.println("변경된 이름은 : " + this.name);
    }
    // 공격력
    public int getAttackDamage(){return this.attackDamage;}

    // 스킬
    public abstract void useQ();
    public abstract void useW();
    public abstract void useE();
    public abstract void useR();
}