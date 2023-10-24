package com.lsw.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@EnableAsync
public class ScheduleClass {
    /**
     * Cron 표현식을 사용한 작업 예약
     * 초(0-59) 분(0-59) 시간(0-23) 일(1-31) 월(1-12) 요일(0-7)
     */
    @Scheduled(cron = "0 * * * * *")
    public void scheduleTest() {
        String logId = String.valueOf(Thread.currentThread().getId());
        log.info("1분마다 확인하는 logId {}.",logId);
    }
}
