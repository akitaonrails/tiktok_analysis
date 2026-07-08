package com.ss.android.ugc.ur.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes17.dex */
public final class CampusProfileBannerConfig {

    @C09CT("enable_banner")
    public final boolean enableBanner;

    @C09CT("enable_sparkle_effect")
    public final boolean enableSparkleEffect;

    public CampusProfileBannerConfig() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampusProfileBannerConfig)) {
            return false;
        }
        CampusProfileBannerConfig campusProfileBannerConfig = (CampusProfileBannerConfig) obj;
        return this.enableBanner == campusProfileBannerConfig.enableBanner && this.enableSparkleEffect == campusProfileBannerConfig.enableSparkleEffect;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.enableBanner) * 31) + C786410Ut5.Z2(this.enableSparkleEffect);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CampusProfileBannerConfig(enableBanner=");
        sbLIZ.append(this.enableBanner);
        sbLIZ.append(", enableSparkleEffect=");
        sbLIZ.append(this.enableSparkleEffect);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CampusProfileBannerConfig(boolean z, boolean z2) {
        this.enableBanner = z;
        this.enableSparkleEffect = z2;
    }
}
