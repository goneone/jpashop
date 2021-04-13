package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final EntityManager em;

    public Long save(Member member) {
        em.persist(member);
        return member.getId();
    }
    public Member findOne(Long id) { //한명 조회
        return em.find(Member.class, id);
    }

    public List<Member> findAll() { //전체 조회
        return em.createQuery("select m from Member m", Member.class)
                .getResultList();
    }

    public List<Member> findbyName(String name) {
        return em.createQuery("select m from Member m where m.name = :name" , Member.class)
                .setParameter("name", name)
                .getResultList();
    }
}