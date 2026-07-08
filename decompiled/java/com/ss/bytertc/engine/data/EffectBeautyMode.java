package com.ss.bytertc.engine.data;

import X.C08FF;

/* JADX INFO: loaded from: classes6.dex */
public enum EffectBeautyMode {
    WHITE(0),
    SMOOTH(1),
    SHARPEN(2),
    CLEAR(3);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        return this == WHITE ? "kEffectBeautyWhiteMode" : this == SMOOTH ? "kEffectBeautySmoothMode" : this == SHARPEN ? "kEffectBeautySharpenMode" : this == CLEAR ? "kEffectBeautyClearMode" : "";
    }

    public int value() {
        return this.value;
    }

    public static EffectBeautyMode fromId(int i) {
        for (EffectBeautyMode effectBeautyMode : values()) {
            if (effectBeautyMode.value() == i) {
                return effectBeautyMode;
            }
        }
        return null;
    }

    public static EffectBeautyMode valueOf(String str) {
        return (EffectBeautyMode) C08FF.LIZ(EffectBeautyMode.class, str);
    }

    EffectBeautyMode(int i) {
        this.value = i;
    }
}
