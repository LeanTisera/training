package com.testexample;

public class UFOEnemyShipFactory implements EnemyShipFactory{
    public ESWeapon addESGun() {
        return new ESUFOGun();
    }

    public ESEngine addESEngine() {
        return new ESUFOEngine(); 
    }
}
