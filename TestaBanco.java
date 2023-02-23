public class TestaBanco {
	public static void main(String[] args) {
		Cliente orleandro = new Cliente();
		paulo.setNome("Orleandro Lincoln");
		paulo.setCpf("222.222.222.-22");
		paulo.setProfissao("programador");

		Conta contaOrleandro = new Conta(6646,969060);
		contaOrleandro.deposita(100);

		contaOrleandro.setTitular(orleandro);
		System.out.println(contaOrleandro.getTitular().getNome());
		System.out.println(contaOrleandro.getTitular());

	}
}
