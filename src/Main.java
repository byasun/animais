class Main {
    public static void main(String[] args) {
        Peixe peixe1 = new Peixe("alfred", 500, "rio");
        Cachorro dog = new Cachorro("alan", 4, "husky");
        System.out.println("O nome do peixe é: " + peixe1.getNome()+ "\nEle pesa: " + peixe1.getPeso() + "\nO habitat dele é o " + peixe1.getHabitat());
        System.out.println("\n");
        System.out.println("O nome do cachorro é: " + dog.getNome()+ "\nEle pesa: " + dog.getPeso() + "kilos \nA raça dele é o " + dog.getRaca());
    }
}