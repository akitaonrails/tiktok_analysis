package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("linkmic_multiguestv3_add_not_receive_first_frame_exp")
public final class LinkMicMultiGuestV3AddNotReceiveFirstFrameExpSetting {
    public static final LinkMicMultiGuestV3AddNotReceiveFirstFrameExpSetting INSTANCE = new LinkMicMultiGuestV3AddNotReceiveFirstFrameExpSetting();
    public static final AddNotReceiveFirstFrameExpConf DEFAULT = new AddNotReceiveFirstFrameExpConf(true, 180, true);

    public final AddNotReceiveFirstFrameExpConf getValue() {
        AddNotReceiveFirstFrameExpConf addNotReceiveFirstFrameExpConf = (AddNotReceiveFirstFrameExpConf) SettingsManager.INSTANCE.getValueSafely(LinkMicMultiGuestV3AddNotReceiveFirstFrameExpSetting.class);
        return addNotReceiveFirstFrameExpConf == null ? DEFAULT : addNotReceiveFirstFrameExpConf;
    }
}
