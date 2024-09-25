package com.spring_repository_esericio.repositories;

import com.spring_repository_esericio.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = {"http://localhost:5500"})
@RepositoryRestResource(path = "repo-prog-languages", collectionResourceDescription = @Description("The repository for programming languages"))
public interface CarRepository extends JpaRepository<Car,Long> {

}
