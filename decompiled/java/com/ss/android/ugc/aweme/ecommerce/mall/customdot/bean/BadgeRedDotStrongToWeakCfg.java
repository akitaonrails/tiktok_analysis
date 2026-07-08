package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class BadgeRedDotStrongToWeakCfg {

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("strong_duration")
    public final Long strongDuration;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BadgeRedDotStrongToWeakCfg(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", strongDuration=");
        sbLIZ.append(this.strongDuration);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BadgeRedDotStrongToWeakCfg(Boolean bool, Long l) {
        this.enable = bool;
        this.strongDuration = l;
    }
}
