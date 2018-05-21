package com.testexample;

public class UFOBossEnemyShipFactory implements EnemyShipFactory{
    public ESWeapon addESGun() {
        return new ESUFOBossGun(); 
    }
    public ESEngine addESEngine() {
        return new ESUFOBossEngine();
    }
}
