package com.ss.ugc.android.davinciresource.jni;

import X.C08FF;
import X.C2188811AlT;
import X.C560070Lxt;

/* JADX INFO: loaded from: classes9.dex */
public enum DAVLogLevel {
    LEVEL_VERBOSE(0),
    LEVEL_DEBUG(1),
    LEVEL_INFO(2),
    LEVEL_WARNING(3),
    LEVEL_ERROR(4),
    LEVEL_OFF(5);

    public final int swigValue;

    public final int swigValue() {
        return this.swigValue;
    }

    public static DAVLogLevel swigToEnum(int i) {
        DAVLogLevel[] dAVLogLevelArr = (DAVLogLevel[]) DAVLogLevel.class.getEnumConstants();
        if (i < dAVLogLevelArr.length && i >= 0) {
            DAVLogLevel dAVLogLevel = dAVLogLevelArr[i];
            if (dAVLogLevel.swigValue == i) {
                return dAVLogLevel;
            }
        }
        for (DAVLogLevel dAVLogLevel2 : dAVLogLevelArr) {
            if (dAVLogLevel2.swigValue == i) {
                return dAVLogLevel2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(DAVLogLevel.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static DAVLogLevel valueOf(String str) {
        return (DAVLogLevel) C08FF.LIZ(DAVLogLevel.class, str);
    }

    DAVLogLevel() {
        int i = C560070Lxt.LIZ;
        C560070Lxt.LIZ = i + 1;
        this.swigValue = i;
    }

    DAVLogLevel(DAVLogLevel dAVLogLevel) {
        int i = dAVLogLevel.swigValue;
        this.swigValue = i;
        C560070Lxt.LIZ = i + 1;
    }

    DAVLogLevel(int i) {
        this.swigValue = i;
        C560070Lxt.LIZ = i + 1;
    }
}
