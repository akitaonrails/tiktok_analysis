package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes9.dex */
public enum NLEGestureType {
    Unknown,
    Tap,
    Pan,
    Rotate,
    Scale,
    LongPress;

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEGestureType swigToEnum(int i) {
        NLEGestureType[] nLEGestureTypeArr = (NLEGestureType[]) NLEGestureType.class.getEnumConstants();
        if (i < nLEGestureTypeArr.length && i >= 0) {
            NLEGestureType nLEGestureType = nLEGestureTypeArr[i];
            if (nLEGestureType.swigValue == i) {
                return nLEGestureType;
            }
        }
        for (NLEGestureType nLEGestureType2 : nLEGestureTypeArr) {
            if (nLEGestureType2.swigValue == i) {
                return nLEGestureType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEGestureType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEGestureType valueOf(String str) {
        return (NLEGestureType) C08FF.LIZ(NLEGestureType.class, str);
    }

    NLEGestureType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEGestureType(NLEGestureType nLEGestureType) {
        int i = nLEGestureType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEGestureType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
