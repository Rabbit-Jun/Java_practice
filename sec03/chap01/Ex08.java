package sec03.chap01;

public class Ex08 {
    public static void main(String[] args) {
        int int1 = 3;

        int int2 = int1++; // int1은 1 증가했으나 int2는 증가되기 전의 값 3이 들어감
        int int3 = ++int1; //int1이 1증가했고 int3 도 증가된 값이 들어감
        int int4 = -(int2-- * --int3);
    }
}
