package net.projecteuler.solution;

public abstract class AbstractSolution {

	public abstract String getProblemDescription();
	public abstract String getProblemDescriptionUrl();
	public abstract void solve();
	
	public void execute() {
		System.out.println(this.getClass().getSimpleName());
		System.out.println();
		System.out.println(getProblemDescription());
		System.out.println();
		System.out.println(getProblemDescriptionUrl());
		System.out.println();
		
		long start = System.currentTimeMillis();
		solve();
		long timeTaken = System.currentTimeMillis() - start;
		System.out.println("\nTook: " + timeTaken + "ms");
	}
	

}
