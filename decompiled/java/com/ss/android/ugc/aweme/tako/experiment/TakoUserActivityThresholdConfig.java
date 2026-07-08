package com.ss.android.ugc.aweme.tako.experiment;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes17.dex */
public final class TakoUserActivityThresholdConfig {

    @C09CT("high_active_days_min")
    public final int highActiveDaysMin;

    @C09CT("high_send_msg_cnt_min")
    public final int highSendMsgCntMin;

    public TakoUserActivityThresholdConfig() {
        this(2, 8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoUserActivityThresholdConfig)) {
            return false;
        }
        TakoUserActivityThresholdConfig takoUserActivityThresholdConfig = (TakoUserActivityThresholdConfig) obj;
        return this.highActiveDaysMin == takoUserActivityThresholdConfig.highActiveDaysMin && this.highSendMsgCntMin == takoUserActivityThresholdConfig.highSendMsgCntMin;
    }

    public final int hashCode() {
        return (this.highActiveDaysMin * 31) + this.highSendMsgCntMin;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoUserActivityThresholdConfig(highActiveDaysMin=");
        sbLIZ.append(this.highActiveDaysMin);
        sbLIZ.append(", highSendMsgCntMin=");
        sbLIZ.append(this.highSendMsgCntMin);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoUserActivityThresholdConfig(int i, int i2) {
        this.highActiveDaysMin = i;
        this.highSendMsgCntMin = i2;
    }
}
