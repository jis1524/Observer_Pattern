package Observer_Pattern_My;

public class MainClass {
	public static void main(String[] args) {
		WriteTXT write = new WriteTXT();
		
		Board_A AA = new Board_A(write);
		Board_B BB = new Board_B(write);
		Board_C CC = new Board_C(write);

		
		write.setNewWrtie("leader", "ù��°", "���������� �����ϰ� ������ ���弼��.");
		write.delete(AA);
		write.setNewWrtie("leader", "�ι�°", "������������ �����ϰ� ������ ���弼��.");
		
	}
}
