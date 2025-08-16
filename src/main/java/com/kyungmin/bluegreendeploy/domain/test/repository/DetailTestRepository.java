package com.kyungmin.bluegreendeploy.domain.test.repository;

import com.kyungmin.bluegreendeploy.domain.test.controller.response.DetailTestResponse;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import static com.kyungmin.bluegreendeploy.domain.test.QTest.test;

@Repository
@RequiredArgsConstructor
public class DetailTestRepository {

  private final JPAQueryFactory queryFactory;

  /**
   * 테스트 상세 조회
   */
  public DetailTestResponse getTest(Long testId) {
    return queryFactory
      .select(
        Projections.fields(
          DetailTestResponse.class,
          test.id.as("testId"),
          test.title,
          test.content
        )
      )
      .from(test)
      .where(test.id.eq(testId))
      .fetchOne();
  }
}
