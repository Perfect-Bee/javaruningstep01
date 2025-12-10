// 상속 : extends
// 중복 : 필드 데이터, 생성자, 피해량, getter, setter, 타격량, 스킬)
public class Garen extends Champion {
    // Garen를 위한 생성자 재설정
    public Garen(String name, int level, int hp, int attackDamage, int defence) {
        // 부모(Champion)의 생성자를 가져온다.
        super(name, level, hp, attackDamage, defence);
    }

    // 스킬 : 내부 로직은 알아서 채우기
    @Override
    public void useQ(Champion target){
        // 가렌만의 Q 스킬
        System.out.println(getName() + "의 Q스킬!");
        target.takeDamage(getAttackDamage() + 30); // Q스킬은 가렌의 기본 공격력 + 30
    }
    public void useW(Champion target){
        // 가렌만의 W 스킬
        System.out.println(getName() + "의 W스킬!");
        target.takeDamage(getAttackDamage() + 60); // Q스킬은 가렌의 기본 공격력 + 30
    }
    public void useE(Champion target){
        // 가렌만의 E 스킬
        System.out.println(getName() + "의 E스킬!");
        target.takeDamage(getAttackDamage() + 90); // Q스킬은 가렌의 기본 공격력 + 30
    }
    public void useR(Champion target){
        // 가렌만의 R 스킬
        System.out.println(getName() + "의 R스킬!");
        target.takeDamage(getAttackDamage() + 120); // Q스킬은 가렌의 기본 공격력 + 30
    }

}
