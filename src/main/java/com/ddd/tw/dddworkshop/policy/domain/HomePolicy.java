package com.ddd.tw.dddworkshop.policy.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HomePolicy extends Policy {
    private String constructionMaterial;
    private String buildingType;
    private String bedroomsType;
    private String address;
}
