package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLEResizeAlgorithm {
    RESIZE_ALGORITHM_BILINEAR(0),
    RESIZE_ALGORITHM_LANCZOS(215);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEResizeAlgorithm swigToEnum(int i) {
        NLEResizeAlgorithm[] nLEResizeAlgorithmArr = (NLEResizeAlgorithm[]) NLEResizeAlgorithm.class.getEnumConstants();
        if (i < nLEResizeAlgorithmArr.length && i >= 0) {
            NLEResizeAlgorithm nLEResizeAlgorithm = nLEResizeAlgorithmArr[i];
            if (nLEResizeAlgorithm.swigValue == i) {
                return nLEResizeAlgorithm;
            }
        }
        for (NLEResizeAlgorithm nLEResizeAlgorithm2 : nLEResizeAlgorithmArr) {
            if (nLEResizeAlgorithm2.swigValue == i) {
                return nLEResizeAlgorithm2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEResizeAlgorithm.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEResizeAlgorithm valueOf(String str) {
        return (NLEResizeAlgorithm) C08FF.LIZ(NLEResizeAlgorithm.class, str);
    }

    NLEResizeAlgorithm() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEResizeAlgorithm(NLEResizeAlgorithm nLEResizeAlgorithm) {
        int i = nLEResizeAlgorithm.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEResizeAlgorithm(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
