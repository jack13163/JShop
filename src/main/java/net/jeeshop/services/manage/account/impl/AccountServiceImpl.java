package net.jeeshop.services.manage.account.impl;import net.jeeshop.core.ServersManager;import net.jeeshop.services.manage.account.AccountService;import net.jeeshop.services.manage.account.bean.Account;import net.jeeshop.services.manage.account.dao.AccountDao;import org.apache.commons.lang.StringUtils;import org.springframework.stereotype.Service;import javax.annotation.Resource;@Service("manageAccountServiceImpl")public class AccountServiceImpl extends ServersManager<Account, AccountDao> implements		AccountService {    @Resource(name="manageAccountDaoImpl")    @Override    public void setDao(AccountDao accountDao) {        this.dao = accountDao;    }	/**	 * 批量删除	 * 	 * @param ids	 * @return	 */	public int deletes(String[] ids) {		if (ids == null || ids.length == 0) {			throw new NullPointerException("id不能全为空！");		}				for (int i = 0; i < ids.length; i++) {			if(StringUtils.isBlank(ids[i])){				throw new NullPointerException("id不能为空！");			}			dao.deleteById(Integer.parseInt(ids[i]));		}		return 0;	}	}