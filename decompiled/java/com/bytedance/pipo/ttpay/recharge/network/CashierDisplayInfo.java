package com.bytedance.pipo.ttpay.recharge.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class CashierDisplayInfo implements Serializable {

    @C09CT("user_display_info")
    public final UserDisplayInfo userDisplayInfo;

    public CashierDisplayInfo() {
        this(null);
    }

    public CashierDisplayInfo(UserDisplayInfo userDisplayInfo) {
        this.userDisplayInfo = userDisplayInfo;
    }
}
