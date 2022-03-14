package dao;

@Component("d")
public class DaoImpl implements IDao {

	@Override
	public double getData() {
		// TODO Auto-generated method stub
		return Math.pow(5, 2);
	}

}
