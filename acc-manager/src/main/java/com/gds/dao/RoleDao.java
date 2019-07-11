package com.gds.dao;

import java.util.List;
import java.util.Map;

import com.gds.bean.Role;
import org.apache.ibatis.annotations.Select;

public interface RoleDao {

	List<Role> pageQueryData(Map<String, Object> map);

	int pageQueryCount(Map<String, Object> map);

	@Select("select * from t_role")
	List<Role> queryAll();

	void insertRolePermission(Map<String, Object> paramMap);

	void deleteRolePermissions(Map<String, Object> paramMap);

}
