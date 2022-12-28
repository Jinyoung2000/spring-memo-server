package com.jinyoung.memoserver.controller

import com.jinyoung.memoserver.dto.CreateMemoDto
import com.jinyoung.memoserver.entity.Memo
import com.jinyoung.memoserver.service.MemoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MemoController(private val memoService: MemoService) {
    @GetMapping("/memos")
    fun getMemos(): List<Memo> {
        return memoService.getMemos()
    }

    @PostMapping("/memos")
    fun createMemo(body: CreateMemoDto): Memo {
        return memoService.createMemo(body)
    }
}
