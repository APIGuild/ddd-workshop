package com.ddd.tw.dddworkshop.policy.command;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class PolicyCommand {
    private String policyStartDate;
    private String quoteId;
    private Double quotePremium;
}
