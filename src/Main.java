public class Main {
    public static void main(String[] args) {
        // [설계도] [변수이름] = [객체 생성. 실제 객체를 메모리에 만들자.] [생성자];
        // = [Garen] [garen] = [new] [Garen()];
        Garen garen = new Garen("garen1", 1, 100, 50, 30); // 고정값 1, 100, 50, 30
        Garen garen2 = new Garen("garen2", 1, 100, 50, 30); // 고정값 1, 100, 50, 30
        Ashe ashe = new Ashe("ashe", 1, 80, 60, 10);


        // 이름 변경
        garen.changeName("가붕이");
        garen2.changeName("짭붕이");
        ashe.changeName("에붕이");

        // 가렌이 에쉬를 공격함 : basicAttackToAshe(Ashe target)
        garen.basicAttack(ashe);
        // 에쉬가 가렌을 공격함 basicAttackToGaren(Garen target)
        ashe.basicAttack(garen);

        // 가렌이 에쉬를 R 스킬 공격 : skillRAttackToAshe(Ashe target)
        garen.useR(ashe);


        // 체력 정리
        System.out.println(garen.getName() + " 체력 : " + garen.getHp() + " \n"
                 + garen2.getName() + " 체력 : " + garen2.getHp() + " \n"
                 + ashe.getName() + " 체력 : " + ashe.getHp());
    }
}
