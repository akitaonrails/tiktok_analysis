package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLECanvasType {
    COLOR(0),
    IMAGE(1),
    VIDEO_FRAME(2),
    GRADIENT_COLOR(3);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLECanvasType swigToEnum(int i) {
        NLECanvasType[] nLECanvasTypeArr = (NLECanvasType[]) NLECanvasType.class.getEnumConstants();
        if (i < nLECanvasTypeArr.length && i >= 0) {
            NLECanvasType nLECanvasType = nLECanvasTypeArr[i];
            if (nLECanvasType.swigValue == i) {
                return nLECanvasType;
            }
        }
        for (NLECanvasType nLECanvasType2 : nLECanvasTypeArr) {
            if (nLECanvasType2.swigValue == i) {
                return nLECanvasType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLECanvasType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLECanvasType valueOf(String str) {
        return (NLECanvasType) C08FF.LIZ(NLECanvasType.class, str);
    }

    NLECanvasType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLECanvasType(NLECanvasType nLECanvasType) {
        int i = nLECanvasType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLECanvasType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
