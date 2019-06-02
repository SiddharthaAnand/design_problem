/* This is an abstract class which HAS-A Weapon behavior.
 * Weapon has been picked up and encapsulated in another
 * interface since it contains the properties that can
 * change frequently. It can have it's own state and behavior
 * and in future, we can introduce more kinds of weapons
 * easily.
 */

abstract public class Character {
    // HAS-A Relationship to Weapon
    IWeaponBehavior weapon;
    abstract public void fight();

    // This is setter method so that the weapon
    // for a character can be changed at runtime.
    public void setWeapon(IWeaponBehavior w) {
        this.weapon = w;
    }
}