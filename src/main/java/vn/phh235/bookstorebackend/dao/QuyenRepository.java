package vn.phh235.bookstorebackend.dao;import org.springframework.data.jpa.repository.JpaRepository;import org.springframework.stereotype.Repository;import vn.phh235.bookstorebackend.entity.Quyen;@Repositorypublic interface QuyenRepository extends JpaRepository<Quyen, Integer> {}