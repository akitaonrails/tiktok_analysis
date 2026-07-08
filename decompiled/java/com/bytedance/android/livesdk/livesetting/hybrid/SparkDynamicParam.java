package com.bytedance.android.livesdk.livesetting.hybrid;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class SparkDynamicParam {
    public static final TypeAdapter ADAPTER = new SparkDynamicParam_OptTypeAdapter(NormalGson.singleton());

    @C09CT("param_key")
    public String paramKey;

    @C09CT("param_value")
    public String paramValue;

    @C09CT("pattern_list")
    public String[] patternList = new String[0];
}
