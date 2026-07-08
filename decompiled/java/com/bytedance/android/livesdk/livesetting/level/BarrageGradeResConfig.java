package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class BarrageGradeResConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("anim_duration")
    public long animDuration;

    @C09CT("barrage_background")
    public String background;

    @C09CT("gecko_channel")
    public String barrageChannel;

    @C09CT("barrage_webp_animation")
    public String barrageWebp;

    @C09CT("barrage_beam")
    public String beam;

    @C09CT("effect_format")
    public String effectFormat;

    @C09CT("grade")
    public int level;

    @C09CT("barrage_ribbon")
    public String ribbon;

    static {
        NormalGson.singleton();
        ADAPTER = new BarrageGradeResConfig_OptTypeAdapter();
    }

    public BarrageGradeResConfig() {
        this(0, "", "", "", "", 1000L, "", "");
    }

    public BarrageGradeResConfig(int i, String str, String str2, String str3, String str4, long j, String str5, String str6) {
        this.level = i;
        this.background = str;
        this.ribbon = str2;
        this.beam = str3;
        this.barrageWebp = str4;
        this.animDuration = j;
        this.effectFormat = str5;
        this.barrageChannel = str6;
    }
}
