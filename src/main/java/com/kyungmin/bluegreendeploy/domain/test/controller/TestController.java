package com.kyungmin.bluegreendeploy.domain.test.controller;

import com.kyungmin.bluegreendeploy.domain.test.controller.request.CreateTestRequest;
import com.kyungmin.bluegreendeploy.domain.test.controller.response.DetailTestResponse;
import com.kyungmin.bluegreendeploy.domain.test.controller.response.ListTestResponse;
import com.kyungmin.bluegreendeploy.domain.test.service.TestService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
@Tag(name = "Test", description = "테스트 관련 API")
public class TestController {
  private final TestService testService;

  @PostMapping
  @Operation(summary = "테스트 생성")
  public ResponseEntity<Void> createTest(@RequestBody @Valid CreateTestRequest request) {
    testService.createTest(request);
    return ResponseEntity.ok().build();
  }

  @GetMapping("/{testId}")
  @Operation(summary = "테스트 상세 조회")
  public ResponseEntity<DetailTestResponse> getTest(@PathVariable("testId") Long testId) {
    return ResponseEntity.ok(testService.getTest(testId));
  }

  @GetMapping
  @Operation(summary = "테스트 목록 조회")
  public ResponseEntity<ListTestResponse> getTestList() {
    return ResponseEntity.ok(testService.getTestList());
  }
}
