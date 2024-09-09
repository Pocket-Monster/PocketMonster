# 깃허브 사용 방법

### < 프로젝트 불러오기 >
1. cmd 창에서 git clone https://github.com/Pocket-Monster/PocketMonster.git 명령어 입력 (깃허브에 있는 프로젝트 다운로드)
2. IntelliJ로 프로젝트 오픈
3. IntelliJ에서 터미널 창 오픈
4. git remote -v (연결 잘 되었는지 확인)
   <br><img src="https://github.com/user-attachments/assets/ad497408-d88b-4ee4-a456-743410f0612f" width=500/>
6. git branch (현재 브랜치 위치 알려줌, 초록색이 현 브랜치)
   <br><img src="https://github.com/user-attachments/assets/3f9a429b-6b86-427d-a2aa-d07d5ccb89c4" width=500/>
8. git checkout {변경할 브랜치 명} (입력한 브랜치로 이동)
9. git branch (브랜치 이동이 잘 되었는지 확인)
    <br><img src="https://github.com/user-attachments/assets/8fc5e0b5-3191-4a32-9416-b8de628c8687" width=500/>
11. git pull origin {브랜치 명}  (브랜치의 변경사항 불러옴, 코드 수정 전 항상 pull하기!!!)
12. 개발 시작!

### < 깃허브에 변경사항 올리기 >
1. git add {변경된 파일 경로명} (모든 파일을 올릴 거면 경로명에 . 쓰면 됨. 근데 변경된 파일만 커밋하는 걸 추천)
2. git commit -m "메세지 내용"
3. git push origin {브랜치 명}
4. 깃허브 사이트 들어가서 잘 됐는지 확인


### Swing 팀
- ~24.09.04 : 각자 Swing에 관해 공부, 개발 틀 잡기 (패널 별 컴포넌트 종류 및 위치 등)
- ~24.09.06 : 메인 화면, 캐릭터 선택 화면 등 초기 화면 만들기
- ~24.09.08 : 이벤트 리스너 이용해서 화면 전환 구현
- ~24.09.10 : 게임 지도 세팅, 스레드 사용하여 메인 캐릭터 이동 구현
