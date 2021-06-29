package com.henu.admin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Purse {
    private  long id;
    private long userId;
    private double balance;
    private double recharge;
    private double withdrawals;
    private long state;
}
