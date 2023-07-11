import java.util.ArrayList;
import java.util.List;

public class Population {
    private ArrayList<List<Boolean>> genome;
    private int genomeLength;
    private int populationSize;
    private double Sb;
    private double activatedProportion;
    private int generations;
    private int mutationsPerGeneration;
    private int transfersPerGeneration;

    private int[] fitnesses;

    public Population(ArrayList<List<Boolean>> genome, int genomeLength, int populationSize, double Sb, double activatedProportion, int generations, int mutationsPerGeneration, int transfersPerGeneration) {
        this.genome = genome;
        this.genomeLength = genomeLength;
        this.populationSize = populationSize;
        this.Sb = Sb;
        this.activatedProportion = activatedProportion;
        this.generations = generations;
        this.mutationsPerGeneration = mutationsPerGeneration;
        this.transfersPerGeneration = transfersPerGeneration;

        System.out.println("Population Created");

        this.initializeGenome();
        this.initializeFitnesses();
    }

    private void initializeGenome() {
        genome = new ArrayList<List<Boolean>>();
        for (int i = 0; i < populationSize; i++) {
            // make a list with activatedProportion of True, rest False
        }
        System.out.println("Genome Initialized");
    }

    private void initializeFitnesses() {
        System.out.println("Fitnesses Initialized");
    }

    private void reproductiveUpdate() {
        this.horizontalGeneTransfer();
        System.out.println("HGT Completed");
        this.reproduce();
        System.out.println("Reproduced");
    }

    private void horizontalGeneTransfer(){
    }

    private void reproduce(){
    }
}
