public class Array {
    public static void main(String[] args) {
        
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        //for em array
        // for (int x=0; x<alunos.length; x++){
        //     System.out.println("A o alunos no indice x= "+x+ " e " + alunos[x]);
        // }
        
        for(String aluno : alunos){
            System.out.println("nome do aluno e " + aluno);
        }
    }
}
