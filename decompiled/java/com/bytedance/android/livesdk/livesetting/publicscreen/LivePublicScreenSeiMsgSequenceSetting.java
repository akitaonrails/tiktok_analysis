package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_sei_msg_sequence_config")
public final class LivePublicScreenSeiMsgSequenceSetting {
    public static final LivePublicScreenSeiMsgSequenceSetting INSTANCE = new LivePublicScreenSeiMsgSequenceSetting();
    public static final SeiMsgSequenceConfig DEFAULT = new SeiMsgSequenceConfig();

    private final SeiMsgSequenceConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SeiMsgSequenceConfig seiMsgSequenceConfig = DEFAULT;
        SeiMsgSequenceConfig seiMsgSequenceConfig2 = (SeiMsgSequenceConfig) settingsManager.getValueSafely("live_public_screen_sei_msg_sequence_config", seiMsgSequenceConfig);
        return seiMsgSequenceConfig2 != null ? seiMsgSequenceConfig2 : seiMsgSequenceConfig;
    }

    public final int getReportMsgIdInterval() {
        return getValue().reportMsgIdInterval;
    }

    public final int getReportMsgSeqInterval() {
        return getValue().reportMsgIdSeqInterval;
    }

    public final int msgCount() {
        return getValue().msgCount;
    }
}
