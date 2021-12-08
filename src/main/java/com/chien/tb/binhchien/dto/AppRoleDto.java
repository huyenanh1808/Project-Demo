package com.chien.tb.binhchien.dto;

import com.chien.tb.binhchien.domain.AppRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppRoleDto extends BaseObjectDto {
    private String roleName;

    public AppRoleDto(AppRole entity) {
        this.id = entity.getId();
        this.createBy = entity.getCreateBy();
        this.createDate = entity.getCreateDate();
        this.modifyBy = entity.getModifyBy();
        this.modifyDate = entity.getModifyDate();
        this.roleName = entity.getRoleName();
    }
}
