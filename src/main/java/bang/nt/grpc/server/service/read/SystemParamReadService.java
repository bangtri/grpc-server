package bang.nt.grpc.server.service.read;

import bang.nt.grpc.server.domain.SystemParam;
import bang.nt.grpc.server.repository.SystemParamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class SystemParamReadService {

    private final SystemParamRepository systemParamRepository;

    public SystemParam findParamByCode(String code) {
        Optional<SystemParam> systemParamOptional = systemParamRepository.findParamByCode(code);
        return systemParamOptional.orElse(null);
    }

}
