package com.greg.converter.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CurrencyRepository extends CrudRepository<Currency, Long> {
    List<Currency> findAllByCode(@Param ("code") String code);

}

