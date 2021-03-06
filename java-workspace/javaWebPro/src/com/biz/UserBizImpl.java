package com.biz;

import java.util.List;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.entity.SysUser;

public class UserBizImpl implements UserBiz {

	UserDao ud = new UserDaoImpl();
	
	@Override
	public SysUser login(String userName, String password)
			throws ClassNotFoundException {
		return ud.login(userName, password);
	}

	@Override
	public List<SysUser> queryUserList() {
		return ud.queryUserList();
	}

	@Override
	public List<SysUser> queryUserList(int startIndex, int size) {
		return ud.queryUserList(startIndex, size);
	}

	@Override
	public int queryUserCount() {
		return ud.queryUserCount();
	}

	@Override
	public List<SysUser> queryUserList(int startIndex, int size,
			String userName, String userRole) {
		return ud.queryUserList(startIndex, size, userName, userRole);
	}

	@Override
	public int queryUserCount(String userName, String userRole) {
		return ud.queryUserCount(userName, userRole);
	}

	@Override
	public boolean updateUserImg(String userName, String imgUrl) {
		return ud.updateUserImg(userName, imgUrl);
	}

}
