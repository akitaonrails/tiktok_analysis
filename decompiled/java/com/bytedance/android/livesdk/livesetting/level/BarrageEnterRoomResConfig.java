package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class BarrageEnterRoomResConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("barrage_background")
    public String background;

    @C09CT("gecko_channel")
    public String barrageChannel;

    @C09CT("grade")
    public int level;

    static {
        NormalGson.singleton();
        ADAPTER = new BarrageEnterRoomResConfig_OptTypeAdapter();
    }

    public BarrageEnterRoomResConfig() {
        this(0, "", "");
    }

    public BarrageEnterRoomResConfig(int i, String str, String str2) {
        this.level = i;
        this.background = str;
        this.barrageChannel = str2;
    }
}
