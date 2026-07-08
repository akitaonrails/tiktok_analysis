package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLECurveSpeedType {
    Normal(0),
    ActionBeam(1);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLECurveSpeedType swigToEnum(int i) {
        NLECurveSpeedType[] nLECurveSpeedTypeArr = (NLECurveSpeedType[]) NLECurveSpeedType.class.getEnumConstants();
        if (i < nLECurveSpeedTypeArr.length && i >= 0) {
            NLECurveSpeedType nLECurveSpeedType = nLECurveSpeedTypeArr[i];
            if (nLECurveSpeedType.swigValue == i) {
                return nLECurveSpeedType;
            }
        }
        for (NLECurveSpeedType nLECurveSpeedType2 : nLECurveSpeedTypeArr) {
            if (nLECurveSpeedType2.swigValue == i) {
                return nLECurveSpeedType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLECurveSpeedType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLECurveSpeedType valueOf(String str) {
        return (NLECurveSpeedType) C08FF.LIZ(NLECurveSpeedType.class, str);
    }

    NLECurveSpeedType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLECurveSpeedType(NLECurveSpeedType nLECurveSpeedType) {
        int i = nLECurveSpeedType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLECurveSpeedType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
