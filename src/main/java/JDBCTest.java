import java.sql.*;
import com.mysql.cj.jdbc.Driver;

public class JDBCTest {
    public static void main(String[] args) {
        try {
            // register driver
            // create connection
            // create statement
            // (Select) execute the query with statement
            // scroll through ResultSet to print album artists

            // register driver

            DriverManager.registerDriver(new Driver());

            // create connection

            Connection connection = DriverManager.getConnection(
                    // DB connection url
                    "jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true",
                    // DB username
                    Config.getUser(),
                    // DB password
                    Config.getPassword()
            );

            // create statement

            Statement statement = connection.createStatement();

            // (Select) execute the query with statement
            statement.executeQuery("use codeup_test_db");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM albums");

            resultSet.next(); // look at first result

            String firstArtist = resultSet.getString("artist");
            String firstAlbum = resultSet.getString("name");

            System.out.println(firstArtist);
            System.out.println(firstAlbum);





            // scroll through ResultSet to print album artists


            // id |         artist |                      name | release_date | sales | genre <------------ column names
            // 1  |              2 |                         3 |            4 |     5 |     6 <------------ column numbers


            // 1 | Michael Jackson |                  Thriller |         1982 |  47.3 | Pop, Rock, R&B
            // 2 |           AC/DC |             Back in Black |         1980 |  26.1 | Hard rock
            // 3 |      Pink Floyd | The Dark Side of the Moon |         1973 |  24.2 | Progressive rock
            //


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
