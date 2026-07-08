package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class AutoTriggerConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("default_trigger_name")
    public String defaultTriggerName;

    @C09CT("delay_second")
    public int delaySecond;

    @C09CT("ignore_pitaya_package")
    public int ignorePitayaPackage;

    @C09CT("is_same_room")
    public int isSameRoom;

    static {
        NormalGson.singleton();
        ADAPTER = new AutoTriggerConfig_OptTypeAdapter();
    }

    public AutoTriggerConfig() {
        this(0, 1, 0, "");
    }

    public AutoTriggerConfig(int i, int i2, int i3, String str) {
        this.delaySecond = i;
        this.isSameRoom = i2;
        this.ignorePitayaPackage = i3;
        this.defaultTriggerName = str;
    }
}
