package com.ss.android.ugc.aweme.ecommerce.performance;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes27.dex */
public final class EcMallMemOptConfig {

    @C09CT("enable_cache_opt")
    public final int enableCacheOpt;

    @C09CT("enable_clear_report_once_track_event")
    public final int enableClearReportOnceTrackEvent;

    @C09CT("multi_tab_offscreen_page_limit")
    public final int multiTabOffscreenPageLimit;

    public EcMallMemOptConfig() {
        this(0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcMallMemOptConfig)) {
            return false;
        }
        EcMallMemOptConfig ecMallMemOptConfig = (EcMallMemOptConfig) obj;
        return this.multiTabOffscreenPageLimit == ecMallMemOptConfig.multiTabOffscreenPageLimit && this.enableCacheOpt == ecMallMemOptConfig.enableCacheOpt && this.enableClearReportOnceTrackEvent == ecMallMemOptConfig.enableClearReportOnceTrackEvent;
    }

    public final int hashCode() {
        return (((this.multiTabOffscreenPageLimit * 31) + this.enableCacheOpt) * 31) + this.enableClearReportOnceTrackEvent;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcMallMemOptConfig(multiTabOffscreenPageLimit=");
        sbLIZ.append(this.multiTabOffscreenPageLimit);
        sbLIZ.append(", enableCacheOpt=");
        sbLIZ.append(this.enableCacheOpt);
        sbLIZ.append(", enableClearReportOnceTrackEvent=");
        sbLIZ.append(this.enableClearReportOnceTrackEvent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcMallMemOptConfig(int i, int i2, int i3) {
        this.multiTabOffscreenPageLimit = i;
        this.enableCacheOpt = i2;
        this.enableClearReportOnceTrackEvent = i3;
    }
}
