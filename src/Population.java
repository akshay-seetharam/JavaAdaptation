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

        this.initialize_genome();
        this.initialize_fitnesses();
    }

    private void initialize_genome() {
        System.out.println("Genome Initialized");
    }

    private void initialize_fitnesses() {
        System.out.println("Fitnesses Initialized");
    }

    private void reproductive_update() {
        this.horizontal_gene_transfer();
        System.out.println("HGT Completed");
        this.reproduce();
        System.out.println("Reproduced");
    }

    private void horizontal_gene_transfer(){
    }

    private void reproduce(){
    }
}
