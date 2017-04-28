import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ShapeEntityManager {
	public static ArrayList<Shape> getShapes(int userId) {
		String query = "select * from shape where user_id = " + userId;
		ArrayList<Shape> list = new ArrayList<Shape>();
		DBManager.Open("paint", "root", "");
		try {
			ResultSet resultSet = DBManager.getStatement().executeQuery(query);
			while (resultSet.next()) {
				switch (resultSet.getString("shape_type")) {
				case "rectangle":
					list.add(new Rectangle(resultSet.getInt("id"), resultSet.getInt("s_x"), resultSet
							.getInt("s_y"), resultSet.getInt("e_x"), resultSet
							.getInt("e_y"), resultSet.getString("color"),
							resultSet.getString("shape_type"),true));
					break;
				case "circle":
					list.add(new Circle(resultSet.getInt("id"),resultSet.getInt("s_x"), resultSet
							.getInt("s_y"), resultSet.getInt("e_x"), resultSet
							.getInt("e_y"), resultSet.getString("color"),
							resultSet.getString("shape_type"),true));
					break;
				case "line":
					list.add(new Line(resultSet.getInt("id"),resultSet.getInt("s_x"), resultSet
							.getInt("s_y"), resultSet.getInt("e_x"), resultSet
							.getInt("e_y"), resultSet.getString("color"),
							resultSet.getString("shape_type"),true));
					break;
				}
			}
			DBManager.Close();
			resultSet.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public static void saveShapes(ArrayList<Shape> list, int userId) {
		DBManager.Open("paint", "root", "");
		for (Shape shape : list) {
			if (!shape.isSave()) {
				try {
					DBManager.getStatement().executeLargeUpdate(
							"insert into shape values(" + null + ","
									+ shape.getsX() + "," + shape.getsY() + ","
									+ shape.geteX() + "," + shape.geteY()
									+ ",'" + shape.getColor() + "','"
									+ shape.getShapeType() + "'," + userId
									+ ")");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if(shape.isModified())
			{
				try {
					DBManager.getStatement().executeUpdate("update shape set color = '" + shape.getColor()+"' where id = " + shape.getId());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		DBManager.Close();
	}
}
