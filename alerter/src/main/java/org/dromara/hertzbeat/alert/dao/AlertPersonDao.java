package org.dromara.hertzbeat.alert.dao;

import org.dromara.hertzbeat.common.entity.alerter.AlertPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Alert person dao
 */
public interface AlertPersonDao extends JpaRepository<AlertPerson, Long>, JpaSpecificationExecutor<AlertPerson> {

}
