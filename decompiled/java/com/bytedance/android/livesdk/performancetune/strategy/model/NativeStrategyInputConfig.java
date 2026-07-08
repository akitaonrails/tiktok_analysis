package com.bytedance.android.livesdk.performancetune.strategy.model;

import X.C09CT;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes18.dex */
public final class NativeStrategyInputConfig extends AbsStrategyInputConfig {

    @C09CT("nativeStrategyKey")
    public final String nativeStrategyKey;

    public NativeStrategyInputConfig() {
        this("", "");
    }

    public final String getNativeStrategyKey() {
        return this.nativeStrategyKey;
    }

    public NativeStrategyInputConfig(String str, String str2) {
        super(1, str2, new LinkedHashMap());
        this.nativeStrategyKey = str;
    }
}
