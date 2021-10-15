package br.zenith.centraldatransparenciaapi.repository;

import br.zenith.centraldatransparenciaapi.model.Expense;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long>, PagingAndSortingRepository<Expense, Long> {

	public List<Expense> getAllByCityCityId(Long cityId);

}
