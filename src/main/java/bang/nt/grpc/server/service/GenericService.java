package bang.nt.grpc.server.service;

import bang.nt.grpc.server.config.MessageTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GenericService {

    private final MessageTemplate messageTemplate;

    public String message(String key, String... value) {
        return messageTemplate.message(key, value);
    }

}
