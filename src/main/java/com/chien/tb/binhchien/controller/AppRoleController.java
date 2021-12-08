package com.chien.tb.binhchien.controller;

import com.chien.tb.binhchien.dto.AppRoleDto;
import com.chien.tb.binhchien.dto.AppRoleSearchDto;
import com.chien.tb.binhchien.response.BINHCHIENResponse;
import com.chien.tb.binhchien.service.AppRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/role")
public class AppRoleController {
    @Autowired
    private AppRoleService appRoleService;

    @PostMapping
    public BINHCHIENResponse<?> create(@RequestBody AppRoleDto dto) {
        return appRoleService.saveOrUpdate(null, dto);
    }

    @PutMapping("/{id}")
    public BINHCHIENResponse<?> create(@PathVariable UUID id,@RequestBody AppRoleDto dto) {
        return appRoleService.saveOrUpdate(id, dto);
    }

    @GetMapping("/{id}")
    public BINHCHIENResponse<?> getById(@PathVariable UUID id) {
        return appRoleService.getById(id);
    }

    @DeleteMapping("/{id}")
    public BINHCHIENResponse<?> delete(@PathVariable UUID id) {
        return appRoleService.delete(id);
    }

    @PostMapping("/searchByPage")
    public BINHCHIENResponse<?> searchByPage(@RequestBody AppRoleSearchDto searchDto) {
        return appRoleService.searchByPage(searchDto);
    }


}
