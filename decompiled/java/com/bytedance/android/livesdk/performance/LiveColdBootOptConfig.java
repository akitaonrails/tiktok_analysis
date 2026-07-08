package com.bytedance.android.livesdk.performance;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveColdBootOptConfig implements Serializable {

    @C09CT("enableCepManagerSoLoadOpt")
    public final boolean enableCepManagerSoLoadOpt;

    @C09CT("enableDelaySettingsUpdateTimeMs")
    public final long enableDelaySettingsUpdateTimeMs;

    @C09CT("enableEcomLiveShowListLoadOpt")
    public final boolean enableEcomLiveShowListLoadOpt;

    @C09CT("enableGetLiveTabTypeOpt")
    public final boolean enableGetLiveTabTypeOpt;

    @C09CT("enableSpPreloadOpt")
    public final boolean enableSpPreloadOpt;

    @C09CT("enableUpdateFollowWidgetOpt")
    public final boolean enableUpdateFollowWidgetOpt;

    @C09CT("enableUserInfoFetchOpt")
    public final boolean enableUserInfoFetchOpt;

    public LiveColdBootOptConfig() {
        this(0L, false, false, false, false, false, false);
    }

    public final boolean getEnableCepManagerSoLoadOpt() {
        return this.enableCepManagerSoLoadOpt;
    }

    public final long getEnableDelaySettingsUpdateTimeMs() {
        return this.enableDelaySettingsUpdateTimeMs;
    }

    public final boolean getEnableEcomLiveShowListLoadOpt() {
        return this.enableEcomLiveShowListLoadOpt;
    }

    public final boolean getEnableGetLiveTabTypeOpt() {
        return this.enableGetLiveTabTypeOpt;
    }

    public final boolean getEnableSpPreloadOpt() {
        return this.enableSpPreloadOpt;
    }

    public final boolean getEnableUpdateFollowWidgetOpt() {
        return this.enableUpdateFollowWidgetOpt;
    }

    public final boolean getEnableUserInfoFetchOpt() {
        return this.enableUserInfoFetchOpt;
    }

    public LiveColdBootOptConfig(long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.enableDelaySettingsUpdateTimeMs = j;
        this.enableCepManagerSoLoadOpt = z;
        this.enableGetLiveTabTypeOpt = z2;
        this.enableEcomLiveShowListLoadOpt = z3;
        this.enableUpdateFollowWidgetOpt = z4;
        this.enableSpPreloadOpt = z5;
        this.enableUserInfoFetchOpt = z6;
    }
}
