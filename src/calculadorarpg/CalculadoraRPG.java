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
public class CalculadoraRPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pokemon pokemon = new Pokemon();
        Pokemon oponente = new Pokemon();
        
        
        //criação do pokemon:
        pokemon.setNome("Hana");
        pokemon.setLevel(18);
        pokemon.setHabilidade("Anticipation");
        
        pokemon.setHp(55);
        pokemon.setAtaque(55);
        pokemon.setDefesa(50);
        pokemon.setSpAtaque(45);
        pokemon.setSpDefesa(65);
        pokemon.setSpeed(55);
        
        pokemon.setStab(28);
        
        Golpe golpe1 = new Golpe();
        Golpe breed = new Golpe();        
        golpe1.setNome("tackle");
        golpe1.setAtt(40);
        breed.setNome("yawn");
        breed.setObs("Sleep em 2 turnos");
        pokemon.setGolpe1(golpe1);
        pokemon.setBreed(breed);
        
        //criação do oponente:
        oponente.setNome("rhyhorn");
        oponente.setLevel(15);
        oponente.setHabilidade("rock head");
        
        oponente.setHp(80);
        oponente.setAtaque(85);
        oponente.setDefesa(95);
        oponente.setSpAtaque(30);
        oponente.setSpDefesa(30);
        oponente.setSpeed(25);
        
        oponente.setCriticalHit(15);
        
        Golpe golpe01 = new Golpe();
        Golpe breed0 = new Golpe();
        golpe01.setNome("tackle");
        golpe01.setAtt(40);
        oponente.setGolpe1(golpe01);
        oponente.setGolpe1(golpe01);
        breed0.setNome("rock climb");
        breed0.setAtt(90);
        oponente.setBreed(breed0);
        oponente.setBreed(breed0);
        
        
        //fórmulas:
        pokemon.setHp(pokemon.getHp()+(pokemon.getLevel()*4));
        pokemon.setAtaque(pokemon.getAtaque()+(pokemon.getLevel()/2));
        pokemon.setDefesa(pokemon.getDefesa()+(pokemon.getLevel()/2));
        pokemon.setSpAtaque(pokemon.getSpAtaque()+(pokemon.getLevel()/2));
        pokemon.setSpDefesa(pokemon.getSpDefesa()+(pokemon.getLevel()/2));
        pokemon.setSpeed(pokemon.getSpeed()+pokemon.getLevel());

        oponente.setHp(oponente.getHp()+(oponente.getLevel()*4));
        oponente.setAtaque(oponente.getAtaque()+(oponente.getLevel()/2));
        oponente.setDefesa(oponente.getDefesa()+(oponente.getLevel()/2));
        oponente.setSpAtaque(oponente.getSpAtaque()+(oponente.getLevel()/2));
        oponente.setSpDefesa(oponente.getSpDefesa()+(oponente.getLevel()/2));
        oponente.setSpeed(oponente.getSpeed()+oponente.getLevel());
        
        //dano:
        int difLvl = pokemon.getLevel()-oponente.getLevel();
        int danoTackle = difLvl+(pokemon.getAtaque()+(pokemon.getGolpe1().getAtt()/2)-oponente.getDefesa());
        if(danoTackle <= 0){
            if(difLvl < 0){
                danoTackle = 1;
            }
            else{
                danoTackle = difLvl;
            }
        }
        
        //teste:
        System.out.println("HP:         " +pokemon.getHp() +"\t" +oponente.getHp());
        System.out.println("Attack:     " +pokemon.getAtaque() +"\t" +oponente.getAtaque());
        System.out.println("Defense:    " +pokemon.getDefesa() +"\t" +oponente.getDefesa());
        System.out.println("SpAttack:   " +pokemon.getSpAtaque() +"\t" +oponente.getSpAtaque());
        System.out.println("SpDefense:  " +pokemon.getSpDefesa() +"\t" +oponente.getSpDefesa());
        System.out.println("Speed:      " +pokemon.getSpeed() +"\t" +oponente.getSpeed());
        System.out.println("");
        System.out.println("Dano do tackle da Hana no Rhyhorn: " +danoTackle);
    }
    
}
