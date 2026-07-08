package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLEInteractivePenType {
    NLE_MATTING_INTERACTIVE_PEN_TYPE_FAST(0),
    NLE_MATTING_INTERACTIVE_PEN_TYPE_GENERAL(1),
    NLE_MATTING_INTERACTIVE_PEN_TYPE_ERASER(2),
    NLE_MATTING_INTERACTIVE_PEN_TYPE_FASTERASER(3);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEInteractivePenType swigToEnum(int i) {
        NLEInteractivePenType[] nLEInteractivePenTypeArr = (NLEInteractivePenType[]) NLEInteractivePenType.class.getEnumConstants();
        if (i < nLEInteractivePenTypeArr.length && i >= 0) {
            NLEInteractivePenType nLEInteractivePenType = nLEInteractivePenTypeArr[i];
            if (nLEInteractivePenType.swigValue == i) {
                return nLEInteractivePenType;
            }
        }
        for (NLEInteractivePenType nLEInteractivePenType2 : nLEInteractivePenTypeArr) {
            if (nLEInteractivePenType2.swigValue == i) {
                return nLEInteractivePenType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEInteractivePenType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEInteractivePenType valueOf(String str) {
        return (NLEInteractivePenType) C08FF.LIZ(NLEInteractivePenType.class, str);
    }

    NLEInteractivePenType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEInteractivePenType(NLEInteractivePenType nLEInteractivePenType) {
        int i = nLEInteractivePenType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEInteractivePenType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
