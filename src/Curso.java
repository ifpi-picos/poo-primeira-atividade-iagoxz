import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    
        int ch;
        int nivel;
        private String nomeDoCurso;
        private String modalidade;
        private LocalDate dataDeInicio;
        private LocalDate dataDeTermino;
        private Boolean gratuito;
        private Professor professor;
        private List<Aluno> alunos;
        
        
        public Curso(String nomeDoCurso,int nivel, int ch, Professor professor){
                this.nomeDoCurso = nomeDoCurso;
                this.nivel = nivel;
                this.ch = ch;
                this.professor = professor;
                this.alunos = new ArrayList<>();
        }
        public int getch() {
                return ch;
        }
        public int getNivel() {
                return nivel;
        }
        public String getNomeDoCurso() {
                return nomeDoCurso;
        }
        public String getModalidade() {
                return modalidade;
        }
        public LocalDate getDataDeInicio() {
                return dataDeInicio;
        }
        public LocalDate getDataDeTermino() {
                return dataDeTermino;
        }
        public Boolean getGratuito() {
                return gratuito;
        }
        public Professor getProfessor() {
                return professor;
        }
        public List<Aluno> getAlunos() {
                return alunos;
        }





    

}