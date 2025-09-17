plugins {
    alias(libs.plugins.mju.feature)
    //이미 여기서 많은 의존성과 다른 플러그인들을 가져왔으니 정말 쉽죠?
}
//원래 있던 다른 sdk나 buildfeatures같은 코드들은 이제 빌드 로직에서 커스텀 플러그인으로 통합했으니 제거해줍시다!
android {
    namespace = "com.mju.home"
}

dependencies {
    //home이 의존하는 다른 부분을 넣어주면 되겠죠?
    //예를 들면 implementation(projects.domain.home) 이라던지 우리가 단일모듈 때 홈에서 어떤 코드들을 불러왔는지 생각해봅시다
}