package com.jkk.study.server.controller;

import com.jkk.study.server.SecurityContext;
import com.jkk.study.server.model.message.MessageRequest;
import com.jkk.study.server.model.message.MessageResponse;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1/message")
public class MessageController {

    @GetMapping(value = "/{accId}")
    public Mono<String> getAllMessagesById(@PathVariable String accId) throws Exception {
    }

    @GetMapping(value = "/{accId}/{msgId}")
    public Mono<MessageResponse> getMessageByIdByMsgId(
            @PathVariable(value = "accId") String accId,
            @PathVariable(value = "msgId") String msgId) {
    }

    @PostMapping
    public Mono<MessageResponse> storeMessage(@RequestBody MessageRequest request, SecurityContext context) {

    }

    @PutMapping
    public Mono<MessageResponse> updateMessage(@RequestBody MessageRequest request, SecurityContext context) {

    }

    @DeleteMapping(value = "/{accId}/{msgId}")
    public Mono<MessageResponse> deleteMessage(
            @PathVariable(value = "accId") String accId,
            @PathVariable(value = "msgId") String msgId) {

    }
}
