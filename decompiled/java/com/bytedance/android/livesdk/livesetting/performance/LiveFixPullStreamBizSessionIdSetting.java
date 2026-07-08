package com.bytedance.android.livesdk.livesetting.performance;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_fix_pull_stream_biz_session_id")
public final class LiveFixPullStreamBizSessionIdSetting {
    public static final boolean DEFAULT = false;
    public static final LiveFixPullStreamBizSessionIdSetting INSTANCE = new LiveFixPullStreamBizSessionIdSetting();
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(71));

    public static final boolean isFixed() {
        return !INSTANCE.getValue();
    }

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
