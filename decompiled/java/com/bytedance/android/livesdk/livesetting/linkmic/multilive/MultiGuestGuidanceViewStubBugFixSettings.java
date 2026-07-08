package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multiguest_guidance_view_stub_bug_fix_enabled")
public final class MultiGuestGuidanceViewStubBugFixSettings {
    public static final boolean DEFAULT = true;
    public static final MultiGuestGuidanceViewStubBugFixSettings INSTANCE = new MultiGuestGuidanceViewStubBugFixSettings();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multiguest_guidance_view_stub_bug_fix_enabled", DEFAULT);
    }
}
