package com.kyungmin.bluegreendeploy.domain.test.repository;

import com.kyungmin.bluegreendeploy.domain.test.controller.response.ListTestDto;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.kyungmin.bluegreendeploy.domain.test.QTest.test;

@Repository
@RequiredArgsConstructor
public class ListTestRepository {

  private final JPAQueryFactory queryFactory;

  /**
   * 테스트 목록 조회
   */
  public List<ListTestDto> getTestList() {
    return queryFactory
      .select(
        Projections.fields(
          ListTestDto.class,
          test.id.as("testId"),
          test.title,
          test.content
        )
      )
      .from(test)
      .fetch();
  }
}
