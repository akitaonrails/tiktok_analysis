package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes14.dex */
public class UgShortcutInfo {

    @C09CT("h5_link")
    public String h5Link;

    @C09CT("money_symbol")
    public String moneySymbol;

    @C09CT("will_get_most")
    public String willGetMost;

    @C09CT("withdrawal_req_interval")
    public int withdrawalReqInterval;

    public String getH5Link() throws C316660CbA {
        String str = this.h5Link;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getMoneySymbol() {
        String str = this.moneySymbol;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getWillGetMost() {
        String str = this.willGetMost;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public int getWithdrawalReqInterval() {
        return this.withdrawalReqInterval;
    }
}
