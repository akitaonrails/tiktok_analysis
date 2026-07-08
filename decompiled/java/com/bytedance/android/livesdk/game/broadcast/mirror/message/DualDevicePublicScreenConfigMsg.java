package com.bytedance.android.livesdk.game.broadcast.mirror.message;

import X.C09CT;
import X.C0TER;

/* JADX INFO: loaded from: classes13.dex */
public final class DualDevicePublicScreenConfigMsg implements C0TER {

    @C09CT("auto_translation_enable")
    public int autoTranslationEnable;

    public DualDevicePublicScreenConfigMsg() {
        this(-1);
    }

    @Override // X.C0TER
    public final String getMethodName() {
        return "dual_device_public_screen_config_update";
    }

    public DualDevicePublicScreenConfigMsg(int i) {
        this.autoTranslationEnable = i;
    }
}
