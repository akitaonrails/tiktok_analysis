package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class BadgeBackgroundClearCfg {

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("interval")
    public final Long interval;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BadgeBackgroundClearCfg(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", interval=");
        sbLIZ.append(this.interval);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BadgeBackgroundClearCfg(Boolean bool, Long l) {
        this.enable = bool;
        this.interval = l;
    }
}
