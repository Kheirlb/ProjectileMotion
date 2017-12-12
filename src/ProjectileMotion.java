import java.util.Scanner;

public class ProjectileMotion {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double Vi = 0.0;
		double Vf = 0.0;
		double Xi = 0.0;
		double Xf = 0.0;
		double a  = 0.0;
		double t  = 0.0;
		
		System.out.println("        Basic kinematic equations on one axis.");
		System.out.println();
		
		System.out.println("Type intial velocity (If no intial velocity type 0.003):");
		Vi = s.nextDouble();
		if (Vi == 0.003) {
			System.out.println("No intial velocity.");
		}
		
		System.out.println("Type final velocity (If no final velocity type 0.003):");
		Vf = s.nextDouble();
		if (Vf == 0.003) {
			System.out.println("No final velocity.");
		}
		
		System.out.println("Type initial distance (If no intial distance type 0.003):");
		Xi = s.nextDouble();
		if (Xi == 0.003) {
			System.out.println("No initial distance.");
		}
		
		System.out.println("Type final distance (If no final distance type 0.003):");
		Xf = s.nextDouble();
		if (Xf == 0.003) {
			System.out.println("No final distance.");
		}
		
		System.out.println("Type acceleration (If no acceleration type 0.003):");
		a = s.nextDouble();
		if (a == 0.003) {
			System.out.println("No accerlation.");
		}
		
		System.out.println("Type time (If no time type 0.003):");
		t = s.nextDouble();
		if (t == 0.003) {
			System.out.println("No time.");
		}
		
		// Equations Below
		
		if (Vi != 0.003) {
			if (Vf != 0.003){
				if (t != 0.003){
					System.out.println("Acceleration Equation: a = (Vf-Vi)/t");
					a = (Vf-Vi)/t;
					System.out.println("a = " + a);
				}
			}
		}
		if (Vi != 0.003) {
			if (a != 0.003){
				if (t != 0.003){
					System.out.println("Final Velocity Equation: Vf = Vi + a * t");
					Vf = Vi + a * t;
					System.out.println("Vf = " + Vf);
				}
			}
		}
		if (Vi != 0.003) {
			if (Vf != 0.003){
				if (a != 0.003){
					System.out.println("Time Equation: t = (Vf - Vi)/a");
					t = (Vf - Vi)/a;
					System.out.println("t = " + t);
				}
			}
		}
		if (a != 0.003) {
			if (Vf != 0.003){
				if (t != 0.003){
					System.out.println("Initial Velocity Equation: Vi = Vf - a * t");
					Vi = Vf - a * t;
					System.out.println("Vi = " + Vi);
				}
			}
		}


		if (Vi != 0.003) {
				if (t != 0.003){
					if (Xi != 0.003){
						if (a != 0.003){
					System.out.println("Final Distance Equation: Xf = Xi + (Vi * t) + ((0.5) * a * t * t)");
					Xf = Xi + (Vi * t) + ((0.5) * a * t * t);
					System.out.println("Xf = " + Xf);
						}
					}
				}
		}

		if (Vi != 0.003) {
				if (t != 0.003){
					if (Xf != 0.003){
						if (a != 0.003){
					System.out.println("Initial Distance Equation: Xi = Xf - ((Vi * t) + ((0.5) * a * t * t))");
					Xi = Xf - ((Vi * t) + ((0.5) * a * t * t));
					System.out.println("Xi = " + Xi);
						}
					}
				}
		}
		
		if (Vi != 0.003) {
				if (t != 0.003){
					if (Xf != 0.003){
						if (Xi != 0.003){
							if (a == 0.003){
					System.out.println("Acceleration Equation: a = ((Xf - Xi - (Vi * t)) * 2)/(t * t)");
					a = ((Xf - Xi - (Vi * t)) * 2)/(t * t);
					System.out.println("a = " + a);
							}
						}
					}
				}
		}
		
