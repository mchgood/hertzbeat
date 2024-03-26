package org.dromara.hertzbeat.alert.service;

import org.dromara.hertzbeat.common.entity.alerter.AlertPerson;

import java.util.List;

/**
 * Alert person service
 */
public interface AlertPersonService {

    /**
     * Add alert person
     * @param alertPerson Alert person entity
     */
    void addAlertPerson(AlertPerson alertPerson);

    /**
     * Add alert person
     * @param alertPersons Alert person entity list
     */
    void addAlertPersons(List<AlertPerson> alertPersons);

    /**
     * Delete alert person
     * @param id Alert person ID
     */
    void deleteAlertPerson(Long id);

    /**
     * Delete alert persons
     * @param ids Alert person ID list
     */
    void deleteAlertPersons(List<Long> ids);

    /**
     * Delete all alert persons
     */
    void deleteAllAlertPersons();

    /**
     * Update alert person
     * @param alertPerson Alert person entity
     */
    void updateAlertPerson(AlertPerson alertPerson);

}
