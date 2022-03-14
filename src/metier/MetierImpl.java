package metier;

import dao.IDao;

public class MetierImpl implements IMetier {

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
