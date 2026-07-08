package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_enable_multi_subscribe_optimization")
public final class LinkMicMultiSubscribeOpt {
    public static final boolean DEFAULT = false;
    public static final LinkMicMultiSubscribeOpt INSTANCE = new LinkMicMultiSubscribeOpt();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_enable_multi_subscribe_optimization", DEFAULT);
    }
}
