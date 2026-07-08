package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_inner_room_jit_block_opt")
public final class LiveInnerRoomJITBlockOpt {
    public static final boolean DEFAULT = false;
    public static final LiveInnerRoomJITBlockOpt INSTANCE = new LiveInnerRoomJITBlockOpt();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_inner_room_jit_block_opt", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
