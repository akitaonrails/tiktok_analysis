package com.bytedance.android.livesdk.livesetting.feed;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "toplive_prefetch_pool_setting")
public final class TopLivePreFetchPoolSetting {
    public static final TopLivePreFetchPoolSetting INSTANCE = new TopLivePreFetchPoolSetting();
    public static final TopLivePreFetchPoolSettingConfig DEFAULT = new TopLivePreFetchPoolSettingConfig(false, 1800000, 0, true, 0, true, "tiktok_message_toplive_preload_rec", 0, true);
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(64));

    public final TopLivePreFetchPoolSettingConfig getValue() {
        return (TopLivePreFetchPoolSettingConfig) value$delegate.getValue();
    }

    public final TopLivePreFetchPoolSettingConfig getDEFAULT() {
        return DEFAULT;
    }
}
