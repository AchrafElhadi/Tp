package metier;

import dao.IDao;

@Component
public class MetierImpl implements IMetier {

	@Autowired
	private IDao dao;
	@Override
	public double calcule() {
		// TODO Auto-generated method stub
		double d=dao.getData();
		double res=d*20;
		return res;
	}
	
	public void setDao(IDao dao) {
		this.dao = dao;
	}
	

}
