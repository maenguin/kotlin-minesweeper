# kotlin-minesweeper

# 🚀 4단계 - 지뢰 찾기(리팩터링)
## 기능 요구사항
지뢰 찾기를 변형한 프로그램을 구현한다.

- 기능 요구사항 3단계와 같다.
- 추가로 제공되는 객체 설계 힌트를 참고해 철저하게 TDD로 재구현해 본다.

## 실행 결과
```
높이를 입력하세요.
10

너비를 입력하세요.
10

지뢰는 몇 개인가요?
10

지뢰찾기 게임 시작
open: 1, 1
0 1 C C C C C C C C
0 1 C C C C C C C C
0 1 C C C C C C C C
1 1 C C C C C C C C
C C C C C C C C C C
C C C C C C C C C C
C C C C C C C C C C
C C C C C C C C C C
C C C C C C C C C C
C C C C C C C C C C

open: 4, 1
Lose Game.
```

## 기능 목록
### Position
(x, y) 좌표계의 특정 위치를 표현합니다
- [x] x, y 좌표를 가진다
- [x] 좌표가 0보다 작으면 예외가 발생한다
- [x] 최대 x값과 최대 y값이 주어졌을때 현재 위치에서 주변 8분면 중 탐색 가능한 위치를 추출할 수 있다
- [x] 최대 x값과 최대 y값 주어졌을때 해당 범위내 올 수 있는 모든 Position을 추출할 수 있다.

#### Positions
Position 리스트를 delegate 시킨 일급 컬렉션 입니다

#### OctantDelta
특정 위치에서 8분면으로 탐색할 수 있는 좌표의 변화량을 정의한 Enum 입니다

### MineMap
지뢰 찾기 게임에 사용되는 지뢰가 매설된 2차원 지도입니다
- [ ] 지도 설정값과 지뢰 매설 전략을 받아서 지도를 구성한다
- [ ] 특정 위치를 열었을때 빈칸이면 지뢰가 없는 인접한 칸이 모두 열린다
- [ ] 특정 위치를 열었을때 지뢰를 열었는지 알 수 있다
- [ ] 모든 빈칸이 열렸는지 확인할 수 있다

### MapItem
지뢰찾기 지도에서 위치 마다 존재하는 아이템입니다. 지뢰와 빈칸으로 구분됩니다.
- [ ] 아이템을 열 수 있다.
#### Mine
지뢰를 표현합니다.
#### Empty
빈칸을 표현합니다.
- [ ] 주변 8분면에 있는 지뢰의 개수를 가진다

### MineMapConfig
지뢰찾기 지도를 생성할때 필요한 설정값 모음입니다
- [x] 너비와 높이 그리고 지뢰 개수를 가진다
- [x] 너비와 높이는 1보다 커야하며 지뢰 개수는 0보다 커야 한다 그렇지 않으면 예외가 발생한다
- [x] 지뢰 개수가 너비와 높이의 곱보다 크면 예외가 발생한다

### MinePositioningStrategy
지뢰를 어떤 위치에 매설할지 결정하는 전략입니다
- [x] 지뢰를 매설할 위치를 추출할 수 있다

#### RandomMinePositionStrategy
지뢰 매설 위치가 랜덤으로 결정되는 전략입니다
- [ ] 지뢰 매설 위치는 지도의 내부로 한정되야 한다
- [ ] 지뢰 매설 위치는 매설되어야 하는 지뢰의 개수와 같다
#### FixedMinePositionStrategy
지뢰 매설 위치가 특정 위치로 고정된 전략입니다
- [ ] 지뢰 매설 위치가 지도의 내부가 아니면 예외가 발생한다
- [ ] 지뢰 매설 위치는 매설되어야 하는 지뢰의 개수와 같다

### MineSweeperGame
지뢰 찾기 게임을 제어하는 주체입니다
- [ ] 지뢰 찾기 게임을 시작할 수 있다
- [ ] 지뢰 찾기 게임 진행 상황을 보고 게임을 종료되었는지 판단할 수 있다
- [ ] 종료된 게임이 게이머의 승리인지 패배인지 알 수 있다
