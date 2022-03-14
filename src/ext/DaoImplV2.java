package ext;

import dao.IDao;

public class DaoImplV2 implements IDao{

	@Override
	public double getData() {
		// TODO Auto-generated method stub
		System.out.println("version web service");
		return 300;
	}

}
