package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey("live_pcs_auto_expand_bio")
public final class LivePcsAutoExpandBioSetting {
    public static final LivePcsAutoExpandBioConfig DEFAULT;
    public static final LivePcsAutoExpandBioSetting INSTANCE;
    public static final boolean enabled;
    public static final float heightThreshold;

    static {
        LivePcsAutoExpandBioSetting livePcsAutoExpandBioSetting = new LivePcsAutoExpandBioSetting();
        INSTANCE = livePcsAutoExpandBioSetting;
        DEFAULT = new LivePcsAutoExpandBioConfig(true, 0.5f);
        LivePcsAutoExpandBioConfig livePcsAutoExpandBioConfigConfig = livePcsAutoExpandBioSetting.config();
        enabled = livePcsAutoExpandBioConfigConfig != null ? livePcsAutoExpandBioConfigConfig.enabled : true;
        LivePcsAutoExpandBioConfig livePcsAutoExpandBioConfigConfig2 = livePcsAutoExpandBioSetting.config();
        heightThreshold = livePcsAutoExpandBioConfigConfig2 != null ? livePcsAutoExpandBioConfigConfig2.heightThreshold : 0.5f;
    }

    private final LivePcsAutoExpandBioConfig config() {
        return (LivePcsAutoExpandBioConfig) SettingsManager.INSTANCE.getValueSafely("live_pcs_auto_expand_bio", DEFAULT);
    }

    public final LivePcsAutoExpandBioConfig getDEFAULT() {
        return DEFAULT;
    }

    public final boolean getEnabled() {
        return enabled;
    }

    public final float getHeightThreshold() {
        return heightThreshold;
    }
}
