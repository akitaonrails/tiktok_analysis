package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_enable_pymk_2nd_degree_relation")
public final class LiveEnablePymk2ndDegreeRelation {
    public static final boolean DEFAULT = false;
    public static final LiveEnablePymk2ndDegreeRelation INSTANCE = new LiveEnablePymk2ndDegreeRelation();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_enable_pymk_2nd_degree_relation", DEFAULT);
    }
}
