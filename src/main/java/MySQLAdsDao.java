import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class MySQLAdsDao implements Ads{
    private List<Ad> ads;
    private Connection connection;
    private Statement statement;
    public MySQLAdsDao(Config config) throws SQLException {
        if (ads == null) {
            ads = generateAds();
        }
        DriverManager.registerDriver(new Driver());
        this.connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
        statement = connection.createStatement();
        statement.execute("use adlister_db");
    }

    @Override
    public List<Ad> all() throws SQLException {

        ResultSet rs = statement.executeQuery("SELECT * FROM ads");
        while (rs.next()) {
            Ad ad = new Ad(rs.getInt("id"),
                    rs.getLong("user_Id"),
                    rs.getString("title"),
                    rs.getString("description"));
            ads.add(ad);
        }
        return ads;
    }

    public Long insert(Ad ad) throws SQLException {

        String query = "INSERT INTO ads(id, user_id, title, description) VALUES "
                + ad.getId() + ", "
                + ad.getUserId() + ", "
                + ad.getTitle() + ", "
                + ad.getDescription();
        statement.execute(query);
        ads.add(ad);
        return ad.getId();
    }

    private List<Ad> generateAds() {
        List<Ad> ads = new ArrayList<>();
        ads.add(new Ad(
                1,
                1,
                "playstation for sale",
                "This is a slightly used playstation"
        ));
        ads.add(new Ad(
                2,
                1,
                "Super Nintendo",
                "Get your game on with this old-school classic!"
        ));
        ads.add(new Ad(
                3,
                2,
                "Junior Java Developer Position",
                "Minimum 7 years of experience required. You will be working in the scripting language for Java, JavaScript"
        ));
        ads.add(new Ad(
                4,
                2,
                "JavaScript Developer needed",
                "Must have strong Java skills"
        ));
        return ads;
    }
}
