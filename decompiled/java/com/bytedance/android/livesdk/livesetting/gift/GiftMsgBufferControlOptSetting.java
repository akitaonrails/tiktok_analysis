package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_msg_buffer_control_setting")
public final class GiftMsgBufferControlOptSetting {
    public static final int DEFAULT = 0;
    public static final GiftMsgBufferControlOptSetting INSTANCE = new GiftMsgBufferControlOptSetting();
    public static final boolean enableHeapQueue;
    public static final boolean enableMsgSkip;
    public static final boolean enableTreeQueue;
    public static final boolean isConfigByRole;
    public static final int value;

    static {
        int intValue = SettingsManager.INSTANCE.getIntValue("live_gift_msg_buffer_control_setting", DEFAULT);
        value = intValue;
        enableMsgSkip = (intValue & 1) == 1;
        isConfigByRole = (intValue & 2) == 2;
        enableHeapQueue = (intValue & 4) == 4;
        enableTreeQueue = (intValue & 8) == 8;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final boolean getEnableHeapQueue() {
        return enableHeapQueue;
    }

    public final boolean getEnableMsgSkip() {
        return enableMsgSkip;
    }

    public final boolean getEnableTreeQueue() {
        return enableTreeQueue;
    }

    public final boolean isConfigByRole() {
        return isConfigByRole;
    }
}
