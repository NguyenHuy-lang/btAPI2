package vn.com.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.com.entity.Taco;

@Transactional
@Repository
public interface TacoRepository extends JpaRepository<Taco, Long> {
}
