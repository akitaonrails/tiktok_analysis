package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLEInvisibleWatermarkError {
    NLEInvisibleWatermarkError_OK(0),
    NLEInvisibleWatermarkError_ModelPathNotExits(-1),
    NLEInvisibleWatermarkError_FailToInitModel(-2),
    NLEInvisibleWatermarkError_InvalidInput(-3),
    NLEInvisibleWatermarkError_UnsupportedFormat(-4),
    NLEInvisibleWatermarkError_AlgorithmError(-5),
    NLEInvisibleWatermarkError_FailToPrepareEditor(-101),
    NLEInvisibleWatermarkError_FailToStartGetFrameController(-102);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEInvisibleWatermarkError swigToEnum(int i) {
        NLEInvisibleWatermarkError[] nLEInvisibleWatermarkErrorArr = (NLEInvisibleWatermarkError[]) NLEInvisibleWatermarkError.class.getEnumConstants();
        if (i < nLEInvisibleWatermarkErrorArr.length && i >= 0) {
            NLEInvisibleWatermarkError nLEInvisibleWatermarkError = nLEInvisibleWatermarkErrorArr[i];
            if (nLEInvisibleWatermarkError.swigValue == i) {
                return nLEInvisibleWatermarkError;
            }
        }
        for (NLEInvisibleWatermarkError nLEInvisibleWatermarkError2 : nLEInvisibleWatermarkErrorArr) {
            if (nLEInvisibleWatermarkError2.swigValue == i) {
                return nLEInvisibleWatermarkError2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEInvisibleWatermarkError.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEInvisibleWatermarkError valueOf(String str) {
        return (NLEInvisibleWatermarkError) C08FF.LIZ(NLEInvisibleWatermarkError.class, str);
    }

    NLEInvisibleWatermarkError() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEInvisibleWatermarkError(NLEInvisibleWatermarkError nLEInvisibleWatermarkError) {
        int i = nLEInvisibleWatermarkError.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEInvisibleWatermarkError(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
