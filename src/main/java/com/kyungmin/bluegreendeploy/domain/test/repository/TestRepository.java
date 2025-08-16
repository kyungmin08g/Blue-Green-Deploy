package com.kyungmin.bluegreendeploy.domain.test.repository;

import com.kyungmin.bluegreendeploy.domain.test.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {
}
