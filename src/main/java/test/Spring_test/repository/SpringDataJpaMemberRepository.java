package test.Spring_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.Spring_test.domain.Member;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    // select m from Member m when m.name = ?
    @Override
    Optional<Member> findByName(String name);
}
