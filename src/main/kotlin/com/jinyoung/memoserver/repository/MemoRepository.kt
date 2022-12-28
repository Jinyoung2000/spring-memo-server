package com.jinyoung.memoserver.repository

import com.jinyoung.memoserver.entity.Memo
import org.springframework.data.jpa.repository.JpaRepository

interface MemoRepository: JpaRepository<Memo, Long> {
}
