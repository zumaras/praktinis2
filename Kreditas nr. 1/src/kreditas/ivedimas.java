package kreditas;

import java.util.Scanner;

public class ivedimas {


	public static void main(String []args){
		double Pajamos = 0, PajamosB = 0, skolos = 0, Ksuma = 0; // ivedimo
		int variantas, Svaiku = 0, pam = 0, laik = 0;// ivedimo
		int sumavaik = 100;

		Scanner scan = new Scanner(System.in);

		System.out.println(" ");
		System.out.println("Pasirinkite kredita: "
				+ "Busto Kreditas - 1" + " "
				+ "Vartojamasis Kreditas - 2");
		variantas = scan.nextInt();

		switch (variantas){
			case 1:
				IvedimasVartojimo(Svaiku, Pajamos, skolos, laik, Ksuma);
				Vartojimo(PajamosB, Pajamos, skolos, Svaiku, sumavaik, (int) Ksuma, laik);
				break;
			case 2:
				IvedimasBusto(Svaiku, Pajamos, skolos, pam, laik, Ksuma);
				Busto(PajamosB, Pajamos, skolos, Svaiku, sumavaik, (int) Ksuma, laik, pam);
				break;
			default:
				System.out.println("Neteisingas parinktas parametras!");
				break;
		}


	}

	public static void Busto (double PajamosB, double Pajamos, double skolos, int Svaiku, int sumavaik, int Ksuma, int laik, int pam){
		bkreditas BustClass = new bkreditas();
		PajamosB=Pajamos-skolos-(Svaiku*sumavaik);
		BustClass.setDuom(PajamosB, Ksuma, laik, skolos, pam);
		BustClass.kreditas();
	}

	public static void Vartojimo (double PajamosB, double Pajamos, double skolos, int Svaiku, int sumavaik, int Ksuma, int laik){
		vkreditas VartClass = new vkreditas();
		PajamosB=Pajamos-skolos-(Svaiku*sumavaik);
		VartClass.setDuom(PajamosB, Ksuma, laik, laik);
		VartClass.kreditas();
	}

	public static void IvedimasVartojimo(int Svaiku, double Pajamos, double skolos, int laik, double Ksuma){

		Scanner scan = new Scanner(System.in);

		System.out.println("Iveskite vaiku skaiciu nuo 0 iki 10 :");
		Svaiku = scan.nextInt();
		System.out.println("Iveskite pajamas atskaiciavus mokescius:");
		Pajamos = scan.nextDouble();
		System.out.println("Iveskite isiskolinimus:");
		skolos = scan.nextDouble();
		System.out.println("Iveskite kredito laikotarpi iki 5 metu:");
		laik = scan.nextInt();
		System.out.println("Iveskite kredito suma nuo 300 Eu iki 26000 Eu: ");
		Ksuma = scan.nextDouble();
	}

	public static void IvedimasBusto(int Svaiku, double Pajamos, double skolos, int pam, int laik, double Ksuma){

		Scanner scan = new Scanner(System.in);

		System.out.println("Iveskite vaiku skaiciu nuo 0 iki 10 :");
		Svaiku = scan.nextInt();
		System.out.println("Iveskite pajamas atskaiciavus mokescius:");
		Pajamos = scan.nextDouble();
		System.out.println("Iveskite isiskolinimus: ");
		skolos = scan.nextDouble();
		System.out.println("Iveskite pastato amziu: ");
		pam = scan.nextInt();
		System.out.println("Iveskite kredito laikotarpi: ");
		laik = scan.nextInt();
		System.out.println("Iveskite kredito suma: ");
		Ksuma = scan.nextDouble();



	}

}
		

	


