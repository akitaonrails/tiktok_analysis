package com.ss.android.ugc.aweme.services.publish;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class AVPublishExtensionBiz {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AVPublishExtensionBiz[] $VALUES;
    public final int value;
    public static final AVPublishExtensionBiz POI = new AVPublishExtensionBiz("POI", 0, 2);
    public static final AVPublishExtensionBiz NEWS = new AVPublishExtensionBiz("NEWS", 1, 16);

    public static final /* synthetic */ AVPublishExtensionBiz[] $values() {
        return new AVPublishExtensionBiz[]{POI, NEWS};
    }

    public static InterfaceC2044707zh<AVPublishExtensionBiz> getEntries() {
        return $ENTRIES;
    }

    static {
        AVPublishExtensionBiz[] aVPublishExtensionBizArr$values = $values();
        $VALUES = aVPublishExtensionBizArr$values;
        $ENTRIES = new C2254308sP(aVPublishExtensionBizArr$values);
    }

    public static AVPublishExtensionBiz[] values() {
        return (AVPublishExtensionBiz[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static AVPublishExtensionBiz valueOf(String str) {
        return (AVPublishExtensionBiz) C08FF.LIZ(AVPublishExtensionBiz.class, str);
    }

    public AVPublishExtensionBiz(String str, int i, int i2) {
        this.value = i2;
    }
}
