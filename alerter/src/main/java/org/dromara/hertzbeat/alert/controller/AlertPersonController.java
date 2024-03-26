package org.dromara.hertzbeat.alert.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.dromara.hertzbeat.alert.service.AlertPersonService;
import org.dromara.hertzbeat.common.entity.alerter.AlertPerson;
import org.dromara.hertzbeat.common.entity.dto.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * Alert person controller
 */
@Tag(name = "Alert person API | 告警通知人API")
@RestController
@RequestMapping(path = "/api/person", produces = {APPLICATION_JSON_VALUE})
@Slf4j
public class AlertPersonController {

    @Autowired
    private AlertPersonService alertPersonService;

    @PostMapping("/add")
    @Operation(summary = "Add new alert person | 添加新的告警通知人", description = "Add new alert person")
    public ResponseEntity<Message<Void>> addNewAlertPerson(@RequestBody AlertPerson alertPerson) {
        try {
            alertPersonService.addAlertPerson(alertPerson);
        } catch (Exception e) {
            log.error("Add new alert person error", e);
            throw e;
        }
        return ResponseEntity.ok(Message.success());
    }

    @PostMapping("/delete")
    @Operation(summary = "Delete alert person | 删除告警通知人", description = "Delete alert person")
    public ResponseEntity<Message<Void>> deleteAlertPerson(@RequestBody Long id) {
        try {
            alertPersonService.deleteAlertPerson(id);
        } catch (Exception e) {
            log.error("Delete alert person error", e);
            throw e;
        }
        return ResponseEntity.ok(Message.success());
    }

    @PostMapping("/update")
    @Operation(summary = "Update alert person | 更新告警通知人", description = "Update alert person")
    public ResponseEntity<Message<Void>> updateAlertPerson(@RequestBody AlertPerson alertPerson) {
        try {
            alertPersonService.updateAlertPerson(alertPerson);
        } catch (Exception e) {
            log.error("Update alert person error", e);
            throw e;
        }
        return ResponseEntity.ok(Message.success());
    }

    @PostMapping("/deleteAll")
    @Operation(summary = "Delete all alert persons | 删除所有告警通知人", description = "Delete all alert persons")
    public ResponseEntity<Message<Void>> deleteAllAlertPersons() {
        try {
            alertPersonService.deleteAllAlertPersons();
        } catch (Exception e) {
            log.error("Delete all alert persons error", e);
            throw e;
        }
        return ResponseEntity.ok(Message.success());
    }

    @PostMapping("/deleteBatch")
    @Operation(summary = "Delete alert persons in batch | 批量删除告警通知人", description = "Delete alert persons in batch")
    public ResponseEntity<Message<Void>> deleteAlertPersons(@RequestBody List<Long> ids) {
        try {
            alertPersonService.deleteAlertPersons(ids);
        } catch (Exception e) {
            log.error("Delete alert persons error", e);
            throw e;
        }
        return ResponseEntity.ok(Message.success());
    }

}
