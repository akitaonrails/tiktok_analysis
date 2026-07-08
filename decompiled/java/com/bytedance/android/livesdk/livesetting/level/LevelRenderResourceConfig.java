package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LevelRenderResourceConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("gecko_channel")
    public String geckoChannel;

    @C09CT("max_grade")
    public long maxGrade;

    @C09CT("min_grade")
    public long minGrade;

    @C09CT("render_effect_lynx_url")
    public String renderEffectLynxUrl;

    static {
        NormalGson.singleton();
        ADAPTER = new LevelRenderResourceConfig_OptTypeAdapter();
    }

    public LevelRenderResourceConfig() {
        this(0L, 0L, "", "");
    }

    public LevelRenderResourceConfig(long j, long j2, String str, String str2) {
        this.minGrade = j;
        this.maxGrade = j2;
        this.renderEffectLynxUrl = str;
        this.geckoChannel = str2;
    }
}
