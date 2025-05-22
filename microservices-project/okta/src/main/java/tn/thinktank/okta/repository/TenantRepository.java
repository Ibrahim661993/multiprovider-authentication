package tn.thinktank.okta.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import tn.thinktank.okta.model.Tenant;


import java.util.Optional;

public interface TenantRepository extends JpaRepository<Tenant, Long> {
    Optional<Tenant> findByIssuerUri(String issuerUri);
}
