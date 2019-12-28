package com.gds.service;

import java.util.List;
import java.util.Map;

import com.gds.bean.Role;

public interface RoleService {
	List<Role> pageQueryData(Map<String, Object> map);

	int pageQueryCount(Map<String, Object> map);

	List<Role> queryAll();

	void insertRolePermission(Map<String, Object> paramMap);


}
