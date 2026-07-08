package com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.util.wallet;

import X.C09CT;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;

/* JADX INFO: loaded from: classes18.dex */
public final class BaseCustomErrorExtra extends Extra {
    public static final int $stable = 8;

    @C09CT("custom_error")
    public final CustomErrorExtra customError;

    public final CustomErrorExtra getCustomError() {
        return this.customError;
    }
}
