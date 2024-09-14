package se.lexicon.DAO;

import se.lexicon.Model.Person;
import se.lexicon.config.db.JDBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PeopleDaoJBDC implements PeopleDAO{

    /*
    *         String query = "insert into city(name, countrycode, district, population) values(?, ?, ?, ?)";
        try (
                Connection connection = MySQLConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)
        ) {
            preparedStatement.setString(1, city.getName());
            preparedStatement.setString(2, city.getCountryCode());
            preparedStatement.setString(3, city.getDistrict());
            preparedStatement.setInt(4, city.getPopulation());

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("City created successfully!!!");
                try (
                        ResultSet generatedKeys = preparedStatement.getGeneratedKeys()
                ) {
                    if (generatedKeys.next()) {
                        int generatedCityId = generatedKeys.getInt(1);
                        city.setId(generatedCityId);
                        System.out.println("Generated City Id: " + city.getId());
                    }
                }
            } else {
                throw new IllegalArgumentException("Creation operation failed...");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return city;
    * */
    @Override
    public Person create(Person person) {
        String query = "insert into person( person_id, first_name, last_name ) values(?, ?, ?)";
        Connection connection = JDBConnection.getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)){

            preparedStatement.setString(1, String.valueOf(person.getId()));
            preparedStatement.setString(2, person.getFirstName());
            preparedStatement.setString(3, person.getLastName());

            boolean execute = preparedStatement.execute();


            if ( execute ) {
                System.out.println("Person created successfully!!!");
            } else {
                throw new IllegalArgumentException("Creation operation failed...");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return person;
    }

    @Override
    public Collection<Person> findAll() {
        return Collections.emptyList();
    }

    @Override
    public Person findById(int id) {
        return null;
    }

    @Override
    public Person update(Person person) {
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
