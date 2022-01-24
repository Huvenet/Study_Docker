# Docker

# #import
[Docker란?[IBM]](https://www.ibm.com/kr-ko/cloud/learn/docker)

---


## Docker?

**`Docker`는 `Container`형 `Application`**의 **빌드, 배치, 관리 기능을 제공하는 오픈 소스 플랫폼**이다.

쉽게 말해 **`Docker`는 개발자가 개발한 `Source Code(Application)`를 실행하는 표준 방식을 제공**한다.


<br>

**`Docker`를 통해 개발자는 `Application`을, `Container`로 `Packaging`**할 수 있다.


`Docker`는 `Container` 를 위한 운영 체제(O/S)이다.

![img.png](img.png)


---

## Container?

**`Docker`에서 사용하는 `Container` 개념 이전**에,

**`Linux O/S`**에는 **`LinuXContainer(LXC)`라는 `Container` 기능이 2008년 부터 제공**되고 있었다. 

이 **`LinuXContainer(LXC)`**는 **단일 `Instance`에 대해 가상화 기능**을,

**Linux 커널 단에서 제공**한다.

<br>


## Container In Docker

**`Docker`는 이러한 `LinuXContainer(LXC)`에 아래와 같은 기능을 추가**하였다.

<br>

`Docker`에서 `Container`의 개념은,

**`Application` Source Code**를 **임의의 환경에서 실행하기 위해 필요한**,

**`O/S` Library 및 종속 항목**과 **결합**하여 **실행 가능한 표준 Component**이다.

이러한 **`Container`는 분산형으로 분화되는 Application의 실행 환경 Delivery를 간소화**해주며,

**Cloud 환경으로 이전되는 개발환경 상황에서 유용하게 사용**된다.

<br>



---
