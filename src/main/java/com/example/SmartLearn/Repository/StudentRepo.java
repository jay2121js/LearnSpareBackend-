package com.example.SmartLearn.Repository;

import com.example.SmartLearn.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
    @Query("""
       SELECT s FROM Student s 
       WHERE s.user.username = :input 
          OR s.user.email = :input
       """)
   Student findByUsernameOrEmail(@Param("input") String input);


}
