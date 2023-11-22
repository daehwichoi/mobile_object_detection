# Android 프로젝트 기본 구조

- Manifest : 안드로이드 Application에 대한 정보들을 기술하는 파일, 앱의 구동 후 첫 시작점으로 보면됨
  - Manifest 4대 요소 
    1. Intent : 안드로이드 Component를 호출 및 변경 내용을 관리하는 App 관리자
    2. Activity : 안드로이드에서 화면을 보여주는 단위 
    3. Service : 백그라운드 작업을 하는 공간. 어떤 Activity에서 한 Service를 실행하고 Activity를 종료해도 Service는 꺼지지 않고 백그라운드에서 계속 돌게된다.
    4. Broadcast Receiver : 특정 이벤트에 대해 응답한다.
    5. Contents Provider : 외부 앱이 DB를 접근하는 것을 막음
  
- Entry Point : 안드로이드 런처화면에서 안드로이드 앱을 켰을 때 처음으로 들어오는 것을 뜻함. (처음 시작하는 Activity는 MainActivity임)

- JAVA 폴더 : 공부해야함
  - 하나의 프로젝트는 여러개의 모듈로 구성되고, 각 모듈은 여러 파일 및 폴더로 구성된다.
  - 패키지 : 개발 시의 소스코드의 소속을 지정하기 위한 논리적 단위, 코드를 작성할 때, 코드 내에서 사용하는 이름이 용도에 따라 서로 충돌하면 안된다. (유니크한 이름을 지어야함)
  - 패키지 작명 방식 : 일반적으로 패키지 이름을 지을 때는 회사가 개발한 도메인이름을 거꾸로 배열한 후, 그 뒤에 프로젝트명을 붙이고, 그 아래 기능별로 세분화하는 방식을 사용
  - 코드 파일 맨 윗줄에 package 키워드로 패키지 이름을 적음 -> 안적으면 default 패키지가 된다.

- res 폴더 : 각종 resource를 관리하는 폴더임
  1. drawable 
  2. layout
  3. mipmap
  4. values

- gadle : 작성한 코틀린을 complie해주거나, 필요한 lib, dependency들을 관리하고 호환해주는 역할을 하는 곳.
   