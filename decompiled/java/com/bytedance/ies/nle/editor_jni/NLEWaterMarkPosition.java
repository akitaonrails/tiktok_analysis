package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes28.dex */
public enum NLEWaterMarkPosition {
    TL_BR,
    BR,
    BL,
    TR,
    TL;

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEWaterMarkPosition swigToEnum(int i) {
        NLEWaterMarkPosition[] nLEWaterMarkPositionArr = (NLEWaterMarkPosition[]) NLEWaterMarkPosition.class.getEnumConstants();
        if (i < nLEWaterMarkPositionArr.length && i >= 0) {
            NLEWaterMarkPosition nLEWaterMarkPosition = nLEWaterMarkPositionArr[i];
            if (nLEWaterMarkPosition.swigValue == i) {
                return nLEWaterMarkPosition;
            }
        }
        for (NLEWaterMarkPosition nLEWaterMarkPosition2 : nLEWaterMarkPositionArr) {
            if (nLEWaterMarkPosition2.swigValue == i) {
                return nLEWaterMarkPosition2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEWaterMarkPosition.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEWaterMarkPosition valueOf(String str) {
        return (NLEWaterMarkPosition) C08FF.LIZ(NLEWaterMarkPosition.class, str);
    }

    NLEWaterMarkPosition() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEWaterMarkPosition(NLEWaterMarkPosition nLEWaterMarkPosition) {
        int i = nLEWaterMarkPosition.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEWaterMarkPosition(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
