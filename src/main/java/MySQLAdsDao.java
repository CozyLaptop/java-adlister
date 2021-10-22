import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class MySQLAdsDao implements Ads{

    public MySQLAdsDao(Config config) throws SQLException {
        Connection connection = DriverManager.getConnection(
                // DB connection url
                "jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true",
                // DB username
                "albert",
                // DB password
                "Hyrule15!"
        );
    }
    @Override
    public List<Ad> all() {
        return null;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }
}
