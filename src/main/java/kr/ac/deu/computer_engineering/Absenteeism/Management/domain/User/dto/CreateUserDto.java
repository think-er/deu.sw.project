package kr.ac.deu.computer_engineering.Absenteeism.Management.domain.User.dto;

import kr.ac.deu.computer_engineering.Absenteeism.Management.domain.Company.Company;
import kr.ac.deu.computer_engineering.Absenteeism.Management.domain.Rank.Rank;
import kr.ac.deu.computer_engineering.Absenteeism.Management.domain.Team.Team;
import kr.ac.deu.computer_engineering.Absenteeism.Management.domain.User.User;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class CreateUserDto {
    @NotNull
    private String name; // 직원 이름

    @NotNull
    private String username; // 로그인 계정

    @NotNull
    private LocalDate dateOfJoin; // 입사일

    @NotNull
    private LocalDate birthDay; // 생년월일

    @NotNull
    private Long teamId; // 생년월일

    @NotNull
    private Long companyId; // 생년월일

    @NotNull
    private Long rankId; // 생년월일

    // 최종 사용자 정보
    public User toEntity(Team team, Rank rank, Company company) {
        return User.builder()
                .name(name)
                .username(username)
                .dateOfJoin(dateOfJoin)
                .birthDay(birthDay)
                .team(team)
                .rank(rank)
                .company(company)
                .build();
    }
}
