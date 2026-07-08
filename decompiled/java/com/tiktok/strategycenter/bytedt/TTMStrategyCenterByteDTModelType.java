package com.tiktok.strategycenter.bytedt;

import X.C08FF;

/* JADX INFO: loaded from: classes19.dex */
public enum TTMStrategyCenterByteDTModelType {
    ERROR(-1),
    CLASSIFICATION(0),
    MULTI_LABEL_CLASSIFICATION(1),
    REGRESSION(2);

    public final int value;

    public static TTMStrategyCenterByteDTModelType parseFromIntVal(int i) {
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return ERROR;
                    }
                    return REGRESSION;
                }
                return MULTI_LABEL_CLASSIFICATION;
            }
            return CLASSIFICATION;
        }
        return ERROR;
    }

    public static TTMStrategyCenterByteDTModelType valueOf(String str) {
        return (TTMStrategyCenterByteDTModelType) C08FF.LIZ(TTMStrategyCenterByteDTModelType.class, str);
    }

    TTMStrategyCenterByteDTModelType(int i) {
        this.value = i;
    }
}
