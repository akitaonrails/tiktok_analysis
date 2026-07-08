package com.bytedance.android.livesdk.livesetting.level;

import X.C13LQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("barrage_container_msg_types")
public final class BarrageContainerMsgTypes {
    public static final BarrageContainerMsgTypes INSTANCE = new BarrageContainerMsgTypes();
    public static final String[] DEFAULT = {"100", "8", "9", "10", "11"};

    private final String[] getMsgTypeList() {
        return SettingsManager.INSTANCE.getStringArrayValue("barrage_container_msg_types", DEFAULT);
    }

    public final boolean isBarrageContainerMsgType(int i) {
        return C13LQ.LJIILLIIL(String.valueOf(i), getMsgTypeList());
    }
}
