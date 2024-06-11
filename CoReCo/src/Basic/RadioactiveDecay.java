package Basic;
/*
A half life is the amount of time for 50% of a radioactive material to decay.

After 1 half life, 50% of a material will be left.
After 2 half lives, 25% of a material will be left.
After 3 half lives, 12.5% of a material will be left, etc.

Create a function which calculates
a) the remaining mass of material and
b) the number of years that it took for the material to decay.

You will be given:
1) The mass of the material.
2) The time in years for a half life to elapse.
3) The number of half lives.

 */
public class RadioactiveDecay {

    public static double calculateRemainingMass(double initialMass, double halfLife, int numHalfLives){
        double decayFactor = Math.pow(0.5, numHalfLives);
        return initialMass * decayFactor;
    }

    public static double calculateDecayTime(double halfLife,int numHalfLives){
        return numHalfLives * halfLife;
    }

    public static void main(String[] args) {
        double initialMass = 100;
        double halfLife = 5;
        int numHalfLives = 2;

        double remainingMass = calculateRemainingMass(initialMass, halfLife , numHalfLives);
        double decayTime = calculateDecayTime(halfLife, numHalfLives);

        System.out.println("Remaining Mass After "+numHalfLives+" Half Lives: "+remainingMass);
        System.out.println("Time taken for decay: "+decayTime+ " Years");

    }
}
