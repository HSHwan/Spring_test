package test.Spring_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import test.Spring_test.repository.MemberRepository;
import test.Spring_test.service.MemberService;

@Configuration
public class SpringConfig {

    /**
     * Spring Data JPA Type, Repository generate
     */
    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }

    /**
     * AOP - Bean 등록
     */

//    @Bean
//    public TimeTraceAop TimeTraceAop(){
//        return new TimeTraceAop();
//    }

    /**
     * JPA Type
     */
//    private EntityManager em;
//
//    @Autowired
//    public SpringConfig(EntityManager em) {
//        this.em = em;
//    }

    /**
     * JDBC & JDBCTemplate Type
     */
//    private DataSource dataSource;
//
//    @Autowired
//    public SpringConfig(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }

    /**
     * Memory, JDBC, JDBCTemplate, JPA Repository generate
     */
//    @Bean
//    public MemberRepository memberRepository(){
//        return new MemoryMemberRepository();
//        return new JdbcMemberRepository(dataSource);
//        return new JdbcTemplateMemberRepository(dataSource);
//        return new JpaMemberRepository(em);
//
//    }
}
