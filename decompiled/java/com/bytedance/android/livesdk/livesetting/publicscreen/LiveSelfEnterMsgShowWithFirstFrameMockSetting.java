package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("self_enter_msg_show_with_first_frame_mock")
public final class LiveSelfEnterMsgShowWithFirstFrameMockSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSelfEnterMsgShowWithFirstFrameMockSetting INSTANCE = new LiveSelfEnterMsgShowWithFirstFrameMockSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("self_enter_msg_show_with_first_frame_mock", DEFAULT);
    }
}
