package vn.phh235.bookstorebackend.dao;import org.springframework.data.jpa.repository.JpaRepository;import org.springframework.data.rest.core.annotation.RepositoryRestResource;import vn.phh235.bookstorebackend.entity.Quyen;@RepositoryRestResource(path = "quyen")public interface QuyenRepository extends JpaRepository<Quyen, Integer> {}