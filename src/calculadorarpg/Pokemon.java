/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorarpg;

/**
 *
 * @author jamele
 */
public class Pokemon {
    private String nome;
    private int level;
    private String habilidade;
    
    //STATS:
    private int hp = 0;
    private int ataque = 0;
    private int defesa = 0;
    private int spAtaque = 0;
    private int spDefesa = 0;
    private int speed = 0;
    
    //SUB-STATS:
    private int stab = 10;
    private int evasion = 0;
    private int criticalHit = 0;
    private int wall = 0;
    
    //GOLPES:
    private Golpe golpe1;
    private Golpe golpe2;
    private Golpe golpe3;
    private Golpe golpe4;
    private Golpe golpe5;
    private Golpe golpe6;
    private Golpe golpe7;
    private Golpe golpe8;
    private Golpe breed;
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getSpAtaque() {
        return spAtaque;
    }

    public void setSpAtaque(int spAtaque) {
        this.spAtaque = spAtaque;
    }

    public int getSpDefesa() {
        return spDefesa;
    }

    public void setSpDefesa(int spDefesa) {
        this.spDefesa = spDefesa;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStab() {
        return stab;
    }

    public void setStab(int stab) {
        this.stab = stab;
    }

    public int getEvasion() {
        return evasion;
    }

    public void setEvasion(int evasion) {
        this.evasion = evasion;
    }

    public int getCriticalHit() {
        return criticalHit;
    }

    public void setCriticalHit(int criticalHit) {
        this.criticalHit = criticalHit;
    }

    public int getWall() {
        return wall;
    }

    public void setWall(int wall) {
        this.wall = wall;
    }

    public Golpe getGolpe1() {
        return golpe1;
    }

    public void setGolpe1(Golpe golpe1) {
        this.golpe1 = golpe1;
    }

    public Golpe getGolpe2() {
        return golpe2;
    }

    public void setGolpe2(Golpe golpe2) {
        this.golpe2 = golpe2;
    }

    public Golpe getGolpe3() {
        return golpe3;
    }

    public void setGolpe3(Golpe golpe3) {
        this.golpe3 = golpe3;
    }

    public Golpe getGolpe4() {
        return golpe4;
    }

    public void setGolpe4(Golpe golpe4) {
        this.golpe4 = golpe4;
    }

    public Golpe getGolpe5() {
        return golpe5;
    }

    public void setGolpe5(Golpe golpe5) {
        this.golpe5 = golpe5;
    }

    public Golpe getGolpe6() {
        return golpe6;
    }

    public void setGolpe6(Golpe golpe6) {
        this.golpe6 = golpe6;
    }

    public Golpe getGolpe7() {
        return golpe7;
    }

    public void setGolpe7(Golpe golpe7) {
        this.golpe7 = golpe7;
    }

    public Golpe getGolpe8() {
        return golpe8;
    }

    public void setGolpe8(Golpe golpe8) {
        this.golpe8 = golpe8;
    }

    public Golpe getBreed() {
        return breed;
    }

    public void setBreed(Golpe breed) {
        this.breed = breed;
    }  
    
}
