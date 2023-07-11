package com.awsTest.aws.repository;

import com.awsTest.aws.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
