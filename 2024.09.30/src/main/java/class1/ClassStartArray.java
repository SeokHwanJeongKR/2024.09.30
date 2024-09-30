package class1;

public class ClassStartArray    {

    public static void main(String[] args) {

        String[] students = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrade = {90, 80};
        for(int i = 0; i < students.length; i++) {
            System.out.println("이름 " + students[i] + "나이" + studentAges[i] +"성적" + studentGrade[i] );
        }
/*이렇게 배열을 이용하여 코드를 짤 수도 있으나 사람의 입장에서 내용이 많아 질 수록 고치기 쉬운 코드가 아님*/





    }
}
