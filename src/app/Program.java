package app;

import java.util.Timer;
import java.util.TimerTask;

public class Program {
	public static void main(String[] args) {
		Timer timer = new Timer();

		TimerTask tarefa = new TimerTask() {
			@Override
			public void run() {

				System.out.println();
				System.out.print("|||||| ");
				System.out.print("|||||| ");
				System.out.println("|||||| ");
				System.out.print("||     ");
				System.out.print("||  || ");
				System.out.println("||     ");
				System.out.print("|||||| ");
				System.out.print("||  || ");
				System.out.println("|||||| ");
				System.out.print("    || ");
				System.out.print("||  || ");
				System.out.println("    || ");
				System.out.print("|||||| ");
				System.out.print("|||||| ");
				System.out.print("|||||| ");
				System.out.println();

			}
		};

		// Agendar a tarefa para ser executada a cada 3 segundos (3000 milissegundos)
		timer.scheduleAtFixedRate(tarefa, 0, 1000);
	}
}