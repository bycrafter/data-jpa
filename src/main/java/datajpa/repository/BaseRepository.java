package datajpa.repository;

import datajpa.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository<T extends BaseEntity> extends JpaRepository<T, String> {
    default T update(T entity){
        T oldEntity = findById(entity.getId()).orElseThrow(() -> new RuntimeException("No updatable user"));
        entity.setCreatedAt(oldEntity.getCreatedAt());
        entity = saveAndFlush(entity);
        return entity;
    }
}
