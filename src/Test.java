import net.blf2.DAO.DbDelete;
import net.blf2.DAO.DbQuery;
import net.blf2.DAO.DbUpdate;
import net.blf2.info.LoginInfo;
import net.blf2.info.LoginInfoFactory;
import net.blf2.staticfile.ILoginInfo;
/*
 * 单元测试：时间2016-1-24
 * Hibernate数据库操作测试无问题
 */
public class Test {
	public static void main(String[] args) {
		//String loginName = "blf2";
	//	String loginPswd = "blf2";
	//	String loginPswd2 = "blf3";
		/*Insert数据成功
		LoginInfoFactory lif = new LoginInfoFactory(loginName, loginPswd);
		ILoginInfo ili = lif.getLoginInfo();
		if (ili != null) {
			System.out.println(ili.getLoginName()+" "+ili.getLoginPswd());
		}*/
		/*query，update测试成功
		ILoginInfo ili = new DbQuery().queryLoginInfoByName(loginName);
		if(ili != null){
			System.out.println(ili.getLoginId()+" "+ili.getLoginName());
			System.out.println("按名查询成功");
			LoginInfo li = (LoginInfo) new DbQuery().queryLoginInfoById(ili.getLoginId());
			System.out.println(li.getLoginId()+" "+li.getLoginName());
			System.out.println("按ID查询成功");
			if(li != null){
				li.setLoginPswd(loginPswd2);
				new DbUpdate().updateLoginInfo(li);
				ILoginInfo ili1 = new DbQuery().queryLoginInfoByName(loginName);
				if(ili1 != null && loginPswd2.equals(ili1.getLoginPswd())){
					System.out.println("更新测试成功！");
				}
			}
		}
		*/
		/*删除测试成功
		LoginInfoFactory lif = new LoginInfoFactory("twg","twg");
		ILoginInfo ili = lif.getLoginInfo();
		if(ili != null){
			System.out.println("添加成功！");
		}
		LoginInfo li = (LoginInfo)new DbQuery().queryLoginInfoByName("twg");
		if(li != null){
			System.out.println("查询成功！");
			new DbDelete().deleteLoginInfo(li);
			ili = new DbQuery().queryLoginInfoByName("twg");
			if(ili == null){
				System.out.println("删除成功！");
			}else{
				System.out.println("删除没成功");
			}
		}
		*/
	}
}
