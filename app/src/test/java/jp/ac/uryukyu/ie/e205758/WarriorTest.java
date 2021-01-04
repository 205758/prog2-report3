package jp.ac.uryukyu.ie.e205758;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
   
    @Test
    void WarriorTest(){
        int defaultWarriorAttack = 10;
        int wantWarriorWeponAtttack = (int)(defaultWarriorAttack * 1.5);
        int defaultEnemyHitPoint = wantWarriorWeponAtttack;
        Warrior demoWarrior = new Warrior("demoWarrior", 100, defaultWarriorAttack);
        for (int i = 0; i < 3; i++){
            Enemy demoEnemy = new Enemy("demoEnemy", defaultEnemyHitPoint, 100);
            demoWarrior.attackWithWeponSkill(demoEnemy);
            assertTrue(demoEnemy.isDead());
        }
    }
}