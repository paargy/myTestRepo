package gr.aueb.dmst.nereids.graphicalInterface;

import gr.aueb.dmst.nereids.commandLine.*;

public class StartGame {
	static Difficulty d1; // the difficulties of the level
	static Difficulty d2;
	static Difficulty d3;
	static Nereids n1; // the chosen nereids
	static Nereids n2;
	static Nereids n3;
	static int difChoice;
	static int score;
	static int agility;
	static int organisation;
	static int wisdom;
	static int windlessness;
	static int courage;
	static int strength;
	static int animalFriendly;
	static int orientation;
	static int justice;
	BoatFrame frame;

	public StartGame(int n1, int n2, int n3) {
		// Initialise with the default values
		Status.Status();

		CommandLineGameplay.createNereids();
		CommandLineGameplay.createDifficulties();
		Status.Status(n1, n2, n3);
		frame = new BoatFrame();
		d1 = Status.getD1();
		d2 = Status.getD2();
		d3 = Status.getD3();

	}

	public static void main(String[] args) {
		StartGame game = new StartGame(1, 2, 3);
		System.out.println(game.d1.getName());
		System.out.println(game.d2.getName());
		System.out.println(game.d3.getName());

	}

	public static Difficulty getD1() {
		return d1;
	}

	public static void setD1(Difficulty d1) {
		StartGame.d1 = d1;
	}

	public static Difficulty getD2() {
		return d2;
	}

	public static void setD2(Difficulty d2) {
		StartGame.d2 = d2;
	}

	public static Difficulty getD3() {
		return d3;
	}

	public static void setD3(Difficulty d3) {
		StartGame.d3 = d3;
	}

	public static Nereids getN1() {
		return n1;
	}

	public static void setN1(Nereids n1) {
		StartGame.n1 = n1;
	}

	public static Nereids getN2() {
		return n2;
	}

	public static void setN2(Nereids n2) {
		StartGame.n2 = n2;
	}

	public static Nereids getN3() {
		return n3;
	}

	public static void setN3(Nereids n3) {
		StartGame.n3 = n3;
	}

}