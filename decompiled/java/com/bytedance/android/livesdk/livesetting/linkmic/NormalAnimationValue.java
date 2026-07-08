package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class NormalAnimationValue {
    public static final TypeAdapter ADAPTER;

    @C09CT("appear_duration")
    public Integer appearDuration;

    @C09CT("disappear_duration")
    public Integer disappearDuration;

    static {
        NormalGson.singleton();
        ADAPTER = new NormalAnimationValue_OptTypeAdapter();
    }

    public NormalAnimationValue() {
        this(null, null);
    }

    public NormalAnimationValue(Integer num, Integer num2) {
        this.disappearDuration = num;
        this.appearDuration = num2;
    }
}
