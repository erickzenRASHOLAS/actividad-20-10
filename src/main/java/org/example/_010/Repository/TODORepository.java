package org.example._010.Repository;

import org.springframework.stereotype.Repository;
import org.example._010.Model.TODO;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TODORepository extends JpaRepository<TODO, Integer> {
    }