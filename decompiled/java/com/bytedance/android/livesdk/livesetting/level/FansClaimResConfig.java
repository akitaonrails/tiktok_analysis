package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClaimResConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("fans_grade")
    public int fansGrade;

    @C09CT("android_channel")
    public String geckoChannel;

    @C09CT("webp_file_name")
    public String webpFileName;

    static {
        NormalGson.singleton();
        ADAPTER = new FansClaimResConfig_OptTypeAdapter();
    }

    public FansClaimResConfig() {
        this(0, "", "");
    }

    public FansClaimResConfig(int i, String str, String str2) {
        this.fansGrade = i;
        this.webpFileName = str;
        this.geckoChannel = str2;
    }
}
