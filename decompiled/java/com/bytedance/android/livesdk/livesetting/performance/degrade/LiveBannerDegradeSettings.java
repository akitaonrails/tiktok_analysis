package com.bytedance.android.livesdk.livesetting.performance.degrade;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_banner_degrade")
public final class LiveBannerDegradeSettings {
    public static final LiveBannerDegrade DEFAULT;
    public static final LiveBannerDegradeSettings INSTANCE = new LiveBannerDegradeSettings();

    static {
        TypeAdapter typeAdapter = LiveBannerDegrade.ADAPTER;
        DEFAULT = new LiveBannerDegrade();
    }

    public final LiveBannerDegrade getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveBannerDegrade liveBannerDegrade = DEFAULT;
        LiveBannerDegrade liveBannerDegrade2 = (LiveBannerDegrade) settingsManager.getValueSafely("live_banner_degrade", liveBannerDegrade);
        return liveBannerDegrade2 != null ? liveBannerDegrade2 : liveBannerDegrade;
    }

    public final long delayMillis() {
        return getValue().delayLoadBannerTime;
    }

    public final boolean enableBanner() {
        return getValue().enableBanner;
    }

    public final boolean enableRecycleWebview() {
        return getValue().enableRecycleWebview;
    }

    public final LiveBannerDegrade getDEFAULT() {
        return DEFAULT;
    }
}
