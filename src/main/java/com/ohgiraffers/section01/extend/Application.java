package com.ohgiraffers.section01.extend;

public class Application {
    public static void main(String[] args) {

        /*수업목표. 상속에 대해 이해할 수 있다.*/
        /*필기.
        *  상속(inheritance)은 현실세계의 상속과 비슷한 개념이다.
        *  부모가 가지고 있는 재산(자바에서는 클래스가 가지는 멤버)을 자식이 물려받는 의미이다.
        *  클래스 또한 부모 클래스와 자식 클래스로 열할을 나누어서 부모가 가지는 멤버를 자식이
        *  물려받아 자기의 멤버인 것 처럼 사용할 수 있도록 만든 기술이다.
        * */

        /*필기.
        *  하지만 단순 물려받는 개념보다 조금 더 나아간다면
        *  자바에서의 상속은 부모클래스의 확장(extend)의 개념을 가진다.
        *  물려 받아서 자신의 것 처럼 사용하는 것 뿐 아니라 추가적인 멤버도 작성이 가능하다.
        *  특히 메소드 재정의(overloading) 이라는 기술을 이용해서 부모가 가진 메소드를 재성의 하는 것도 가능하다
        *   */

        /*필기.
        *   메소드 재정의(overloading) 이란, 부모가 가지는 메소드 선언부를 그대로 사용하면서
        *  자식 클래스가 정의한 메소드대로 동작하도록 구현 몸체 {} 부분을 새롭게 다시 작성하는 것이다.
        *  메소드 재정의를 하면 메소드를 호출할시 재정의 한 메소드가 우선적으로 동작하게 된다.
        * */

        /*필기.
        *  이러한 상속이라는 기술을 사용하게 되면 얻게 되는 이점은 크게 두가지로 볼 수 있다.
        *  1. 새로운 쿨랴수룰 작성할 시 기존에 작성한 클래스를 재사용할 수 있다.
        *    1-1. 재사용시 생산성을 크게 향상시킬 수 있다.(새로 작성하는 것 보다 빠르다. )
        *    1-2. 공통적으로 사용하는 코드가 부모클래스에 존재하면 수정사항이 생길시 부모
        *         클래스만 수정해도 전체적으로 적용된다.(유지보수성 증가)
        *  2. 클래스간 계층 관계가 형성되며 다형성의 문법적인 토대가 된다.
        *   */

        /*필기.
        *  하지만상속으로 인한 단점도 존재한다.
        *  1. 부모님클래스 기능을 추가/변경 할 ㅣ 자식 클래스가 정상적으로 동작하는지 예측이 힘들다
        *       상속의 구조가 복잡해 질 수록 그 영향에 대한 예측이 힘들며 이런 단점이 유지보수성이 증가한다는 장점과는
        *       반대로 유지보수에 악 영향을 미친다.
        *  2. 또한 부모 클래스의 변경 또한 쉽지 않다. 자식 클래스에서 중요하게 생각하게 사용하는 기능인 경우
        *  부모 클래스를 변경할 시 자식 클래스에 모두 영향을 줄 수 있다.
        *  역시 유지부수에 악영향을 미친다.
        *  3. 부모 클래스에서는 의미 있는 기능이 자식 클래스에서는 무의미 할 수 있다. (불필요한 기능 추가.)
        *  */

        /*필기.
        *  장점과 단점을 고려했을 때,
        *  상속은 재사용이라는 장점만 바로보게 되면 오용의 가능성이 있기 때문에 유지보수에 좋지 않은
        *  코드를 작성할 확률이 높다.
        *  상속은 Is-A 관계로 구분되는 경우에만 사용해야 한다.
        *
        *  fireCar is car(o) / car is a fireCar(x)
        * */

        /*필기.
        *   객체지향 설계 관점에서 바라보는 상속
        *  모든 객체는 자신이 수신한 메세지에 대해 응답을 해야 하는 채임을 가지며, 그 책임의 규모는 적절해야 한다.
        *  적절한 책임을 가진 객체들이 서로 협력(메세지 수신과 응답) 을 통해 프로그램이 동작하는 것이
        *  객체지향 프로그램이다.
        *  */

        /*목차. 1. Car 인스턴스 생성 후 메소드 호출*/
        Car car = new Car();
        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        /*목차. 2. FireCar 인스턴스 생성 후 Car 클래스에 작성한 메소드 사용 가능 확인.*/

        /*필기.
        *   모든 생성자는 맨 첫 줄에는 super()를 컴파일러가 자동으로 추가한다.
        *  부모의 기본 생성자를 호출하는 구문이다.
        *  명시적, 묵시적 전부 사용이 가능하다.
        *  */

        FireCar fireCar = new FireCar();

        /*필기. 우리는 분명 아무것도 작성하지 않았는데 Car (부모) 클래스가 가진 메소드를 사용했다. */ // 생산성 UP
        fireCar.soundHorn();
        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();

        /*목차. 3. 상속은 확장이다. 추가적인 기능도 작성할 수 있다.*/
        fireCar.sprayWater();





    }
}