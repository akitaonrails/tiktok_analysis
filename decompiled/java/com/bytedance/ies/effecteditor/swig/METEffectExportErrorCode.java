package com.bytedance.ies.effecteditor.swig;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes28.dex */
public enum METEffectExportErrorCode {
    METEffectExportErrorCode_None(0),
    METEffectExportErrorCode_NoEffect,
    METEffectExportErrorCode_Failed,
    METEffectExportErrorCode_Timeout;

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static METEffectExportErrorCode swigToEnum(int i) {
        METEffectExportErrorCode[] mETEffectExportErrorCodeArr = (METEffectExportErrorCode[]) METEffectExportErrorCode.class.getEnumConstants();
        if (i < mETEffectExportErrorCodeArr.length && i >= 0) {
            METEffectExportErrorCode mETEffectExportErrorCode = mETEffectExportErrorCodeArr[i];
            if (mETEffectExportErrorCode.swigValue == i) {
                return mETEffectExportErrorCode;
            }
        }
        for (METEffectExportErrorCode mETEffectExportErrorCode2 : mETEffectExportErrorCodeArr) {
            if (mETEffectExportErrorCode2.swigValue == i) {
                return mETEffectExportErrorCode2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(METEffectExportErrorCode.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static METEffectExportErrorCode valueOf(String str) {
        return (METEffectExportErrorCode) C08FF.LIZ(METEffectExportErrorCode.class, str);
    }

    METEffectExportErrorCode() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    METEffectExportErrorCode(METEffectExportErrorCode mETEffectExportErrorCode) {
        int i = mETEffectExportErrorCode.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    METEffectExportErrorCode(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
