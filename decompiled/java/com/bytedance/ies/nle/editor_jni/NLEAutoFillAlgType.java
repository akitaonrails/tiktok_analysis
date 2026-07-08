package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLEAutoFillAlgType {
    UM(0),
    COVE(1),
    UMHighPerformance(2);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEAutoFillAlgType swigToEnum(int i) {
        NLEAutoFillAlgType[] nLEAutoFillAlgTypeArr = (NLEAutoFillAlgType[]) NLEAutoFillAlgType.class.getEnumConstants();
        if (i < nLEAutoFillAlgTypeArr.length && i >= 0) {
            NLEAutoFillAlgType nLEAutoFillAlgType = nLEAutoFillAlgTypeArr[i];
            if (nLEAutoFillAlgType.swigValue == i) {
                return nLEAutoFillAlgType;
            }
        }
        for (NLEAutoFillAlgType nLEAutoFillAlgType2 : nLEAutoFillAlgTypeArr) {
            if (nLEAutoFillAlgType2.swigValue == i) {
                return nLEAutoFillAlgType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEAutoFillAlgType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEAutoFillAlgType valueOf(String str) {
        return (NLEAutoFillAlgType) C08FF.LIZ(NLEAutoFillAlgType.class, str);
    }

    NLEAutoFillAlgType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEAutoFillAlgType(NLEAutoFillAlgType nLEAutoFillAlgType) {
        int i = nLEAutoFillAlgType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEAutoFillAlgType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
