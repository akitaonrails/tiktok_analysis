package com.ss.android.ugc.aweme.services.publish;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class AVPublishExtensionVisible {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AVPublishExtensionVisible[] $VALUES;
    public final int value;
    public static final AVPublishExtensionVisible VISIBLE = new AVPublishExtensionVisible("VISIBLE", 0, 0);
    public static final AVPublishExtensionVisible GRAY = new AVPublishExtensionVisible("GRAY", 1, 1);
    public static final AVPublishExtensionVisible GONE = new AVPublishExtensionVisible("GONE", 2, 2);

    public static final /* synthetic */ AVPublishExtensionVisible[] $values() {
        return new AVPublishExtensionVisible[]{VISIBLE, GRAY, GONE};
    }

    public static InterfaceC2044707zh<AVPublishExtensionVisible> getEntries() {
        return $ENTRIES;
    }

    static {
        AVPublishExtensionVisible[] aVPublishExtensionVisibleArr$values = $values();
        $VALUES = aVPublishExtensionVisibleArr$values;
        $ENTRIES = new C2254308sP(aVPublishExtensionVisibleArr$values);
    }

    public static AVPublishExtensionVisible[] values() {
        return (AVPublishExtensionVisible[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static AVPublishExtensionVisible valueOf(String str) {
        return (AVPublishExtensionVisible) C08FF.LIZ(AVPublishExtensionVisible.class, str);
    }

    public AVPublishExtensionVisible(String str, int i, int i2) {
        this.value = i2;
    }
}
