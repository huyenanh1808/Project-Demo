package com.chien.tb.binhchien.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "app_role")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppRole extends BaseObject{
    @Column(name = "Role_Name", length = 30, nullable = false)
    private String roleName;
}
