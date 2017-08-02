# spring-boot-standalone-exercise
- Spring Quick Start 하루/7시간/5일 책을 위한 실습 프로젝트
- 사내 스터디 용으로 만든 프로젝트

# 기술스택
- JDK 1.8.x
- Gradle 2.x (Gradle Wrapper)
- Spring-boot 1.5.4.RELEASE
- H2 Database 1.4.195

# 빌드
```bash
$ ./gradle build
```

# 실행
- 실행하기 전에 h2 database를 자신의 PC에서 미리 실행시켜둔다.
- 실행 후 src/main/resources/init/create_table.sql 쿼리를 실행
- 그 다음 터미널에서 아래 명령어를 실행, 혹은 인텔리제이에서 project import 후 Main Class(MainApplication) 실행
```bash
$ ./gradle bootRun
```

# Trouble Shooting
## h2 database 접속이 안되는 이슈
- 프로젝트 디펜던시 중에 h2 database와 PC에 설치된 h2 database 버전이 맞지 않을 경우 실행이 되질 않는다.
- 이 때 PC에 설치된 h2 database의 버전을 확인한 뒤 build.gradle에 h2 database의 버전을 PC에 설치된 버전으로 맞춘다.
```sql
SELECT H2VERSION() FROM DUAL;
```