		if (Vi != 0.003) {
			if (Vf != 0.003){
				if (t != 0.003){
					if (Xi != 0.003){
						if (Xf == 0.003){
					System.out.println("Distance Equation: Xf = Xi + (0.5) * (Vf + Vi) * t)");
					Xf = Xi + (0.5) * (Vf + Vi) * t;
					System.out.println("Xf = " + Xf);
						}
					}
				}
			}
		}
		
		if (Xf != 0.003) {
			if (Xi != 0.003){
				if (t != 0.003){
					if (Vf != 0.003){
						if (Vi == 0.003){
					System.out.println("Initial Velocity Equation: Vi = (2 * (Xf - Xi))/t - Vf");
					Vi = (2 * (Xf - Xi))/t - Vf;
					System.out.println("Vi = " + Vi);
						}
					}
				}
			}
		}
		
		if (Vi != 0.003) {
			if (Vf != 0.003){
				if (Xf != 0.003){
					if (Xi != 0.003){
						if (t == 0.003){
					System.out.println("Time Equation: t = (2 * (Xf - Xi))/(Vf + Vi)");
					t = (2 * (Xf - Xi))/(Vf + Vi);
					System.out.println("t = " + t);
						}
					}
				}
			}
		}
		
		if (a != 0.003) {
			if (Xi != 0.003){
				if (Xf != 0.003){
					if (t != 0.003){
						if (Vi == 0.003){
					System.out.println("Initial Velocity Equation: Vi = (-0.5) * a * t - ((Xi - Xf)/t)");
					Vi = (-0.5) * a * t - ((Xi - Xf)/t);
					System.out.println("Vi = " + Vi);
						}
					}
				}
			}
		}
		
		if (Vi != 0.003) {
			if (a != 0.003){
				if (Xf != 0.003){
					if (Xi != 0.003){
						if (Vf == 0.003){
					System.out.println("Final Velocity Equation: Vf = Math.sqrt((Vi * Vi) + 2 * a * (Xf -Xi))");
					Vf = Math.sqrt((Vi * Vi) + 2 * a * (Xf -Xi));
					System.out.println("Vf = " + Vf);
						}
					}
				}
			}
		}
		
		if (Vf != 0.003) {
			if (a != 0.003){
				if (Xf != 0.003){
					if (Xi != 0.003){
						if (Vi == 0.003){
					System.out.println("Initial Velocity Equation: Vi = Math.sqrt((Vf * Vf) - 2 * a * (Xf -Xi))");
					Vi = Math.sqrt((Vf * Vf) - 2 * a * (Xf -Xi));
					System.out.println("Vi = " + Vi);
						}
					}
				}
			}
		}
		
		if (Vi != 0.003) {
			if (Vf != 0.003){
				if (t != 0.003){
					if (a == 0.003){
					System.out.println("Acceleration Equation: a = (Vf-Vi)/t");
					a = (Vf-Vi)/t;
					System.out.println("a = " + a);
					}
				}
			}
		}
		
		if (Vi != 0.003) {
			if (Vf != 0.003){
				if (Xf != 0.003){
					if (Xi != 0.003){
						if (t == 0.003){
					System.out.println("Time Equation: t = (2 * (Xf - Xi))/(Vf + Vi)");
					t = (2 * (Xf - Xi))/(Vf + Vi);
					System.out.println("t = " + t);
						}
					}
				}
			}
		}
		
		//End of equations 
		
		System.out.println();
		System.out.println("Not enough information to compute any more variables.");
		System.out.println("Variables that equal 0.003 have not been calculated.");
		System.out.print("Vi = " + Vi + " ");
		System.out.print("Vf = " + Vf + " ");
		System.out.print("Xi = " + Xi + " ");
		System.out.print("Xf = " + Xf + " ");
		System.out.print("a = " + a + " ");
		System.out.println("t = " + t);
		System.out.println("If applicable, re-enter computed variable(s) ONLY IN DECIMAL FORM for more results.");
		System.out.println("Enter decimals at extreme acccuracy.");
		
		return; // n/a 5 30 20 n/a 2

	}

}				




