package com.ss.android.ugc.aweme.legoImp.task.region;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes18.dex */
public final class PrivacyDataPushFrequencySettingsModel {

    @C09CT("max_count")
    public final int maxCount;

    @C09CT("min_interval_millis")
    public final long minIntervalMillis;

    public PrivacyDataPushFrequencySettingsModel() {
        this(5, 300000L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyDataPushFrequencySettingsModel)) {
            return false;
        }
        PrivacyDataPushFrequencySettingsModel privacyDataPushFrequencySettingsModel = (PrivacyDataPushFrequencySettingsModel) obj;
        return this.maxCount == privacyDataPushFrequencySettingsModel.maxCount && this.minIntervalMillis == privacyDataPushFrequencySettingsModel.minIntervalMillis;
    }

    public final int hashCode() {
        return (this.maxCount * 31) + C786410Ut5.Y2(this.minIntervalMillis);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyDataPushFrequencySettingsModel(maxCount=");
        sbLIZ.append(this.maxCount);
        sbLIZ.append(", minIntervalMillis=");
        sbLIZ.append(this.minIntervalMillis);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PrivacyDataPushFrequencySettingsModel(int i, long j) {
        this.maxCount = i;
        this.minIntervalMillis = j;
    }
}
