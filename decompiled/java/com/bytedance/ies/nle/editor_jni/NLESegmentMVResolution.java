package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes9.dex */
public enum NLESegmentMVResolution {
    RES_720P(0),
    RES_1080P(1),
    RES_CUSTOM(2);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLESegmentMVResolution swigToEnum(int i) {
        NLESegmentMVResolution[] nLESegmentMVResolutionArr = (NLESegmentMVResolution[]) NLESegmentMVResolution.class.getEnumConstants();
        if (i < nLESegmentMVResolutionArr.length && i >= 0) {
            NLESegmentMVResolution nLESegmentMVResolution = nLESegmentMVResolutionArr[i];
            if (nLESegmentMVResolution.swigValue == i) {
                return nLESegmentMVResolution;
            }
        }
        for (NLESegmentMVResolution nLESegmentMVResolution2 : nLESegmentMVResolutionArr) {
            if (nLESegmentMVResolution2.swigValue == i) {
                return nLESegmentMVResolution2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLESegmentMVResolution.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLESegmentMVResolution valueOf(String str) {
        return (NLESegmentMVResolution) C08FF.LIZ(NLESegmentMVResolution.class, str);
    }

    NLESegmentMVResolution() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLESegmentMVResolution(NLESegmentMVResolution nLESegmentMVResolution) {
        int i = nLESegmentMVResolution.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLESegmentMVResolution(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
