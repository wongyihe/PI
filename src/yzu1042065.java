import java.util.Scanner;

public class yzu1042065 {

	public static void main(String[] args) {
		culculate_Pi p = new culculate_Pi();
		p.go();
	}

}

class culculate_Pi {

	int n;
	double pi = 0;
	double m = 4;
	double i = 1;

	void go() {

		new Thread() {
			@Override
			public void run() {

				while (true) {

					pi += m / i;
					m = -m;
					i += 2;
				}
			}
		}.start();

		while (true) {
			n = 0;
			Scanner s = new Scanner(System.in);
			n = s.nextInt();
			if (n == 2) {
				System.out.println("final:" + pi);
				System.exit(0);
			} else if (n == 1) {
				System.out.println(pi);
				n = 0;
			}
		}
	}

}
