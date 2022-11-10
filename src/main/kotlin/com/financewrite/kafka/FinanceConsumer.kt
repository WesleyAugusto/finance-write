package com.financewrite.kafka

import com.financewrite.model.User
import io.micronaut.configuration.kafka.annotation.KafkaKey
import io.micronaut.configuration.kafka.annotation.KafkaListener
import io.micronaut.configuration.kafka.annotation.Topic

@KafkaListener
class FinanceConsumer {

    @Topic("insertFinance")
    fun receiveMessage(@KafkaKey key:String, user: User){
        println(key)
        println(user)
    }
}