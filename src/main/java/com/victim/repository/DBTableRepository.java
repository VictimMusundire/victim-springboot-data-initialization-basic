package com.victim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.victim.entity.DBTable;
@Repository
public interface DBTableRepository extends JpaRepository<DBTable, Long> {

}
