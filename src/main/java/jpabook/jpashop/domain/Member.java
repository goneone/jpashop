package jpabook.jpashop.domain;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String Name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member") //오더테이블에 있는 memeber 컬럼에 맵핑 되어있다. //읽기전용
    private List<Order> order = new ArrayList<>();

 }
