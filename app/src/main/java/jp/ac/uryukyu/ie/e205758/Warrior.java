package jp.ac.uryukyu.ie.e205758;

public class Warrior extends Hero {
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Warrior (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }
    public void attackWithWeponSkill(LivingThing opponent){
        if (isDead()){
            return;
        }
        int damage = (int)(getAttack() * 1.5);
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
        opponent.wounded(damage);
    }

    
}