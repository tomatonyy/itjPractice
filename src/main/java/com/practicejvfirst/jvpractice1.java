public class jvpractice1 {

    public static void main(String[] args) {

        /* -300 ~ 500 범위에서 난수 랜덤생성해서 출력하기 */
        int random500 = (int) (Math.random()*801) + (-300);
        System.out.println(random500); // 처음에 78 출력, 밑에 한번더 발생시키니까 191로 바뀜
        System.out.println(random500); //191출력, 두 번째로 하면 먼저 생성된 숫자도 바뀜, 이대로 run을 한번 더 하면 -137으로 변경됨



        //갖고 있는 번호에 따라 좌석 번호 랜덤지정할 경우가 있으면 사용해보기

   }
}
