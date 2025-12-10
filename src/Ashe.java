// Ashe가 Champion의 것을 상속받음
public class Ashe extends Champion {
    // Ashe를 위한 생성자 재설정
    public Ashe(String name, int level, int hp, int attackDamage, int defence) {
        // 부모(Champion)의 생성자를 가져온다.
        super(name, level, hp, attackDamage, defence);
    }

    @Override
    public void useQ(Champion target){
        // 에쉬만의 Q 스킬
        System.out.println(getName() + "의 Q스킬!");
        target.takeDamage(getAttackDamage() * 2); // 공격력의 200%
        // 주의. 이거 int라서 실수 안 됨
    }
    public void useW(Champion target){
        // 에쉬만의 W 스킬
        System.out.println(getName() + "의 W스킬!");
        target.takeDamage(getAttackDamage() * 3); // 공격력의 300%
    }
    public void useE(Champion target){
        // 에쉬만의 E 스킬
        System.out.println(getName() + "의 E스킬!");
        target.takeDamage(getAttackDamage() * 4);
    }
    public void useR(Champion target){
        // 에쉬만의 R 스킬
        System.out.println(getName() + "의 R스킬!");
        target.takeDamage(getAttackDamage() * 5);
    }

}
