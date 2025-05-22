package tn.thinktank.okta.service;





import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import tn.thinktank.okta.model.Tenant;
import tn.thinktank.okta.repository.TenantRepository;


import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TenantService {

    private final TenantRepository repository;

    public Optional<Tenant> getTenantByIssuer(String issuerUri) {
        return repository.findByIssuerUri(issuerUri);
    }
}
