package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_linkmic_fix_delegate_memory")
public final class LinkMicFixDelegateMemoryLeaf {
    public static final boolean DEFAULT = true;
    public static final LinkMicFixDelegateMemoryLeaf INSTANCE = new LinkMicFixDelegateMemoryLeaf();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("livesdk_linkmic_fix_delegate_memory", DEFAULT);
    }
}
