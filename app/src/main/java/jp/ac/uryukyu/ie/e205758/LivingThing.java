package jp.ac.uryukyu.ie.e205758;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
    /**
     * NameのGetter。ヒーローの名前が返ってくる。
     * @return　ヒーローの名前
     */
    public String getName(){
        return name;
    }

    /**
     * NameのSetter。ヒーロー名を設定する。
     * @param name　ヒーロー名
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * HitpointのGetter。ヒーローのHPが返ってくる。
     * @return　ヒーローのHP
     */
    public int getHitPoint(){
        return hitPoint;
    }

    /**
     * HitpointのSetter。ヒーローのHPを設定する。
     * @param hitPoint　ヒーローのHP
     */
    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    /**
    * AttackのGetter。ヒーローの攻撃力が返ってくる
    * @return　ヒーロの攻撃力
    */
    public int getAttack(){
        return attack;
    }

    /**
     * AttackのSetter。ヒーローの攻撃力を設定する。
     * @param attack　ヒーローの攻撃力
     */
    public void setAttack(int attack){
        this.attack = attack;
    }

    /**
     * Deadの確認
     * @return　敵の生死状態
     */
    public boolean isDead(){
        return dead;
    }

    /**
     * DeadのSetter。生死状態の設定をする
     * @param dead　生死状態
     */
    public void setDead(boolean dead){
        this.dead = dead;
    }

    /**
     * Enemyへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param e 攻撃対象
     */
    public void attack(LivingThing opponent){
        if (dead){
            return;
        }
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        opponent.wounded(damage);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
   
}