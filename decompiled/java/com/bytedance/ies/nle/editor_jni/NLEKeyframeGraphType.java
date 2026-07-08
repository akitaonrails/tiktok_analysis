package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLEKeyframeGraphType {
    LINEAR(0),
    BEZIER(1);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEKeyframeGraphType swigToEnum(int i) {
        NLEKeyframeGraphType[] nLEKeyframeGraphTypeArr = (NLEKeyframeGraphType[]) NLEKeyframeGraphType.class.getEnumConstants();
        if (i < nLEKeyframeGraphTypeArr.length && i >= 0) {
            NLEKeyframeGraphType nLEKeyframeGraphType = nLEKeyframeGraphTypeArr[i];
            if (nLEKeyframeGraphType.swigValue == i) {
                return nLEKeyframeGraphType;
            }
        }
        for (NLEKeyframeGraphType nLEKeyframeGraphType2 : nLEKeyframeGraphTypeArr) {
            if (nLEKeyframeGraphType2.swigValue == i) {
                return nLEKeyframeGraphType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEKeyframeGraphType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEKeyframeGraphType valueOf(String str) {
        return (NLEKeyframeGraphType) C08FF.LIZ(NLEKeyframeGraphType.class, str);
    }

    NLEKeyframeGraphType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEKeyframeGraphType(NLEKeyframeGraphType nLEKeyframeGraphType) {
        int i = nLEKeyframeGraphType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEKeyframeGraphType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
