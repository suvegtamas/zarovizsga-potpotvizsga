package hu.nive.ujratervezes.zarovizsga.housecup;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HouseCup {
    private DataSource dataSource;

    public HouseCup(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public int getPointsOfHouse(String house) {

        try(Connection conn = dataSource.getConnection();
            PreparedStatement stmt = conn.prepareStatement("select sum(points_earned) as points from house_points where house_name = ?;")) {
            stmt.setString(1,house);
            return getResultSetByStatement(stmt);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can't connect!");
        }

    }

    private int getResultSetByStatement(PreparedStatement stmt) throws SQLException {
        try(ResultSet rs = stmt.executeQuery()) {
            while(rs.next()) {
                return rs.getInt("points");
            }
        }
        throw new IllegalArgumentException("No record!");
    }
}
