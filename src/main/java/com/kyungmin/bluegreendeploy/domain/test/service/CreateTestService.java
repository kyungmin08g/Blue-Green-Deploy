package com.kyungmin.bluegreendeploy.domain.test.service;

import com.kyungmin.bluegreendeploy.domain.test.Test;
import com.kyungmin.bluegreendeploy.domain.test.controller.request.CreateTestRequest;
import com.kyungmin.bluegreendeploy.domain.test.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class CreateTestService {

  private final TestRepository testRepository;

  /**
   * 테스트 생성
   */
  public void createTest(CreateTestRequest request) {
    this.testRepository.save(
      Test.builder()
        .title(request.title())
        .content(request.content())
        .build()
    );
  }
}
