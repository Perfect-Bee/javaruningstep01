// Ashe가 Champion의 것을 상속받음
public class Ashe extends Champion {
    // Ashe를 위한 생성자 재설정
    public Ashe(String name, int level, int hp, int attackDamage, int defence) {
        // 부모(Champion)의 생성자를 가져온다.
        super(name, level, hp, attackDamage, defence);
    }

    // 타격량 : 에쉬가 가렌을 공격했다.
    public void basicAttackToGaren(Garen target){
        // this는 상속받은거니 super로 바꾸고, name도 public에서 써야하니 getName이다.
        System.out.println("[ " + getName() + " ]" + "이(가) " + "[ " + target.getName() + " ]" + "을(를) 기본 공격!");
        target.takeDamage(super.getAttackDamage());
    }

    @Override // @은 문법임. 정의.
    public void useQ(){
        // 에쉬만의 Q 스킬
    }
    public void useW(){}
    public void useE(){}
    public void useR(){}

}
