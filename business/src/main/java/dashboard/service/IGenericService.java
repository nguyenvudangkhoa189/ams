package dashboard.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IGenericService<D extends Serializable, K extends Object> {

    Optional<D> findOne(final K id);

    List<D> findAll();

    Page<D> findAll(Pageable pageable);

    D save(final D entity);

    void delete(final D entity);

    void deleteById(final K id);

}