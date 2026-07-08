package com.bytedance.android.livesdk.livesetting.clientai;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class TriggerScaleProduceParams {
    public static final TypeAdapter ADAPTER;

    @C09CT("algo_package_name")
    public String algoPackageName;

    @C09CT("delay_execute_time")
    public int delayExecuteTime;

    @C09CT("enable")
    public int enable;

    static {
        NormalGson.singleton();
        ADAPTER = new TriggerScaleProduceParams_OptTypeAdapter();
    }

    public TriggerScaleProduceParams() {
        this(0, 30, "");
    }

    public TriggerScaleProduceParams(int i, int i2, String str) {
        this.enable = i;
        this.delayExecuteTime = i2;
        this.algoPackageName = str;
    }
}
