package 인터페이스;

public interface Temp {
	
	// 인터페이스란??
	// : 클래스들이 "공통으로 구현해야하는 기능"(강제성을 가진다)들을 미리 정의
	// : 프로젝트 설계도면 or 작업 명세서 (지켜야하는 규칙)
	
	// 1. 필드
	// final을 안붙이면 빨간줄이뜸 
	// 그리고 반드시 초기화가 되어야 함.!!!
	int num =0;
	// static final은 당연히 들어가야하기 때문에 생략이 가능
	
	
	// 인터페이스의 특징
	// 1. 필드에 들어갈 수 있는 데이터는 반드시!!!! 상수여야 합니다!!!
	// 2. static 키워드가 있는 필드만 선언이 가능합니다!!!
	// static이란??
	// --> 정적인, 고정적인 저장공간!
	// --> 실행했을 때 1순위로 실행되는 저장공간!
	
	// 3. 필드에서 static, final 키워드는 생략이 가능하다!
	// 4. 추상메소드만 가질 수 있다.
	// 5. 메소드 선언시 abstract키워드를 생략 가능하다.
	// 6. implements 키워드 사용해서 상속받을 수 있다.
	// 7. 인터페이스는 다중상속이 가능합니다!
	
	// 2. 메소드
	public void temp();
	
	
	
	
	
	
	
	
}
