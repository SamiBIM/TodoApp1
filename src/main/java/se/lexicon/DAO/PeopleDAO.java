package se.lexicon.DAO;

import se.lexicon.Model.Person;

import java.util.Collection;

public interface PeopleDAO {

    public Person create(Person person);

    public Collection<Person> findAll();

    public Person findById(int id);

    public Person update(Person person);

    public boolean deleteById(int id);
}
