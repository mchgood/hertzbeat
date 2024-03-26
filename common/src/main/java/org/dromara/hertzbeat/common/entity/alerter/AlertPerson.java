package org.dromara.hertzbeat.common.entity.alerter;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.dromara.hertzbeat.common.support.valid.PhoneNumValid;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import static io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY;
import static io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_WRITE;

/**
 * Alert person entity
 */
@Entity
@Table(name = "hzb_alert_person")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Alert person entity | 告警通知人实体")
@EntityListeners(AuditingEntityListener.class)
public class AlertPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "snow-flake-id")
    @GenericGenerator(name = "snow-flake-id", strategy = "org.dromara.hertzbeat.common.util.SnowFlakeIdGenerator")
    @Schema(title = "Alarm record entity primary key index ID",
            description = "告警通知人实体主键索引ID",
            example = "87584674384", accessMode = READ_ONLY)
    private Long id;

    @Schema(title = "Alert person name",
            description = "告警通知人名称",
            example = "张三", accessMode = READ_WRITE)
    @Length(max = 255)
    private String username;

    @Schema(title = "Alert person ID",
            description = "告警通知人ID",
            example = "8743267443543", accessMode = READ_WRITE)
    private String userId;

    @Schema(title = "Alert person phone number",
            description = "告警通知人手机号",
            example = "18888888888", accessMode = READ_WRITE)
    @PhoneNumValid
    private String phoneNumber;

    @Schema(title = "Alert person type",
            description = "告警通知人类型",
            example = "5")
    /*
     4: wechat, 5: dingtalk
    */
    private byte type;
}
