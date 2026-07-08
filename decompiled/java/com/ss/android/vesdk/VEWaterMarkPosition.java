package com.ss.android.vesdk;

import X.C08FF;

/* JADX INFO: loaded from: classes28.dex */
public enum VEWaterMarkPosition {
    TL_BR,
    BR,
    BL,
    TR,
    TL;

    public static VEWaterMarkPosition valueOf(String str) {
        return (VEWaterMarkPosition) C08FF.LIZ(VEWaterMarkPosition.class, str);
    }
}
