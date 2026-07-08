package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes.dex */
public final class SmartLivePreviewCTADisplayConfig {

    @C09CT("cta_delay_call_engine")
    public final long delayCallEngine;

    @C09CT("live_preview_card_cta_pitaya_delay")
    public long delayTime;

    @C09CT("live_preview_card_cta_pitaya_enable")
    public final boolean enable;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartLivePreviewCTADisplayConfig)) {
            return false;
        }
        SmartLivePreviewCTADisplayConfig smartLivePreviewCTADisplayConfig = (SmartLivePreviewCTADisplayConfig) obj;
        return this.enable == smartLivePreviewCTADisplayConfig.enable && this.delayTime == smartLivePreviewCTADisplayConfig.delayTime && this.delayCallEngine == smartLivePreviewCTADisplayConfig.delayCallEngine;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Y2(this.delayTime)) * 31) + C786410Ut5.Y2(this.delayCallEngine);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SmartLivePreviewCTADisplayConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", delayTime=");
        sbLIZ.append(this.delayTime);
        sbLIZ.append(", delayCallEngine=");
        sbLIZ.append(this.delayCallEngine);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SmartLivePreviewCTADisplayConfig() {
        this(false, 6L, 0L);
    }

    public SmartLivePreviewCTADisplayConfig(boolean z, long j, long j2) {
        this.enable = z;
        this.delayTime = j;
        this.delayCallEngine = j2;
    }
}
