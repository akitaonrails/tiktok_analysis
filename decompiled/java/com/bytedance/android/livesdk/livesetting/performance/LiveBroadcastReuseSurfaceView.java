package com.bytedance.android.livesdk.livesetting.performance;

import X.C504210Jpz;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_broadcast_single_activity_reuse_surfaceview_client")
public final class LiveBroadcastReuseSurfaceView {
    public static final int DEFAULT = 0;
    public static final LiveBroadcastReuseSurfaceView INSTANCE = new LiveBroadcastReuseSurfaceView();
    public static final boolean enable;
    public static final boolean enableIndependentPage;
    public static final boolean enableRecordPage;
    public static final boolean enableTTLH;
    public static final int value;

    public static /* synthetic */ void getEnable$annotations() {
    }

    public static /* synthetic */ void getEnableIndependentPage$annotations() {
    }

    public static /* synthetic */ void getEnableRecordPage$annotations() {
    }

    public static /* synthetic */ void getEnableTTLH$annotations() {
    }

    static {
        int intValue = SettingsManager.INSTANCE.getIntValue("live_broadcast_single_activity_reuse_surfaceview_client", DEFAULT);
        value = intValue;
        boolean z = (intValue & 1) != 0 && C504210Jpz.LIZ;
        enableIndependentPage = z;
        boolean z2 = (intValue & 2) != 0 && C504210Jpz.LIZ;
        enableRecordPage = z2;
        enableTTLH = (intValue & 4) != 0 && C504210Jpz.LIZ;
        enable = z || z2;
    }

    public static final boolean getEnable() {
        return enable;
    }

    public static final boolean getEnableIndependentPage() {
        return enableIndependentPage;
    }

    public static final boolean getEnableRecordPage() {
        return enableRecordPage;
    }

    public static final boolean getEnableTTLH() {
        return enableTTLH;
    }
}
