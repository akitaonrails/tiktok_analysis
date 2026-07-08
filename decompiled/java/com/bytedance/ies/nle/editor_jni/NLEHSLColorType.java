package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLEHSLColorType {
    UNKNOWN(0),
    RED(1),
    ORANGE(2),
    YELLOW(3),
    GREEN(4),
    CYAN(5),
    BLUE(6),
    PURPLE(7),
    MAGENTA(8);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEHSLColorType swigToEnum(int i) {
        NLEHSLColorType[] nLEHSLColorTypeArr = (NLEHSLColorType[]) NLEHSLColorType.class.getEnumConstants();
        if (i < nLEHSLColorTypeArr.length && i >= 0) {
            NLEHSLColorType nLEHSLColorType = nLEHSLColorTypeArr[i];
            if (nLEHSLColorType.swigValue == i) {
                return nLEHSLColorType;
            }
        }
        for (NLEHSLColorType nLEHSLColorType2 : nLEHSLColorTypeArr) {
            if (nLEHSLColorType2.swigValue == i) {
                return nLEHSLColorType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEHSLColorType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEHSLColorType valueOf(String str) {
        return (NLEHSLColorType) C08FF.LIZ(NLEHSLColorType.class, str);
    }

    NLEHSLColorType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEHSLColorType(NLEHSLColorType nLEHSLColorType) {
        int i = nLEHSLColorType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEHSLColorType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
