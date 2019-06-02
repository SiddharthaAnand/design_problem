/*
 */

abstract public class Character {
    IWeaponBehavior weapon;
    abstract public void fight();

    public void setWeapon(IWeaponBehavior w) {

    }
}