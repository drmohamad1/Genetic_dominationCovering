package AI.Genetic_dominationCovering;

import java.io.IOException;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	//Genetics.printPopualation(Genetics.Genetic(8, 100, 30));
		Genetics.printPopualation( Genetics.parallelGeneticInteractive(8, 5, 100, 30, 5, 2, 0.2, 0.1));
	//	Genetics.printPopualation(  Genetics.parallelGeneticIsolated(8, 5, 100, 30, 0.2));
    }
}
