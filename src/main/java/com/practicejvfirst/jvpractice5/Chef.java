package src.main.java.com.practicejvfirst.jvpractice5;

public class Chef {

    private boolean isOn;   // 초기에는 시동이 꺼진 false 상태이다.
    private int speed;

    public void powerOn() {
        if(isOn) {
            System.out.println("이미 전원이 켜져 있습니다.");
        } else  {
            this.isOn = true;
            System.out.println("전원을 켰습니다. 이동 준비 완료");
        }
    }

    public void toTable() {
        if(isOn) {
            System.out.println("기계가 식탁으로 이동합니다.");
            this.speed += 1;
            System.out.println("현재 기계의 속도는" + this.speed + "m/h 입니다.");
        } else {
            System.out.println("기계가 전원이 켜져 있지 않습니다. 먼저 전원을 켜주세요.");
        }
    }

    public void comeBack() {
        if(isOn) {
            if(this.speed > 0) {
                this.speed = 0;
                System.out.println("전달완료. 주방으로 되돌아 갑니다.");
            } else {
                System.out.println("기계는 이미 주방으로 되돌아가고 있습니다.");
            }
        } else {
            System.out.println("기계의 전원이 꺼져있습니다. 전원을 먼저 켜주세요.");
        }
    }

    public void powerOff() {
        if(isOn) {
            if(speed > 0) {
                System.out.println("움직이는 상태에서 전원을 끌 수 없습니다. 기계를 우선 멈춰주세요.");
            } else {
                this.isOn =false;
                System.out.println("전원을 끄겠습니다. 다시 사용하려면 전원을 켜주세요.");
            }
        } else {
            System.out.println("이미 전원이 꺼져 있는 상태입니다. 전원 상태를 확인해주세요.");
        }
    }


}
