# helloweb
jsp, servlet

## chapter01 웹프로그래밍 개요
- 1. 기본용어
- 2. 정적인 웹페이지
- 3. 동적인 웹페이지

### 1. 기본용어 
#### 서버
  : 네트쿼트에서 서비스를 제공하는 컴퓨터

#### 클라이언트
  : 네트워크에서 서비스를 제공받는 컴퓨터

#### HTTP(Hyper Text Transfer Protocol)
  : www 서비스를 위한 TCP/IP 응용계층 프로토콜 중 하나, 웹 서버와 클라이언트는 HTTP를 이용한 통신
  
> 요청(request)와 응답(response)는 header와 body로 이루어져있는데 
메시지 내용은 body에, 부가 설명은 header에 들어간다.

### 2. 정적인 웹페이지
정적인 웹 페이지는 파일 형태로 저장되어 있으면서 사용자의 입력에 따라 변하지 않는 HTML 문서이다.

#### URL(Uniform Resource Locater)
- 특정 웹 서버의 특정파일에 접근하기 위한 경로 혹은 주소
- 접근 프로토콜://IP주소또는도메인이름/문서의경로/문서이름
- 예) http://www.naver.com/docs/cafemain.html

### 3. 동적인 웹페이지 
서버(Web server) <--> Web Application Server(응용 프로그램 객체들)

#### 쿼리스트링
: get 방식으로 요청했을 때 URL주소 뒤에 입력데이터를 함께 제공하는 방법으로 '이름=값' 형식으로 전달

## chapter02 웹프로그래밍 개발환경 구축
- 1. 웹 서버, 웹 어플리케이션 서버 설치(톰캣: tomcat)
- 2. 이클립스 톰켓 연동
- 3. 인코딩 방식 변경(UTF-8)
- 4. 프로젝트 만들기
