package kr.ac.deu.computer_engineering.Absenteeism.Management.service.health;

import kr.ac.deu.computer_engineering.Absenteeism.Management.domain.HealthCheckHistory.HealthCheckHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HealthService {
    private final HealthCheckHistoryRepository healthCheckHistoryRepository;
}
