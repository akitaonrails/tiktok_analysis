package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

/* JADX INFO: loaded from: classes16.dex */
public final class LinkMicMicPosLoadingOptimizeSettings {
    public static final int DEFAULT = 0;
    public static final LinkMicMicPosLoadingOptimizeSettings INSTANCE = new LinkMicMicPosLoadingOptimizeSettings();

    public final int getValue() {
        return LiveAbLabelSetting.INSTANCE.getIntValue("linkmic_mic_pos_loading_optimize");
    }

    public final boolean isEnable() {
        return getValue() > 0;
    }

    public final boolean isEnablePureNoVideoBackground() {
        return (getValue() & 2) != 0;
    }
}
