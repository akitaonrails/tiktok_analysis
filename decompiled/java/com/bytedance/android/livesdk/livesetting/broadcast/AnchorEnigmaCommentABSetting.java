package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_enigma_comment_enable")
public final class AnchorEnigmaCommentABSetting {
    public static final int DEFAULT = 1;
    public static final AnchorEnigmaCommentABSetting INSTANCE = new AnchorEnigmaCommentABSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("anchor_enigma_comment_enable", DEFAULT) == 1;
    }
}
