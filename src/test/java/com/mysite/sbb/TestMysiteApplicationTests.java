package com.mysite.sbb;

import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
@SpringBootTest
class TestMysiteApplicationTests {
    @Autowired
    private QuestionRepository questionrepository;


    @Test
    void testJpa() {
        Question q1 = new Question();
        q1.setSubject("sbb가 무엇인가요?");
        q1.setContent("sbb에 대해서 알고 싶습니다");
        q1.setCreateDate(LocalDateTime.now());
        this.questionrepository.save(q1);   // 첫 번째 질문 저장

        Question q2 = new Question();
        q2.setSubject("스프링부트 모델 질문입니다");
        q2.setContent("id는 자동으로 생성되나요?");
        q2.setCreateDate(LocalDateTime.now());
        this.questionrepository.save(q2);
    }
}