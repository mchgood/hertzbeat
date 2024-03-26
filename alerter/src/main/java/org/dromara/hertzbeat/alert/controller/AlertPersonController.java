package org.dromara.hertzbeat.alert.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * Alert person controller
 */
@Tag(name = "Alert person API | 告警通知人API")
@RestController
@RequestMapping(path = "/api/person", produces = {APPLICATION_JSON_VALUE})
public class AlertPersonController {

}
