package collections;

import java.util.Map;
import java.util.HashMap;

public class Challenge {

	public static Map getOriginalGrades(){
		
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Angie", 24);
        grades.put("Johnny", 50);
        grades.put("Schlanda", 79);
        grades.put("Sean", 32);
        grades.put("Mark", 80);
        grades.put("Jeremy", 40);
        grades.put("Mary", 59);
        grades.put("Amber", 55);
        grades.put("Salah", 95);
        grades.put("Jason", 63);

        return grades;
    }

    public static Map getMakeUpGrades(){

        Map<String, Integer>  grades = new HashMap<>();
        grades.put("Angie", 97);
        grades.put("Johnny", 89);
        grades.put("Schlanda", 79);
        grades.put("Sean", 82);
        grades.put("Mark", 76);
        grades.put("Jeremy", 98);
        grades.put("Mary", 80);
        grades.put("Amber", 95);
        grades.put("Salah", 90);
        grades.put("Jason", 62);

        return grades;
    }
	
	public static void main(String[] args) {
		
		// atribui a cada aluno a sua melhor nota 
		
		Map<String, Integer> originalGrades = getOriginalGrades();
		Map<String, Integer> makeUpGrades = getMakeUpGrades();
		Map<String, Integer> finalGrades = new HashMap<>();
		
		// resolução pelo método classico
		for(String nome : originalGrades.keySet()) {
			
			var originalGrade = originalGrades.get(nome);
			var makeUpGrade = makeUpGrades.get(nome);
			
			if (makeUpGrade > originalGrade) {
				finalGrades.put(nome, makeUpGrade);
			}
			else {
				finalGrades.put(nome, originalGrade);
			}
		}
		
		System.out.println(finalGrades);
		
		
		// resolução usando Lambda
		finalGrades.clear();
		
		originalGrades.forEach((k, v) -> {
			var o = originalGrades.get(k);
			var m = makeUpGrades.get(k);
			if (m > o) {
				finalGrades.put(k, m);
			}
			else {
				finalGrades.put(k, o);
			}
		});
		
		System.out.println(finalGrades);
		
		

	}

}
