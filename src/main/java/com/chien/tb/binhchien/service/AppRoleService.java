package com.chien.tb.binhchien.service;

import com.chien.tb.binhchien.dto.AppRoleDto;
import com.chien.tb.binhchien.dto.AppRoleSearchDto;
import com.chien.tb.binhchien.response.BINHCHIENResponse;

import java.util.UUID;

public interface AppRoleService {
    BINHCHIENResponse<?> saveOrUpdate(UUID id, AppRoleDto dto);

    BINHCHIENResponse<?> getById(UUID id);

    BINHCHIENResponse<?> delete(UUID id);

    BINHCHIENResponse<?> searchByPage(AppRoleSearchDto searchDto);
}
