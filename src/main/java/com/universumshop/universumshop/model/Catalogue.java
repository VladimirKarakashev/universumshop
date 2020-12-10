package com.universumshop.universumshop.model;

import javax.persistence.*;

@Entity
@Table(name = "catalogue")
public class Catalogue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "img_path", nullable = false)
    private String img_path;

    @Column(name = "description", nullable = false)
    private String description;

}
