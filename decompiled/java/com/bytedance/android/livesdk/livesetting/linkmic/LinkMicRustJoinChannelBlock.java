package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_rust_join_channel_block_v2")
public final class LinkMicRustJoinChannelBlock {
    public static final boolean DEFAULT = true;
    public static final LinkMicRustJoinChannelBlock INSTANCE = new LinkMicRustJoinChannelBlock();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_rust_join_channel_block_v2", DEFAULT);
    }
}
