package springcloud.authservice.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springcloud.authservice.entity.Account;


/**
 * 处理数据到mongodb数据库
 * 
 * @author leftso
 *
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
	/**
	 * 参照spring data jpa 可以根据方法名称查询出数据无需实现
	 * @param name
	 * @return
	 */
	Account findByName(String name);
}