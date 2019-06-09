# spring-vue-integration

### Spring(BE) + Vue(FE) integration project

- Spring(BE framework)과 (React, Vue, Angular)FE framework 연동 환경 구축
- 현재 가장 많이 사용하고 있는 (BE)Spring과 (FE)Vue.js 연동 프로젝트

### 환경 설정

- Spring framework의 경우, 기본 세팅을 따라감
- FE(Vue.js)의 경우, webpack build 후 생성되는 파일들을 resources & web-inf 아래로 지정
- Vue(2.6.10) & Spring boot 2.1.1(jdk 1.8)

### 실행 순서 (FE build -> BE build)
<pre><code>
// FE build
npm install
npm run build
// BE build
java build
</code></pre>

