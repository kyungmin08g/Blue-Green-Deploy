package com.kyungmin.bluegreendeploy.domain.test.service;

import com.kyungmin.bluegreendeploy.domain.test.controller.response.DetailTestResponse;
import com.kyungmin.bluegreendeploy.domain.test.repository.DetailTestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class DetailTestService {

  private final DetailTestRepository detailTestRepository;

  /**
   * 테스트 상세 조회
   */
  public DetailTestResponse getTest(Long testId) {
    DetailTestResponse response = detailTestRepository.getTest(testId);
    if (response == null) throw new RuntimeException("존재하지 않는 TEST ID입니다.");
    return response;
  }
}
