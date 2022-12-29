package com.jinyoung.memoserver.entity

import javax.persistence.*

@Entity
class User(
    val userName: String,
    val password: String,
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0

//    매핑될 해당 테이블의 컬럼이름을 적어야됨
    @OneToMany(mappedBy = "id")
    val memo: MutableList<Memo> = ArrayList()
}
