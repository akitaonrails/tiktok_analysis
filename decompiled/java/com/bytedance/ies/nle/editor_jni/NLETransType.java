package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLETransType {
    NLETransTypeRecord(0),
    NLETransTypeCopy(1),
    NLETransTypeMuxer(2),
    NLETransTypeEncode(3),
    NLETransTypeReuseEncodedFile(4);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLETransType swigToEnum(int i) {
        NLETransType[] nLETransTypeArr = (NLETransType[]) NLETransType.class.getEnumConstants();
        if (i < nLETransTypeArr.length && i >= 0) {
            NLETransType nLETransType = nLETransTypeArr[i];
            if (nLETransType.swigValue == i) {
                return nLETransType;
            }
        }
        for (NLETransType nLETransType2 : nLETransTypeArr) {
            if (nLETransType2.swigValue == i) {
                return nLETransType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLETransType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLETransType valueOf(String str) {
        return (NLETransType) C08FF.LIZ(NLETransType.class, str);
    }

    NLETransType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLETransType(NLETransType nLETransType) {
        int i = nLETransType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLETransType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
