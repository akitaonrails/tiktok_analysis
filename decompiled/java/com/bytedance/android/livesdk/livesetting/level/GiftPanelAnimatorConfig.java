package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftPanelAnimatorConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("channel")
    public String channel;

    @C09CT("grade")
    public int grade;

    @C09CT("light_name")
    public String lightName;

    static {
        NormalGson.singleton();
        ADAPTER = new GiftPanelAnimatorConfig_OptTypeAdapter();
    }

    public GiftPanelAnimatorConfig() {
        this(0, "", "");
    }

    public GiftPanelAnimatorConfig(int i, String str, String str2) {
        this.grade = i;
        this.lightName = str;
        this.channel = str2;
    }
}
