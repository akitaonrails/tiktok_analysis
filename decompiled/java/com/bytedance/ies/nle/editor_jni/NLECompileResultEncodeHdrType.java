package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLECompileResultEncodeHdrType {
    NLECompileResultEncodeHdrTypeNormal(0),
    NLECompileResultEncodeHdrTypeHLG(1),
    NLECompileResultEncodeHdrTypePQ(2);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLECompileResultEncodeHdrType swigToEnum(int i) {
        NLECompileResultEncodeHdrType[] nLECompileResultEncodeHdrTypeArr = (NLECompileResultEncodeHdrType[]) NLECompileResultEncodeHdrType.class.getEnumConstants();
        if (i < nLECompileResultEncodeHdrTypeArr.length && i >= 0) {
            NLECompileResultEncodeHdrType nLECompileResultEncodeHdrType = nLECompileResultEncodeHdrTypeArr[i];
            if (nLECompileResultEncodeHdrType.swigValue == i) {
                return nLECompileResultEncodeHdrType;
            }
        }
        for (NLECompileResultEncodeHdrType nLECompileResultEncodeHdrType2 : nLECompileResultEncodeHdrTypeArr) {
            if (nLECompileResultEncodeHdrType2.swigValue == i) {
                return nLECompileResultEncodeHdrType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLECompileResultEncodeHdrType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLECompileResultEncodeHdrType valueOf(String str) {
        return (NLECompileResultEncodeHdrType) C08FF.LIZ(NLECompileResultEncodeHdrType.class, str);
    }

    NLECompileResultEncodeHdrType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLECompileResultEncodeHdrType(NLECompileResultEncodeHdrType nLECompileResultEncodeHdrType) {
        int i = nLECompileResultEncodeHdrType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLECompileResultEncodeHdrType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
