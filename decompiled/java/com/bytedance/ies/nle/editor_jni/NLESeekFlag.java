package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes23.dex */
public enum NLESeekFlag {
    EDITOR_SEEK_FLAG_OnGoing(0),
    EDITOR_SEEK_FLAG_LastSeek(1),
    EDITOR_SEEK_FLAG_LAST_UpdateInOut(2),
    EDITOR_SEEK_FLAG_LAST_UpdateIn(3),
    EDITOR_SEEK_FLAG_LAST_UpdateOut(4),
    EDITOR_SEEK_FLAG_LAST_UpdateSwingSync(5);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLESeekFlag swigToEnum(int i) {
        NLESeekFlag[] nLESeekFlagArr = (NLESeekFlag[]) NLESeekFlag.class.getEnumConstants();
        if (i < nLESeekFlagArr.length && i >= 0) {
            NLESeekFlag nLESeekFlag = nLESeekFlagArr[i];
            if (nLESeekFlag.swigValue == i) {
                return nLESeekFlag;
            }
        }
        for (NLESeekFlag nLESeekFlag2 : nLESeekFlagArr) {
            if (nLESeekFlag2.swigValue == i) {
                return nLESeekFlag2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLESeekFlag.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLESeekFlag valueOf(String str) {
        return (NLESeekFlag) C08FF.LIZ(NLESeekFlag.class, str);
    }

    NLESeekFlag() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLESeekFlag(NLESeekFlag nLESeekFlag) {
        int i = nLESeekFlag.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLESeekFlag(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
