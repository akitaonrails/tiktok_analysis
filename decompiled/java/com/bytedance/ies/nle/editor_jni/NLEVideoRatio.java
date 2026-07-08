package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes23.dex */
public enum NLEVideoRatio {
    VIDEO_OUT_RATIO_1_1,
    VIDEO_OUT_RATIO_4_3,
    VIDEO_OUT_RATIO_3_4,
    VIDEO_OUT_RATIO_16_9,
    VIDEO_OUT_RATIO_9_16,
    VIDEO_OUT_RATIO_ORIGINAL;

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEVideoRatio swigToEnum(int i) {
        NLEVideoRatio[] nLEVideoRatioArr = (NLEVideoRatio[]) NLEVideoRatio.class.getEnumConstants();
        if (i < nLEVideoRatioArr.length && i >= 0) {
            NLEVideoRatio nLEVideoRatio = nLEVideoRatioArr[i];
            if (nLEVideoRatio.swigValue == i) {
                return nLEVideoRatio;
            }
        }
        for (NLEVideoRatio nLEVideoRatio2 : nLEVideoRatioArr) {
            if (nLEVideoRatio2.swigValue == i) {
                return nLEVideoRatio2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEVideoRatio.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEVideoRatio valueOf(String str) {
        return (NLEVideoRatio) C08FF.LIZ(NLEVideoRatio.class, str);
    }

    NLEVideoRatio() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEVideoRatio(NLEVideoRatio nLEVideoRatio) {
        int i = nLEVideoRatio.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEVideoRatio(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
