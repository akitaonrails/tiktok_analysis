package com.bytedance.android.livesdk.livesetting.barrage;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class UserBarrageUIElementsConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("duration")
    public int duration;

    @C09CT("level")
    public String levelRange = "";

    @C09CT("background")
    public String background = "";

    @C09CT("left_icon")
    public String leftIcon = "";

    @C09CT("right_icon")
    public String rightIcon = "";

    @C09CT("ribbon")
    public String ribbon = "";

    static {
        NormalGson.singleton();
        ADAPTER = new UserBarrageUIElementsConfig_OptTypeAdapter();
    }
}
