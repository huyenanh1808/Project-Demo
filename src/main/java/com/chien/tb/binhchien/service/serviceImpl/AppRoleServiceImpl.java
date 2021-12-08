package com.chien.tb.binhchien.service.serviceImpl;

import com.chien.tb.binhchien.constant.ErrorCodeEnum;
import com.chien.tb.binhchien.domain.AppRole;
import com.chien.tb.binhchien.dto.AppRoleDto;
import com.chien.tb.binhchien.dto.AppRoleSearchDto;
import com.chien.tb.binhchien.repository.AppRoleRepository;
import com.chien.tb.binhchien.response.BINHCHIENResponse;
import com.chien.tb.binhchien.service.AppRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
@Transactional
public class AppRoleServiceImpl implements AppRoleService {

    @Autowired
    private AppRoleRepository appRoleRepository;

    @Override
    public BINHCHIENResponse<?> saveOrUpdate(UUID id, AppRoleDto dto) {
        String roleName = dto.getRoleName();
        if (dto == null || roleName == null)
            return new BINHCHIENResponse<AppRoleDto>(ErrorCodeEnum.NO_INPUT.getCode(),
                    ErrorCodeEnum.NO_INPUT.getMessage(),
                    null, 1);
        if (appRoleRepository.existsAppRoleByRoleName(roleName.toUpperCase()))
            return new BINHCHIENResponse<AppRoleDto>(ErrorCodeEnum.ROLE_NAME_EXIST.getCode(),
                    ErrorCodeEnum.ROLE_NAME_EXIST.getMessage(),
                    null, 1);
        AppRole appRole;
        if (id != null && appRoleRepository.existsById(id)) {
            appRole = appRoleRepository.getOne(id);
            appRole.setModifyDate(LocalDateTime.now());
        } else {
            appRole = new AppRole();
            appRole.setCreateDate(LocalDateTime.now());
        }
        if (StringUtils.hasText(roleName))
            appRole.setRoleName(roleName.toUpperCase());
        appRole = appRoleRepository.save(appRole);
        return new BINHCHIENResponse<AppRoleDto>(new AppRoleDto(appRole), 200);
    }

    @Override
    public BINHCHIENResponse<?> getById(UUID id) {
        if (id == null)
            return new BINHCHIENResponse<AppRoleDto>(ErrorCodeEnum.NO_INPUT.getCode(),
                    ErrorCodeEnum.NO_INPUT.getMessage(),
                    null, 1);
        if (!appRoleRepository.existsById(id))
            return new BINHCHIENResponse<AppRoleDto>(ErrorCodeEnum.ID_NOT_FOUND.getCode(),
                    ErrorCodeEnum.ID_NOT_FOUND.getMessage(),
                    null, 1);
        return new BINHCHIENResponse<AppRoleDto>(new AppRoleDto(appRoleRepository.getOne(id)), 200);
    }

    @Override
    public BINHCHIENResponse<?> delete(UUID id) {
        if (id == null)
            return new BINHCHIENResponse<AppRoleDto>(ErrorCodeEnum.NO_INPUT.getCode(),
                    ErrorCodeEnum.NO_INPUT.getMessage(),
                    null, 1);
        if (!appRoleRepository.existsById(id))
            return new BINHCHIENResponse<AppRoleDto>(ErrorCodeEnum.ID_NOT_FOUND.getCode(),
                    ErrorCodeEnum.ID_NOT_FOUND.getMessage(),
                    null, 1);
        appRoleRepository.deleteById(id);
        return new BINHCHIENResponse<>(true, 200);
    }

    @Override
    public BINHCHIENResponse<?> searchByPage(AppRoleSearchDto dto) {
        if (dto == null )
            return new BINHCHIENResponse<>(ErrorCodeEnum.NO_INPUT.getCode(),
                    ErrorCodeEnum.NO_INPUT.getMessage(),
                    null, 1);
        int pageIndex = dto.getPageIndex() > 0  ? dto.getPageIndex() : 1;
        int pageSize = dto.getPageSize() > 0  ? dto.getPageSize() : 10;

        if (pageIndex > 0) {
            pageIndex--;
        } else {
            pageIndex = 0;
        }
//
//        String whereClause = "";
//        String sqlCount = "select count(e.id) from NimpeCategory as e where (1=1) ";
//        String sql = "select new com.globits.nimpe.dto.NimpeCategoryDto(e) from NimpeCategory as e where (1=1) ";
//        String orderBy = "";
//
//        if (StringUtils.hasText(dto.getText()))
//            whereClause += "AND ( e.code LIKE :text or "
//                    + " e.title LIKE :text or "
//                    + " e.description LIKE :text or "
//                    + " e.slug LIKE :text or "
//                    + " e.positionIndex LIKE :text or "
//                    + " e.linkUrl LIKE :text )";
//
//        sql += whereClause + orderBy;
//        sqlCount += whereClause;
//        Query q = manager.createQuery(sql,NimpeCategoryDto.class);
//        Query qCount = manager.createQuery(sqlCount);
//
//        if (StringUtils.hasText(dto.getText())) {
//            q.setParameter("text", '%' + dto.getText().trim() + '%');
//            qCount.setParameter("text", '%' + dto.getText().trim() + '%');
//        }
//
//        int startPosition = pageIndex * pageSize;
//        q.setFirstResult(startPosition);
//        q.setMaxResults(pageSize);
//        List<NimpeCategoryDto> entities = q.getResultList();
//
//        Pageable pageable = PageRequest.of(pageIndex, pageSize);
//        long count = (long) qCount.getSingleResult();
//
//        return new BINHCHIENResponse<Page<AppRoleDto>>(new PageImpl(entities, pageable, count),200);
        return null;
    }
}
