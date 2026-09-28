package com.github.azadan.minimalisturl.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;
import lombok.Getter;


@MappedSuperclass
@Getter
public abstract class AbstactedJpaVersionedAuditableEntity extends AbstractJpaAuditableEntity {

    @Version
    @Column(name = "version", nullable = false)
    private Long version;
}
