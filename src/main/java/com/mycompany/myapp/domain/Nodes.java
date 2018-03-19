package com.mycompany.myapp.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A Nodes.
 */
@Entity
@Table(name = "nodes")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Nodes implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Size(max = 100)
    @Column(name = "master_url", length = 100)
    private String masterUrl;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMasterUrl() {
        return masterUrl;
    }

    public Nodes masterUrl(String masterUrl) {
        this.masterUrl = masterUrl;
        return this;
    }

    public void setMasterUrl(String masterUrl) {
        this.masterUrl = masterUrl;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Nodes nodes = (Nodes) o;
        if (nodes.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), nodes.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Nodes{" +
            "id=" + getId() +
            ", masterUrl='" + getMasterUrl() + "'" +
            "}";
    }
}
