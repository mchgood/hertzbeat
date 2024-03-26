package org.dromara.hertzbeat.alert.service.impl;

import org.dromara.hertzbeat.alert.dao.AlertPersonDao;
import org.dromara.hertzbeat.alert.service.AlertPersonService;
import org.dromara.hertzbeat.common.entity.alerter.AlertPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AlertPersonServiceImpl implements AlertPersonService {

    @Autowired
    private AlertPersonDao alertPersonDao;

    /**
     * Add alert person
     *
     * @param alertPerson Alert person entity
     */
    @Override
    public void addAlertPerson(AlertPerson alertPerson) {
        alertPersonDao.save(alertPerson);
    }

    /**
     * Add alert person
     *
     * @param alertPersons Alert person entity list
     */
    @Override
    public void addAlertPersons(List<AlertPerson> alertPersons) {
        alertPersonDao.saveAll(alertPersons);
    }

    /**
     * Delete alert person
     *
     * @param id Alert person ID
     */
    @Override
    public void deleteAlertPerson(Long id) {
        alertPersonDao.deleteById(id);
    }

    /**
     * Delete alert persons
     *
     * @param ids Alert person ID list
     */
    @Override
    public void deleteAlertPersons(List<Long> ids) {
        alertPersonDao.deleteAllById(ids);
    }

    /**
     * Delete all alert persons
     */
    @Override
    public void deleteAllAlertPersons() {
        alertPersonDao.deleteAll();
    }

    /**
     * Update alert person
     *
     * @param alertPerson Alert person entity
     */
    @Override
    public void updateAlertPerson(AlertPerson alertPerson) {
        alertPersonDao.save(alertPerson);
    }
}
