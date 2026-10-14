package com.github.azadan.minimalisturl.miniLinks.entity;

import com.github.azadan.minimalisturl.jpa.AbstactedJpaVersionedAuditableEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;


@ToString(callSuper = true)
@Table(name = "mini_links")
@Entity
@Getter
@Setter

public class MiniLink extends AbstactedJpaVersionedAuditableEntity {

    @Id
    @GeneratedValue
    @Column(name = "id",
            nullable = false,
            updatable = false
    )
    private UUID id;


    @Column(name = "long_url",
            length = 2048,
            nullable = false
    )
    private String longUrl;

    @Column(name = "mini_link_key",
            length = 10,
            nullable = false,
            unique = true
    )
    private String miniLinkKey;

}
