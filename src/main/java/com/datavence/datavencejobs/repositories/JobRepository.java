package com.datavence.datavencejobs.repositories;

import com.datavence.datavencejobs.models.Job;
import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<Job, Long> {
}