# 코딩클리닉<br>
Java를 사용하여 Spring Boot 프레임워크로 개발된 웹 애플리케이션
<br><br>
--
## 코드 흐름 정리<br><br>
### 1.사용자 폼 입력:<br>
- 회원가입: 아이디와 비밀번호 입력 후 "등록해줘요" 클릭.<br>
- 정보 조회: ID 입력 후 "조회해줘요" 클릭.<br>
- 정보 업데이트: ID, 이름, 닉네임, 전화번호 입력 후 "등록해줘요" 클릭.<br>

### 2.AJAX 요청:<br>
- create() 함수: POST 요청으로 아이디와 비밀번호 전송.<br>
- detail() 함수: GET 요청으로 ID 전송.<br>
- update() 함수: PUT 요청으로 ID, 이름, 닉네임, 전화번호 전송.<br>

### 3.컨트롤러 메소드 호출:<br>
- TbuserController.create(): TbuserService.create() 호출.<br>
- TbuserController.detail(): TbuserService.get() 호출.<br>
- TbuserController.update(): TbuserService.update() 호출.<br>

### 4.서비스 메소드 실행:<br>
- TbuserService.create(): Tbuser 객체 생성 및 저장.<br>
- TbuserService.get(): Tbuser 객체 조회.<br>
- TbuserService.update(): Tbuser 객체 업데이트 및 저장.<br>

### 5.데이터베이스 연동:
- TbuserRepository.save(): Tbuser 객체 저장.
- TbuserRepository.findById(): Tbuser 객체 조회.

### 6.응답 처리:
- 클라이언트는 응답을 받아 결과를 사용자에게 표시.
