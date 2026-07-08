package com.bytedance.android.livesdk.livesetting.hybrid;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class SparkCpuBoostMatchParam {
    public static final TypeAdapter ADAPTER = new SparkCpuBoostMatchParam_OptTypeAdapter(NormalGson.singleton());

    @C09CT("pattern_list")
    public String[] patternList = new String[0];
}
