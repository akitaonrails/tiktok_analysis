package com.bytedance.android.livesdk.pack.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.Extra;

/* JADX INFO: loaded from: classes18.dex */
public final class SendItemErrorExtra extends Extra {
    public static final int $stable = 8;

    @C09CT("need_reload")
    public Boolean needReload;

    public SendItemErrorExtra() {
        this(Boolean.FALSE);
    }

    public final Boolean getNeedReload() {
        return this.needReload;
    }

    public SendItemErrorExtra(Boolean bool) {
        this.needReload = bool;
    }

    public final void setNeedReload(Boolean bool) {
        this.needReload = bool;
    }
}
