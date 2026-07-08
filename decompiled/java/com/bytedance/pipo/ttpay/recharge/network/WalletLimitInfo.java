package com.bytedance.pipo.ttpay.recharge.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class WalletLimitInfo implements Serializable {

    @C09CT("account_info")
    public final AccountInfo accountInfo;

    @C09CT("user_info")
    public final UserInfo userInfo;

    public WalletLimitInfo() {
        this(null, null);
    }

    public WalletLimitInfo(UserInfo userInfo, AccountInfo accountInfo) {
        this.userInfo = userInfo;
        this.accountInfo = accountInfo;
    }
}
