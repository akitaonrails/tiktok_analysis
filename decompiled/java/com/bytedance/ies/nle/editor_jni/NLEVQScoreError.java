package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLEVQScoreError {
    NLEVQScoreError_OK(0),
    NLEVQScoreError_ModelPathNotExits(-1),
    NLEVQScoreError_FailToInitModel(-2),
    NLEVQScoreError_FailToLoadSharedLib(-3),
    NLEVQScoreError_FailToInitBmfApi(-4),
    NLEVQScoreError_FailToPrepareEditor(-101),
    NLEVQScoreError_FailToStartGetFrameController(-102);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEVQScoreError swigToEnum(int i) {
        NLEVQScoreError[] nLEVQScoreErrorArr = (NLEVQScoreError[]) NLEVQScoreError.class.getEnumConstants();
        if (i < nLEVQScoreErrorArr.length && i >= 0) {
            NLEVQScoreError nLEVQScoreError = nLEVQScoreErrorArr[i];
            if (nLEVQScoreError.swigValue == i) {
                return nLEVQScoreError;
            }
        }
        for (NLEVQScoreError nLEVQScoreError2 : nLEVQScoreErrorArr) {
            if (nLEVQScoreError2.swigValue == i) {
                return nLEVQScoreError2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEVQScoreError.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEVQScoreError valueOf(String str) {
        return (NLEVQScoreError) C08FF.LIZ(NLEVQScoreError.class, str);
    }

    NLEVQScoreError() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEVQScoreError(NLEVQScoreError nLEVQScoreError) {
        int i = nLEVQScoreError.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEVQScoreError(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
