package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FansEntranceResConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("entrance_webp_animation")
    public String entranceAnimFileName;

    @C09CT("entrance_lottie_animation")
    public String entranceLottieFileName;

    @C09CT("fans_grade")
    public int fansGrade;

    @C09CT("gecko_channel")
    public String geckoChannel;

    static {
        NormalGson.singleton();
        ADAPTER = new FansEntranceResConfig_OptTypeAdapter();
    }

    public FansEntranceResConfig() {
        this(0, "", "", "");
    }

    public FansEntranceResConfig(int i, String str, String str2, String str3) {
        this.fansGrade = i;
        this.entranceAnimFileName = str;
        this.entranceLottieFileName = str2;
        this.geckoChannel = str3;
    }
}
