package com.bytedance.android.livesdk.livesetting.level;

import X.C13LQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("always_barrage_container_msg_subtypes")
public final class AlwaysBarrageContainerMsgSubTypes {
    public static final AlwaysBarrageContainerMsgSubTypes INSTANCE = new AlwaysBarrageContainerMsgSubTypes();
    public static final String[] DEFAULT = {"mystery_shop"};

    private final String[] getMsgSubTypeList() {
        return SettingsManager.INSTANCE.getStringArrayValue("always_barrage_container_msg_subtypes", DEFAULT);
    }

    public final boolean isAlwaysUseBarrageContainer(String str) {
        return C13LQ.LJIILLIIL(str, getMsgSubTypeList());
    }
}
