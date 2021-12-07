package com.roit.lol.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_lol_info")
public class LolInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accountId;

    private String name;

    private String profileIconId;

    private String summonerLevel;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
