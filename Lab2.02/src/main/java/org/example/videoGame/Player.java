package org.example.videoGame;

abstract class Player {
    private int health;
    private int strength;
    private int lives;

    public Player(int health, int strength, int lives) {
        this.health = health;
        this.strength = strength;
        this.lives = lives;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    void decrementLive(){
        lives--;

        if (lives<=0) {
            System.out.println("Este personaje está muerto");
        } else {
            health = 100;
        }
    }

    void attack(Player playerToAttack){
        playerToAttack.setHealth(playerToAttack.getHealth()-strength);

    }

    void checkHealth(){
        if (this.health<=0) decrementLive();
    }
}
