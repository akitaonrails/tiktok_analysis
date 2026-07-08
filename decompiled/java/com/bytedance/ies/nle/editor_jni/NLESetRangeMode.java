package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLESetRangeMode {
    EDITOR_TIMERANGE_FLAG_BEFORE_SPEED(0),
    EDITOR_TIMERANGE_FLAG_AFTER_SPEED(1);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLESetRangeMode swigToEnum(int i) {
        NLESetRangeMode[] nLESetRangeModeArr = (NLESetRangeMode[]) NLESetRangeMode.class.getEnumConstants();
        if (i < nLESetRangeModeArr.length && i >= 0) {
            NLESetRangeMode nLESetRangeMode = nLESetRangeModeArr[i];
            if (nLESetRangeMode.swigValue == i) {
                return nLESetRangeMode;
            }
        }
        for (NLESetRangeMode nLESetRangeMode2 : nLESetRangeModeArr) {
            if (nLESetRangeMode2.swigValue == i) {
                return nLESetRangeMode2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLESetRangeMode.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLESetRangeMode valueOf(String str) {
        return (NLESetRangeMode) C08FF.LIZ(NLESetRangeMode.class, str);
    }

    NLESetRangeMode() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLESetRangeMode(NLESetRangeMode nLESetRangeMode) {
        int i = nLESetRangeMode.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLESetRangeMode(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
