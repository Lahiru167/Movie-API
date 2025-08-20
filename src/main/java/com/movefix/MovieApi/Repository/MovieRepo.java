package com.movefix.MovieApi.Repository;

import com.movefix.MovieApi.Entities.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepo extends JpaRepository<MovieEntity,Integer> {



}
