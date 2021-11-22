package example2;

public class FacadePC {
	public static void main(String[] args) {
		System.out.println("Facade PC Example\n");
		Computer computer = new Computer();
		computer.startBooting();
	}
}

class Computer{
	private CPU cpu;
	private Memory memory;
	private SSD ssd;
	
	public Computer() {
		this.cpu = new CPU();
		this.memory = new Memory();
		this.ssd = new SSD();
	}
	
	public void startBooting() {
		System.out.println("Computer starts booting up...\n");
		cpu.StartProcessing();
		memory.startLoadingMemory();
		ssd.startReadingData();
		System.out.println("Computer booting process completed!");
	}
}

class CPU{
	public void StartProcessing() {
		System.out.println("- started processing");
	}
}

class Memory{
	public void startLoadingMemory() {
		System.out.println("- memory started loading");
	}
}

class SSD{
	public void startReadingData() {
		System.out.println("- reading data from internal storage\n");
	}
}