package com.bert.bertmusic.repository;

import com.bert.bertmusic.entity.TsUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TsUserRepository extends JpaRepository<TsUser, String> {

    List<TsUser> findByUsername(String username);

    TsUser getByUsername(String username);
}
