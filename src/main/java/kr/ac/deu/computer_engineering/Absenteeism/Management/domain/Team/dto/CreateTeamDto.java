package kr.ac.deu.computer_engineering.Absenteeism.Management.domain.Team.dto;

import kr.ac.deu.computer_engineering.Absenteeism.Management.domain.Team.Team;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CreateTeamDto {
    @NotNull
    private String teamName;

    public Team toEntity() {
        return Team.builder()
                .teamName(teamName)
                .build();
    }
}
