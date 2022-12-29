package com.jinyoung.memoserver.service

import com.jinyoung.memoserver.dto.CreateMemoDto
import com.jinyoung.memoserver.entity.Memo
import com.jinyoung.memoserver.repository.MemoRepository
import org.springframework.stereotype.Service

@Service
class MemoService(private val memoRepository: MemoRepository) {
    fun getMemos(): List<Memo> {
        return memoRepository.findAll()
    }

    fun createMemo(body: CreateMemoDto): Memo {
        body.apply {
            return memoRepository.save(Memo(title, content))
        }
    }

    fun deleteMemoById(id: Long) {
        return memoRepository.deleteById(id)
    }
}
