# Docker

## 1. Docker란?
**`Container`를 사용하여 애플리케이션에 필요한 환경을 신속하게 구축하고 테스트 및 배포를 할 수 있게 해주는 플랫폼**

> - **Conainer**
> 
>   Host OS 상에서 리소스를 논리적으로 구분하여 별도의 서버인 것 처럼 사용할 수 있게하는 기술

## 2. 다른기술과 차이
1. Legacy
   - 하나의 물리서버
2. Hosted Hypervisor
   - VMWare, Virtual Box
3. Bare Metal Hypervisor
   - Hyper-v, XenServer
4. Container
   - Docker

## 3. Docker Image
- 컨테이너 실행에 필요한 파일과 설정값등을 포함하고 있는 틀
- Image를 기반으로 Container를 만듬

## 4. 예제

1. WSL2 설치
2. Docker Desktop 설치
3. Docker hub 가입
4. pubile repository 생성
5. spring project 생성
6. dockerfile 생성
7. dockerfile build
   - <code>docker build -t ${IMAGE_NAME:TAG} -f ./Dockerfile .</code><br>
   -t : 태그 옵션 image 버전관리를 쉽게 하기 위해<br>
   -f : Dockerfile의 위치 (현재 디렉토리일경우 생략 가능)
   - database
     - docker build -t ${IMAGE_NAME}
8. docker run
   1. local
      - <code>docker run --name &{CONTAINER_NAME} -d -p ${HOST_PORT}&#58;&#36;{CONTAINER_PORT} ${IMAGE_NAME:TAG}</code>
      - database
        - docker run --name ${DATABASE_NAME} -p {HOST_PORT}&#58;&#36;{CONTAINER_PORT} ${IMAGE_NAME}
   2. remote
      - <code>docker push ${USER_NAME}/&#36;{YOUR_REPO}</code>
      - `run`은 IMAGE_NAME을 USER_NAME/YOUR_REPO로 사용

<br>
<br>
<br>

> [참고]
> 
> [Docker란 무엇인가? 왜 사용할까?](https://myjamong.tistory.com/297)
>
> [Docker와 기존 가상화 기술의 차이 알아보기](https://devlog-wjdrbs96.tistory.com/279?category=902375)
>
> [가장 쉽게 배우는 도커](https://www.youtube.com/watch?v=hWPv9LMlme8)
>
> [서버 가상화 기술의 진화:VM과 컨테이너](https://library.gabia.com/contents/infrahosting/7426/)
> 
> [Docker 개념 정리 및 사용방법까지](https://cultivo-hy.github.io/docker/image/usage/2019/03/14/Docker%EC%A0%95%EB%A6%AC/)