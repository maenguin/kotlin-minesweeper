# kotlin-minesweeper

## 기능 요구사항
지뢰 찾기를 변형한 프로그램을 구현한다.

높이와 너비, 지뢰 개수를 입력받을 수 있다.
지뢰는 눈에 잘 띄는 것으로 표기한다.
지뢰는 가급적 랜덤에 가깝게 배치한다.

## 실행 결과
```
높이를 입력하세요.
10

너비를 입력하세요.
10

지뢰는 몇 개인가요?
10

지뢰찾기 게임 시작
C C C * C C C * C C
C C * C * C C C C C
C C C C C C C C C C
C C C C C C C C C C
* C C C C C C C C C
C C C C C C * C C C
C C * C C C * C C C
C C C C C C * C C *
C C C C C C C C C C
C C C C C C C C C C
```

## 프로그래밍 요구 사항
- 객체지향 생활 체조 원칙을 지키면서 프로그래밍한다.

**객체지향 생활 체조 원칙**
1. 한 메서드에 오직 한 단계의 들여쓰기만 한다.
2. else 예약어를 쓰지 않는다.
3. 모든 원시 값과 문자열을 포장한다.
4. 한 줄에 점을 하나만 찍는다.
5. 줄여 쓰지 않는다(축약 금지).
6. 모든 엔티티를 작게 유지한다.
7. 3개 이상의 인스턴스 변수를 가진 클래스를 쓰지 않는다.
8. 일급 컬렉션을 쓴다.
9. getter/setter/프로퍼티를 쓰지 않는다.


## 기능 목록
- MineMap : 지도는 지뢰가 매설된 2차원 평면이다
  - [x] 지뢰를 매설하면 지뢰 개수 만큼 지도에 지뢰가 추가된다
  - [x] 특정 위치를 열었을때 빈칸이면 지뢰가 없는 인접한 칸이 모두 열린다
  - [x] 특정 위치를 열었을때 지뢰를 열었는지 알 수 있다
  - [x] 모든 빈칸이 열렸는지 확인할 수 있다
- MineMapConfig : 지도를 구성할때 사용하는 설정값들의 모음이며 높이와 너비 그리고 지뢰 개수를 가진다
  - [x] 높이와 너비 그리고 지뢰 개수가 0보다 작으면 예외가 발생한다
  - [x] 지뢰 개수가 높이와 너비의 곱보다 크면 예외가 발생한다
- MinePositionStrategy : 지뢰를 어느 위치에 매설할지 결정하는 전략
  - [x] 지뢰 매설 위치는 지도의 내부로 한정되야 한다
  - [x] 지뢰 매설 위치 개수는 지뢰의 개수와 같다
