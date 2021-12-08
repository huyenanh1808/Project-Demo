package com.chien.tb.binhchien.dto;

import com.chien.tb.binhchien.domain.BaseObject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BaseObjectDto {
    protected UUID id;
    protected LocalDateTime createDate;
    protected String createBy;
    protected LocalDateTime modifyDate;
    protected String modifyBy;

    public BaseObjectDto(BaseObject entity) {
        this.id = entity.getId();
        this.createBy = entity.getCreateBy();
        this.createDate = entity.getCreateDate();
        this.modifyBy = entity.getModifyBy();
        this.modifyDate = entity.getModifyDate();
    }
}
