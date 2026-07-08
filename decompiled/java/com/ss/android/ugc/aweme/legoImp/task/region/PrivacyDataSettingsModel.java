package com.ss.android.ugc.aweme.legoImp.task.region;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PrivacyDataSettingsModel {

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("header_injection_config")
    public final PrivacyDataInjectionSettingsModel headerInjectionConfig;

    @C09CT("max_retry_times")
    public final int maxRetryTimes;

    @C09CT("retry_delay_millis")
    public final long retryDelayMillis;

    public PrivacyDataSettingsModel() {
        this(false, 2, Mp4ScreenVideoLoadTimeout.CONTROL, new PrivacyDataInjectionSettingsModel(false, null, 3, null));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyDataSettingsModel)) {
            return false;
        }
        PrivacyDataSettingsModel privacyDataSettingsModel = (PrivacyDataSettingsModel) obj;
        return this.enabled == privacyDataSettingsModel.enabled && this.maxRetryTimes == privacyDataSettingsModel.maxRetryTimes && this.retryDelayMillis == privacyDataSettingsModel.retryDelayMillis && Intrinsics.LJFF(this.headerInjectionConfig, privacyDataSettingsModel.headerInjectionConfig);
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.enabled) * 31) + this.maxRetryTimes) * 31) + C786410Ut5.Y2(this.retryDelayMillis)) * 31) + this.headerInjectionConfig.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyDataSettingsModel(enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(", maxRetryTimes=");
        sbLIZ.append(this.maxRetryTimes);
        sbLIZ.append(", retryDelayMillis=");
        sbLIZ.append(this.retryDelayMillis);
        sbLIZ.append(", headerInjectionConfig=");
        sbLIZ.append(this.headerInjectionConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PrivacyDataSettingsModel(boolean z, int i, long j, PrivacyDataInjectionSettingsModel privacyDataInjectionSettingsModel) {
        this.enabled = z;
        this.maxRetryTimes = i;
        this.retryDelayMillis = j;
        this.headerInjectionConfig = privacyDataInjectionSettingsModel;
    }
}
