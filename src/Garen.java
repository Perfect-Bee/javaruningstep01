// 상속 : extends
// 중복 : 필드 데이터, 생성자, 피해량, getter, setter, 타격량, 스킬)
public class Garen extends Champion {
    // Garen를 위한 생성자 재설정
    public Garen(String name, int level, int hp, int attackDamage, int defence) {
        // 부모(Champion)의 생성자를 가져온다.
        super(name, level, hp, attackDamage, defence);
    }


    // 타격량 : 가렌이 에쉬를 공격했다.
    public void basicAttackToAshe(Ashe target){
        System.out.println("[ " + super.getName() + " ]" + "이(가) " + "[ " + target.getName() + " ]" + "을(를) 기본 공격!");
        target.takeDamage(super.getAttackDamage());
    }

    // 스킬 : 내부 로직은 알아서 채우기
    @Override
    public void useQ(){}
    public void useW(){}
    public void useE(){}
    public void useR(){}

}
