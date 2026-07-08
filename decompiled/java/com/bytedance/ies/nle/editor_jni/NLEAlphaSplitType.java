package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLEAlphaSplitType {
    NONE(0),
    H264_LR,
    H264_UD,
    H264_RL(3);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEAlphaSplitType swigToEnum(int i) {
        NLEAlphaSplitType[] nLEAlphaSplitTypeArr = (NLEAlphaSplitType[]) NLEAlphaSplitType.class.getEnumConstants();
        if (i < nLEAlphaSplitTypeArr.length && i >= 0) {
            NLEAlphaSplitType nLEAlphaSplitType = nLEAlphaSplitTypeArr[i];
            if (nLEAlphaSplitType.swigValue == i) {
                return nLEAlphaSplitType;
            }
        }
        for (NLEAlphaSplitType nLEAlphaSplitType2 : nLEAlphaSplitTypeArr) {
            if (nLEAlphaSplitType2.swigValue == i) {
                return nLEAlphaSplitType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEAlphaSplitType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEAlphaSplitType valueOf(String str) {
        return (NLEAlphaSplitType) C08FF.LIZ(NLEAlphaSplitType.class, str);
    }

    NLEAlphaSplitType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEAlphaSplitType(NLEAlphaSplitType nLEAlphaSplitType) {
        int i = nLEAlphaSplitType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEAlphaSplitType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
