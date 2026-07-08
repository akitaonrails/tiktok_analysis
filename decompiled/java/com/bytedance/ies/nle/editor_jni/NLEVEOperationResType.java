package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes28.dex */
public enum NLEVEOperationResType {
    UNKNOWN(-1),
    VIDEO(0),
    AUDIO,
    FILTER_NORMAL,
    FILTER_COMPOSER,
    FILTER_AMAZING,
    EFFECT_NORMAL(5),
    EFFECT_COMPOSER,
    EFFECT_AMAZING,
    EFFECT_TIME,
    STICKER_INFO,
    STICKER_IMAGE(10),
    STICKER_TEXT,
    STICKER_SUBTITLE,
    STICKER_EMOJI,
    TRANSITION,
    MASK(15),
    STICKER_BORDER;

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEVEOperationResType swigToEnum(int i) {
        NLEVEOperationResType[] nLEVEOperationResTypeArr = (NLEVEOperationResType[]) NLEVEOperationResType.class.getEnumConstants();
        if (i < nLEVEOperationResTypeArr.length && i >= 0) {
            NLEVEOperationResType nLEVEOperationResType = nLEVEOperationResTypeArr[i];
            if (nLEVEOperationResType.swigValue == i) {
                return nLEVEOperationResType;
            }
        }
        for (NLEVEOperationResType nLEVEOperationResType2 : nLEVEOperationResTypeArr) {
            if (nLEVEOperationResType2.swigValue == i) {
                return nLEVEOperationResType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEVEOperationResType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEVEOperationResType valueOf(String str) {
        return (NLEVEOperationResType) C08FF.LIZ(NLEVEOperationResType.class, str);
    }

    NLEVEOperationResType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEVEOperationResType(NLEVEOperationResType nLEVEOperationResType) {
        int i = nLEVEOperationResType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEVEOperationResType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
