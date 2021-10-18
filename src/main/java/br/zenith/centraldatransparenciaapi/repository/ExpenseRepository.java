package br.zenith.centraldatransparenciaapi.repository;

import br.zenith.centraldatransparenciaapi.model.Expense;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long>, PagingAndSortingRepository<Expense, Long> {

	public List<Expense> getAllByCityId(Long cityId, Pageable page);

	public List<Expense> getAllByCityId(Long cityId);

	public int countAllByCityId(Long cityId);
}
