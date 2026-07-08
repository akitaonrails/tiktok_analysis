package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.libra;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpLynxLazyLoadConfig {

    @C09CT("creator_video_module_enable")
    public final boolean creatorVideoModuleEnable;

    @C09CT("review_module_enable")
    public final boolean reviewModuleEnable;

    public PdpLynxLazyLoadConfig() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpLynxLazyLoadConfig)) {
            return false;
        }
        PdpLynxLazyLoadConfig pdpLynxLazyLoadConfig = (PdpLynxLazyLoadConfig) obj;
        return this.reviewModuleEnable == pdpLynxLazyLoadConfig.reviewModuleEnable && this.creatorVideoModuleEnable == pdpLynxLazyLoadConfig.creatorVideoModuleEnable;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.reviewModuleEnable) * 31) + C786410Ut5.Z2(this.creatorVideoModuleEnable);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpLynxLazyLoadConfig(reviewModuleEnable=");
        sbLIZ.append(this.reviewModuleEnable);
        sbLIZ.append(", creatorVideoModuleEnable=");
        sbLIZ.append(this.creatorVideoModuleEnable);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PdpLynxLazyLoadConfig(boolean z, boolean z2) {
        this.reviewModuleEnable = z;
        this.creatorVideoModuleEnable = z2;
    }
}
