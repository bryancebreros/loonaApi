package com.bryan.loonaapi;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository extends JpaRepository<Member, Integer> {
}
