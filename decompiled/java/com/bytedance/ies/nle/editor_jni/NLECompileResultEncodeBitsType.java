package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLECompileResultEncodeBitsType {
    NLECompileResultEncodeBitsTypeNormal(0),
    NLECompileResultEncodeBitsType10Bit(1),
    NLECompileResultEncodeBitsType12Bit(2);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLECompileResultEncodeBitsType swigToEnum(int i) {
        NLECompileResultEncodeBitsType[] nLECompileResultEncodeBitsTypeArr = (NLECompileResultEncodeBitsType[]) NLECompileResultEncodeBitsType.class.getEnumConstants();
        if (i < nLECompileResultEncodeBitsTypeArr.length && i >= 0) {
            NLECompileResultEncodeBitsType nLECompileResultEncodeBitsType = nLECompileResultEncodeBitsTypeArr[i];
            if (nLECompileResultEncodeBitsType.swigValue == i) {
                return nLECompileResultEncodeBitsType;
            }
        }
        for (NLECompileResultEncodeBitsType nLECompileResultEncodeBitsType2 : nLECompileResultEncodeBitsTypeArr) {
            if (nLECompileResultEncodeBitsType2.swigValue == i) {
                return nLECompileResultEncodeBitsType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLECompileResultEncodeBitsType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLECompileResultEncodeBitsType valueOf(String str) {
        return (NLECompileResultEncodeBitsType) C08FF.LIZ(NLECompileResultEncodeBitsType.class, str);
    }

    NLECompileResultEncodeBitsType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLECompileResultEncodeBitsType(NLECompileResultEncodeBitsType nLECompileResultEncodeBitsType) {
        int i = nLECompileResultEncodeBitsType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLECompileResultEncodeBitsType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
