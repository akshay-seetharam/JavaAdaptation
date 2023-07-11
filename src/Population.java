import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class Population {
    private ArrayList<List<Boolean>> genome;
    private int genomeLength;
    private int populationSize;
    private double Sb;
    private int startingMutations;
    private int generations;
    private int mutationsPerGeneration;
    private int transfersPerGeneration;

    private ArrayList<Integer> fitnesses;

    public Population(int genomeLength, int populationSize, double Sb, int startingMutations, int generations, int mutationsPerGeneration, int transfersPerGeneration) {
        this.genomeLength = genomeLength;
        this.populationSize = populationSize;
        this.Sb = Sb;
        this.startingMutations = startingMutations;
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
            ArrayList<Boolean> genome_i = new ArrayList<>();
            for (int j = 0; j < startingMutations; j++) {
                genome_i.add(true);
            }
            for (int k = startingMutations; k < genomeLength; k++) {
                genome_i.add(false);
            }
            Collections.shuffle(genome_i);
            genome.add(genome_i);
        }
        System.out.println("Genome Initialized");
        // System.out.println(genome);
    }

    private void initializeFitnesses() {
        int trueCount = Arrays.deepToString(new ArrayList[]{genome}).replaceAll("[^t]", "").length();
        fitnesses = new ArrayList<>();
        fitnesses.add(trueCount);
        System.out.println("Fitnesses Initialized");
        System.out.println(fitnesses);
    }

    private void updateFitnesses() {
        int trueCount = Arrays.deepToString(new ArrayList[]{genome}).replaceAll("[^t]", "").length();
        fitnesses.add(trueCount);
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
