package org.upgrad.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.upgrad.model.Movies;

import java.util.List;

@Repository
public interface MoviesRepository extends CrudRepository<Movies, Integer> {

    @Query(nativeQuery = true,value="SELECT * FROM MOVIES WHERE UPPER(NAME) = UPPER (?1) ")
    List<Movies> findMovieDetails(String name);
}