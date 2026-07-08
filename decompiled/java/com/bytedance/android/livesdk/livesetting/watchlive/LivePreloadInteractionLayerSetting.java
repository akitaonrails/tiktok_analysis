package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.dataChannel.LeftBottomECSlotWidgetShow;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_preload_interaction_layer")
public final class LivePreloadInteractionLayerSetting {
    public static final int DEFAULT = 0;
    public static final LivePreloadInteractionLayerSetting INSTANCE = new LivePreloadInteractionLayerSetting();
    public static final int v1 = 1;
    public static final int v2 = 2;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_preload_interaction_layer", DEFAULT);
    }

    public final boolean isEnableFeedRoomParse() {
        return getValue() == 2 || getValue() == 1;
    }

    public final boolean isDisablePreload(DataChannel dataChannel) {
        return !isEnablePreload(dataChannel);
    }

    public final boolean isEnablePreload(DataChannel dataChannel) {
        if (getValue() == 2 || (getValue() == 1 && dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(LeftBottomECSlotWidgetShow.class), Boolean.TRUE))) {
            return true;
        }
        return false;
    }
}
