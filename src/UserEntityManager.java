import java.sql.ResultSet;
import java.sql.SQLException;

public class UserEntityManager {
	public static int isUserExist(String userName, String passWord) {
		String query = "select * from user where user_name = '" + userName
				+ "' and password = '" + passWord + "'";
		DBManager.Open("paint", "root", "");
		ResultSet resultSet = null;
		try {
			resultSet = DBManager.getStatement().executeQuery(query);
			resultSet.last();
			if (resultSet.getRow() > 0) {
				int i = 0;
				resultSet.beforeFirst();
				while (resultSet.next()) {
					i = resultSet.getInt("id");
				}
				return i;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBManager.Close();
		try {
			resultSet.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}

}
