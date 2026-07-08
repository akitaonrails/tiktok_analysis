package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class OspPaymentBlockGCConfig {

    @C09CT("duration")
    public final Long duration;

    @C09CT("enable")
    public final Boolean enable;

    public OspPaymentBlockGCConfig() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OspPaymentBlockGCConfig)) {
            return false;
        }
        OspPaymentBlockGCConfig ospPaymentBlockGCConfig = (OspPaymentBlockGCConfig) obj;
        return Intrinsics.LJFF(this.enable, ospPaymentBlockGCConfig.enable) && Intrinsics.LJFF(this.duration, ospPaymentBlockGCConfig.duration);
    }

    public final int hashCode() {
        Boolean bool = this.enable;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.duration;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OspPaymentBlockGCConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public OspPaymentBlockGCConfig(Boolean bool, Long l) {
        this.enable = bool;
        this.duration = l;
    }
}
