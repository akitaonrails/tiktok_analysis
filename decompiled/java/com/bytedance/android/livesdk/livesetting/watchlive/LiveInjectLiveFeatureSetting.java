package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C01GW;
import X.C0JAJ;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_inject_feature_for_feed")
public final class LiveInjectLiveFeatureSetting {
    public static final boolean DEFAULT = false;
    public static final LiveInjectLiveFeatureSetting INSTANCE = new LiveInjectLiveFeatureSetting();
    public static final C01GW value$delegate = C452501pT.LIZIZ(new C0JAJ());

    private final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }

    public final boolean injectEnable() {
        return getValue();
    }
}
