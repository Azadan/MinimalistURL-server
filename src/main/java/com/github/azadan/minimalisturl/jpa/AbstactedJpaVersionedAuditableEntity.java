package com.github.azadan.minimalisturl.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.ToString;


@MappedSuperclass
@Getter
@ToString(callSuper = true)
public abstract class AbstactedJpaVersionedAuditableEntity extends AbstractJpaAuditableEntity {

    @Version
    @Column(name = "version", nullable = false)
    private Long version;
}
