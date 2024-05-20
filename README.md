코딩클리닉
Java를 사용하여 Spring Boot 프레임워크로 개발된 웹 애플리케이션
<br>

코드 흐름 정리
1.사용자 폼 입력:
회원가입: 아이디와 비밀번호 입력 후 "등록해줘요" 클릭.
정보 조회: ID 입력 후 "조회해줘요" 클릭.
정보 업데이트: ID, 이름, 닉네임, 전화번호 입력 후 "등록해줘요" 클릭.

2.AJAX 요청:
create() 함수: POST 요청으로 아이디와 비밀번호 전송.
detail() 함수: GET 요청으로 ID 전송.
update() 함수: PUT 요청으로 ID, 이름, 닉네임, 전화번호 전송.

3.컨트롤러 메소드 호출:
TbuserController.create(): TbuserService.create() 호출.
TbuserController.detail(): TbuserService.get() 호출.
TbuserController.update(): TbuserService.update() 호출.

4.서비스 메소드 실행:
TbuserService.create(): Tbuser 객체 생성 및 저장.
TbuserService.get(): Tbuser 객체 조회.
TbuserService.update(): Tbuser 객체 업데이트 및 저장.

5.데이터베이스 연동:
TbuserRepository.save(): Tbuser 객체 저장.
TbuserRepository.findById(): Tbuser 객체 조회.

6.응답 처리:
클라이언트는 응답을 받아 결과를 사용자에게 표시.
