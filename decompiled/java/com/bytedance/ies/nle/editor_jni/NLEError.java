package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLEError {
    SUCCESS(0),
    FAILED(-1),
    OPERATION_ILLEGAL(-2),
    NO_CHANGED(-3),
    OBJECTS_NOT_FOUND(-4),
    NOT_SUPPORT(-5),
    FILE_ACCESS_ERROR(-6),
    PARAM_INVALID(-7),
    COMPILE_CANCELED(-1301);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEError swigToEnum(int i) {
        NLEError[] nLEErrorArr = (NLEError[]) NLEError.class.getEnumConstants();
        if (i < nLEErrorArr.length && i >= 0) {
            NLEError nLEError = nLEErrorArr[i];
            if (nLEError.swigValue == i) {
                return nLEError;
            }
        }
        for (NLEError nLEError2 : nLEErrorArr) {
            if (nLEError2.swigValue == i) {
                return nLEError2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEError.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEError valueOf(String str) {
        return (NLEError) C08FF.LIZ(NLEError.class, str);
    }

    NLEError() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEError(NLEError nLEError) {
        int i = nLEError.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEError(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
